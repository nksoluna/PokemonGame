import java.lang.Math; 

public class Snorlax extends Pokemon {
    public Snorlax(String name) {
        super(name, 450) ;
        }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(15) ;
    }
}