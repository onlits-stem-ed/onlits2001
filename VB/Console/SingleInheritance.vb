class A
	Dim a as Integer
	Sub New()
		a=10
	End Sub
	public Sub showa()
		Console.WriteLine("a=" & a)
	End Sub
End Class

class B 
	Inherits A
	Private b as Integer
	public Sub New()
		b=20
	End Sub
	public Sub New(x as Integer)
		b = x
	End Sub
	public Sub showb()
		Console.WriteLine("b=" & b)
	End Sub
End Class

Module SingleInheritance
	Sub Main()
		Dim obb as new B(30)
	
		obb.showa()
		obb.showb()
	End Sub
End Module