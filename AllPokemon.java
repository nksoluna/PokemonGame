
import java.util.*;

public class AllPokemon {
    
    public static ArrayList<Pokemon> getPokemon(int num){
        ArrayList<Pokemon> partner = new ArrayList<Pokemon>();
        if(num < 1){
            return partner;
        }

        for(int i = 0 ; i < num ; ++i){
            
            if(i == 0){
                 partner.add(new Lapras("Lapras"));
            }

            else if(i == 1){
                partner.add(new Snorlax("Snorlax"));
            }

            else if(i == 2){
                partner.add(new Riolu("Riolu")); 
            }
                
            else if(i == 3){
                partner.add(new Lucario("Lucario"));
            } 
            else if(i == 4){
                partner.add(new Giratina("Giratina"));
            } 
        
        }
        return partner;
        
    }
}


