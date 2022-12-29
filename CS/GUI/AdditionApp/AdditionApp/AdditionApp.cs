using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AdditionApp
{
    public partial class AdditionApp : Form
    {
        public AdditionApp()
        {
            InitializeComponent();
        }

        private void BtnAdd_Click(object sender, EventArgs e)
        {
            int a, b, c;

            a = Convert.ToInt32(TxtAugend.Text);
            b = Convert.ToInt32(TxtAddend.Text);

            c = a + b;

            TxtSum.Text = c.ToString();
        }
    }
}
