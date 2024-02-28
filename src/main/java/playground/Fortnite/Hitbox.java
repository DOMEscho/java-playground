package playground.Fortnite;

public class Hitbox {

    public Point2D position;
    public int height;
    public int width;

    public Hitbox(Point2D position) {
        this.position = position;
        // Default size
        this.height = 100;
        this.width = 50;
    }
}
