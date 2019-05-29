public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point();
        p3.setX(5);
        p3.setY(6);

        Point p4 = p1; // p4 tekhou el pointeur taa l p1

        if (p1 == p3) {
            System.out.printf("p1  %s is p3 %s \n", p1, p3);
        } else {
            System.out.printf("p1  %s is not to p3 %s \n", p1, p3);
        }

        if (p1.equals(p3)) {
            System.out.printf("p1  %s is p3 %s \n", p1, p3);
        } else {
            System.out.printf("p1  %s is not to p3 %s \n", p1, p3);
        }

        if (p1 == p4) //compare pointers
        {
            System.out.printf("p1  %s is p4 %s \n", p1, p4);
        } else {
            System.out.printf("p1  %s is not to p4 %s \n", p1, 4);
        }

        if (p1.equals(p4)) {
            System.out.printf("p1  %s is p4 %s \n", p1, p4);
        } else {
            System.out.printf("p1  %s is not to p4 %s \n", p1, 4);
        }


        if ((p1.getX() == p3.getX()) && (p1.getY() == p3.getY())) {
            System.out.printf("p1  %s is equal to p3 %s \n", p1, p3);
        } else {
            System.out.printf("p1  %s is different from p3 %s \n", p1, p3);
        }
        if ((p1.getX() < p2.getX()) && (p1.getY() < p2.getY())) {
            System.out.printf("p1  %s is lower than p2 %s \n", p1, p2);
        } else {
            System.out.printf("p1  %s is higher than or equal to p2 %s \n", p1, p2);
        }

        Segment l1 = new Segment(p1, p2);
        Segment l2 = new Segment();
        Segment l3 = new Segment(p3);

        System.out.println("the length of the line between " + l1 + " is equal to: " + l1.getLength());
        System.out.println("the length of the line between " + l2 + " is equal to: " + l2.getLength());
        System.out.println("the length of the line between " + l3 + " is equal to: " + l3.getLength());


        Rectangle r = new Rectangle(l1, l2);
        System.out.println("the area of " + r + " is " + r.area());

        Square s = new Square(l1, l2);
        System.out.println("the area of " + s + " is " + s.area());

        Rectangle r1 = s;
        System.out.println("The area of " + r1 + " is " +  r1.area());


    }


}

