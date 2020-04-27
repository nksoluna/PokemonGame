<<<<<<< HEAD
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
=======
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
>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
}