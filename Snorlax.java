<<<<<<< HEAD
import java.lang.Math; 

public class Snorlax extends Pokemon {
    public Snorlax(String name) {
        super(name, 450) ;
        }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(15) ;
    }
=======
import java.lang.Math; 

public class Snorlax extends Pokemon {
    public Snorlax(String name) {
        super(name, 450 , 10 , 20) ;
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(15) ;
    }
>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
}