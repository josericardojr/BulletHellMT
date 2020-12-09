import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BulletProcessing extends Thread {
	
	Scene scene;
	List<Bullet> bullets;
	
	public BulletProcessing(Scene scene, List<Bullet> b) {
		this.bullets = b;
		this.scene = scene;
	}
	
	
	@Override
	public void run() {
		
		for (Bullet b : bullets) {
			
			Iterator<GameObject> go = scene.iterate();
			while (go.hasNext()) {
				
				GameObject g = go.next();
				if (g instanceof Collidable) {
					if (b.checkCollision((Collidable) g)) 
						b.setAlive(false);
				}
				
			}
		}
	}
}
