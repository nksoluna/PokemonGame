import java.lang.Math; 
import java.util.ArrayList;


public abstract class Ball {
    protected String name ;
    protected int number ;
    
    public Ball (String name) {
        this.name = name ;
    }

    public Ball(String name , int numRandom) {
        this.name = name ;
        this.number = (int)(Math.random()*numRandom) + 1 ;
    }

    public String getName() {
        return name ;
    }

    public int getNumber() {
        return number ;
    }

    public boolean isCatch(int num) {
        if(this.number == num ) {
                return true ;
        }
        else {
            
            return false ;
        }
    }
    public String toString() {
        return name ;
    }
}