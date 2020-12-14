import java.util.*;
import javax.swing.*;

public class AgeCalculation {

	public static void main(String[] args) {
		
		GregorianCalendar now = new GregorianCalendar();
		int curYear; //Current year
		int birthday; //You're birthday including year
		int ageCalc; // Stores users age
		birthday = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));
		curYear = now.get(GregorianCalendar.YEAR);
		ageCalc = curYear - birthday;
		JOptionPane.showMessageDialog(null,  "You are " + ageCalc + "years old.");
		
		
	}
	
}
