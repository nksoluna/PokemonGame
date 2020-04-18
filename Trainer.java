import java.util.*;
public class Trainer {
    private ArrayList<Pokemon> bag ;
    private Scanner sc ;
    public Trainer () {
     bag = new ArrayList<Pokemon>() ;
     sc = new Scanner(System.in);
     bag.add(new Lapras("Laprasgod"));
     bag.add(new Snorlax("My Snorlax"));
     bag.add(new Snorlax("Snorlax"));

    }
    public void play() {
        String cmd = "" ;
        

        do{
            System.out.print("Enter cmd : ");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                printPokemon();
            }
            else if(cmd.equals("Catch"))  {
                catchPokemon();
            }
        }while(!cmd.equals("q"));
        
    }

    public void catchPokemon() {
        System.out.println("All pokemons");
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>() ;
        int pokemonsNumber = (int)(Math.random()*5);
        for (int i = 1 ; i< pokemonsNumber ; ++i) {
            int type = (int)(Math.random()*2);
            if (type == 0) 
                pokemons.add(new Lapras("Wild Lapras")) ;
            else if (type==1) 
            pokemons.add(new Snorlax("Wild Snorlax")) ;
        }
        System.out.println("pokemon arround You!");
        int no = 1 ;
        for (Pokemon p : pokemons) {
            System.out.println("No." + no + " " + p.getName());
            no++ ;
        }

        System.out.println("You catch : ");
        no = sc.nextInt();
        
        bag.add(pokemons.get(no));
    }

    public void printPokemon(){
        
        System.out.println("Pokemon in bag");
                for(Pokemon p : bag) {
            System.out.println(p) ;
        }

    } 
}
