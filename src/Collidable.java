import java.awt.Rectangle;

public interface Collidable {
	
	boolean checkCollision(Collidable other);
	Rectangle getCollisionRect();
	void onCollision(Collidable other);
}
