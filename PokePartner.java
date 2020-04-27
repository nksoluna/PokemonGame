
import java.util.*;

public class PokePartner {
    
    private ArrayList<Ball> ball2;
    private ArrayList<Ball> balls;
    private ArrayList<PokemonTrainer> trainer;

    public PokePartner(){
        balls = new ArrayList<Ball>(); 
        trainer = new ArrayList<PokemonTrainer>();
        ball2 = new ArrayList<Ball>(); 
    }
    
    public void select(){
        
        Ptrainer s = new Ptrainer("RED",5,5000);
        trainer.add(s);
        s.addBall();
        
        
        
        ball2 = s.getBall();
        
    }
    public ArrayList<PokemonTrainer> act(){

        select();
        return trainer;
    }

    public void addBall(ArrayList<Ball> ball){
        PokeBall pokeball = new PokeBall("Pokeball");
        Quickball quickball = new Quickball("Quickball");
        Timerball timerball = new Timerball("Timerball");
        Ultraball ultraball = new Ultraball("Ultraball");
        Masterball masterball = new Masterball("Masterball");

        for(Ball b : ball){
            if(b.getName() == "Pokeball"){
                balls.add(pokeball);
            }
            else if(b.getName() == "Quickball"){
                balls.add(quickball);
            }
            else if(b.getName() == "Timerball"){  
                balls.add(timerball);
            }
            else if(b.getName() == "Ultraball"){ 
                balls.add(ultraball);
            }
            else if(b.getName() == "Masterball"){
                balls.add(masterball);
            }

        }

        for(int i = 0 ; i < balls.size()-1 ; ++i){
            if(balls.get(i).getName() == balls.get(i+1).getName()){
                balls.remove(i+1);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }    
        
        }    
        for(int i = 0 ; i < balls.size()-2 ; ++i){
            if(balls.get(i).getName() == balls.get(i+2).getName()){
                balls.remove(i+2);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }        
                
        }      
        for(int i = 0 ; i < balls.size()-2 ; ++i){
            if(balls.get(i).getName() == balls.get(i+2).getName()){
                balls.remove(i+2);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }
            
        }
        for(int i = 0 ; i < balls.size()-3; ++i){
            if(balls.get(i).getName() == balls.get(i+3).getName()){
                balls.remove(i+3);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }
        }   
        for(int i = 0 ; i < balls.size()-4 ; ++i){
            if(balls.get(0).getName() == balls.get(4).getName()){
                balls.remove(4);
                check(pokeball, quickball, timerball, ultraball, masterball, 0);
                
            } 
            // if(balls.get(1).getName() == balls.get(4).getName()){
            //     balls.remove(4);
            //     check(pokeball, quickball, timerball, ultraball, masterball, 1);
                
            // } 
        } 
        for(int i = 0 ; i < balls.size()-1 ; ++i){
            if(balls.get(i) == balls.get(i+1)){
                balls.remove(i+1);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                  
            }    
        
        }
    }
    
    public ArrayList<Ball> TrainerBall() {
        balls.removeAll(balls);
        addBall(ball2);
        
        return balls;
    }
    
  
    
    public void check(PokeBall pokeball,Quickball quickball,Timerball timerball, Ultraball ultraball ,Masterball masterball,int i){
        if(balls.get(i).getName() == "Pokeball"){
            int num = pokeball.getNumber() + 1 ;
            pokeball.setNumber(num);
            
        }
        else if(balls.get(i).getName() == "Quickball"){
            int num = quickball.getNumber() + 1 ;
            quickball.setNumber(num);
        }
        else if(balls.get(i).getName() == "Timerball"){
            int num = timerball.getNumber() + 1 ;
            timerball.setNumber(num);
        }
        else if(balls.get(i).getName() == "Ultraball"){
            int num = ultraball.getNumber() + 1 ;
            ultraball.setNumber(num);
        }
        else if(balls.get(i).getName() == "Masterball"){
            int num = masterball.getNumber() + 1 ;
            masterball.setNumber(num);
        }
        

    }
    
    public void deleteBall(Ball b){
        System.out.println(b);
        int ballNum = b.getNumber()-1;
        b.setNumber(ballNum);
        System.out.println(b);
        if(ballNum == 0){
            b.setNumber(0);
        }
       
    }

    public void toString(ArrayList<PokemonTrainer> trainers){
        int number = 0;
        for(PokemonTrainer t : trainers){
            System.out.println("" + number + " " + t );
            number++ ;
        }
    }
}
