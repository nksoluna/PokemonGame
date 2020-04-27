import java.lang.Math; 
import java.util.ArrayList;


public abstract class Ball {
    protected String name ;
    protected int number ;
    private int rate ;
    
    public Ball(String name , int rate) {
        this.name = name ;
        this.number = 1 ;
        this.rate = rate ;
    }

    public String getName() {
        return name ;
    }

    public int getNumber() {
        return number ;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public String toString(){
        return name + " : " + number;
    }

	public int getRate() {
	
		return rate;
	}
 
   
}