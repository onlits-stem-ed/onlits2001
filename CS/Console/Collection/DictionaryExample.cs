using System.Collections.Generic;
using System;
class DictionaryExample
{
    static void Main()
    {
        Console.WriteLine("This is the beginning of program");
        var openWith = new Dictionary<string, string>();
        openWith.Add("txt", "notepad.exe");
        openWith.Add("bmp", "paint.exe");
        openWith.Add("dib", "paint.exe");
        openWith.Add("rtf", "wordpad.exe");

        try
        {
            openWith.Add("txt", "winword.exe");
        }
        catch (System.ArgumentException)
        {
            Console.WriteLine("An element with Key = \"txt\" already exists.");
        }

        openWith["rtf"] = "winword.exe";

        openWith["doc"] = "winword.exe";

        try
        {
            Console.WriteLine(openWith["tif"]);
        }
        catch (KeyNotFoundException)
        {
            Console.WriteLine("Key = \"tif\" is not found.");
        }

        foreach (var option in openWith)
        {
            Console.WriteLine(option);
        }

        Console.WriteLine("This is the end of program.");
    }
}