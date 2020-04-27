
import java.util.*;

public class Bag {
    
    public static String name;
    public static ArrayList<Pokemon> bag;
    public static ArrayList<Ball> ball;

    public Bag() {
        bag = new ArrayList<Pokemon>();
        ball = new ArrayList<Ball>();
    }

    public void addBag(String name) {
        Bag.name = name;
       // System.out.println(name);
    }

    public static String bagString() {
        return name;
    }

    public static ArrayList<Ball> chooseBall() {
        return ball;
    }



    public ArrayList<Ball> countBall(){
        PokeBall pokeball = new PokeBall("Pokeball");
        Quickball quickball = new Quickball("Quickball");
        Timerball timerball = new Timerball("Timerball");
        Ultraball ultraball = new Ultraball("Ultraball");
        Masterball masterball = new Masterball("Masterball");
        for(Ball b : ball){
             if(b.getName() == "Pokeball"){
                int num = pokeball.getNumber() + 1 ;
                pokeball.setNumber(num);
            }
            else if(b.getName() == "Quickball"){
                int num = quickball.getNumber() + 1 ;
                pokeball.setNumber(num);
            }
		
            else if(b.getName() == "Timerball"){
                int num = timerball.getNumber() + 1 ;
                pokeball.setNumber(num);
            }
		
            else if(b.getName() == "Ultraball"){
                int num = ultraball.getNumber() + 1 ;
                pokeball.setNumber(num);
            }
		
            else if(b.getName() == "Masterball"){
                int num = masterball.getNumber() + 1 ;
                pokeball.setNumber(num);
            }
          
        }
        //System.out.println(ball);    
        return ball;
          
    }
  
}
