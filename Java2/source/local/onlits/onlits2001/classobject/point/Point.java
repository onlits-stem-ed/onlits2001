package local.onlits.onlits2001.classobject.point;

public class Point {
    float x;
    float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point add(Point p) {
        Point r = new Point();
        r.x = this.x + p.x;
        r.y = this.y + p.y;
        return r;
    }

    public void display(String name) {
        System.out.println(name + "(" + this.x + ", " + this.y + ")");
    }
}