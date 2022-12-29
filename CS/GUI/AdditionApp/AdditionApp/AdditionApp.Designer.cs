namespace AdditionApp
{
    partial class AdditionApp
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
            this.LblAugend = new System.Windows.Forms.Label();
            this.TxtAugend = new System.Windows.Forms.TextBox();
            this.TxtAddend = new System.Windows.Forms.TextBox();
            this.LblAddend = new System.Windows.Forms.Label();
            this.TxtSum = new System.Windows.Forms.TextBox();
            this.LblSum = new System.Windows.Forms.Label();
            this.BtnAdd = new System.Windows.Forms.Button();
            this.BtnReset = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // LblAugend
            // 
            this.LblAugend.AutoSize = true;
            this.LblAugend.Location = new System.Drawing.Point(67, 31);
            this.LblAugend.Name = "LblAugend";
            this.LblAugend.Size = new System.Drawing.Size(44, 13);
            this.LblAugend.TabIndex = 0;
            this.LblAugend.Text = "Augend";
            // 
            // TxtAugend
            // 
            this.TxtAugend.Location = new System.Drawing.Point(149, 28);
            this.TxtAugend.Name = "TxtAugend";
            this.TxtAugend.Size = new System.Drawing.Size(100, 20);
            this.TxtAugend.TabIndex = 1;
            // 
            // TxtAddend
            // 
            this.TxtAddend.Location = new System.Drawing.Point(149, 72);
            this.TxtAddend.Name = "TxtAddend";
            this.TxtAddend.Size = new System.Drawing.Size(100, 20);
            this.TxtAddend.TabIndex = 3;
            // 
            // LblAddend
            // 
            this.LblAddend.AutoSize = true;
            this.LblAddend.Location = new System.Drawing.Point(67, 75);
            this.LblAddend.Name = "LblAddend";
            this.LblAddend.Size = new System.Drawing.Size(44, 13);
            this.LblAddend.TabIndex = 2;
            this.LblAddend.Text = "Addend";
            // 
            // TxtSum
            // 
            this.TxtSum.Location = new System.Drawing.Point(149, 121);
            this.TxtSum.Name = "TxtSum";
            this.TxtSum.Size = new System.Drawing.Size(100, 20);
            this.TxtSum.TabIndex = 5;
            // 
            // LblSum
            // 
            this.LblSum.AutoSize = true;
            this.LblSum.Location = new System.Drawing.Point(67, 124);
            this.LblSum.Name = "LblSum";
            this.LblSum.Size = new System.Drawing.Size(28, 13);
            this.LblSum.TabIndex = 4;
            this.LblSum.Text = "Sum";
            // 
            // BtnAdd
            // 
            this.BtnAdd.Location = new System.Drawing.Point(70, 181);
            this.BtnAdd.Name = "BtnAdd";
            this.BtnAdd.Size = new System.Drawing.Size(75, 23);
            this.BtnAdd.TabIndex = 6;
            this.BtnAdd.Text = "Add";
            this.BtnAdd.UseVisualStyleBackColor = true;
            this.BtnAdd.Click += new System.EventHandler(this.BtnAdd_Click);
            // 
            // BtnReset
            // 
            this.BtnReset.Location = new System.Drawing.Point(174, 181);
            this.BtnReset.Name = "BtnReset";
            this.BtnReset.Size = new System.Drawing.Size(75, 23);
            this.BtnReset.TabIndex = 7;
            this.BtnReset.Text = "Reset";
            this.BtnReset.UseVisualStyleBackColor = true;
            // 
            // AdditionApp
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(340, 265);
            this.Controls.Add(this.BtnReset);
            this.Controls.Add(this.BtnAdd);
            this.Controls.Add(this.TxtSum);
            this.Controls.Add(this.LblSum);
            this.Controls.Add(this.TxtAddend);
            this.Controls.Add(this.LblAddend);
            this.Controls.Add(this.TxtAugend);
            this.Controls.Add(this.LblAugend);
            this.Name = "AdditionApp";
            this.Text = "AdditionApp";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LblAugend;
        private System.Windows.Forms.TextBox TxtAugend;
        private System.Windows.Forms.TextBox TxtAddend;
        private System.Windows.Forms.Label LblAddend;
        private System.Windows.Forms.TextBox TxtSum;
        private System.Windows.Forms.Label LblSum;
        private System.Windows.Forms.Button BtnAdd;
        private System.Windows.Forms.Button BtnReset;
    }
}

