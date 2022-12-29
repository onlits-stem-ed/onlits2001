package local.onlits.onlits2001.experiment;

interface InterfaceToExperiment {
    int a = 10;

    void experiment();
}

abstract class AbstractClass {
    public final int a = 20;

    public abstract void experiment(); // Abstract

    void experiment2() {// Concrete
        System.out.print("Concrete Method");
    }
}

public class InterfaceExperiment extends AbstractClass implements InterfaceToExperiment {
    public void experiment() {
        System.out.println("Method experiment overridden");
    }
    
    public static void main(String[] args) {
        InterfaceToExperiment r = new InterfaceExperiment();
        r.experiment();

        AbstractClass s = new InterfaceExperiment();
        s.experiment();
    }
}
