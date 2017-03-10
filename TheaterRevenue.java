import javax.swing.*;
import java.awt.event.*;
//imports all the swing packages and the awt event packages

public class TheaterRevenue extends JFrame { //extends the GUI class
	//initiates the Jpanel
	private JPanel panel;
	//initiates labels
	private JLabel Label_Priceofadulttickets;
	private JLabel Label_Numofadultticketssold;
	private JLabel Label_Priceofchildtickets;
	private JLabel Label_Numofchildticketssold;
	//initiates text fields
	private JTextField TextField_Priceofadulttickets;
	private JTextField TextField_Numofadultticketssold;
	private JTextField TextField_Priceofchildtickets;
	private JTextField TextField_Numofchildticketssold;
	//initiates button fields
	private JButton calcButton;
	//set the window width and height
	private final int windowwidth = 300;
	private final int windowheight = 200;
	private final double kept = 0.2;

	
	public TheaterRevenue() {
		//set the window title
		setTitle("Theater Revenue");
		//set the size of window
		setSize(windowheight, windowwidth);
		//closes the application when the close button is clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//build panel
		TheaterPanel();
		//add the panel
		add(panel);
		//makes the panel visible
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//calls the constructor when the program starts and creates the GUI application
		new TheaterRevenue();
	}
	
	private void TheaterPanel(){
		
		Label_Priceofadulttickets = new JLabel("Enter adult ticket price ");
		TextField_Priceofadulttickets = new JTextField(10);
		Label_Numofadultticketssold = new JLabel("Enter adult tickets sold ");
		TextField_Numofadultticketssold = new JTextField(10);
		
		Label_Priceofchildtickets = new JLabel("Enter child ticket price ");
		TextField_Priceofchildtickets = new JTextField(10);
		Label_Numofchildticketssold = new JLabel("Enter child tickets sold ");
		TextField_Numofchildticketssold = new JTextField(10);
		
		calcButton = new JButton ("Calculate Theater Revenue");
		//add an action listener to the button
		calcButton.addActionListener((ActionListener) new CalcButtonListener());
		
		//makes a JPanel object
		panel = new JPanel();
		//creates the label, text and button
		panel.add(Label_Priceofadulttickets);
		panel.add(TextField_Priceofadulttickets);
		panel.add(Label_Numofadultticketssold);
		panel.add(TextField_Numofadultticketssold);
		panel.add(Label_Priceofchildtickets);
		panel.add(TextField_Priceofchildtickets);
		panel.add(Label_Numofchildticketssold);
		panel.add(TextField_Numofchildticketssold);
		panel.add(calcButton);
		}

		//Action listener for the calculate button
		private class CalcButtonListener implements ActionListener {
			//triggers when the calcbutton is clicked
			public void actionPerformed(ActionEvent e){
				String input;
				//Initialize variables
				double Gross_adultticketssold;
				double net_adultticketssold = 0 ;
				double Gross_childticketssold;
				double net_childticketssold;
				double totalgross;
				double totalnet;
				
				//gets the text from the text fields and sets them to the variables
				String inputone = TextField_Priceofadulttickets.getText();
				String inputtwo = TextField_Numofadultticketssold.getText();
				String inputthree = TextField_Priceofchildtickets.getText();
				String inputfour = TextField_Numofchildticketssold.getText();
				//convert the input to a double and sets the variable
				Gross_adultticketssold = Double.parseDouble(inputone) * Double.parseDouble(inputtwo);
				Gross_childticketssold = Double.parseDouble(inputthree) * Double.parseDouble(inputfour);
				
				//display the result
				JOptionPane.showMessageDialog(null, "Gross revenue for adult tickets sold is "+ Gross_adultticketssold);
				net_adultticketssold = Gross_adultticketssold - (Gross_adultticketssold * kept);
				JOptionPane.showMessageDialog(null, "Net revenue for adult tickets sold is " + net_adultticketssold);
				
				JOptionPane.showMessageDialog(null, "Gross revenue for child tickets sold is "+ Gross_childticketssold);
				net_childticketssold = Gross_childticketssold - (Gross_childticketssold * kept);
				JOptionPane.showMessageDialog(null, "Net revenue for child tickets sold is " + net_childticketssold);
				
				totalgross = (Gross_adultticketssold + Gross_childticketssold);
				totalnet = (net_adultticketssold + net_childticketssold);
				
				JOptionPane.showMessageDialog(null, "The total gross revenue is " + totalgross +"\n" +
				"The total net revenue is " + totalnet);
			}
		}
	}
