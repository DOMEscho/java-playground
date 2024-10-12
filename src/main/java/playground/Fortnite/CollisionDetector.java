package playground.Fortnite;

public class CollisionDetector {

    public static boolean hasCollision(Hitbox hitbox, Bullet bullet) {
        // TODO: Implement the logic to detect if the bullet is inside the hitbox.
        Point2D bulletPosition = bullet.position;

        Point2D hitboxPosition = hitbox.position;
        int hitboxLeft = hitboxPosition.x;
        int hitboxRight = hitboxPosition.x + hitbox.width;
        // Y-achse verläuft von Oben nach Unten. Je Größer der Wert ist, bedeutet das es sich 
        // weiter unten befindet.
        int hitboxTop = hitboxPosition.y;
        int hitboxBottom = hitboxPosition.y + hitbox.height;

        // Bullet ist innerhalb der Grenze der Hitbox 
        boolean isWithinX = bulletPosition.x >= hitboxLeft && bulletPosition.x <= hitboxRight;
        boolean isWithinY = bulletPosition.y >= hitboxTop && bulletPosition.y <= hitboxBottom;
        return isWithinX && isWithinY;
    }
}
