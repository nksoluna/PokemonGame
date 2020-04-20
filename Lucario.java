import java.lang.Math; 

public class Lucario extends Riolu {
    public Lucario(String name) {
        super(name, 350 , 20 , 60) ;
        
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(50) ;
    }

}