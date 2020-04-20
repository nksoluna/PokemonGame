import java.lang.Math; 

public class Riolu extends Pokemon {
    public Riolu(String name) {
        super(name,200 , 15 , 10) ;
      
    }

    public Riolu(String name , int maxHP , int maxPP , int maxLvl) {
        super(name,maxHP,maxPP , maxLvl) ;
    }
    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + getName() + " " + "Attack " + enemy.getName());
        enemy.damage(35) ;
    }
}