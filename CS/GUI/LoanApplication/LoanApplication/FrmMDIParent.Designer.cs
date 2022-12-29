namespace LoanApplication
{
    partial class FrmMDIParent
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
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.masterToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.loanTypesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.prospectToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.newProspectToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.editProspectToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.transactionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.loanProposalToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.loanApplicationToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.loanAmortisationTableToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.helpToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.viewHelpToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.aboutLoanApplicationToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem2 = new System.Windows.Forms.ToolStripMenuItem();
            this.prospectListToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.masterToolStripMenuItem,
            this.transactionToolStripMenuItem,
            this.toolStripMenuItem1,
            this.toolStripMenuItem2,
            this.helpToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // masterToolStripMenuItem
            // 
            this.masterToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.loanTypesToolStripMenuItem,
            this.prospectToolStripMenuItem});
            this.masterToolStripMenuItem.Name = "masterToolStripMenuItem";
            this.masterToolStripMenuItem.Size = new System.Drawing.Size(55, 20);
            this.masterToolStripMenuItem.Text = "Master";
            // 
            // loanTypesToolStripMenuItem
            // 
            this.loanTypesToolStripMenuItem.Name = "loanTypesToolStripMenuItem";
            this.loanTypesToolStripMenuItem.Size = new System.Drawing.Size(132, 22);
            this.loanTypesToolStripMenuItem.Text = "Loan Types";
            // 
            // prospectToolStripMenuItem
            // 
            this.prospectToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.newProspectToolStripMenuItem,
            this.editProspectToolStripMenuItem});
            this.prospectToolStripMenuItem.Name = "prospectToolStripMenuItem";
            this.prospectToolStripMenuItem.Size = new System.Drawing.Size(132, 22);
            this.prospectToolStripMenuItem.Text = "Prospect";
            // 
            // newProspectToolStripMenuItem
            // 
            this.newProspectToolStripMenuItem.Name = "newProspectToolStripMenuItem";
            this.newProspectToolStripMenuItem.Size = new System.Drawing.Size(147, 22);
            this.newProspectToolStripMenuItem.Text = "New Prospect";
            this.newProspectToolStripMenuItem.Click += new System.EventHandler(this.newProspectToolStripMenuItem_Click);
            // 
            // editProspectToolStripMenuItem
            // 
            this.editProspectToolStripMenuItem.Name = "editProspectToolStripMenuItem";
            this.editProspectToolStripMenuItem.Size = new System.Drawing.Size(147, 22);
            this.editProspectToolStripMenuItem.Text = "Edit Prospect";
            this.editProspectToolStripMenuItem.Click += new System.EventHandler(this.editProspectToolStripMenuItem_Click);
            // 
            // transactionToolStripMenuItem
            // 
            this.transactionToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.loanProposalToolStripMenuItem,
            this.loanApplicationToolStripMenuItem,
            this.loanAmortisationTableToolStripMenuItem});
            this.transactionToolStripMenuItem.Name = "transactionToolStripMenuItem";
            this.transactionToolStripMenuItem.Size = new System.Drawing.Size(79, 20);
            this.transactionToolStripMenuItem.Text = "Transaction";
            // 
            // loanProposalToolStripMenuItem
            // 
            this.loanProposalToolStripMenuItem.Name = "loanProposalToolStripMenuItem";
            this.loanProposalToolStripMenuItem.Size = new System.Drawing.Size(202, 22);
            this.loanProposalToolStripMenuItem.Text = "Loan Proposal";
            this.loanProposalToolStripMenuItem.Click += new System.EventHandler(this.loanProposalToolStripMenuItem_Click);
            // 
            // loanApplicationToolStripMenuItem
            // 
            this.loanApplicationToolStripMenuItem.Name = "loanApplicationToolStripMenuItem";
            this.loanApplicationToolStripMenuItem.Size = new System.Drawing.Size(202, 22);
            this.loanApplicationToolStripMenuItem.Text = "Loan Application";
            // 
            // loanAmortisationTableToolStripMenuItem
            // 
            this.loanAmortisationTableToolStripMenuItem.Name = "loanAmortisationTableToolStripMenuItem";
            this.loanAmortisationTableToolStripMenuItem.Size = new System.Drawing.Size(202, 22);
            this.loanAmortisationTableToolStripMenuItem.Text = "Loan Amortisation Table";
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(12, 20);
            // 
            // helpToolStripMenuItem
            // 
            this.helpToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.viewHelpToolStripMenuItem,
            this.aboutLoanApplicationToolStripMenuItem});
            this.helpToolStripMenuItem.Name = "helpToolStripMenuItem";
            this.helpToolStripMenuItem.Size = new System.Drawing.Size(44, 20);
            this.helpToolStripMenuItem.Text = "Help";
            // 
            // viewHelpToolStripMenuItem
            // 
            this.viewHelpToolStripMenuItem.Name = "viewHelpToolStripMenuItem";
            this.viewHelpToolStripMenuItem.Size = new System.Drawing.Size(200, 22);
            this.viewHelpToolStripMenuItem.Text = "View Help";
            // 
            // aboutLoanApplicationToolStripMenuItem
            // 
            this.aboutLoanApplicationToolStripMenuItem.Name = "aboutLoanApplicationToolStripMenuItem";
            this.aboutLoanApplicationToolStripMenuItem.Size = new System.Drawing.Size(200, 22);
            this.aboutLoanApplicationToolStripMenuItem.Text = "About Loan Application";
            // 
            // toolStripMenuItem2
            // 
            this.toolStripMenuItem2.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.prospectListToolStripMenuItem});
            this.toolStripMenuItem2.Name = "toolStripMenuItem2";
            this.toolStripMenuItem2.Size = new System.Drawing.Size(54, 20);
            this.toolStripMenuItem2.Text = "Report";
            // 
            // prospectListToolStripMenuItem
            // 
            this.prospectListToolStripMenuItem.Name = "prospectListToolStripMenuItem";
            this.prospectListToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.prospectListToolStripMenuItem.Text = "Prospect List";
            this.prospectListToolStripMenuItem.Click += new System.EventHandler(this.prospectListToolStripMenuItem_Click);
            // 
            // FrmMDIParent
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.menuStrip1);
            this.IsMdiContainer = true;
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "FrmMDIParent";
            this.Text = "Loan Application";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.FrmMDIParent_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem masterToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem loanTypesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem transactionToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem loanProposalToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem loanApplicationToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem loanAmortisationTableToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem helpToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem viewHelpToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem aboutLoanApplicationToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem prospectToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem newProspectToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem editProspectToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem prospectListToolStripMenuItem;
    }
}

