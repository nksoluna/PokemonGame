import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class PokeInterFace extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
    private ArrayList<Ball> ball;
    private ArrayList<Berries> berry;
   
    
    public PokeInterFace(ArrayList<Ball> balls){

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
    
        JPanel b1 = new JPanel();
        b1.setLayout(new BoxLayout(b1, BoxLayout.Y_AXIS));

        JButton btn6 = new JButton("CATCH"); 
        btn6.setBounds(50, 469, 116, 59);
        btn6.setFont(myFont.deriveFont(Font.BOLD,11f));
        btn6.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {

                ball = Bag.ball;
                new CatchPokemon(Bag.ball);


            }

        });
        
        JPanel interfaces = new JPanel();
        interfaces.setBounds(0, 0, 782, 539);
    
        JButton btn5 = new JButton("START");
        btn5.setBounds(363, 252, 221, 114);
        btn5.setFont(myFont.deriveFont(Font.BOLD,20f));
        btn5.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                Bag.ball = balls;
                ball = Bag.ball;
                new MyPartner();

            }

        });
        interfaces.setLayout(null);

        interfaces.add(btn5);
        interfaces.add(btn6);
        c.add(interfaces);
        
        JButton btn4 = new JButton("BERRIES");
        btn4.setBounds(613, 469, 148, 59);
        interfaces.add(btn4);
        btn4.setFont(myFont.deriveFont(Font.BOLD,11f));
        
                JButton btn3 = new JButton("STATUS");
                btn3.setBounds(187, 469, 125, 59);
                interfaces.add(btn3);
                btn3.setFont(myFont.deriveFont(Font.BOLD,11f));
                JButton btn2 = new JButton("MARKET");
                btn2.setBounds(472, 469, 125, 59);
                interfaces.add(btn2);
                btn2.setFont(myFont.deriveFont(Font.BOLD,11f));
                
                        JButton btn = new JButton("GACHAPON");
                        btn.setBounds(330, 469, 125, 59);
                        interfaces.add(btn);
                        btn.setFont(myFont.deriveFont(Font.BOLD,11f));
                        
                        JLabel lblNewLabel_2 = new JLabel("");
                        lblNewLabel_2.setIcon(new ImageIcon(PokeInterFace.class.getResource("/BG/pokeballs.gif")));
                        lblNewLabel_2.setBounds(-17, 202, 261, 232);
                        interfaces.add(lblNewLabel_2);
                        
                        JLabel lblNewLabel = new JLabel("");
                        lblNewLabel.setIcon(new ImageIcon(PokeInterFace.class.getResource("/Logo/Logo.png")));
                        lblNewLabel.setBounds(250, 11, 685, 163);
                        interfaces.add(lblNewLabel);
                        
                        JLabel lblNewLabel_1 = new JLabel("");
                        lblNewLabel_1.setIcon(new ImageIcon(PokeInterFace.class.getResource("/BG/BG.png")));
                        lblNewLabel_1.setBounds(-7, 0, 789, 539);
                        interfaces.add(lblNewLabel_1);
                        btn.addActionListener(new ActionListener() {
                           

                            public void actionPerformed(ActionEvent arg0) {
                                
                                new Gachapon();
                                

                            }

                        });
                btn2.addActionListener(new ActionListener(){
	    
	    public void actionPerformed(ActionEvent e) {
                        ball = Bag.ball;
                        new Market(ci, s, t, Bag.ball);
                    }
                });
                btn3.addActionListener(new ActionListener() {
                   
                    public void actionPerformed(ActionEvent arg0) {
                        ball = Bag.ball;
                        bag = PersonalTrainer.bag;
                        new MyBag(bag, ball, berry);

                    }

                });
        btn4.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                bag = PersonalTrainer.bag;
                new Eatery(ci,s,t,bag);

            }

        });
       

        
    }
    public void use(ArrayList<Ball> balls){
	    
        JLabel j = new JLabel(new ImageIcon("icon/pokeball.png"));
        PokeInterFace m = new PokeInterFace(balls);
        
        m.setSize(787, 577);
        m.getContentPane().add(j);
        m.setIconImage(new ImageIcon("icon/pokeball.png").getImage());
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        
    }
}
