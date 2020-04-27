
import java.util.ArrayList;

public interface PokemonTrainer {
    
    String getName();
    void setName(String name);
    void addBall();
    int getNum();
    String toString();
    ArrayList<Ball> getBall();
    
}
