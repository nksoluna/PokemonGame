
import java.util.*;

public class Ptrainer implements PokemonTrainer{
    protected String name;
    private ArrayList<Ball> ball;
    private int ballnum;
    private int money;
    
    public Ptrainer(String name,int ballnum , int money){
        this.name = name;
        this.ballnum = ballnum;
        ball = new ArrayList<Ball>();
        this.money = money ;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMoney() {
    	return money ;
    }
    public void setMoney(int money) {
    	this.money = money ;
    }
    public int getNum(){
        return ballnum;
    }
    public ArrayList<Ball> getBall(){

        return ball;
    }
    public void addBall() {
        ArrayList<Ball> balls = BallType.getBalls(5);       
        
        for(Ball b  : balls){
            ball.add(b);
            
        }

         
    }

    public String toString(){
        return "Trainer : " +name + " Balls : " + ballnum ;
    }
    

}