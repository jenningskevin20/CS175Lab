import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class RoachSimulation {

public static void main(String[] args) {
	
	DecimalFormat dformat = new DecimalFormat("0");
	
	String input = JOptionPane.showInputDialog("Please enter initial roach population: ");
	double initialPop = Double.parseDouble(input);
	RoachPopulation bugs = new RoachPopulation(initialPop);
	
	bugs.breed();
	double num = bugs.getRoaches();
	System.out.println("The population after cycle 1 breeding is: " + dformat.format(num) + ".");
	bugs.spray(0.5);
	num = bugs.getRoaches();
	System.out.println("The population after cycle 1 spraying at 50% is: " + dformat.format(num) + ".");
	
	bugs.breed();
	num = bugs.getRoaches();
	System.out.println("The population after cycle 2 breeding is: " + dformat.format(num) + ".");
	bugs.spray(0.6);
	num = bugs.getRoaches();
	System.out.println("The population after cycle 2 spraying at 60% is: " + dformat.format(num) + ".");
	
	bugs.breed();
	num = bugs.getRoaches();
	System.out.println("The population after cycle 3 breeding is: " + dformat.format(num) + ".");
	bugs.spray(0.7);
	num = bugs.getRoaches();
	System.out.println("The population after cycle 3 spraying at 70% is: " + dformat.format(num) + ".");
	
	bugs.breed();
	num = bugs.getRoaches();
	System.out.println("The population after cycle 4 breeding is: " + dformat.format(num) + ".");
	bugs.spray(0.8);
	num = bugs.getRoaches();
	System.out.println("The population after cycle 4 spraying at 80% is: " + dformat.format(num) + ".");
}
}
