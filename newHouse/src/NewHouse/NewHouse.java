package NewHouse;
import java.util.Scanner;

public class NewHouse {

	public static void main(String[] args) {
		
		/* I changed the names of some of the variables from 
		my pseudocode since I was getting confused*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the building:");
		int lengthHouse = in.nextInt();
		System.out.println("Enter the width of the building:");
		int widthHouse = in.nextInt();
		System.out.println("Enter the height of the building:");
		int heightHouse = in.nextInt();
			
			int HouseHmW = (heightHouse - widthHouse);
			int HouseLHmW = (lengthHouse * HouseHmW);
			int halfLHmW = (HouseLHmW / 2);
			int singlePeak = (lengthHouse * widthHouse + halfLHmW);
			int bothPeaks = (singlePeak * 2);
			System.out.println("The square footage of the peak side walls are " + bothPeaks);
			
			int normalSides = (lengthHouse * widthHouse * 2);
			System.out.println("The square footage of the normal side walls are " + normalSides);
			
			int totalWalls = (bothPeaks + normalSides);
			System.out.println("The square footage of the walls are " + totalWalls);
			
		System.out.println("Enter the total amount of windows on the House:");
		int numWindows = in.nextInt();
		System.out.println("Enter the length of the windows:");
		int lengthWindows = in.nextInt();
		System.out.println("Enter the height of the windows:");
		int heightWindows = in.nextInt();
			
			int totalWindows = (lengthWindows * heightWindows * numWindows);
			System.out.println("The square footage of the windows are " + totalWindows);
			
			System.out.println("Enter the amount of doors in the house:");
			int numDoors = in.nextInt();
			System.out.println("Enter the length of the doors:");
			int lengthDoors = in.nextInt();
			System.out.println("Enter the height of the doors:");
			int heightDoors = in.nextInt();
				
				int totalDoors = (lengthDoors * heightDoors * numDoors);
				System.out.println("The square footage of the doors are " + totalDoors);
				
				int subDW = (totalDoors + totalWindows);
				int totalsqft = (totalWalls- subDW);
				System.out.println("The total amount of square footage of the house is " + totalsqft);
				
				System.out.println("Enter the cost per square foot set by painter:");
				int sqftCost = in.nextInt();
				
					int totalCost = (totalsqft * sqftCost);
					System.out.println("The total cost to paint the house is $" + totalCost);
			
		
		
	}
	
	
	
	
}
