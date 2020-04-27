<<<<<<< HEAD
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
=======
import java.util.*;
public class Trainer {
    private ArrayList<Pokemon> bag ;
    private Scanner sc ;
    private String name ;
    private ArrayList<Ball> ballbag ;
    public Trainer (String name) {
     bag = new ArrayList<Pokemon>() ;
     ballbag = new ArrayList<Ball>() ;
     sc = new Scanner(System.in);
     bag.add(new Lapras("Laprasgod"));
     bag.add(new Snorlax("My Snorlax"));
     bag.add(new Snorlax("Snorlax"));
     bag.add(new Lucario("Goku"));
     ballbag.add(new PokeBall("Pokeball")) ;
     ballbag.add(new Ultraball("Ultraball")) ;

     this.name = name ;


    }
    public String getName() {
        return this.name ;
    }
    public void play() {
        String cmd = "" ;
        

        do{
            System.out.print("Enter cmd : ");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                System.out.println("\n\nPokemon in bag !! ");
                printPokemon(bag);
            }
            else if(cmd.equals("catch"))  {
                catchPokemon();
            }
            else if(cmd.equals("myball"))  {
                printBall(ballbag);
            }
            else if(cmd.equals("findball"))  {
                findBall() ;
            }
        }while(!cmd.equals("q"));
        
    }

    public void catchPokemon() {
        System.out.println("All pokemons");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(10);
        System.out.println("pokemon arround You!");
        int no = 0 ;
        printPokemon(pokemons);

        System.out.println("\n\nSelect Pokemon number or run (-1) ?" ); 
        no = sc.nextInt();
        if(no < 0) {
            sc.nextLine();
            return ;
        }
        Pokemon wildPokemon = pokemons.get(no);
        
        printPokemon(bag);
        System.out.println("Choose Your pokemon in bag !! ");
        no = sc.nextInt(); 
        Pokemon myPokemon = bag.get(no) ;
        
        boolean isWin = false ;
        do {
            myPokemon.attack(wildPokemon);
            if(wildPokemon.getHP() == 0) {
                isWin = true ;
                break;
            }
            else {
                wildPokemon.attack(myPokemon);
                if (myPokemon.getHP() == 0) {
                    isWin = false ;
                    break;
                }
            }
        }while(true) ;

        if(isWin) {
                
            System.out.println("Select your PokeBalls");
            printBall(ballbag);
            no = sc.nextInt(); 
            Ball myBall = ballbag.get(no) ;
           
                int catchNumber = (int)(Math.random()*10) + 1 ;
                if (myBall.getNumber() == catchNumber || myBall.getNumber() == 3 || myBall.getNumber() == 5 ) {
            System.out.println("You catch!");
        
            sc.nextLine();
            
            bag.add(wildPokemon);
                }
               else  {
                System.out.println(wildPokemon.getName() + " " + "Ran away");
                sc.nextLine() ;
                }
        }
        else {
            System.out.println(wildPokemon.getName() + " " + "Ran away");
            sc.nextLine();
        }

       
    }

    public void findBall() {
        System.out.println("All Balls You can get !!");
         ArrayList<Ball> balls = BallType.getBalls(5);
        int num = 0 ;
        printBall(balls);

        System.out.println("\n\nSelect ball you want or ignored them (-1) ?" ); 
        num = sc.nextInt();
        if(num < 0) {
            sc.nextLine();
            return ;
        }

        Ball wildball= balls.get(num);
        
        
        boolean CaNYougetIt = false ;
        int random = (int)(Math.random()*10) + 1 ;
            if(random == 1) {
                CaNYougetIt = true ;
                
            }
            else if(random == 3) {
                CaNYougetIt = true ;
                
            }
            else if(random == 5) {
                CaNYougetIt = true ;
               
            }
            else if(random == 7) {
                CaNYougetIt = true ;
                
            }
            else {
                
                CaNYougetIt = false ;
                    
                }
            
        

        if(CaNYougetIt) {

            System.out.println("You can get it!!");
        
            sc.nextLine();
            
            ballbag.add(wildball);
        }
        else {
            System.out.println("Better Luck Next time !!");
            sc.nextLine();
        }

       
    }
    public void printPokemon(ArrayList <Pokemon> pokemons){
      
        int number = 0 ;
                for(Pokemon p : pokemons) {
            System.out.println("" + number + " " + p + " HP : " + p.getHP() + " PP : " + p.getPP()) ;
            number++;   
            
        }
    }
        public void printBall(ArrayList <Ball> Balls){
      
            int number = 0 ;
                    for(Ball b : Balls) {
                System.out.println("" + number + " " + b + " Random number Balls : " + b.getNumber());
                number++;   
                
            }

    } 

    public ArrayList <Pokemon> getBag() {
        return bag;
    }

    public ArrayList <Ball> getBallBag() {
        return ballbag ;
    }
}
>>>>>>> 4359bc21fc8eeb1a93576d7e167b50a1fca91158
