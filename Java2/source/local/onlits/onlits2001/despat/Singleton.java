package local.onlits.onlits2001.despat;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {       //To stop instantiating this class from outside

    }

    public static Singleton getInstance() { // Factory Method
        if (instance == null) {
            instance =  new Singleton();
        }
        return instance;
    }

    void message(String message) {
        System.out.println(message);
    }
}
