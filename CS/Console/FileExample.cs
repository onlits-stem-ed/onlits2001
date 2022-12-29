using System;
using System.IO;
class FileExample
{
	public static void Main(string[] args)
	{
		StreamWriter sw = new StreamWriter("Test.txt");
		Console.WriteLine("Enter some text below:");
		string text = Console.ReadLine();
		sw.WriteLine(text);
		sw.Close();
		Console.WriteLine("Text save in the file Test.txt");
	}
}
