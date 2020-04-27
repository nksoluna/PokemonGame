
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class Pair extends JFrame  {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> male,female;
    private ArrayList<Pokemon> bag;

    public Pair(ArrayList<Pokemon> bags){
        
        super("Pair Pokemon");
        Container c = getContentPane();
        bag = new ArrayList<Pokemon>();
        male = new ArrayList<Pokemon>();
        female = new ArrayList<Pokemon>();
        
        try {
            for(Pokemon b : bags){
                bag.add(b);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"No Pokemon");
        }
      

        JPanel head = new JPanel();
        JLabel k1 = new JLabel("Hatch Pokemon", JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	k1.setFont(k1.getFont().deriveFont(Font.BOLD,35f));
        head.setForeground(Color.green);
        head.add(k1);

        JPanel radio = new JPanel();
        radio.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 30));
        radio.setLayout(new BoxLayout(radio, BoxLayout.Y_AXIS));
        ButtonGroup group = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();
        System.out.println(bag);
        for(int i = 0; i < bag.size(); ++i){
            if(bag.get(i).getGen() == "Male"){
                male.add(bag.get(i));
            }
            if(bag.get(i).getGen() == "Female"){
                female.add(bag.get(i));
            }
        }
        for(int i = 0; i < male.size(); ++i) {
            if(male.get(i).getGen() == "Male")
            {
                System.out.println(male.get(i));
                radio.add( new JRadioButton("" + i + " " + male.get(i),false));
                group.add( new JRadioButton ("" + i + " " + male.get(i),false));
                
            }
           
        }
        JPanel check = new JPanel();
        check.setBorder(BorderFactory.createEmptyBorder(20, 30, 10, 20));
        check.setLayout(new BoxLayout(check, BoxLayout.Y_AXIS));
        for(int i = 0; i < female.size(); ++i) {
            if(female.get(i).getGen() == "Female")
            {
                check.add( new JRadioButton ("" + i + " " + female.get(i),false));
                group2.add( new JRadioButton ("" + i + " " + female.get(i),false));
                
            } 
        }

        JPanel button = new JPanel();
        JButton btn = new JButton("SELECT");
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(330, 20)));
        btn.addActionListener ( new ActionListener ( ){
          
            public void actionPerformed ( ActionEvent event ){
                new Male(male,female,bag);
            }
     
        });


        JButton btn2 = new JButton("CANCEL");
        btn2.add(Box.createRigidArea(new Dimension(330, 20)));
        btn2.addActionListener(new ActionListener(){
	    
	    public void actionPerformed(ActionEvent e) {
              
                setVisible(false);
            
            }
        });
        button.add(btn);
        button.add(btn2);
        
        c.add(button, BorderLayout.SOUTH);
        c.add(radio, BorderLayout.WEST);
        c.add(check, BorderLayout.EAST);
        c.add(head, BorderLayout.NORTH);
        
        
        setSize(730, 350);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
