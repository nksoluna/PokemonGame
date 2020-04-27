import java.lang.Math; 

public class Riolu extends Pokemon {
    public Riolu(String name) {
        super(name,200) ;
      
    }

    public Riolu(String name , int maxHP) {
        super(name,maxHP) ;
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(35) ;
    }
}