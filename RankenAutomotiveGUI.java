import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class RankenAutomotiveGUI extends JFrame {
	private RoutineServices routine;
	private NonRoutineServices nonroutine;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	private final double HOURSOFLABOR = 20;
	
	public RankenAutomotiveGUI() {
		super("Ranken's Automotive Maintenance");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		routine = new RoutineServices();
		nonroutine = new NonRoutineServices();
		
		buildButtonPanel();
		
		add(routine, BorderLayout.NORTH);
		add(nonroutine, BorderLayout.CENTER);
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
			double subtotal, total, Hours;
			subtotal = routine.getRoutineServicesCost() + nonroutine.getParts();
			Hours = nonroutine.getHours() * 20;
			total = subtotal + Hours;

			DecimalFormat dollar = new DecimalFormat("0.00");
			
			JOptionPane.showMessageDialog(null, "Total Charges: $" + dollar.format(total));
		}
	}
	
	private class ExitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new RankenAutomotiveGUI();
	}

}
