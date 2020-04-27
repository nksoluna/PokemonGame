import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame {
    Pokemon pokemon;
    private JTextField textSet;
    private JTextField txtRenamedPokemon;
    public PokemonStatus(Pokemon pokemon) {
        super("Pokemon Status: " + pokemon.getName()) ;
        this.pokemon = pokemon ;
        Container c = getContentPane();
        JLabel HP = new JLabel("HP : " + pokemon.getHP()) ;
        HP.setBounds(20, -42, 170, 163);
        JLabel PP = new JLabel("PP : " + pokemon.getPP()) ;
        PP.setBounds(20, 0, 170, 163);
        getContentPane().setLayout(null);
        c.add(HP);
        c.add(PP);
        JLabel PokemonName = new JLabel("Name : " +pokemon.getName()) ;
        PokemonName.setBounds(20, 154, 111, 14);
        
                c.add(PokemonName);
                
                JLabel Level = new JLabel("Level : " + pokemon.getLvl() );
                Level.setBounds(20, 97, 180, 46);
                c.add(Level);
                
               
                txtRenamedPokemon = new JTextField();
                txtRenamedPokemon.setText("rename Pokemon");
                txtRenamedPokemon.setBounds(128, 145, 102, 32);
                getContentPane().add(txtRenamedPokemon);
                txtRenamedPokemon.setColumns(10);
                
                JLabel lblNewLabel_1 = new JLabel("Status : ");
                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
                lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
                lblNewLabel_1.setBounds(240, 20, 170, 131);
                getContentPane().add(lblNewLabel_1);
                
                JButton btnNewButton = new JButton("rename!");
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		String namebox =  String.valueOf(textSet.getText());
        				PokemonName.setText("Name:"+ String.valueOf(namebox));
        				textSet.setText("");
                	}
                });
                btnNewButton.setBounds(128, 188, 92, 27);
                getContentPane().add(btnNewButton);


    // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(480,275);
    setVisible(true);
    }
}