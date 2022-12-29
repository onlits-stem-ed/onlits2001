Class Student
	Private reg_no As Integer
	Dim class_roll_no As Integer
	Dim name As String
	Dim age As Integer

	Public Sub Input()
		Console.Write("Registration Number: ")
		reg_no = Console.ReadLine()
		Console.Write("Class Roll No: ")
		class_roll_no = Console.ReadLine()
		Console.Write("Name: ")
		name = Console.ReadLine()
		Console.Write("Age: ")
		age = Console.ReadLine()
	End Sub
	
	Sub Display()
	Console.WriteLine("Registration Number: {0}", reg_no)
	Console.WriteLine("Class Roll No: {0}", class_roll_no)
	Console.WriteLine("Name: {0}", name)
	Console.WriteLine("Age: {0}", age)
	End Sub
End Class

Module ClassTest
	Sub main()
		Dim s as new Student
	
		s.Input()
		s.Display()
	End Sub
End Module