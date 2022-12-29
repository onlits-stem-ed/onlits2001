package local.onlits.onlits2001.method;

public class MethodOverloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        
        return sum(a, b) + c;
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println("The sum of a and b is " + MethodOverloading.sum(a, b));
        System.out.println("The sum of a, b and c is " + sum(a, b, c));
        // System.out.println("The length of Mrityunjay is " + "Mrityunjay".length());
        // Integer in = 4;
        // System.out.println(a.toString());
        // MethodOverloading.sum(a, b);
    }
}
