
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;

public class TrainerPartner extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<PokemonTrainer> pokemontrainers;
    private JRadioButton j1,j2;

    public TrainerPartner(){
        
        super("Pokemon Game");
        Container c = getContentPane();
        pokemontrainers = new ArrayList<PokemonTrainer>();
        Font myFont = null;
        Font myFont2 = null;
      
        
        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        
        PokePartner p = new PokePartner();
        pokemontrainers = p.act();

        JPanel head = new JPanel();
        head.setBounds(0, 0, 644, 73);
        JLabel k1 = new JLabel("SELECT YOUR TRAINER", JLabel.CENTER);
        k1.setBounds(0, 0, 644, 61);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	k1.setFont(myFont.deriveFont(Font.BOLD,20f));
        head.setForeground(Color.BLACK);
        head.setBackground(Color.PINK);
        head.setLayout(null);
        head.add(k1);

        JPanel radio1 = new JPanel();
        radio1.setBackground(Color.PINK);
        radio1.setBounds(0, 72, 644, 290);
        radio1.setBorder(BorderFactory.createEmptyBorder(50, 20, 10, 30));
        radio1.setLayout(null);
        JLabel k2 = new JLabel( " " + p.TrainerBall());
        k2.setBounds(30, 75, 548, 63);
        radio1.add(k2);

       
       
        ButtonGroup group = new ButtonGroup();
        group.add(j2);

        JPanel button = new JPanel();
        button.setBounds(0, 284, 644, 28);
        JButton btn = new JButton("SELECT");
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(290, 20)));
        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {

                if(j1.isSelected()){
                  
                    JOptionPane.showMessageDialog(null, pokemontrainers.get(0));
                    Bag.ball = p.TrainerBall();
                    Hello h = new Hello(Bag.ball,pokemontrainers.get(0));
                    h.use(Bag.ball,pokemontrainers.get(0));
                   
  
                } 
                setVisible(false);
                
            }

        });
        JButton btn2 = new JButton("CANCEL");
        btn2.add(Box.createRigidArea(new Dimension(290, 20)));
        btn2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        getContentPane().setLayout(null);
        button.add(btn);
        button.add(btn2);
        
        c.add(button);
        c.add(radio1);
        j1 = new JRadioButton(""+ pokemontrainers.get(0)+"\n",true);
        j1.setBounds(30, 15, 231, 85);
        j1.setBackground(Color.PINK);
        radio1.add(j1);
        group.add(j1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TrainerPartner.class.getResource("/Trainer/RED.png")));
        lblNewLabel.setBounds(485, 0, 117, 205);
        radio1.add(lblNewLabel);
        c.add(head);
        
        
        setSize(660, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
