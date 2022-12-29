package local.onlits.onlits2001.inheritance.multiipleinheritance;

public class Shape implements Triangle, Rectangle {
    public double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double ar = Math.sqrt((s-a) * (s-b) * (s-c));
        return ar;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }
}
