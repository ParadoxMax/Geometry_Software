public class Square extends Rectangle {
    public Square(Segment a, Segment b) {
        super(a, b, "Square");
    }

    public double perimeter() {
        double b = bot.getLength();
        return 4 * b;

    }

    public double area() {
        double b = bot.getLength();
        return b * b;
    }


}