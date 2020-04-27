
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;

public class MyPokemon extends JFrame  {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
 
    public MyPokemon(Pokemon wildPokemon,ArrayList<Ball> ball){
        
        super("Catch Wild Pokemon ");
        Container c = getContentPane();
        
        //System.out.println(wildPokemon);
        //System.out.println(Trainer.bag);
        bag = new ArrayList<Pokemon>();
        
        for(Pokemon a : PersonalTrainer.bag ){
            bag.add(a);
        }
        Font myFont = null;

        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        
        JPanel head = new JPanel();
        JLabel k1 = new JLabel("Select my Pokemon ", JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	k1.setFont(myFont.deriveFont(Font.BOLD,20f));
        k1.setForeground(Color.RED);
        head.add(k1);

        JPanel radio2 = new JPanel();
        ButtonGroup group2 = new ButtonGroup();
        radio2.setBorder(BorderFactory.createEmptyBorder(20, 60, 10, 10));
        radio2.setLayout(new BoxLayout(radio2, BoxLayout.Y_AXIS));
        JPanel button = new JPanel();
        JButton btn = new JButton("SELECT");

        for(int i = 0 ; i < bag.size() ; ++i ){
            radio2.add(new JLabel(""+ i + " " + bag.get(i),false));
            group2.add(new JLabel(""+ i + " " + bag.get(i),false));
            
        }
 
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(240, 20)));
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Mine m = new Mine(wildPokemon,bag,ball);
                    m.playgui(wildPokemon,bag,ball);
                    //setVisible(false);
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
        c.add(radio2, BorderLayout.WEST);
        c.add(head, BorderLayout.NORTH);
        
        
        setSize(550, 350);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
