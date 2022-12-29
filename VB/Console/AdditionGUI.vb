Imports System.Windows.Forms			'Namespace
Imports System.Drawing					'Namespace

Class Addition 
	inherits Form
	
	Dim LblAugend as New Label()		'Create a Label Object
	Dim TxtAugend as New TextBox()
	Dim LblAddend as New Label()
	Dim TxtAddend as New TextBox()
	Dim LblSum as New Label()
	Dim TxtSum as New TextBox()
	Dim WithEvents BtnAdd as New Button()
	Dim BtnReset as New Button()
	
	Sub New()
	
		'Form
		Me.Text="Addition Program"
	
		'LblAugend
		LblAugend.Size = new Size(100, 20)	
		LblAugend.Location = new Point(20,30)
		LblAugend.Text = "Augend"
		Me.Controls.Add(LblAugend)
		
		'TxtAugend
		TxtAugend.Size = new Size(100, 20)	
		TxtAugend.Location = new Point(120,30)
		Me.Controls.Add(TxtAugend)
		
		'LblAddend
		LblAddend.Size = new Size(100, 20)	
		LblAddend.Location = new Point(20,60)
		LblAddend.Text = "Addend"
		Me.Controls.Add(LblAddend)
		
		'TxtAddend
		TxtAddend.Size = new Size(100, 20)	
		TxtAddend.Location = new Point(120,60)
		Me.Controls.Add(TxtAddend)
		
		'LblSum
		LblSum.Size = new Size(100, 20)	
		LblSum.Location = new Point(20,90)
		LblSum.Text = "Sum"
		Me.Controls.Add(LblSum)
		
		'TxtSum
		TxtSum.Size = new Size(100, 20)	
		TxtSum.Location = new Point(120,90)
		'TxtSum.ReadOnly = True
		Me.Controls.Add(TxtSum)
		
		'BtnAdd
		BtnAdd.Size = new Size(60, 30)	
		BtnAdd.Location = new Point(20,120)
		BtnAdd.Text = "&Add"							'& enable us to create hotkey 
		Me.Controls.Add(BtnAdd)
		
		'BtnReset
		BtnReset.Size = new Size(60, 30)	
		BtnReset.Location = new Point(80,120)
		BtnReset.Text = "&Reset"
		Me.Controls.Add(BtnReset)
	End Sub
	
	
	Private Sub BtnAdd_Click(ByVal sender As System.Object, ByVal e as System.EventArgs) Handles BtnAdd.Click
		Dim a, b, c as Integer
		
		a = TxtAugend.Text
		b = TxtAddend.Text
		
		c = a + b
		
		TxtSum.Text = c
	End Sub

End Class

Module AdditionGUI
	Sub Main
		Application.Run(new Addition())
	End Sub
End Module
