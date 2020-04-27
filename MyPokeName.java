
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MyPokeName extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel1;
    public JTextField txtName;
    private JButton btnClick;
    public String name;
    private Pokemon partners;
    private ArrayList<Pokemon> bags;
    private ArrayList<Ball> balls;

    public MyPokeName(Pokemon partner,ArrayList<Pokemon> bag){
        
        super("Set Pokemon Name");
        jLabel1 = new JLabel();
        txtName = new JTextField();
        btnClick = new JButton();
        partners = partner;
        bags = new ArrayList<Pokemon>(); 
        balls = new ArrayList<Ball>();
        System.out.println(Bag.ball);
      
        for(Pokemon p : bag){
            bags.add(p);
        }      
	    
        balls = Bag.ball;  
        getContentPane().setLayout(null);
        
        jLabel1.setText("Pokemon Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 60, 140, 18);

        txtName.setName("txtName"); // NOI18N
        txtName.setSize(180, 150);
        getContentPane().add(txtName);
        txtName.setBounds(80, 100, 260, 20);
        btnClick.setText("Click");
        
        btnClick.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 
                
                btnClickActionPerformed(e);
                setVisible(false);
                
	    }
	});

        getContentPane().add(btnClick);
        btnClick.setBounds(160, 140, 90, 23);
        
    }
	
    private void btnClickActionPerformed(ActionEvent evt) {   

            JOptionPane.showMessageDialog(this, "Pokamon Name is " + txtName.getText());
            name = txtName.getText();
            Bag b = new Bag();
            b.addBag(name);
            partners.setMyName(name);
            bags.add(partners); 
            PersonalTrainer.bag = bags;
            Bag.ball=balls ;

    } 
	
    public void playgui(Pokemon partner,ArrayList<Pokemon> bag) {
        MyPokeName frame = new MyPokeName(partner,bag);
        frame.setSize(400, 300);
	//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
