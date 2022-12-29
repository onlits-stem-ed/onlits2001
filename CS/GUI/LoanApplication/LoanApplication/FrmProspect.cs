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
    public partial class FrmProspect : Form
    {
        SqlConnection con = new SqlConnection("Server=(localdb)\\mssqllocaldb; Database=LoanApplication; Integrated Security=True");
        SqlCommand cmd = new SqlCommand();
        SqlDataReader dr;
        public FrmProspect()
        {
            InitializeComponent();
        }


        private string GenerateProspectId()
        {
            string pid=null;
            Int32 sl;
            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "SELECT TOP 1 ProspectID FROM Prospect ORDER BY ProspectID DESC";
            dr = cmd.ExecuteReader();
            dr.Read();
            sl = Convert.ToInt32(dr[0].ToString().Substring(1, 3));
            sl++;
            if (sl < 10)
                pid = "P00" + sl;
            else if (sl < 100)
                pid = "P0" + sl;
            else if (sl < 1000)
                pid = "P" + sl;
            con.Close();

            return pid;
        }
        private void BtnSubmit_Click(object sender, EventArgs e)
        {
            string pid = GenerateProspectId();

            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "INSERT INTO Prospect VALUES('" + pid + "', '" + TxtProspectName.Text + "')";
            cmd.ExecuteNonQuery();
            MessageBox.Show("Data Inserted Successfully!");

            con.Close();
        }
    }
}
