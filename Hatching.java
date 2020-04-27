
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Hatching extends JFrame {

    private static final long serialVersionUID = 1L;

    public Hatching(Pokemon male, Pokemon female, ArrayList<Pokemon> partners) {
        super("Hatch Pokemon Egg");
        Container c = getContentPane();
        
        Font myFont = null;
        Font myFont2 = null;
        
        try{
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Hollow.ttf" ) ); 
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Solid.ttf" ) );   
            

        }catch ( FontFormatException error ){

        }catch ( FileNotFoundException error ){
 
        }catch ( IOException error ){

        }
        JPanel p1 = new JPanel();
        JLabel k1 = new JLabel("Pokemon Hatching ", JLabel.CENTER);
	
	k1.setFont(myFont.deriveFont(Font.BOLD,30f));
        k1.setForeground(Color.BLACK);
        p1.add(k1);

        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createEmptyBorder(14, 80, 14, 80));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));

        JLabel j1 = new JLabel(new ImageIcon(" "),JLabel.CENTER);
        if(male.getName() == "Pikachu of Satochi"|| male.getName() == "Wild Pikachu"){
            j1 = new JLabel(new ImageIcon("img/pikachu.jpg"));
        }
        else if(male.getName() == "Zanigame" || male.getName() == "Wild Zanigame"  ){
            j1 = new JLabel(new ImageIcon("img/zanigame.jpg"));
        }
        else if(male.getName() == "Raichu" || male.getName() == "Wild Raichu"){
            j1 = new JLabel(new ImageIcon("img/raichu.jpg"));
        }
        else if (male.getName() == "Kabigon" || male.getName() == "Wild Kabigon"){
            j1 = new JLabel(new ImageIcon("img/kabigon.jpg"));
        }
        else if(male.getName() == "Bulbasaur" || male.getName() == "Wild Bulbasaur"  ){
            j1 = new JLabel(new ImageIcon("img/bulbasaur.jpg"));
        }
        else {
            new Pair(partners);
        }
        j1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
          
        JLabel k2 = new JLabel(" Male Pokemon " + male.getName(), JLabel.CENTER);
	k2.setFont(myFont2.deriveFont(Font.BOLD,18f));
        k2.setForeground(Color.BLUE);

        p2.add(j1);
        p2.add(k2);

        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createEmptyBorder(14, 50, 14, 50));
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));

        JLabel j2 = new JLabel(new ImageIcon(" "));
        if(female.getName() == "Pikachu of Satochi"|| female.getName() == "Wild Pikachu"){
            j2 = new JLabel(new ImageIcon("img/pikachu.jpg"));
            
        }
        else if(female.getName() == "Zanigame" || female.getName() == "Wild Zanigame"  ){
            j2 = new JLabel(new ImageIcon("img/zanigame.jpg"));
        }
        else if(female.getName() == "Raichu" || female.getName() == "Wild Raichu"){
            j2 = new JLabel(new ImageIcon("img/raichu.jpg"));
        }
        else if (female.getName() == "Kabigon" || female.getName() == "Wild Kabigon"){
            j2 = new JLabel(new ImageIcon("img/kabigon.jpg"));
        }
        else if(female.getName() == "Bulbasaur" || female.getName() == "Wild Bulbasaur"  ){
            j2 = new JLabel(new ImageIcon("img/bulbasaur.jpg"));
        }
        else {
            new Pair(partners);
        }
        j2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel k3 = new JLabel("Female Pokemon " + female.getName(), JLabel.CENTER);
	k3.setFont(myFont2.deriveFont(Font.BOLD,18f));
        k3.setForeground(Color.RED);

        p4.add(j2);
        p4.add(k3);

        JButton b1 = new JButton("SELECT");
        b1.add(Box.createRigidArea(new Dimension(223, 23)));
        b1.add(Box.createRigidArea(new Dimension(223, 23)));
        b1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                new Hatching2(male,female,partners);
                setVisible(false);
            }
	});

        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.WEST);
        c.add(p4, BorderLayout.CENTER);
        c.add(b1,BorderLayout.SOUTH);
	    
        pack();
        setSize(800, 470);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
        //setResizable(false);
    }


}
