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
    public partial class FrmProspectList : Form
    {
        public FrmProspectList()
        {
            InitializeComponent();
        }

        private void FrmProspectList_Load(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("Server=(localdb)\\mssqllocaldb; Database=LoanApplication");
            SqlCommand cmd = new SqlCommand();
            SqlDataAdapter da = new SqlDataAdapter();
            DataSet ds = new DataSet();

            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM Prospect";
            da.SelectCommand = cmd;
            da.Fill(ds, "Prospect");
            DgvProspect.DataSource = ds.Tables["Prospect"];
            con.Close();
        }
    }
}
