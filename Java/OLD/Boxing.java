class MyInteger {
    int i;

    MyInteger (int p) {
        i = p;
    }

    int value(){
        return i;
    }
}
public class Boxing {
    public static void main(String[] args) {
        int i = 5;
        MyInteger a = new MyInteger(i);                 //Boxing
        System.out.println("a = " + a.value());         //Unboxing
        i = a.value();                                  //Unboxing
    }
}
