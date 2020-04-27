<<<<<<< HEAD
import java.util.*;
public class PokemonRandomizer {

    public static ArrayList<Pokemon> getPokemons(int num) {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>() ;
        if (num < 1) {
            return pokemons ;
        }
    
    
    for (int i = 0 ; i< num ; ++i) {
        int type = (int)(Math.random()*5);
        if (type == 0) 
            pokemons.add(new Lapras("Wild Lapras")) ;
        else if (type==1) 
        pokemons.add(new Snorlax("Wild Snorlax")) ;
        else if (type==2) 
        pokemons.add(new Riolu("Wild Riolu")) ;
        else if (type==3) 
        pokemons.add(new Lucario("Wild Lucario")) ;
        else if (type==4) 
        pokemons.add(new Giratina("Wild Giratina")) ;
    }

    return pokemons ;
    }
=======
import java.util.*;
public class PokemonRandomizer {

    public static ArrayList<Pokemon> getPokemons(int num) {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>() ;
        if (num < 1) {
            return pokemons ;
        }
    
    int pokemonsNumber = (int)(Math.random()*num) + 1 ;
    for (int i = 1 ; i< pokemonsNumber ; ++i) {
        int type = (int)(Math.random()*4);
        if (type == 0) 
            pokemons.add(new Lapras("Wild Lapras")) ;
        else if (type==1) 
        pokemons.add(new Snorlax("Wild Snorlax")) ;
        else if (type==2) 
        pokemons.add(new Riolu("Wild Riolu")) ;
        else if (type==3) 
        pokemons.add(new Lucario("Wild Lucario")) ;
    }

    return pokemons ;
    }
>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
}