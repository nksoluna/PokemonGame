import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGame extends JFrame {
   private Trainer trainer ;
   
   public MainGame(Trainer trainer) {
    super("Pokemon Game") ;
    this.trainer = trainer ;
    
    Container c = getContentPane();
    
    JLabel trainerNameLabel = new JLabel(this.trainer.getName()) ; 
    JLabel pokemonNameLabel = new JLabel() ;
    JButton firstpokemon = new JButton(trainer.getBag().get(0).getName() + " : Status ");
    JLabel img = new JLabel(new ImageIcon("pokemonx.jpg"));
     img.setBounds(0, 0, 500, 500);
        
  
    c.add(trainerNameLabel) ;
    c.add(pokemonNameLabel);
    c.add(firstpokemon);
    c.add(img);

    c.setLayout(new BoxLayout(c , BoxLayout.Y_AXIS));
    

        String pName = "Pokemon : " ;
    for (Pokemon p : trainer.getBag()) {
        pName += p.getName() + ". ";

    }
    String bName = "Balls : " ;
    for (Ball b : trainer.get()) {
        bName += b.getName() + ". ";

    }

    pokemonNameLabel.setText(pName);

    firstpokemon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
        }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,250);
    setVisible(true);
    }
}