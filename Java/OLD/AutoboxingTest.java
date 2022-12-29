import java.io.*;

public class AutoboxingTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        float f = 3.14F;
        int b = (int)f;

        Integer i = a;                  //Autoboxing

        b = i;                          //AutoUnboxing

        System.out.println("i = " + i);     //Unboxing

        System.out.println("br = " + br);

    }
}
