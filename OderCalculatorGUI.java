import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class OderCalculatorGUI extends JFrame {
	private BagelPanel bagels;
	private ToppingPanel toppings;
	private CoffeePanel coffee;
	private GreetingPannal banner;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	private final double TAX_RATE = 0.06;
	
	public OderCalculatorGUI() {
		super("Order Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		banner = new GreetingPannal();
		bagels = new BagelPanel();
		toppings = new ToppingPanel();
		coffee = new CoffeePanel();
		
		buildButtonPanel();
		
		add(banner, BorderLayout.NORTH);
		add(bagels, BorderLayout.WEST);
		add(toppings, BorderLayout.CENTER);
		add(coffee, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private void buildButtonPanel() {
		buttonPanel = new JPanel();
		
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double subtotal, tax, total;
			subtotal = bagels.getBagelCost() + toppings.getToppingsCost() + coffee.getCoffeeCost();
			
			tax = subtotal * TAX_RATE;
			total = subtotal + tax;
			
			DecimalFormat dollar = new DecimalFormat("0.00");
			
			JOptionPane.showMessageDialog(null, "Subtotal: $" + dollar.format(subtotal) + 
					"\n Tax: $" + dollar.format(tax) + "\n Total: $" + dollar.format(total));
		}
	}
	
	private class ExitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new OderCalculatorGUI();
	}

}
