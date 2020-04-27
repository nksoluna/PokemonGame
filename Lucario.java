<<<<<<< HEAD
import java.lang.Math; 

public class Lucario extends Riolu {
    public Lucario(String name) {
        super(name, 350) ;
        
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(50) ;
    }

=======
import java.lang.Math; 

public class Lucario extends Riolu {
    public Lucario(String name) {
        super(name, 350 , 20 , 60) ;
        
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(50) ;
    }

>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
}