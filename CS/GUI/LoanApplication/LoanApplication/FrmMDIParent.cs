using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LoanApplication
{
    public partial class FrmMDIParent : Form
    {
        public FrmMDIParent()
        {
            InitializeComponent();
        }

        private void loanProposalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmLoanProposal LoanProposal = new FrmLoanProposal();
            LoanProposal.MdiParent = this;
            LoanProposal.Show();
        }

        private void FrmMDIParent_Load(object sender, EventArgs e)
        {

        }

        private void newProspectToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmProspect Prospect = new FrmProspect();
            Prospect.MdiParent = this;
            Prospect.Show();
        }

        private void editProspectToolStripMenuItem_Click(object sender, EventArgs e)
        {
            EditProspect eprospect = new EditProspect();
            eprospect.MdiParent = this;
            eprospect.Show();
        }

        private void prospectListToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmProspectList prospectlist = new FrmProspectList();
            prospectlist.MdiParent = this;
            prospectlist.Show();
        }
    }
}
