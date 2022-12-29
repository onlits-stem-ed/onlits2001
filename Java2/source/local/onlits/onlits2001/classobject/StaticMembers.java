package local.onlits.onlits2001.classobject;

class Members {
    int a;
    static int b;

    void display() {
        System.out.println("this.a=" + this.a);
        System.out.println("this.b=" + this.b);
    }

    // static void temp() {
        // System.out.println(this.a);
    // }
}

public class StaticMembers {
    public static void main(String[] args) {
        Members m = new Members();
        Members n = new Members();
        m.a = 10;
        Members.b = 20;
        n.a=50;
        m.b=30;
        n.b=100;
        System.out.println("m.a=" + m.a);
        System.out.println("Members.b=" + Members.b);
        System.out.println("m.b=" + m.b);
        n.display();
    }
}
