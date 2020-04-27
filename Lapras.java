<<<<<<< HEAD
import java.lang.Math; 

public class Lapras extends Pokemon {
    public Lapras(String name) {
        super(name, 240) ;
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(60);
    }
=======
import java.lang.Math; 

public class Lapras extends Pokemon {
    public Lapras(String name) {
        super(name, 240 , 30 , 40) ;
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(60);
    }
>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
}