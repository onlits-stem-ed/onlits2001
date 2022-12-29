namespace LoanApplication
{
    partial class FrmProspectList
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
            this.DgvProspect = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.DgvProspect)).BeginInit();
            this.SuspendLayout();
            // 
            // DgvProspect
            // 
            this.DgvProspect.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.DgvProspect.Location = new System.Drawing.Point(41, 51);
            this.DgvProspect.Name = "DgvProspect";
            this.DgvProspect.Size = new System.Drawing.Size(353, 318);
            this.DgvProspect.TabIndex = 0;
            // 
            // FrmProspectList
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.DgvProspect);
            this.Name = "FrmProspectList";
            this.Text = "Prospect List";
            this.Load += new System.EventHandler(this.FrmProspectList_Load);
            ((System.ComponentModel.ISupportInitialize)(this.DgvProspect)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView DgvProspect;
    }
}