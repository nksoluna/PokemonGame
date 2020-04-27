import java.util.*;
public class BallType {
    public static ArrayList<Ball> getBalls(int num) {
        ArrayList<Ball> balls = new ArrayList<Ball>() ;
            if (num < 1) {
                return balls ;
            }
            
            for(int i = 0 ; i < num; ++i){
                int type = (int)(Math.random()*5);
                if (type == 0){
                    balls.add(new PokeBall("Pokeball"));
                } 
                else if(type == 1){
                    balls.add(new Quickball("Quickball"));
                } 
                else if(type == 2){
                   balls.add(new Timerball("Timerball"));
                }  
                else if(type == 3){
                   balls.add(new Ultraball("Ultraball"));
                }  
                else if(type == 4){
                    balls.add(new Masterball("Masterball"));
                }  
                
            }
        
            return balls ;
            }    

}