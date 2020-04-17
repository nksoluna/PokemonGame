import java.util.*;
import java.util.ArrayList;


public  class PokemonGame {

    public static void main (String arg[]) {
        System.out.println("Welcome to The Pokemon Game !!") ;
        Arraylist<Pokemon> bag = new ArrayList<Pokemon>() ;

        Pokemon Lapras = new Lapras("Laprasgod") ;
        Pokemon Snorlax = new Snorlax("My Snorlax") ;
        Pokemon Snorlax2 = new Snorlax("Snorlax") ;

        bag.add(Lapras);
        bag.add(Snorlax);
        bag.add(Snorlax2);

        for(Pokemon p : bag) {
            System.out.println(p) ;
        }

    }
}
