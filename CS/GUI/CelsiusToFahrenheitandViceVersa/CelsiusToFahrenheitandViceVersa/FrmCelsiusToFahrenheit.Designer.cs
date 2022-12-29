namespace CelsiusToFahrenheitandViceVersa
{
    partial class FrmCelsiusToFahrenheit
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.TxtCelsius = new System.Windows.Forms.TextBox();
            this.TxtFahrenheit = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.RbtC2F = new System.Windows.Forms.RadioButton();
            this.RbtF2C = new System.Windows.Forms.RadioButton();
            this.BtnFind = new System.Windows.Forms.Button();
            this.BtnReset = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(56, 116);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(40, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Celsius";
            // 
            // TxtCelsius
            // 
            this.TxtCelsius.Location = new System.Drawing.Point(152, 113);
            this.TxtCelsius.Name = "TxtCelsius";
            this.TxtCelsius.Size = new System.Drawing.Size(100, 20);
            this.TxtCelsius.TabIndex = 1;
            // 
            // TxtFahrenheit
            // 
            this.TxtFahrenheit.Location = new System.Drawing.Point(152, 163);
            this.TxtFahrenheit.Name = "TxtFahrenheit";
            this.TxtFahrenheit.ReadOnly = true;
            this.TxtFahrenheit.Size = new System.Drawing.Size(100, 20);
            this.TxtFahrenheit.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(56, 166);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(57, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Fahrenheit";
            // 
            // RbtC2F
            // 
            this.RbtC2F.AutoSize = true;
            this.RbtC2F.Checked = true;
            this.RbtC2F.Location = new System.Drawing.Point(53, 49);
            this.RbtC2F.Name = "RbtC2F";
            this.RbtC2F.Size = new System.Drawing.Size(57, 17);
            this.RbtC2F.TabIndex = 4;
            this.RbtC2F.TabStop = true;
            this.RbtC2F.Text = "C To F";
            this.RbtC2F.UseVisualStyleBackColor = true;
            this.RbtC2F.CheckedChanged += new System.EventHandler(this.RbtC2F_CheckedChanged);
            // 
            // RbtF2C
            // 
            this.RbtF2C.AutoSize = true;
            this.RbtF2C.Location = new System.Drawing.Point(199, 49);
            this.RbtF2C.Name = "RbtF2C";
            this.RbtF2C.Size = new System.Drawing.Size(53, 17);
            this.RbtF2C.TabIndex = 5;
            this.RbtF2C.Text = "F to C";
            this.RbtF2C.UseVisualStyleBackColor = true;
            this.RbtF2C.CheckedChanged += new System.EventHandler(this.RbtF2C_CheckedChanged);
            // 
            // BtnFind
            // 
            this.BtnFind.Location = new System.Drawing.Point(53, 238);
            this.BtnFind.Name = "BtnFind";
            this.BtnFind.Size = new System.Drawing.Size(75, 23);
            this.BtnFind.TabIndex = 6;
            this.BtnFind.Text = "Find";
            this.BtnFind.UseVisualStyleBackColor = true;
            this.BtnFind.Click += new System.EventHandler(this.BtnFind_Click);
            // 
            // BtnReset
            // 
            this.BtnReset.Location = new System.Drawing.Point(134, 238);
            this.BtnReset.Name = "BtnReset";
            this.BtnReset.Size = new System.Drawing.Size(75, 23);
            this.BtnReset.TabIndex = 7;
            this.BtnReset.Text = "Reset";
            this.BtnReset.UseVisualStyleBackColor = true;
            this.BtnReset.Click += new System.EventHandler(this.BtnReset_Click);
            // 
            // FrmCelsiusToFahrenheit
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(359, 295);
            this.Controls.Add(this.BtnReset);
            this.Controls.Add(this.BtnFind);
            this.Controls.Add(this.RbtF2C);
            this.Controls.Add(this.RbtC2F);
            this.Controls.Add(this.TxtFahrenheit);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.TxtCelsius);
            this.Controls.Add(this.label1);
            this.Name = "FrmCelsiusToFahrenheit";
            this.Text = "Celsius To Fahrenheit and Vice Versa";
            this.Load += new System.EventHandler(this.FrmCelsiusToFahrenheit_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox TxtCelsius;
        private System.Windows.Forms.TextBox TxtFahrenheit;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.RadioButton RbtC2F;
        private System.Windows.Forms.RadioButton RbtF2C;
        private System.Windows.Forms.Button BtnFind;
        private System.Windows.Forms.Button BtnReset;
    }
}

