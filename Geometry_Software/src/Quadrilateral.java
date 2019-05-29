public class Quadrilateral {
    protected Segment bot;
    protected Segment top;
    protected String name;

    public Quadrilateral(Segment a, Segment b, String name) {
        this.bot = a;
        this.top = b;
        this.name = name;
    }

    public Segment getBot() {
        return bot;
    }

    public void setBot(Segment bot) {
        this.bot = bot;
    }

    public Segment getTop() {
        return top;
    }

    public void setTop(Segment top) {
        this.top = top;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {

        return name + "{" + top + " " + bot + "}";

    }


}
