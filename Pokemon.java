import java.lang.Math;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

public abstract class Pokemon {
    protected String name ;
    protected int HP ;
    private int PP ;
    private int Level ;


    public Pokemon (String name) {
        this.name = name ;
        this.HP = 0 ;
        this.PP = 0 ;
        this.Level = 0 ;
    }

    public Pokemon(String name , int maxHP , int maxPP , int maxLvl) {
        this.name = name ;
        this.HP = (int)(Math.random()*maxHP) ;
        this.PP = (int)(Math.random()*maxPP) ;
        this.Level = (int)(Math.random()*maxLvl) ;
    }

    public String getName() {
        return name ;
    }

    public int getHP () {
        return HP ;
    }
    public int getPP() {
        return PP ;
    }
    public int getLvl() {
        return Level ;
    }
    public boolean damage(int value) {
        if(HP == 0 ) {
            return false ;
        }
        int currentHP  = HP - value ;
        if(currentHP >= 0 ) {
            this.HP = currentHP ;
                return true ;
        }
        else {
            this.HP = 0 ;
            return true ;
        }

    }

    public boolean skill(int pvalue) {
         if(PP == 0) {
             return false ;
         }
         int currentPP = PP - pvalue ;
         if(currentPP >= 0 ) {
            this.PP = pvalue;
                return true ;
        }
        else {
            this.PP = 0 ;
            return true ;
    }
}
    public abstract void attack(Pokemon enemy) ;


    public String toString() {
        return name ;
    }
}