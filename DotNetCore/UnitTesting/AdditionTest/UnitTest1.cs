namespace AdditionTest;

public class UnitTest
{
    Addition addition = new Addition();
    [Fact]
    public void TestAdd1()
    {
        Assert.Equal(30, addition.add(10, 20));
    }

    [Fact]
    public void TestAdd2()
    {
        Assert.Equal(5, addition.add(3, 3));
    }
    [Fact]
    public void TestAdd3()
    {
        Assert.Equal(5, addition.add(10, 100));
    }

    [Fact]
    public void TestSubtract1()
    {
        Assert.Equal(-1, new Subtraction().subtract(0, 1));
    }

    [Fact]
    public void TestSubtract2()
    {
        Assert.Equal(-1, new Subtraction().subtract(10, 1));
    }
}