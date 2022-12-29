<<<<<<< HEAD
imports System

class Complex
	Dim real, imag as Single
	
	Sub SetValue()
		Console.Write("Please enter real part: ")
		real = Console.ReadLine()
	
		Console.Write("Please enter imaginary part: ")
		imag = Console.ReadLine()
	End Sub
	Sub GetValue()
		Console.WriteLine("real: " & real & "  imag: " & imag)
	End Sub
End Class

Module ComplexTry
	Sub Main()
		Dim c as new Complex()
		c.SetValue()
		c.GetValue()
	End Sub
End Module

	'In the above program we have violeted encapsulation	
	REM	Managed Program	-	program that are targeted toward CLR
=======
imports System

class Complex
	Dim real, imag as Single
	
	Sub SetValue()
		Console.Write("Please enter real part: ")
		real = Console.ReadLine()
	
		Console.Write("Please enter imaginary part: ")
		imag = Console.ReadLine()
	End Sub
	Sub GetValue()
		Console.WriteLine("real: " & real & "  imag: " & imag)
	End Sub
End Class

Module ComplexTry
	Sub Main()
		Dim c as new Complex()
		c.SetValue()
		c.GetValue()
	End Sub
End Module

	'In the above program we have violeted encapsulation	
	REM	Managed Program	-	program that are targeted toward CLR
>>>>>>> a8223819cb6bfb5d6ae4a479581df51dcea3df00
