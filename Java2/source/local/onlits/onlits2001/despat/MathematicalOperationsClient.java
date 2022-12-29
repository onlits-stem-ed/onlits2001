package local.onlits.onlits2001.despat;

public class MathematicalOperationsClient {
    public static void main(String[] args) {
        MathematicalOperations mo = new MathematicalOperations();
        System.out.println("a + b = " + mo.add(10,20));
        System.out.println("a - b = " + mo.sub(10, 20));
        System.out.println("a * b = " + mo.mul(10, 20));
        System.out.println("a / b = " + mo.div(10, 20));
    }
    
}
