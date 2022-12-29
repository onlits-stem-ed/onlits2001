package local.onlits.onlits2001.string;

import java.util.Scanner;

public class InventorOfJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Q. Who is the inventor of Java?");
            System.out.print("A. ");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("James Gosling")) {
                System.out.println("Good!");
                break;
            } else {
                if(i<=2)
                    System.out.println("Try Again!");
                else
                    System.out.println("All your attempts are exhausted. Correct answer is James Gosling.");
            }
        }
        scan.close();
    }
}
