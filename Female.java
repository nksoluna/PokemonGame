
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Female extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel1;
    public JTextField txtName;
    private JButton btnClick;
    private String no;
    
    public Female(Pokemon male,ArrayList<Pokemon> female,ArrayList<Pokemon> bag){
        
        super("Female Pokemon");
        jLabel1 = new JLabel();
        txtName = new JTextField();
        btnClick = new JButton();
        
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        jLabel1.setText("Female Pokemon Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 60, 180, 18);

        txtName.setName("txtName"); 
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
                  
                    for(int i = 0; i < female.size() ; i++){
                   
                    if(result == i){
                        Pokemon females = female.get(i);

                        new Hatching(male, females, bag);
                        System.out.println(females);
                    }
                }
                    
                } catch (NumberFormatException evt) {
                    new Female(male, female, bag);
                }
                
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
