
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Male extends JFrame {
 
    private static final long serialVersionUID = 1L;
    private JLabel jLabel1;
    public JTextField txtName;
    private JButton btnClick;
    private String no;
    private ArrayList<Pokemon> bag;

    public Male(ArrayList<Pokemon> male,ArrayList<Pokemon> female,ArrayList<Pokemon> bags){
        
        super("Male Pokemon");
        jLabel1 = new JLabel();
        txtName = new JTextField();
        btnClick = new JButton();
        
        System.out.println(bag);
        bag = new ArrayList<Pokemon>();
        for(Pokemon b : male){
            bag.add(b);
        }
	     
        getContentPane().setLayout(null);
        
        jLabel1.setText("Male Pokemon Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 60, 160, 18);

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
                    for(int i = 0; i < male.size() ; i++){
                  
                        if(result == i){
                            Pokemon males = male.get(i);
                            new Female(males,female,bags);

                        }
                    }
                    
                } catch (NumberFormatException evt) {
                    new Male(male, female, bags);
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
