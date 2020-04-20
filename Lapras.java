import java.lang.Math; 

public class Lapras extends Pokemon {
    public Lapras(String name) {
        super(name, 240 , 30 , 40) ;
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(60);
    }
}