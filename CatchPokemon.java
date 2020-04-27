
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;

public class CatchPokemon extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
    private ArrayList<Pokemon> wild;
    private JRadioButton j1,j2,j3,j4,j5;
    
    
    public CatchPokemon(ArrayList<Ball> ball){
        
        super("Catch Wild Pokemon ");
        getContentPane().setBackground(new Color(255, 204, 255));
        Container c = getContentPane();
        ArrayList<Pokemon> wildPokemon = PokemonRandomizer.getPokemons(5);
        
        bag = new ArrayList<Pokemon>();
        wild = new ArrayList<Pokemon>();
        for(Pokemon m : wildPokemon){
            wild.add(m);
        }
        
        Font myFont = null;
        Font myFont2 = null;
      
        
        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        
        JPanel head = new JPanel();
        head.setBackground(new Color(255, 204, 255));
        head.setBounds(0, 0, 534, 88);
        head.setBorder(BorderFactory.createEmptyBorder(20, 95, 10, 10));
        head.setLayout(null);
	    
        JLabel k2 = new JLabel("Select wild pokemon ",JLabel.CENTER);
        k2.setBounds(10, 20, 514, 44);
        k2.setBorder(BorderFactory.createEmptyBorder(20, 60, 10, 10));
	k2.setFont(myFont2.deriveFont(Font.BOLD,20f));
        k2.setForeground(Color.magenta);
        head.add(k2);

        JPanel radio1 = new JPanel();
        radio1.setBackground(new Color(255, 204, 255));
        radio1.setBounds(0, 102, 534, 314);
        radio1.setBorder(BorderFactory.createEmptyBorder(10, 90, 10, 30));
	    
        j1 = new JRadioButton(""+ wild.get(0),true);
        j1.setBackground(new Color(255, 204, 255));
        j1.setBounds(25, 10, 483, 23);
        j2 = new JRadioButton(""+ wild.get(1),false);
        j2.setBackground(new Color(255, 204, 255));
        j2.setBounds(25, 33, 483, 23);
        j3 = new JRadioButton(""+ wild.get(2),false);
        j3.setBackground(new Color(255, 204, 255));
        j3.setBounds(25, 56, 483, 23);
        j4 = new JRadioButton(""+ wild.get(3),false);
        j4.setBackground(new Color(255, 204, 255));
        j4.setBounds(25, 79, 483, 23);
        j5 = new JRadioButton(""+ wild.get(4),false);
        j5.setBackground(new Color(255, 204, 255));
        j5.setBounds(25, 102, 483, 23);
        radio1.setLayout(null);

        radio1.add(j1);
        radio1.add(j2);
        radio1.add(j3);
        radio1.add(j4);
        radio1.add(j5);
        
        ButtonGroup group = new ButtonGroup();
        group.add(j1);
        group.add(j2);
        group.add(j3);
        group.add(j4);
        group.add(j5);
        
        JPanel button = new JPanel();
        button.setBounds(0, 314, 534, 28);
        JButton btn = new JButton("CATCH");
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(240, 20)));
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
             
                try {

                    if(j1.isSelected()){
                        
                        new MyPokemon(wild.get(0),ball);
                        setVisible(false);
                       
                    } else if (j2.isSelected()) {
                        
                        new MyPokemon(wild.get(1),ball);
                        setVisible(false);
                                       
                    } else if (j3.isSelected()) {
                        
                        new MyPokemon(wild.get(2), ball);
                        setVisible(false);
                       
                    } else if(j4.isSelected()){ 
                        
                        new MyPokemon(wild.get(3), ball);
                        setVisible(false);
                       
                    } else if(j5.isSelected()){ 
                        
                        new MyPokemon(wild.get(4), ball);
                        setVisible(false);
                       
    
                    } else if(j5.isSelected()){ 
                        
                        bag.removeAll(bag);
                        new MyPokemon(wild.get(5),ball);
                        setVisible(false);
                       
                    }
                
                } catch (NullPointerException e) {
                    //System.out.println("No Pokemon");
                    JOptionPane.showMessageDialog(null,"Please Select Your Partner First");
                }  
            
            }

        });
        JButton btn2 = new JButton("RUN");
        btn2.add(Box.createRigidArea(new Dimension(240, 20)));
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
        c.add(head);
             
        setSize(550, 380);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
