namespace LoanApplication
{
    partial class FrmLoanProposal
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
            this.CboLoanType = new System.Windows.Forms.ComboBox();
            this.label2 = new System.Windows.Forms.Label();
            this.TxtLoanAmount = new System.Windows.Forms.TextBox();
            this.CboLoanTenure = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.TxtInterestRate = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.TxtTotalInterest = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.TxtTotalAmountPayable = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.TxtEMI = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.BtnCalculate = new System.Windows.Forms.Button();
            this.BtnReset = new System.Windows.Forms.Button();
            this.TxtProspectName = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.BtnSearch = new System.Windows.Forms.Button();
            this.TxtProspectID = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(65, 87);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(58, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Loan Type";
            // 
            // CboLoanType
            // 
            this.CboLoanType.FormattingEnabled = true;
            this.CboLoanType.Items.AddRange(new object[] {
            "Home Loan",
            "Car Loan",
            "Agriculture Loan",
            "Business Loan",
            "Mudra Loan"});
            this.CboLoanType.Location = new System.Drawing.Point(196, 84);
            this.CboLoanType.Name = "CboLoanType";
            this.CboLoanType.Size = new System.Drawing.Size(121, 21);
            this.CboLoanType.TabIndex = 1;
            this.CboLoanType.SelectedIndexChanged += new System.EventHandler(this.CboLoanType_SelectedIndexChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(65, 133);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(70, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Loan Amount";
            // 
            // TxtLoanAmount
            // 
            this.TxtLoanAmount.Location = new System.Drawing.Point(196, 130);
            this.TxtLoanAmount.Name = "TxtLoanAmount";
            this.TxtLoanAmount.Size = new System.Drawing.Size(100, 20);
            this.TxtLoanAmount.TabIndex = 3;
            // 
            // CboLoanTenure
            // 
            this.CboLoanTenure.FormattingEnabled = true;
            this.CboLoanTenure.Location = new System.Drawing.Point(196, 172);
            this.CboLoanTenure.Name = "CboLoanTenure";
            this.CboLoanTenure.Size = new System.Drawing.Size(121, 21);
            this.CboLoanTenure.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(65, 175);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(68, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Loan Tenure";
            // 
            // TxtInterestRate
            // 
            this.TxtInterestRate.Location = new System.Drawing.Point(196, 215);
            this.TxtInterestRate.Name = "TxtInterestRate";
            this.TxtInterestRate.ReadOnly = true;
            this.TxtInterestRate.Size = new System.Drawing.Size(100, 20);
            this.TxtInterestRate.TabIndex = 7;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(65, 218);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(85, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "Interest Rate (%)";
            // 
            // TxtTotalInterest
            // 
            this.TxtTotalInterest.Location = new System.Drawing.Point(196, 262);
            this.TxtTotalInterest.Name = "TxtTotalInterest";
            this.TxtTotalInterest.ReadOnly = true;
            this.TxtTotalInterest.Size = new System.Drawing.Size(100, 20);
            this.TxtTotalInterest.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(65, 265);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(69, 13);
            this.label5.TabIndex = 8;
            this.label5.Text = "Total Interest";
            // 
            // TxtTotalAmountPayable
            // 
            this.TxtTotalAmountPayable.Location = new System.Drawing.Point(196, 308);
            this.TxtTotalAmountPayable.Name = "TxtTotalAmountPayable";
            this.TxtTotalAmountPayable.ReadOnly = true;
            this.TxtTotalAmountPayable.Size = new System.Drawing.Size(100, 20);
            this.TxtTotalAmountPayable.TabIndex = 11;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(65, 311);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(111, 13);
            this.label6.TabIndex = 10;
            this.label6.Text = "Total Amount Payable";
            // 
            // TxtEMI
            // 
            this.TxtEMI.Location = new System.Drawing.Point(196, 355);
            this.TxtEMI.Name = "TxtEMI";
            this.TxtEMI.ReadOnly = true;
            this.TxtEMI.Size = new System.Drawing.Size(100, 20);
            this.TxtEMI.TabIndex = 13;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(65, 358);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(26, 13);
            this.label7.TabIndex = 12;
            this.label7.Text = "EMI";
            // 
            // BtnCalculate
            // 
            this.BtnCalculate.Location = new System.Drawing.Point(68, 408);
            this.BtnCalculate.Name = "BtnCalculate";
            this.BtnCalculate.Size = new System.Drawing.Size(75, 23);
            this.BtnCalculate.TabIndex = 14;
            this.BtnCalculate.Text = "Calculate";
            this.BtnCalculate.UseVisualStyleBackColor = true;
            this.BtnCalculate.Click += new System.EventHandler(this.BtnCalculate_Click);
            // 
            // BtnReset
            // 
            this.BtnReset.Location = new System.Drawing.Point(180, 408);
            this.BtnReset.Name = "BtnReset";
            this.BtnReset.Size = new System.Drawing.Size(75, 23);
            this.BtnReset.TabIndex = 15;
            this.BtnReset.Text = "Reset";
            this.BtnReset.UseVisualStyleBackColor = true;
            // 
            // TxtProspectName
            // 
            this.TxtProspectName.Location = new System.Drawing.Point(196, 48);
            this.TxtProspectName.Name = "TxtProspectName";
            this.TxtProspectName.Size = new System.Drawing.Size(141, 20);
            this.TxtProspectName.TabIndex = 20;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(64, 51);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(80, 13);
            this.label8.TabIndex = 19;
            this.label8.Text = "Prospect Name";
            // 
            // BtnSearch
            // 
            this.BtnSearch.Location = new System.Drawing.Point(376, 12);
            this.BtnSearch.Name = "BtnSearch";
            this.BtnSearch.Size = new System.Drawing.Size(75, 23);
            this.BtnSearch.TabIndex = 18;
            this.BtnSearch.Text = "Search";
            this.BtnSearch.UseVisualStyleBackColor = true;
            this.BtnSearch.Click += new System.EventHandler(this.BtnSearch_Click);
            // 
            // TxtProspectID
            // 
            this.TxtProspectID.Location = new System.Drawing.Point(196, 10);
            this.TxtProspectID.Name = "TxtProspectID";
            this.TxtProspectID.Size = new System.Drawing.Size(100, 20);
            this.TxtProspectID.TabIndex = 17;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(64, 17);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(63, 13);
            this.label9.TabIndex = 16;
            this.label9.Text = "Prospect ID";
            // 
            // FrmLoanProposal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(484, 518);
            this.Controls.Add(this.TxtProspectName);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.BtnSearch);
            this.Controls.Add(this.TxtProspectID);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.BtnReset);
            this.Controls.Add(this.BtnCalculate);
            this.Controls.Add(this.TxtEMI);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.TxtTotalAmountPayable);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.TxtTotalInterest);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.TxtInterestRate);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.CboLoanTenure);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.TxtLoanAmount);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.CboLoanType);
            this.Controls.Add(this.label1);
            this.Name = "FrmLoanProposal";
            this.Text = "Loan Proposal";
            this.Load += new System.EventHandler(this.FrmLoanProposal_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox CboLoanType;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox TxtLoanAmount;
        private System.Windows.Forms.ComboBox CboLoanTenure;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox TxtInterestRate;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox TxtTotalInterest;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox TxtTotalAmountPayable;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox TxtEMI;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button BtnCalculate;
        private System.Windows.Forms.Button BtnReset;
        private System.Windows.Forms.TextBox TxtProspectName;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Button BtnSearch;
        private System.Windows.Forms.TextBox TxtProspectID;
        private System.Windows.Forms.Label label9;
    }
}