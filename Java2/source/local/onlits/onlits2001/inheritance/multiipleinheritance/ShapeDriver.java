package local.onlits.onlits2001.inheritance.multiipleinheritance;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape triangle = new Shape();
        System.out.println("Area of Triange: " + triangle.area(3, 4, 5));
        Shape rectangle = new Shape();  
        System.out.println("Area of Rectangle: " + rectangle.area(6, 4));
    }
}
