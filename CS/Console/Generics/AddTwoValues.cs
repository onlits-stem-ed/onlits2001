
class AddTwoValues<T>
{
    private static T _a;
    private static T _b;


    static int add(T a, T b)
    {
        _a = a;
        _b = b;
        return a + b;
    }
}

class TestAddTwoValues
{
    static void Main()
    {
        System.Console.WriteLine(AddTwoValues<float>.add(10.5f, 20.5f));

    }
}
