<<<<<<< HEAD

public class PokemonGame   {

    public static void main(String[] args) {
        System.out.println("Start Pokemon Game!");
        new SelectTrainer();
        

       
        System.out.println("\n\nEnd Pokemon Game!");

    }

}  
=======
import java.util.*;
import java.util.ArrayList;


public class PokemonGame {

    public static void main (String arg[]) {
        System.out.println("Welcome to The Pokemon Game !!") ;

        Trainer t = new Trainer("Trainer Name : Red");
        //MainGame mg = new MainGame(t) ;
         t.play() ;
        System.out.println("End Pokemon Game") ; 
        
    }
}
>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
