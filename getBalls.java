import java.util.*;
public class getBalls {
    public static ArrayList<Ball> getBalls(int num) {
        ArrayList<Ball> balls = new ArrayList<Ball>() ;
            if (num < 1) {
                return balls ;
            }
            int BallsNumber = (int)(Math.random()*num) + 1 ;
            for (int i = 1 ; i< BallsNumber ; ++i) {
                int type = (int)(Math.random()*2);
                if (type == 0) 
                    balls.add(new Ultraball("UltraBall")) ;
                else if (type==1) 
                balls.add(new PokeBall("PokeBall")) ;
            }
        
            return balls ;
            }    

}