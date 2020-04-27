
import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;

public class Hello extends JFrame {

    private static final long serialVersionUID = 1L;
    public Hello(ArrayList<Ball> balls,PokemonTrainer p){

        super("Pokemon Game");
       
        
        Container c = getContentPane();
        Font myFont = null;
        try{
            
            myFont = Font.createFont( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        if(p.getName() == "Red"){
            JPanel head = new JPanel();
            JLabel k1 = new JLabel("Hi Red", JLabel.CENTER);
            head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            k1.setFont(k1.getFont().deriveFont(Font.BOLD,28f));
        
            head.setForeground(Color.RED);
            head.setBackground(Color.orange);
            head.add(k1);
            head.setBounds(0, 0, 500, 60);
            c.add(head);

        }
       
        
    
        JPanel button1 = new JPanel();
        button1.setBounds(170, 300, 130, 30);

        JButton btn = new JButton("");
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setIcon(new ImageIcon(Hello.class.getResource("/Button/Start.png")));
        btn.setFont(myFont.deriveFont(Font.BOLD,20f));
        btn.setBounds(359, 292, 221, 114);

        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                PokeInterFace m = new PokeInterFace(Bag.ball);
                m.use(Bag.ball);
                setVisible(false);

            }

        });
        button1.setLayout(null);
        
        button1.add(btn);
        c.add(button1);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Hello.class.getResource("/img/Logo.png")));
        lblNewLabel_1.setBounds(262, 29, 420, 152);
        button1.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Hello.class.getResource("/BG/BG.gif")));
        lblNewLabel.setBounds(-80, -155, 1000, 900);
        button1.add(lblNewLabel);

    }
    public void use(ArrayList<Ball> balls,PokemonTrainer p){
        JLabel j = new JLabel(new ImageIcon("img/satochi.jpeg"));
        
        Hello m = new Hello(balls,p);
        
        m.setSize(924, 615);
        if(p.getName() == "Red"){
            m.getContentPane().add(j);
            m.setIconImage(new ImageIcon("img/satochi.jpg").getImage());
        }
        

        //m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        
    }
}
