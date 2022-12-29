package local.onlits.onlits2001.classobject;

final class Constant {
    final float PI;
    Constant() {
        PI = 3.14f;
    }


    final float areaOfCircle(float r) {
        return PI * r * r;
    }
}

// class Circle extends Constant {      //Cannot subclass final class Constant
//     float areaOfCircle(float r) {
//         System.out.println("Overridden Method");
//         return (float)(Math.PI * Math.pow((double)r, 2));
//     }
// }

public class FinalMember {
    int a = 10;
    public static void main(String[] args) {
        Constant c = new Constant();
        System.out.println("The area is " + c.areaOfCircle(10));

        // Circle cir = new Circle();
        // System.out.println("The area is " + cir.areaOfCircle(5));
    }
}
