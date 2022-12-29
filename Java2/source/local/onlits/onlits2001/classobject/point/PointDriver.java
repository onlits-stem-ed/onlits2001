package local.onlits.onlits2001.classobject.point;

public class PointDriver {
    public static void main(String[] args) {
        Point p1, p2, p3;
        p1 = new Point(0.0f, 0.0f);
        p2 = new Point(5.5f, 3.9f);
        p3 = p1.add(p2);
        p1.display("p1");
        p2.display("p2");
        p3.display("p3");
    }
}
