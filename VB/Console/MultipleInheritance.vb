interface A
	
	sub show()
End interface

interface B
	
	sub show()
end interface


class C
	Implements A, B
	Dim c as integer
	
	public sub new()
		c=30
	end sub
	public sub show() implements A.show, B.show
		Console.WriteLine("c=" & c)								'Overriding
	end sub
end class


Module MultipleInheritanceTest
	Sub Main()
		Dim obc as new C()
	
		obc.show()
	End Sub
End Module
