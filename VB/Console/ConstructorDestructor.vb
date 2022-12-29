Class Constructor
	dim a as integer
	Sub New(x as integer)
		a = x
		Console.WriteLine("Constructor Called " & a)
	End Sub
	
	Protected Overrides Sub Finalize()
		Console.WriteLine("Destructor Called " & a)
	End Sub
End Class

Module ConstructorDestructor
	Sub Main()
		Dim c1 as new Constructor(10)
		Dim C2 as new Constructor(20)
	End Sub
End Module