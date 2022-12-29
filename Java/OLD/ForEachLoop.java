/*
	Find the largest number among 5 numbers
*/
public class ForEachLoop {
	public static void main(String[] args) {
		int large=0;
		int[] n = {15,25,6,80,12};
		for(int i : n) {
			if(i>large)
				large=i;
		}
		
		System.out.println("The largest value is " + large);
	}
}

/*
	C, C++, Java and most probably C# are free form language but not VB

	List some situations where do-while is favourable over while
	
	while((c=getc(fp)) != EOF)
	{
		putchar(c);
	}
	
	do
	{
	
	
	}
	while(...)
	
	for(i=m; i<=n; i++)
	{
	
	}
	
	int i=1;
	
	while(i<=10)
	{
	
		i++;
	}
	
	
	c = getc(fp)		macro		console
	c = fgetc(fp)		function	stream
	
	
	Modularization	-	Divide and conquer
	
	Top Down: POP
	Prime Number
		- Find the factors
			-
			-
		- Decide
		
	Bottom Up: OOP (Objects)		Experience
	
	Start from the parts	(patient, doctor, appointment)
	
	A real life entity represented in an OOP. Object may represent a person, place, a table of data or a process.
		
		class patient {
			string pid;
			
		}
		
		class doctor {
		
			String[] specialization() {
			
			}
		}
		
		class appoinment {
			String aid;
			
			void createAppointment() {
				doctor d = new doctor();
				sp[] = d.specialization();
			}
			
		}
		
*/
