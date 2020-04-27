import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Gachapon extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] imga = {"Lapras.png","Snorlax.png","Rockruff.png","Lucario.png","Charlizard.png","Blastoise.png","Psyduck.png"};
	private int n ;
	LaprasDoll lp = new LaprasDoll();
	SnorlaxDoll sl = new SnorlaxDoll();
	RockRuffDoll rr = new RockRuffDoll();
	LucarioDoll lc = new LucarioDoll();
	CharlizardDoll cl = new CharlizardDoll();
	BlastoiseDoll bt = new BlastoiseDoll();
	PsyduckDoll sd = new PsyduckDoll();

	

	/**
	 * Create the frame.
	 */
	public Gachapon() {
		
		Ptrainer p = new Ptrainer("RED" , 0 ,10);
		Font myFont = null;
        try{
            
            myFont = Font.createFont( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        
		
		setTitle("Gachapon");
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 424);
		getContentPane().setLayout(null);
		
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Gachapon.class.getResource("/Gachapon/Q.png")));
		lblNewLabel.setBounds(196, 42, 239, 237);
		getContentPane().add(lblNewLabel);
		
		JButton btnselect = new JButton("SELECT");
		btnselect.setFont(myFont.deriveFont(Font.BOLD,11f));
		btnselect.setBounds(260, 308, 130, 41);
		getContentPane().add(btnselect);

		JButton btnStars = new JButton("Start");
		btnStars.setFont(myFont.deriveFont(Font.BOLD,11f));
		btnStars.setBounds(38, 308, 106, 41);
		getContentPane().add(btnStars);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setFont(myFont.deriveFont(Font.BOLD,11f));
		btnStop.setBounds(487, 308, 106, 41);
		getContentPane().add(btnStop);
		
		JLabel Mon = new JLabel("Gachapon Coin  " +  p.getMoney());
		Mon.setForeground(new Color(204, 0, 0));
		Mon.setFont(myFont.deriveFont(Font.BOLD,11f));
		Mon.setBounds(34, 11, 306, 74);
		getContentPane().add(Mon);
		
		JLabel lbBG = new JLabel("");
		lbBG.setIcon(new ImageIcon(Gachapon.class.getResource("/Gachapon/BG.gif")));
		lbBG.setBounds(0, -34, 653, 436);
		getContentPane().add(lbBG);
		
		Timer timer =new Timer(100,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					n  =(int)Math.floor(Math.random()*7);
					String images=imga[n];
					lblNewLabel.setIcon(new ImageIcon(Gachapon.class.getResource("/Gachapon/"+images)));
				
			}
		
		});
		
		
		btnStars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				timer.start();
				int m =p.getMoney()-1;
				Mon.setText("Gachapon Coin  "+m);
				p.setMoney(m);

				if(m < 0) {
					m = 0;
					Mon.setText("Gachapon Coin  0");
					timer.stop();
					JOptionPane.showMessageDialog(null,"You Out of Your Coins", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		
		
		btnselect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = p.getMoney() ;
				
				timer.stop();

				if (a == 0) {
					JOptionPane.showMessageDialog(null,"You Can Selected Once , Please Come Again Tomorrow", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {	
				if (n == 0 ) {
				JOptionPane.showMessageDialog(null,"You got : "  + lp.getName() , "Selected", JOptionPane.INFORMATION_MESSAGE);
				}
				else if (n == 1 ) {
					JOptionPane.showMessageDialog(null,"You got : " + sl.getName() , "Selected", JOptionPane.INFORMATION_MESSAGE);
					}
				else if (n == 2 ) {
					JOptionPane.showMessageDialog(null,"You got : " + rr.getName() , "Selected", JOptionPane.INFORMATION_MESSAGE);
						}
				else if (n == 3 ) {
					JOptionPane.showMessageDialog(null,"You got : " + lc.getName() , "Selected", JOptionPane.INFORMATION_MESSAGE);
							}
				else if (n == 4 ) {
					JOptionPane.showMessageDialog(null,"You got : " + cl.getName() , "Selected", JOptionPane.INFORMATION_MESSAGE);
								}
				else if (n == 5 ) {
					JOptionPane.showMessageDialog(null,"You got : "+ bt.getName()  , "Selected", JOptionPane.INFORMATION_MESSAGE);
									}
				else if (n == 6 ) {
					JOptionPane.showMessageDialog(null,"You got : " + sd.getName() , "Selected", JOptionPane.INFORMATION_MESSAGE);
								}
				
			}
				p.setMoney(0) ;
			
				
				}	
				
			
		});
		
		
		
		
		setVisible(true);
	}
	
}


	

