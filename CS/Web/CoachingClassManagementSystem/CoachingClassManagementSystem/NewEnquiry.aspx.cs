using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;
using MySql.Data.MySqlClient;

namespace CoachingClassManagementSystem
{
    public partial class NewEnquiry : System.Web.UI.Page
    {
        MySqlConnection con = new MySqlConnection("Server=localhost; Database=CCMS; Uid=aman; Pwd=aman");
        MySqlCommand cmd = new MySqlCommand();
        MySqlDataAdapter da = new MySqlDataAdapter();
        MySqlCommandBuilder cb = new MySqlCommandBuilder();
        //SqlConnection con = new SqlConnection("Server=localhost\\sqlexpress; Database=CCMS; Integrated Security=True");
        //SqlCommand cmd = new SqlCommand();
        //SqlDataAdapter da = new SqlDataAdapter();
        //SqlCommandBuilder cb = new SqlCommandBuilder();
        DataSet ds = new DataSet();
        DataRow dr;
        protected void Page_Load(object sender, EventArgs e)
        {
            
        }

        protected void BtnSubmit_Click(object sender, EventArgs e)
        {
            con.Open();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM Enquiry";
            da.SelectCommand = cmd;
            da.Fill(ds);
            dr = ds.Tables[0].NewRow();
            dr["EnquiryId"] = TxtEnquiryId.Text;
            dr["EnquiryName"] = TxtEnquiryName.Text;
            ds.Tables[0].Rows.Add(dr);
            cb.DataAdapter = da;
            da.Update(ds);
            con.Close();
            LblConfirm.InnerText = "Records submitted successfully!";
        }
    }
}