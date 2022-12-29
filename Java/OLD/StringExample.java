import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        String s1 = new String("Bihar");                    //immutable string
        String s2 = "Muzaffarpur";
        String s3;
        StringBuilder sb1 = new StringBuilder("Patna");     //mutable string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s3 = sc.next();

        System.out.println(s1);
        System.out.println("The length of " + s1 + " is " + "Bihar".length());
        //System.out.println(s2);
        System.out.println(sb1);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter another string: ");
        s2 = sc2.next();
        sc.close();
        sc2.close();
    }
}
