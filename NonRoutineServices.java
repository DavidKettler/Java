import java.awt.*;
import javax.swing.*;
public class NonRoutineServices extends JPanel {
	
	private JLabel lblParts;
	private JLabel lblHours;
	private JTextField tfPartCharges;
	private JTextField tfHoursOfLabor;
	
	public NonRoutineServices() {
		setLayout(new GridLayout(3, 1));
		
		lblParts = new JLabel("Parts Charges: \t");
		tfPartCharges = new JTextField();
		lblHours = new JLabel("Hours of Labor: \t");
		tfHoursOfLabor = new JTextField();
		
		
		
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
		
		add(lblParts, tfPartCharges);
		add(tfPartCharges);
		add(lblHours);
		add(tfHoursOfLabor);
	}
	
	public int getParts() {
		return Integer.parseInt(this.tfPartCharges.getText());
	}
	
	public int getHours() {
		return Integer.parseInt(this.tfHoursOfLabor.getText());
	}

}
