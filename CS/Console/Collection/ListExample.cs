using System.Collections.Generic;
class ListExample
{
    static void Main()
    {
        var salmons = new List<string>();
        salmons.Add("chinook");
        salmons.Add("coho");
        salmons.Add("pink");
        salmons.Add("sockeye");
        foreach(var salmon in salmons)
        {
            System.Console.WriteLine(salmon);
        }
    }
}