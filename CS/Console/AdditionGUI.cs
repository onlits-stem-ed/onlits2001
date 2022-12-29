using System.Windows.Forms;
using System.Drawing;
using System;

class AdditionGUI : Form
{
	Label LblAugend = new Label();
	Label LblAddend = new Label();
	Label LblSum = new Label();
	TextBox TxtAugend = new TextBox();
	TextBox TxtAddend = new TextBox();
	TextBox TxtSum = new TextBox();
	Button BtnAdd = new Button();
	Button BtnReset = new Button();
	
	public AdditionGUI()
	{
	
		//Form
		this.Text="Addition Program";
	
		//LblAugend
		LblAugend.Size = new Size(100, 20);	
		LblAugend.Location = new Point(20,30);
		LblAugend.Text = "Augend";
		this.Controls.Add(LblAugend);
		
		//TxtAugend
		TxtAugend.Size = new Size(100, 20);	
		TxtAugend.Location = new Point(120,30);
		this.Controls.Add(TxtAugend);
		
		//LblAddend
		LblAddend.Size = new Size(100, 20);	
		LblAddend.Location = new Point(20,60);
		LblAddend.Text = "Addend";
		this.Controls.Add(LblAddend);
		
		//TxtAddend
		TxtAddend.Size = new Size(100, 20);	
		TxtAddend.Location = new Point(120,60);
		this.Controls.Add(TxtAddend);
		
		//LblSum
		LblSum.Size = new Size(100, 20);	
		LblSum.Location = new Point(20,90);
		LblSum.Text = "Sum";
		this.Controls.Add(LblSum);
		
		//TxtSum
		TxtSum.Size = new Size(100, 20);	
		TxtSum.Location = new Point(120,90);
		//TxtSum.ReadOnly = True
		this.Controls.Add(TxtSum);
		
		//BtnAdd
		BtnAdd.Size = new Size(60, 30);	
		BtnAdd.Location = new Point(20,120);
		BtnAdd.Text = "&Add";							//& enable us to create hotkey 
		this.Controls.Add(BtnAdd);
		this.BtnAdd.Click += new System.EventHandler(this.BtnAdd_Click);	//EventListener
		
		//BtnReset
		BtnReset.Size = new Size(60, 30);	
		BtnReset.Location = new Point(80,120);
		BtnReset.Text = "&Reset";
		this.Controls.Add(BtnReset);
	}
	
	private void BtnAdd_Click(object sender, System.EventArgs e)	//Event Handler
	{
		int a, b, c;
		
		a = Convert.ToInt32(TxtAugend.Text);
		b = Convert.ToInt32(TxtAddend.Text);
		
		c = a + b;
		
		TxtSum.Text = c.ToString();
		
		//MessageBox.Show(sender.ToString());
		//MessageBox.Show(e.ToString());
	}
	
	public static void Main()
	{
		//AdditionGUI app = new AdditionGUI();
		//Application.Run(app);
		
		Application.Run(new AdditionGUI());
	}
}

/*
	
	Importance of developing program with and without IDE
*/

