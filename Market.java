
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Market extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Ball> balls;

    public Market(Citrus ci, Shuca s, Tamato t, ArrayList<Ball> ball2)  {
        
        super("Pokemon Market");
        balls = new ArrayList<Ball>();
  
        //System.out.println(ball2);
        Container c = getContentPane();
        Font myFont = null;
        try{
            
            myFont = Font.createFont( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        PokeBall pokeball = new PokeBall("Pokeball");
        Quickball quickball = new Quickball("Quickball");
        Ultraball ultraball = new Ultraball("Ultraball");
       

        pokeball.setNumber(0);
        quickball.setNumber(0);
        ultraball.setNumber(0);
        
	    
        balls.add(pokeball);      
        balls.add(ultraball);
        balls.add(quickball);

        for (Ball ball : ball2) {
            if (ball.getName() == "Pokeball") {
                int num = ball.getNumber();
                pokeball.setNumber(num);
                
                //System.out.println(balls);
            } else if (ball.getName() == "Quickball") {
                int num = ball.getNumber();
                quickball.setNumber(num);
                 
		    
            } else if (ball.getName() == "Ultraball") {
                int num = ball.getNumber();
                ultraball.setNumber(num);
                
                //System.out.println(balls);
		    
            } 

        }
     
        //System.out.println(balls);
       
        
        JPanel pk1 = new JPanel();
        pk1.setBackground(new Color(153, 255, 102));
        
        JLabel k1 = new JLabel("Welcome to BerriesMarket ", JLabel.CENTER);
        k1.setFont(myFont.deriveFont(Font.PLAIN,30));
		
        k1.setForeground(Color.BLACK);
        
        
        pk1.add(k1);

        JPanel panel1 = new JPanel ( );
        panel1.setLayout ( new BorderLayout ( ) );
	    
        JButton b1 = new JButton("Sitrus Berry");
        b1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                addBerry(ci);
	    }
        });
        
        JButton b2 = new JButton("Shuca Berry");
        b2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {       
                addBerry(s);
            }
        });
	    
        JButton b3 = new JButton("Tamato Berry");
        b3.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {          
                addBerry(t);
	    }
        });
	    
        JButton d1 = new JButton("CLOSE");
        d1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                System.out.println("Have : "+ci.getNum()+" Sitrus Berry "+ s.getNum()+ " Shuca Berry "+ t.getNum()+ " Tamato Berry ");
                setVisible(false);
	    }
        });
       
        JLabel j1 = new JLabel(new ImageIcon("img/market.gif"));

        JPanel p3 = new JPanel ( );
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        b1.add(Box.createRigidArea(new Dimension(150, 94)));
        b2.add(Box.createRigidArea(new Dimension(150, 94)));
        b3.add(Box.createRigidArea(new Dimension(150, 118)));
	    
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        panel1.add ( pk1, BorderLayout.NORTH );
        panel1.add ( p3, BorderLayout.WEST );
        panel1.add ( j1, BorderLayout.EAST );
        panel1.add ( d1, BorderLayout.SOUTH );
        

        JPanel panel2 = new JPanel ( );
        panel2.setLayout ( new BorderLayout ( ) );

        JPanel pk2 = new JPanel();
        pk2.setBackground(new Color(255, 204, 0));
        JLabel k2 = new JLabel("Welcome to BallsMarket ", JLabel.CENTER);
        k2.setFont(myFont.deriveFont(Font.PLAIN,30));

        k2.setForeground(new Color(204, 51, 0));
        pk2.add(k2);

        JButton b4 = new JButton("Pokeball");
        b4.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {     
                addBall(pokeball);
                //System.out.println(pokeball);
 
	    }
        });

        JButton b5 = new JButton("Quickball");
        b5.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
               
                addBall(quickball);
                //System.out.println(quickball);
	    }
        });
        
        
 
        JButton b7 = new JButton("Ultraball");
        b7.addActionListener(new ActionListener(){
	    //anonymous class
        	   public void actionPerformed(ActionEvent e) {   
                   
                   addBall(ultraball);
                  // System.out.println(ultraball);
   	    }
           });
           
        
       
       
        JButton d2 = new JButton("CLOSE");
        d2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                
                System.out.println(balls);
                Bag.ball = balls;
                System.out.println(Bag.ball);
                setVisible(false);
               
	    }
        });

        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));

        b4.add(Box.createRigidArea(new Dimension(150, 52)));
        b5.add(Box.createRigidArea(new Dimension(150, 52)));
        b7.add(Box.createRigidArea(new Dimension(150, 52)));
       

        p4.add(b4);
      
        p4.add(b7);
        p4.add(b5);
        

        JLabel j2 = new JLabel(new ImageIcon("img/ball.png"));

        panel2.add ( pk2, BorderLayout.NORTH );
        panel2.add ( p4, BorderLayout.EAST );
        panel2.add ( j2, BorderLayout.CENTER );
        panel2.add ( d2, BorderLayout.SOUTH );

        JTabbedPane tabbedPane = new JTabbedPane ( );

        tabbedPane.setSize ( 750, 420 );
        tabbedPane.setLocation ( 30, 10 );

        c.add ( tabbedPane );



        tabbedPane.addTab ( "Berrie", panel1 );
        tabbedPane.setBackgroundAt ( 0, Color.ORANGE );
        tabbedPane.setForegroundAt ( 0, Color.BLACK);

        tabbedPane.addTab ( "POKEMON BALLS", panel2);
        tabbedPane.setBackgroundAt ( 1, Color.YELLOW );
        tabbedPane.setForegroundAt ( 1, Color.BLACK );
        
        setSize ( 780, 460 );
        setVisible ( true );
        
    }

    public void addBerry(Berries berrie){
        int berry = berrie.getNum()+1;
        berrie.setNum(berry);
        System.out.println("" + berrie.getType() + " have " + berrie.getNum());
    }
    public void addBall(Ball ball){
        int b= ball.getNumber()+1;
        ball.setNumber(b);
        System.out.println(ball);
        
    }

}

