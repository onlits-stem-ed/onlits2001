package local.onlits.onlits2001.array;

import java.util.Scanner;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers below:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int flag = 0;

        
        for (int no : arr) {
            if (noOfDigits(no) % 2 == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {

            System.out.println("The number with even number of digits are:");
            for (int no : arr) {
                if (noOfDigits(no) % 2 == 0) {
                    System.out.println(no);
                }
            }
        } else {
            System.out.println("There are no numbers with even number of digits.");
        }
    }

    static int noOfDigits(int n) {
        int digits = 0;
        while (n > 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }
}