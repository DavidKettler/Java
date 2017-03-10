import javax.swing.*;
import java.awt.event.*;
//imports all the swing and awt event packages
public class TempConverter extends JFrame {
	//Initializes the panel, labels, text fields, and buttons
	private JPanel panel; //panel
	private JLabel messageLabel;
	private JTextField celisus;
	private JButton Fbutton;
	//variable for the width and height of the window
	private final int windowwidth = 200;
	private final int windowheight = 150;
	
	public TempConverter() {
		 //set the title
 		setTitle("Temperature convertor");
 		//set the size of window
 		setSize(windowwidth, windowheight);
 		//when close button is clicked
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		//build panel
 		buildPanel();
 		//add the panel
 		add(panel);
 		//display the window
 		setVisible(true);
	}
	
	public static void main(String[] args) {
		//calls the class constructor
		new TempConverter();
	}

	private void buildPanel(){
		//creates the labels, textFields buttons and acton listener for the button
 		messageLabel = new JLabel("Enter Celsius temperature: ");
 		celisus = new JTextField(10);
 		Fbutton = new JButton("Calculate");
 		Fbutton.addActionListener(new Calc());
 		//add components to panel
 		panel = new JPanel();
 		panel.add(messageLabel);
 		panel.add(celisus);
 		panel.add(Fbutton);
 	}
 	//when the calc button is clicked it will run this method
 	private class Calc implements ActionListener{
 		public void actionPerformed(ActionEvent e){
 			String input;
 			double f,c;
 			input = celisus.getText();
 			c = Double.parseDouble(input);
 			f=c*(9/5) + 32;
 			//display result
 			JOptionPane.showMessageDialog(null, c + " Celcius is " + f + " in Fahrenhiet.");			
 		}
 	}
}
