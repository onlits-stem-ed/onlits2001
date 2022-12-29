using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace LoanApplication
{
    public partial class FrmLoanProposal : Form
    {
        public FrmLoanProposal()
        {
            InitializeComponent();
        }

        private void BtnCalculate_Click(object sender, EventArgs e)
        {
            double A, P, r, n, t;

            P = Convert.ToDouble(TxtLoanAmount.Text);
            r = Convert.ToDouble(TxtInterestRate.Text) / 100;
            n = 1.0;
            t = Convert.ToDouble(CboLoanTenure.Text);

            A = Math.Round(P * Math.Pow((1 + r / n), (n * t)));

            TxtTotalAmountPayable.Text = A.ToString();

            TxtTotalInterest.Text = (A - P).ToString();

            TxtEMI.Text = Math.Round((A / (t * 12)),2).ToString();
        }

        private void FrmLoanProposal_Load(object sender, EventArgs e)
        {

            //------ POPULATING LOAN TENURE COMBOBOX
            for(int i=1; i<=30; i++)
                CboLoanTenure.Items.Add(i);


        }

        private void CboLoanType_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (CboLoanType.Text == "Home Loan")
                TxtInterestRate.Text = 8.ToString();
            else if (CboLoanType.Text == "Car Loan")
                TxtInterestRate.Text = 10.ToString();
        }

        private void BtnSearch_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("Server=(localdb)\\mssqllocaldb; Database=LoanApplication; Integrated Security=True");
            SqlCommand cmd = new SqlCommand();
            DataSet ds = new DataSet();                         //System.Data
            SqlDataAdapter da = new SqlDataAdapter();

            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM Prospect WHERE ProspectID='" + TxtProspectID.Text + "'";
            da.SelectCommand = cmd;
            da.Fill(ds, "Prospect");
            con.Close();

           if(ds.Tables["Prospect"].Rows.Count>0)
            {
                TxtProspectName.Text = ds.Tables["Prospect"].Rows[0].ItemArray[1].ToString();
            }
           else
            {
                MessageBox.Show("Records not found!");
            }
        }
    }
}
