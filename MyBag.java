
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MyBag extends JFrame {
    
    private static final long serialVersionUID = 1L;

    public MyBag(ArrayList<Pokemon> bag, ArrayList<Ball> baller, ArrayList<Berries> berrie) {
        super("My Bag");
        Container c = getContentPane();

        Font myFont = null;
        
        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(102, 255, 153));
        JLabel k1 = new JLabel("MY BAG ", JLabel.CENTER);
        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	k1.setFont(myFont.deriveFont(Font.BOLD,35f));
        k1.setForeground(new Color(153, 0, 0));
        p1.add(k1);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(102, 255, 153));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        URL url1 = this.getClass().getResource("font3/friend.gif");
        ImageIcon imageIcon1 = new ImageIcon(url1);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        p2.add(label1);

        JPanel p3 = new JPanel();
        p3.setBackground(new Color(102, 255, 153));
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        URL url2 = this.getClass().getResource("font3/eat.gif");
        ImageIcon imageIcon2 = new ImageIcon(url2);
        JLabel label2 = new JLabel(imageIcon2);
        JButton b2 = new JButton("BERRIES");
        b2.add(Box.createRigidArea(new Dimension(230, 40)));
        b2.setFont(myFont.deriveFont(Font.BOLD,14f));
        b2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                new StatusBerry(berrie);
            }
        });
        p3.add(b2);
        label2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        p3.add(label2);
        
        JPanel p4 = new JPanel();
        p4.setBackground(new Color(102, 255, 153));
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        p4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        URL url3 = this.getClass().getResource("font3/ball.gif");

        ImageIcon imageIcon3 = new ImageIcon(url3);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        p4.add(label3);
       

        JButton b4 = new JButton("CANCEL");
        b4.setFont(myFont.deriveFont(Font.PLAIN,14f));
        b4.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.EAST);
        JButton b1 = new JButton("POKEMON");
        b1.add(Box.createRigidArea(new Dimension(230, 40)));
        b1.setFont(myFont.deriveFont(Font.PLAIN,14f));
        b1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                new StatusPokemon(bag);
            }
        });
        p2.add(b1);
        c.add(p3, BorderLayout.CENTER);
        c.add(p4, BorderLayout.WEST);
        JButton b3 = new JButton("POKEMON BALLS");
        b3.add(Box.createRigidArea(new Dimension(230, 40)));
        b3.setFont(myFont.deriveFont(Font.PLAIN,14f));
        b3.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                new StatusBall(baller);
            }
        });
        p4.add(b3);
        c.add(b4, BorderLayout.SOUTH);
    
    
        setSize(850, 430);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	

    }

}
