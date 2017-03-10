import java.awt.*;
import javax.swing.*;
public class BagelPanel extends JPanel {
	public final double WHITE_BAGEL = 1.25;
	public final double WHEAT_BAGEL = 1.50;
	
	private JRadioButton WhiteBagel;
	private JRadioButton WheatBagel;
	
	private ButtonGroup bg;
	
	public BagelPanel() {
		setLayout(new GridLayout(2, 1));
		WhiteBagel = new JRadioButton("White", true);
		WheatBagel = new JRadioButton("Wheat");
		
		bg = new ButtonGroup();
		bg.add(WhiteBagel);
		bg.add(WheatBagel);
		
		setBorder(BorderFactory.createTitledBorder("Bagel"));
		add(WhiteBagel);
		add(WheatBagel);
	}
	
	public double getBagelCost() {
		double bagelCost = 0.0;
		if (WhiteBagel.isSelected()) {
			bagelCost = WHITE_BAGEL;
		} else {
			bagelCost = WHEAT_BAGEL;
		}
		return bagelCost;
	}

}
