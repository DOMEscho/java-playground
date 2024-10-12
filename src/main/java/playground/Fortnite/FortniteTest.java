package playground.Fortnite;

public class FortniteTest {

    public static void run() {
        System.out.println("FortniteTest: Start...");

        // Test 1
        Hitbox hitbox = new Hitbox(new Point2D(0, 0));
        Bullet bullet = new Bullet(new Point2D(0, 0));
        boolean expected = true;
        boolean actual = CollisionDetector.hasCollision(hitbox, bullet);
        if (expected != actual) {
            fail(expected, actual);
        }
        
        // Test 2
        hitbox = new Hitbox(new Point2D(0, 0));
        bullet = new Bullet(new Point2D(100, 100));
        expected = false;
        actual = CollisionDetector.hasCollision(hitbox, bullet); 
        if (expected != actual) {
            fail(expected, actual);
        } 

        // Test 3
        hitbox = new Hitbox(new Point2D(0, 0));
        bullet = new Bullet(new Point2D(50, 100)); // RechtsUnten
        expected = true;
        actual = CollisionDetector.hasCollision(hitbox, bullet);
        if(expected != actual){
            fail(expected, actual);
        }
        
        //Test 4
        hitbox = new Hitbox(new Point2D(0, 0));
        bullet = new Bullet(new Point2D(0, 100));
        expected = true;
        actual = CollisionDetector.hasCollision(hitbox, bullet);
        if(expected != actual){
            fail(expected, actual);
        }

        // Test 5
        hitbox = new Hitbox(new Point2D(0, 0));
        bullet = new Bullet(new Point2D(-50, -50));
        expected = false;
        actual = CollisionDetector.hasCollision(hitbox, bullet);
        if(expected != actual){
            fail(expected, actual);
        }

        System.out.println("FortniteTest: Finished.");
    }
    
    private static void fail(Object expected, Object actual) {
        System.out.println("Test failed: expected '" + expected + "', but was '" + actual + "'");
    }
}
