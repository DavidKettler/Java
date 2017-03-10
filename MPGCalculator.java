import javax.swing.*;
import java.awt.event.*;
//imports all the swing and awt event packages
public class MPGCalculator extends JFrame {
	//Initializes the panel, labels, text fields, and buttons
	private JPanel panel;
	private JLabel messageLabelgallons;
	private JLabel messageLabelmiles;
	private JTextField gallonsTextField;
	private JTextField milesTextField;
	private JButton mpgbutton;
	//variable for the width and height of the window
	private final int windowwidth = 125;
	private final int windowheight = 200;
	
	public MPGCalculator() {
		//set the title
		setTitle("MPG calculator");
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
		new MPGCalculator();
	}
	
	private void buildPanel(){
		//creates the labels and text fields
		messageLabelgallons = new JLabel("Enter number of gallons: ");
		gallonsTextField = new JTextField(10);
		messageLabelmiles = new JLabel("enter miles: ");
		milesTextField = new JTextField(10);
		
		//create button to calculate
		mpgbutton = new JButton("Calculate MPG");
		//makes and action listener
		mpgbutton.addActionListener(new CalculateMPG());
		
		//add items to panel
		panel = new JPanel();
		panel.add(messageLabelgallons);
		panel.add(gallonsTextField);
		panel.add(messageLabelmiles);
		panel.add(milesTextField);
		panel.add(mpgbutton);
	}
	
	public class CalculateMPG implements ActionListener{
		//when the calculate button is clicked this method will run
		public void actionPerformed(ActionEvent e){
			String inputone;
			String inputtwo;
			double mpg;
			inputone = gallonsTextField.getText();
			inputtwo = milesTextField.getText();
			mpg = (Double.parseDouble(inputtwo) / Double.parseDouble(inputone));
			//prints the result to the screen
			JOptionPane.showMessageDialog(null, "Your car gets " + mpg + "mpg");
		}
	}
}
