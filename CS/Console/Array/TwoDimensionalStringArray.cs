using System;

namespace Onlits2001
{
    public class TwoDimensionalStringArray
    {
        static void Main()
        {
            string[,] employees = {
                {"E001", "Mrityunjay", "SWE2"},
                {"E002", "Pawan Kumar", "SWE2"},
                {"E003", "Venkatragavan Krishna Aiyar", "SWE4"}
            };

            Console.WriteLine("{0, -15}{1, -30}{2}","Employee Id","Employee Name", "Designation");
            for (int i=0; i<employees.GetLength(0); i++)
            {
                for(int j=0; j<employees.GetLength(1); j++)
                {
                    if(j==0)
                        Console.Write("{0,-15}", employees[i, j]);
                    else if(j==1)
                        Console.Write("{0,-30}", employees[i, j]);
                    else if(j==2)
                        Console.Write("{0}", employees[i, j]);
                }
                Console.WriteLine();
            }
        }
    }
}