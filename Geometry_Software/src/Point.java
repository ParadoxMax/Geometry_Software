public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void setX(int a) {
        this.x = a;
    }

    public int getX() {
        return x;
    }

    public void setY(int a) {
        this.y = a;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(((this.y - p.getY()) * (this.y - p.getY())) + ((this.x - p.getX()) * (this.x - p.getX())));
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        //we should convert object to point
        Point other = (Point) obj;
        if (this.x != other.x)
            return false;
        if (this.y != other.y)
            return false;
        return true;
    }
}
