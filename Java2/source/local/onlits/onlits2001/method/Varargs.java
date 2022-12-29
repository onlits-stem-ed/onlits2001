package local.onlits.onlits2001.method;

public class Varargs {
    
    static int sum(int... x){
        int s=0;
        if(x.length>5) {
            System.out.println("Cannot accept more than 5 numbers.\n");
            return 0;
        }
        for (int i : x) {
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20,30,40,50));
    }
}