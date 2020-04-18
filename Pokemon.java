import java.lang.Math; 
import java.util.ArrayList;

public abstract class Pokemon {
    protected String name ;
    protected int HP ;
    private int PP ;


    public Pokemon (String name) {
        this.name = name ;
        this.HP = 0 ;
        this.PP = 0 ;
    }

    public String getName() {
        return name ;
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
    public abstract void attack(Pokemon enemy) ;


    public String toString() {
        return name ;
    }
}