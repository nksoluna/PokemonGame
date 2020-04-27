
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Eatery extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JLabel jLabel1;
    public JTextField txtName;
    private JButton btnClick;
    private String no;
    
    public Eatery(Citrus ci,Shuca s,Tamato t,ArrayList<Pokemon> bag){
        
        super("Enter Your Pokemon number");
        jLabel1 = new JLabel();
        txtName = new JTextField();
        btnClick = new JButton();
        
        getContentPane().setLayout(null);
        
        jLabel1.setText("Pokemon Number");
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
                
                try {
                    no = txtName.getText();
                    int result = Integer.parseInt(no);
                   
                    for(int i = 0; i < bag.size() ; i++){
                       
                        if(result == i){
                            Pokemon myPokemon = bag.get(i);
                            EatBerries f = new EatBerries(myPokemon, ci, s, t);
                            f.use(myPokemon, ci, s, t);
                           
                        }
                    }
                    
                } catch (NumberFormatException evt) {
                   
                    JOptionPane.showMessageDialog(null,"Please Enter Number", "Error", JOptionPane.ERROR_MESSAGE);
                }
                 catch (NullPointerException evt) {
                   
                    JOptionPane.showMessageDialog(null,"Please Find You Partner First", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //btnClickActionPerformed(e);
                setVisible(false);
                
	    }
	});

        getContentPane().add(btnClick);
        btnClick.setBounds(160, 140, 90, 23);
        setSize(400, 300);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
             
    }

}
