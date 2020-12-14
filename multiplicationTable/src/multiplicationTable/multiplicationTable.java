package multiplicationTable;

public class multiplicationTable {
	
	public static void main(String[] args) {
	   for (int i =1; i <= 10; i++){
	        //cycles through the first number to multiply

	        for (int b=1; b <=10; b++){
	            //cycles through second number to multiply
	            System.out.print(i*b + " ");
		        }
		        System.out.println();
		    }
		}
}
