import java.awt.*;
import javax.swing.*;
public class RoutineServices  extends JPanel {
	
	public final double OIL_CHANGE = 26.00;
	public final double LUBE_JOB = 18.00;
	public final double RADIATOR_FLUSH = 30.00;
	public final double TRANSMISSION_FLUSH = 80.00;
	public final double INSPECTION = 15.00;
	public final double MUFFLER_REPLACEMENT = 100.00;
	public final double TIRE_ROTATION = 20.00;
	
	private JCheckBox oilChange;
	private JCheckBox lubeJob;
	private JCheckBox radiatorFlush;
	private JCheckBox transmissionFlush;
	private JCheckBox inspection;
	private JCheckBox mufflerReplacement;
	private JCheckBox tireRotation;
	
	public RoutineServices() {
		setLayout(new GridLayout(7, 1));
		
		oilChange = new JCheckBox("Oil Change ($26.00)");
		lubeJob = new JCheckBox("Lube Job ($18.00)");
		radiatorFlush = new JCheckBox("Radiator Flush ($30.00)");
		transmissionFlush = new JCheckBox("Transmission Flush ($80.00)");
		inspection = new JCheckBox("Inspection ($15.00)");
		mufflerReplacement = new JCheckBox("Muffler Replacement ($100.00)");
		tireRotation = new JCheckBox("Tire Rotation ($20.00)");
		
		setBorder(BorderFactory.createTitledBorder("Routine Services"));
		
		add(oilChange);
		add(lubeJob);
		add(radiatorFlush);
		add(transmissionFlush);
		add(inspection);
		add(mufflerReplacement);
		add(tireRotation);
	}
	
	public double getRoutineServicesCost() {
		double servicesCost = 0.0;
		if (oilChange.isSelected())
			servicesCost += OIL_CHANGE;
		if (lubeJob.isSelected())
			servicesCost += LUBE_JOB;
		if (radiatorFlush.isSelected())
			servicesCost += RADIATOR_FLUSH;
		if (transmissionFlush.isSelected())
			servicesCost += TRANSMISSION_FLUSH;
		if (inspection.isSelected())
			servicesCost += INSPECTION;
		if (mufflerReplacement.isSelected())
			servicesCost += MUFFLER_REPLACEMENT;
		if (tireRotation.isSelected())
			servicesCost += TIRE_ROTATION;
		
		return servicesCost;
	}

}
