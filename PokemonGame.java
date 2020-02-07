import java.util.Scanner;
import java.io.*;

public class PokemonGame {

    public static void main (String arg[] {
        System.out.println("Welcome to The Pokemon Game !!") ;
        System.out.println("Game Started !!") ;
        Pokemon Zacian = new Pokemon("Zacian") ;
        while (true) {
            system.out.println(Zacian.getStats());
            Zacian.exp(300);
            wait (20000) ;
        }
}

private static void wait(int miliseconds)
    {
        try {
            Thread.sleep(miliseconds);
        }
        catch (Exception e) { }
    }

}
