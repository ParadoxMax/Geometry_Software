public class Rectangle extends Quadrilateral {

    public Rectangle(Segment a, Segment b) {
        super(a, b, "Rectangle");  // constructor of the mother class

    }

    protected Rectangle(Segment a, Segment b, String name) {
        super(a, b, name);  // constructor of the mother class

    }

    public double perimeter() {
		/*double b = bot.getLength();
		Point a1 = bot.getP1();
		Point  a2 =	top.getP1();
		double a = a1.distanceTo(a2);
		return (a+b)*2;*/
        //return (bot.getLength()*2 + bot.getP1().distanceTo(top.getP1())*2);

        return (width() + high()) * 2;
    }

    public double width() {
        return bot.getLength();
    }

    public double high() {
        Point bot_p1 = bot.getP1();
        Point top_p1 = top.getP1();
        return bot_p1.distanceTo(top_p1);

        //return bot.getP1().distanceTo(top.getP1());
    }

    public double area() {
		/*double b = bot.getLength();
		Point a1 = bot.getP1();
		Point  a2 =	top.getP1();
		double a = a1.distanceTo(a2);
		return a*b;*/

        return width() * high();
    }


}