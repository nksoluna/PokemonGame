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
