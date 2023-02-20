import java.util.ArrayList;

class PrimePartition {
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static ArrayList<Integer> getPrimeParts(int num) {
        var primeParts = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                primeParts.add(i);
            }
        }
        return primeParts;
    }

    static boolean primePartition(int num) {
        var primeParts = getPrimeParts(num);
        for (int x : primeParts) {
            for (int y : primeParts) {
                if (x + y == num) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("An argument required!");
        } else if (args.length == 1) {
            System.out.println(primePartition(Integer.parseInt(args[0])));
        } else {
            System.out.println("Too many arguments!");
        }
    }
}