import java.util.Scanner;
import javax.swing.JOptionPane;
public class ClassExample {

	public static void main(String[] args) {
		String name;
		String name1 = "David";
		Scanner keyboard = new Scanner(System.in);
		/*System.out.println("What is your name?");
		name = keyboard.nextLine();
		
		if (name.equals(name1)) {
			System.out.println("Welcome, " + name + ", you are authorized");
		} else {
			System.out.println("You are not authorized, Please leave immediately");
		}
		keyboard.close();*/
		
		name = JOptionPane.showInputDialog("What is your name?");
		if (name.equals(name1)) {
			JOptionPane.showMessageDialog(null, "Welcome, " + name + ", you are autherized");
		} else {
			JOptionPane.showMessageDialog(null, "You are not autherized, Please leave immediately");
		}
	}

}
