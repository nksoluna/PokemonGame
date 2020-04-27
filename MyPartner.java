
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;

public class MyPartner extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
    private JRadioButton j1,j2,j3,j4;
 
    public MyPartner(){
        
        super("Pokemon Game");
        Container c = getContentPane();
        Font myFont = null;
        Font myFont2 = null;
      
        
        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        System.out.println(Bag.ball);
        ArrayList<Pokemon> partner = AllPokemon.getPokemon(4);
        bag = new ArrayList<Pokemon>();
        
        JPanel head = new JPanel();
        JLabel k1 = new JLabel("SELECT PARTNER ", JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	k1.setFont(myFont.deriveFont(Font.BOLD,20f));
        
        head.setBackground(Color.BLACK);
        k1.setForeground(Color.YELLOW);
        head.add(k1);

        JPanel radio = new JPanel();
        radio.setBorder(BorderFactory.createEmptyBorder(50, 70, 10, 30));
        radio.setLayout(new BoxLayout(radio, BoxLayout.Y_AXIS));
        j1 = new JRadioButton(""+ partner.get(0),true);
        j2 = new JRadioButton(""+ partner.get(1),false);
        j3 = new JRadioButton(""+ partner.get(2),false);
        j4 = new JRadioButton(""+ partner.get(3),false);

        radio.add(j1);
        radio.add(j2);
        radio.add(j3);
        radio.add(j4);
        
        ButtonGroup group = new ButtonGroup();
        group.add(j1);
        group.add(j2);
        group.add(j3);
        group.add(j4);

        JPanel button = new JPanel();
        JButton btn = new JButton("SELECT");
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(240, 20)));
        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {

                if(j1.isSelected()){
                    bag.removeAll(bag);
                    //System.out.println(Bag.ball);
                    Pokemon pokemonPartner = partner.get(0);
                    JOptionPane.showMessageDialog(null,"Your Pokemon : " + partner.get(0));
                    //bag.add(pokemonPartner);
                    MyPokeName frame = new MyPokeName(pokemonPartner,bag);
                    frame.playgui(pokemonPartner,bag);
                    setVisible(false);
                   
                   
  
                } else if (j2.isSelected()) {
                    bag.removeAll(bag);
                    Pokemon pokemonPartner = partner.get(1);
                    //System.out.println(Bag.ball);
                    JOptionPane.showMessageDialog(null,"Your Pokemon : "+ partner.get(1));
                    //bag.add(pokemonPartner);
                    MyPokeName frame = new MyPokeName(pokemonPartner,bag);
                    frame.playgui(pokemonPartner,bag);
                    setVisible(false);

                } else if (j3.isSelected()) {
                    bag.removeAll(bag);
                    Pokemon pokemonPartner = partner.get(2);
                    JOptionPane.showMessageDialog(null,"Your Pokemon : "+ partner.get(2));
                    //bag.add(pokemonPartner);
                    MyPokeName frame = new MyPokeName(pokemonPartner,bag);
                    frame.playgui(pokemonPartner,bag);
                    setVisible(false);


                } else if(j4.isSelected()){ 
                    bag.removeAll(bag);
                    Pokemon pokemonPartner = partner.get(3);
                    JOptionPane.showMessageDialog(null,"Your Pokemon : "+ partner.get(3));
                    //bag.add(pokemonPartner);
                    MyPokeName frame = new MyPokeName(pokemonPartner,bag);
                    frame.playgui(pokemonPartner,bag);
                    setVisible(false);

                }

            }

        });
        JButton btn2 = new JButton("CANCEL");
        btn2.add(Box.createRigidArea(new Dimension(240, 20)));
        btn2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                
            }
        });
        button.add(btn);
        button.add(btn2);
        
        c.add(button, BorderLayout.SOUTH);
        c.add(radio, BorderLayout.WEST);
        c.add(head, BorderLayout.NORTH);
        
        
        setSize(555, 350);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
