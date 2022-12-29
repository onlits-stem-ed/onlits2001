using System;
using System.IO;

class FileInputOutput
{
    static void Main()
    {
        StreamWriter sw;
        sw = new StreamWriter("Stationery.123");
        sw.WriteLine("Paper, Pen, Notebook, Eraser, Sharpner");
        Console.WriteLine("File created and information saved.");
        sw.Close();
        Console.ReadKey();
        Console.WriteLine("The file contains the following information:");
        StreamReader sr = new StreamReader("Stationery.123");
        Console.WriteLine(sr.ReadLine());
        sr.Close();
    }
}