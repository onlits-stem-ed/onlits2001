using System;
class Complex
{
    float _real;
    float _imag;

    public Complex()
    {
        _real = 0.0F;
        _imag = 0.0F;
    }

    public Complex(float real, float imag)
    {
        _real = real;
        _imag = imag;
    }

    public static Complex operator+(Complex x, Complex y)
    {
        Complex t = new Complex();
        t._real = x._real + y._real;
        t._imag = x._imag + y._imag;
        return t;
    }

    // public Complex Add(Complex y)
    // {
    //     Complex t = new Complex();
    //     t._real = _real + y._real;
    //     t._imag = _imag + y._imag;
    //     return t;
    // }

    public void Display()
    {
        Console.WriteLine("real: {0}, imag: {1}", _real, _imag);
    }

    public static void Message()
    {
        Console.WriteLine("Hello");
    }
}

class OperatorOverloading
{
    public static void Main()
    {
        Complex c1 = new Complex(10.2F, 20.4F);
        Complex c2 = new Complex(50.23F, 100.96F);
        Complex c3;
        c3 = c1 + c2;
        // c3 = c1.Add(c2);
        c3.Display();
        Complex.Message();
    }
}