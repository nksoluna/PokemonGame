
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class StatusPokemon extends JFrame {

    private static final long serialVersionUID = 1L;
    private static int i = 0;

    public StatusPokemon(ArrayList<Pokemon> p) {
        
        super("POKEMON");
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        
        try {

        	Pokemon partners = p.get(i);

        	p1.setBorder(BorderFactory.createEmptyBorder(70, 15, 15, 10));
        	p2.setBorder(BorderFactory.createEmptyBorder(70, 15, 50, 100));

        	p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        	p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        
        	JLabel b0 = new JLabel("Number : " + i);
        	JLabel b1 = new JLabel("Name : " + partners.getMyName());
        	JLabel b2 = new JLabel("Pokemon : " + partners.getName());
        
        	
		JLabel b5 = new JLabel("HP : " + partners.getHP());
        	JLabel b6 = new JLabel("PP : " + partners.getPP());
        	JLabel b7 = new JLabel("Gender : " + partners.getGen());    
        
        	p1.add(b0);
        	p1.add(b1);
        	p1.add(b2);
        	p2.add(b5);
        	p2.add(b6);
        	p2.add(b7); 
               
        

        JLabel j1 = new JLabel(new ImageIcon(""));;
            if(partners.getName() == "Lapras"|| partners.getName() == "Wild Lapras"){
                j1 = new JLabel(new ImageIcon("img/Lapras.gif"));
            }
            else if(partners.getName() == "Snorlax" || partners.getName() == "Wild Snorlax"  ){
                j1 = new JLabel(new ImageIcon("img/Snorlax.gif"));
            }
            else if(partners.getName() == "Lucario" || partners.getName() == "Wild Lucario"){
                j1 = new JLabel(new ImageIcon("img/Lucario.gif"));
            }
            else if (partners.getName() == "Riolu" || partners.getName() == "Wild Riolu"){
                j1 = new JLabel(new ImageIcon("img/Riolu.gif"));
            }
            else if (partners.getName() == "Giratina" || partners.getName() == "Wild Giratina"){
                j1 = new JLabel(new ImageIcon("img/Giratina.gif"));
            }
       
        
        
            j1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            c.add(j1, BorderLayout.WEST);
		
        } catch (NullPointerException e) {
            
        }

        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createEmptyBorder(10, 265, 15, 10));
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));

        JButton button1 = new JButton("Next");
        p3.add(button1);
        button1.add(Box.createRigidArea(new Dimension(40, 18)));
        p3.add(Box.createRigidArea(new Dimension(30, 0)));
        
        JButton button2 = new JButton("Back"); 
        
        p3.add(button2);
        button2.add(Box.createRigidArea(new Dimension(40, 18)));
        button2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
	});
	    
        button1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 
                
                i++;
                try {
                    new StatusPokemon(p);
                    setVisible(false);
                } catch (IndexOutOfBoundsException t) {

                    i = 0;
                    new StatusPokemon(p);
                    setVisible(false);
                    //t.getMessage();
                }
			}
		});
        

        
        c.add(p1, BorderLayout.CENTER);		
        c.add(p2, BorderLayout.EAST);	
        c.add(p3, BorderLayout.SOUTH);

        setSize(720, 350);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
        setResizable(false);
        
    }
    
    
}





