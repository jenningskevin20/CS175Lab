package mailMerge;

import java.util.Scanner;

public class mailMerge {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String firName = in.next();
		
		System.out.println("Enter Last Name: ");
		String lastName = in.next();
		
		System.out.println("Enter the House Number: ");
		String houNum = in.next();
		
		System.out.println("Enter the Street Name: ");
		String streName = in.next();
		String stretype = in.next();
		//street type is clarifying st, drive, rd, etc
		
		String text1 = "Dear Joe Smo";
		String text2 = "Please confirm that your address is 123 Apple Grape";
		String text3 = "Your answer is Pair";
		
		text1 = text1.replace("Joe", firName);
		text1 = text1.replace("Smo", lastName);
		text2 = text2.replace("123", houNum);
		text2 = text2.replace("Apple", streName);
		text2 = text2.replace("Grape", stretype);
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println("Enter Y/N  to the question: ");
		String result = in.next();
		
		text3 = text3.replace("Pair", result);
		System.out.println(text3);
		
		in.close();
		
	}

}
