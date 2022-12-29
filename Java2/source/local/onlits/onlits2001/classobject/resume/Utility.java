package local.onlits.onlits2001.classobject.resume;

public class Utility {
    final static int MAX_COLUMNS = 80;

    static void printLine() {
        printDash(MAX_COLUMNS);
        System.out.println();
    }

    static void printDash(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("-");
        }
    }

    static void alignCenter(String line) {
        int spaces = (MAX_COLUMNS / 2) - (line.length() / 2);
        printSpaces(spaces);
        System.out.println(line);
    }

    static void alignRight(String line) {
        int spaces = MAX_COLUMNS - line.length();
        printSpaces(spaces);
        System.out.println(line);
    }

    static void printSpaces(int spaces) {
        for (int i = 1; i <= spaces; i++)
            System.out.print(" ");
    }

    static void print80Columns(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
            if (i % 80 == 0 && i != 0)
                System.out.println();

        }
        System.out.println();
    }
}
