import java.lang.Math; 

public class Lapras extends Pokemon {
    public Lapras(String name) {
        super(name) ;
        HP = (int)(Math.random()*100) ;
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
    }
}