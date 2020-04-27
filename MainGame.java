import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class MainGame extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
    private ArrayList<Ball> ball;
    private ArrayList<Berries> berry;
   
    
    public MainGame(ArrayList<Ball> balls){

        super("Pokemon Game");
       
        Citrus ci = new Citrus();
        Shuca s = new Shuca();
        Tamato t = new Tamato();
        berry = new ArrayList<Berries>();
        ball = new ArrayList<Ball>();
        bag = new ArrayList<Pokemon>();
        berry.add(ci);
        berry.add(s);
        berry.add(t);
       
        Container c = getContentPane();

        Font myFont = null;
        try{
            
            myFont = Font.createFont( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        
        for(Ball be : balls){
            ball.add(be);
            
        }
       ball = Bag.ball;
        JPanel head = new JPanel();
        JLabel k1 = new JLabel("Pokemon Game ", JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		k1.setFont(myFont.deriveFont(Font.BOLD,35f));

        head.setForeground(Color.BLACK);
        head.setBackground(Color.YELLOW);
        head.add(k1);
        head.setBounds(0, 0, 610, 80);
        c.add(head);
    
        JPanel b1 = new JPanel();
        b1.setLayout(new BoxLayout(b1, BoxLayout.Y_AXIS));
        

        JPanel button1 = new JPanel();
        button1.setLayout(new BoxLayout(button1, BoxLayout.X_AXIS));
        button1.setBounds(0, 430, 610, 30);

        JButton btn = new JButton("GACHAPON");
        btn.add(Box.createRigidArea(new Dimension(270, 20)));
        btn.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                
                new Gachapon();
                

            }

        });
        JButton btn2 = new JButton("MARKET");
        btn2.add(Box.createRigidArea(new Dimension(270, 20)));
        btn2.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn2.addActionListener(new ActionListener(){
	    
	    public void actionPerformed(ActionEvent e) {
                ball = Bag.ball;
                new Market(ci, s, t, Bag.ball);
            }
        });

        JPanel button2 = new JPanel();
        button2.setLayout(new BoxLayout(button2, BoxLayout.X_AXIS));
        button2.setBounds(0, 400, 610, 30);

        JButton btn3 = new JButton("STATUS");
        
        btn3.add(Box.createRigidArea(new Dimension(270, 20)));
        btn3.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn3.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent arg0) {
                ball = Bag.ball;
                bag = PersonalTrainer.bag;
                new MyBag(bag, ball, berry);

            }

        });
	    
        JButton btn4 = new JButton("EATBERRIES");
        btn4.add(Box.createRigidArea(new Dimension(270, 20)));
        btn4.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn4.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                bag = PersonalTrainer.bag;
                new Eatery(ci,s,t,bag);

            }

        });

        JButton btn6 = new JButton("CATCH"); 
        btn6.add(Box.createRigidArea(new Dimension(100, 20)));
        btn6.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn6.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {

                ball = Bag.ball;
                new CatchPokemon(Bag.ball);


            }

        });
        
        JPanel button3 = new JPanel();
        button3.setLayout(new BoxLayout(button3, BoxLayout.X_AXIS));
        button3.setBounds(170, 250, 260, 30);
    
        JButton btn5 = new JButton("START");
        btn5.add(Box.createRigidArea(new Dimension(100, 20)));
        btn5.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn5.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                Bag.ball = balls;
                ball = Bag.ball;
                new MyPartner();

            }

        });
	
        button1.add(btn);
        button1.add(btn2);

        button2.add(btn3);
        button2.add(btn4);

        button3.add(btn5);
        button3.add(btn6);

        
        c.add(button2);
        c.add(button1);
        c.add(button3);
       

        
    }
    public void use(ArrayList<Ball> balls){
	    
        JLabel j = new JLabel(new ImageIcon("img/test.jpg"));
        MainGame m = new MainGame(balls);
        
        m.setSize(610, 500);
        m.add(j);
        m.setIconImage(new ImageIcon("img/test.jpg").getImage());
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        
    }
}
