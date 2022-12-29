package local.onlits.onlits2001.generics;

import local.onlits.onlits2001.generics.Box;

public class BoxTest {
    public static void main(String[] args)
    {
        Box <Integer> b1 = new Box <Integer>();
        b1.set(10);
        System.out.println("b1 = " + b1.get());
    }
}
