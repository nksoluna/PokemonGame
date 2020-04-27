
public abstract class Pokemon {
    
    protected String name;
    protected int HP;
    private int maxHP;
    private String myName;
    private String level ;
    private int PP;
    private String gender;

    
    public Pokemon(String name)
    {
        this.name = name;

        this.HP = 0;
        this.level = "level 1";
        this.PP = 0;

    }
    
    public Pokemon(String name,int maxHP){
        this.name = name;
     
        this.HP = (int)(Math.random() * maxHP)+1;
        this.maxHP = maxHP;
        this.level = "level " + (int)(Math.random() * 15 )+1;;
        this.PP = (int)(Math.random() * 5)+1;;
        this.gender = getGender();
        
    }
    
    public void setMyName(String myName){
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    

    public int getHP(){
        return HP;
    }

    public void setHp(int HP){
        this.HP = HP;
    }

    public int getMaxHP(){
        return maxHP;
    }
    
    public String getLevel(){
        return level;
    }
    
    public void setLevel(String level){
        this.level = level;
    }

    public int getPP(){
        return PP;
    }   
    
    public void setPP(int PP){
        this.PP = PP;
    }
    
    public String getGen(){
        return gender;
    }

    public String getGender(){
        for(int i = 0 ; i < 1 ; i++) {
            int type = (int)(Math.random()*2);
            if (type == 0){
                gender = "Male";
            }
            else if(type == 1){
                gender = "Female";
            }
            
        }
        return gender;
    }
    
   


    public boolean damage(int value){
        if(PP == 0){
            return false;
        }
        
        int currentHP = HP - value;
        if(currentHP >= 0){
            this.HP = currentHP;
        }
        else {
            this.HP = 0;
        }
        //can setHP
        return true;
    }
   
    public abstract void attack(Pokemon enemy);

    public String toString(){
        return "Pokemon : " + name + " HP : " + HP + " " + gender;
    }

}

