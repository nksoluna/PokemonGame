import java.io.*;
import java.io.ObjectInputFilter.Status;
import java.util.* ;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Pokemon {
    private String Name ;
    private int HP ;
    private int ATK ;
    private int DEF ;
    private int Lvl ;
    private int PP ;
    private int Exp ;
    private int LevelUpxp ;
    private int HpLeft ;
    
}

public Pokemon(String PokemonName) {
     Name = PokemonName ;
     level = ThreadLocalRandom.current().nextInt(1, 5 + 1);
     Exp = 0 ;
     LevelUpxp = level * 5 ;
     HP = ThreadLocalRandom.current().nextInt(10, 35 + 1);
     ATK = ThreadLocalRandom.current().nextInt(5, 10 + 1);
     DEF = ThreadLocalRandom.current().nextInt(10, 10 + 1);

}

public String Stats () {
    return "----------Pokemon Stats----------\n" +
                "PokemonName : " + Name +
                "\nLevel : " + Level + "\tExp : " + Exp + "/" + levelUpExp +
                "\nHP : " + HP +
                "\nATK : " + ATK +
                "\nDEF : " + DEF +
                "\n---------------------------------";
    }

}

public void exp (int ReciveExp) {
    Exp += ReciveExp ;
    if (Exp >= LevelUpxp) {
        Exp = Exp %LevelUpxp ;
        LevelUp() ;
    }
}
public void LevelUp() {
    Lvl++ ;
    LevelUpxp += 15 ;
    StatsUp() ;
    system.out.println("Level UP !!") ;
}

public void Attack (String Command) {
    if (Command = "Attack") {
    if (ATK > DEF) {
    HpLeft = HP - Atk + DEF ;    
    }
    else {
    Hpleft = HP - 0 ;
    }
}

}
