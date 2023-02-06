using System.Collections.Generic;
class ListExample
{
    static void Main()
    {
        List<string> salmons = new List<string>();
        salmons.Add("chinook");
        salmons.Add("coho");
        salmons.Add("pink");
        salmons.Add("sockeye");
        foreach(string salmon in salmons)
        {
            System.Console.WriteLine(salmon);
        }
    }
}