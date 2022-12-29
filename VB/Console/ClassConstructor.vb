Class Student
	Private reg_no As Integer
	Dim class_roll_no As Integer
	Dim name As String
	Dim age As Integer

	
	Public Sub New()
		reg_no = 0
		class_roll_no = 0
		name = "Some Student"	'Will this work strcpy()	?
		age = 0
	End Sub
	
	Public Sub New(reg as integer, roll as integer, nm as string, a as integer)
		reg_no = reg
		class_roll_no = roll
		name = nm
		age = a
	End Sub
	
	Sub Display()
	Console.WriteLine("Registration Number: {0}", reg_no)
	Console.WriteLine("Class Roll No: {0}", class_roll_no)
	Console.WriteLine("Name: {0}", name)
	Console.WriteLine("Age: {0}", age)
	End Sub

	Protected Overrides Sub Finalize()		'Destructor
		Console.WriteLine("Destructor Called")
	End Sub
End Class

Module ClassTest
	Sub main()
		Dim s as new Student(123, 1, "Aditya Raj", 20)
		Dim temp as new Student()
		s.Display()
	End Sub
End Module

'POSIX