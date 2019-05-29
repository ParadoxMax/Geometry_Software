public class Segment {
    private Point p1;
    private Point p2;

    public Segment() {
        this.p1 = new Point();
        this.p2 = new Point(0, 1);
    }

    public Segment(Point p) {
        this.p1 = new Point(); //origin
        this.p2 = p;
    }

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double getLength() {
        return p1.distanceTo(p2);
    }

    public String toString() {
        return "(" + p1.toString() + "and" + p2.toString() + ")";
    }
}