import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//imports all the swing and awt packages
public class LatinTranslator extends JFrame {
	//initiates all the labels, buttons, and panels that the class will use
	private JLabel messageLabel; 
	private JButton sinisterbutton;
	private JButton dexterbutton;
	private JButton mediumbutton;
	private JPanel panel;
	private final int windowHeight = 150;
	private final int windowWidth = 200;
	
	public LatinTranslator() {
		//set title
		setTitle("Latin translator");
		//set size of window
		setSize(windowWidth,windowHeight);
		//close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//create a label
		messageLabel = new JLabel("Click a button for English");
		
		//create the buttons
		sinisterbutton = new JButton("sinister");
		dexterbutton = new JButton("dexter");
		mediumbutton = new JButton("medium");
		
		//makes an event listener for each button
		sinisterbutton.addActionListener(new SinButtonListener());
		dexterbutton.addActionListener(new DexButtonListener());
		mediumbutton.addActionListener(new MedButtonListener());
		
		//create panel and add components
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(sinisterbutton);
		panel.add(dexterbutton);
		panel.add(mediumbutton);
		
		//add panel to content pane
		add(panel);
		//display window
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//calls the class constructor when ran
		new LatinTranslator();
	}
	
	//event listener for the sinister button
	private class SinButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Left");
		}
	}
	//event listener for the dexter button
	private class DexButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Right");
		}
	}
	//event listener for the medium button
	private class MedButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Center");
		}
	}
}
