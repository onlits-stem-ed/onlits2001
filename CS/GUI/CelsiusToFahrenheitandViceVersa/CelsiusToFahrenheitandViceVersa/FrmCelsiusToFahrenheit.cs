using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CelsiusToFahrenheitandViceVersa
{
    public partial class FrmCelsiusToFahrenheit : Form
    {
        public FrmCelsiusToFahrenheit()
        {
            InitializeComponent();
        }

        private void FrmCelsiusToFahrenheit_Load(object sender, EventArgs e)
        {

        }

        private void BtnFind_Click(object sender, EventArgs e)
        {
            float c, f;

            if (RbtC2F.Checked)
            {

                c = Convert.ToSingle(TxtCelsius.Text);

                f = (c * 1.8F) + 32;

                TxtFahrenheit.Text = f.ToString();
            }
            else
            {
                f = Convert.ToSingle(TxtFahrenheit.Text);

                c = (f - 32) / 1.8f;

                TxtCelsius.Text = c.ToString();
            }
        }

        private void RbtC2F_CheckedChanged(object sender, EventArgs e)
        {
            if(RbtC2F.Checked)
            {
                TxtCelsius.ReadOnly = false;
                TxtFahrenheit.ReadOnly = true;
                ResetForm();
            }
        }

        private void RbtF2C_CheckedChanged(object sender, EventArgs e)
        {
            if (RbtF2C.Checked)
            {
                TxtCelsius.ReadOnly = true;
                TxtFahrenheit.ReadOnly = false;
                ResetForm();
            }
        }

        private void BtnReset_Click(object sender, EventArgs e)
        {
            ResetForm();
        }

        private void ResetForm()
        {
            TxtCelsius.Clear();
            TxtFahrenheit.Clear();
        }
    }
}
