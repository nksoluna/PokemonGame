import java.lang.Math; 

public class Giratina extends Pokemon {
    public Giratina(String name) {
        super(name, 560) ;
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(120);
    }
}