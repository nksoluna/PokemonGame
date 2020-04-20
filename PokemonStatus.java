import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame {
    Pokemon pokemon;
    public PokemonStatus(Pokemon pokemon) {
        super("Pokemon Status: " + pokemon.getName()) ;
        this.pokemon = pokemon ;
        Container c = getContentPane();
        JLabel PokemonName = new JLabel(pokemon.getName()) ;
        JLabel HP = new JLabel("HP : " + pokemon.getHP()) ;

        c.add(PokemonName);
        c.add(HP);


    // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(480,250);
    setVisible(true);
    }
}