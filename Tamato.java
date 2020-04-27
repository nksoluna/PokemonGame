
public class Tamato extends Berries {
    public Tamato(){
        super("Tamato Berries",5);
    }
   
    public void useBerry(Pokemon pokemon,Berries berrie){
             
        int hp = pokemon.getHP();
        int currentHp = 0;
        if(hp < pokemon.getMaxHP() || hp > pokemon.getMaxHP() ){
            reduceBerry(berrie);
            
        }
        hp = pokemon.getHP()+160;
        if(hp >= pokemon.getMaxHP()){
            currentHp = pokemon.getHP();

        }
        else {
            currentHp = hp;
        }
        pokemon.setHp(currentHp);    
        System.out.println("HP : " + pokemon.getHP());
        
    }

    public void reduceBerry(Berries berrie){
        
        System.out.println("Tamato BERRIES "+berrie.getNum());
        int number = berrie.getNum()-1;
        if(number <= 0){
            number = 0;
            berrie.setNum(0);
                        
        }
        
        berrie.setNum(number);
    }

}
