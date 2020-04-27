
public abstract class Berries {
    private String type;
    private int number;
    private int value;
    
    public Berries(String type,int number){
        this.type = type;
        this.number = number;
    }
    
    public String getType() {
        return type;
    }
    
    public int getNum(){
        return number;
    }
    
    public void setNum(int number){
        this.number = number;
    }
    
    public int getValue(){
        return value;
    }
    
    public abstract void useBerry(Pokemon pokemon,Berries berrie);
    public abstract void reduceBerry(Berries berrie);

}
