
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EatBerries extends JFrame {

    private static final long serialVersionUID = 1L;

    public EatBerries(Pokemon pokemon, Citrus ci,Shuca s,Tamato t) {
        super("Berries");
        Container c = getContentPane();
        
        JPanel p5 = new JPanel();
        JLabel k1 = new JLabel("Select Berry to your Pokemon", JLabel.CENTER);
	    
	k1.setFont(k1.getFont().deriveFont(18.0f));
        k1.setForeground(Color.YELLOW);
        p5.setBackground(Color.black);
        p5.add(k1);

        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.setBackground(Color.pink);
        JLabel j1 = new JLabel(new ImageIcon("Berries/Sitrus.png"));
        p1.add(j1);
        JButton b1 = new JButton("SITRUS BERRY");
        b1.add(Box.createRigidArea(new Dimension(223, 23)));
        p1.add(b1);
        b1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                ci.useBerry(pokemon,ci);
	    }
	});

        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.setBackground(Color.pink);
	    
        JLabel j2 = new JLabel(new ImageIcon("Berries/shuca.png"));
        p2.add(j2);
	    
        JButton b2 = new JButton("SHUCA BERRY");
        b2.add(Box.createRigidArea(new Dimension(223, 23)));
        b2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 		
                s.useBerry(pokemon,s);
	    }
	});
	    
        p2.add(b2);
        
        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.setBackground(Color.pink);
	    
        JLabel j3 = new JLabel(new ImageIcon("Berries/tamato.png"));
        p3.add(j3);
	    
        JButton b3 = new JButton("TAMATO BERRY");
        b3.add(Box.createRigidArea(new Dimension(223, 23)));
        b3.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 
                
                t.useBerry(pokemon,t);
                
	    }
	});
        p3.add(b3);

        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
	    
        JButton b4 = new JButton("Cancel");
        p4.setBackground(Color.pink);
        b4.add(Box.createRigidArea(new Dimension(50, 20)));
        b4.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 
                System.out.println("Left : "+ci.getNum()+" SITRUS Berry (ies) "+ s.getNum()+ " SHUCA Berry (ies) "+ t.getNum()+ " TAMATO Berry (ies) ");
		setVisible(false);
	    }
        });
        p4.add(b4);

        c.add(p1, BorderLayout.WEST);
        c.add(p2, BorderLayout.CENTER);
        c.add(p3, BorderLayout.EAST);
        c.add(p5, BorderLayout.PAGE_START);
        c.add(p4, BorderLayout.PAGE_END);
        
    }
	
    public void use(Pokemon pokemons,Citrus ci,Shuca s,Tamato t){
        EatBerries frame = new EatBerries(pokemons,ci,s,t);
        frame.setSize(869, 460);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
}
