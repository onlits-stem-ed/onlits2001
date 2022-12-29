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
    public partial class EditProspect : Form
    {
        SqlConnection con = new SqlConnection("Server=(localdb)\\mssqllocaldb; Database=LoanApplication; Integrated Security=True");
        SqlCommand cmd = new SqlCommand();
        SqlDataReader dr;
        public EditProspect()
        {
            InitializeComponent();
        }

        private void BtnSearch_Click(object sender, EventArgs e)
        {
            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM Prospect WHERE ProspectID='" + TxtProspectID.Text + "'";
            dr = cmd.ExecuteReader();
            if(dr.Read())
            {
                TxtProspectName.Text = dr.GetString(1);
            }
            else
            {
                MessageBox.Show("No records found!");
            }
            con.Close();
        }

        private void BtnSubmit_Click(object sender, EventArgs e)
        {
            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "UPDATE Prospect SET ProspectName='" + TxtProspectName.Text + "' WHERE ProspectID='" + TxtProspectID.Text + "'";
            cmd.ExecuteNonQuery();
            MessageBox.Show("Data Updated Successfully!");

            con.Close();
        }
    }
}
