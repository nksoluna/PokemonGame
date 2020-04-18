import java.lang.Math; 

public class Snorlax extends Pokemon {
    public Snorlax(String name) {
        super(name) ;
        HP = (int)(Math.random()*1000) ;
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
    }
}