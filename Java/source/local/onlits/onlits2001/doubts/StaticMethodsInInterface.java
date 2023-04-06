package local.onlits.onlits2001.doubts;

public interface StaticMethodsInInterface {
    public static void randomStaticMethod() {
        System.out.println("This is a random static method.");
    }

    public static void main(String[] arg) {
        System.out.println("This is the main method.");
        randomStaticMethod();
    }
}