import java.util.Scanner;


public class BankAccountTesterModified {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount to start you account: ");
		double newAmt = input.nextDouble();
		
		System.out.println("Enter Interest Percent: ");
		double interest = input.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(newAmt, interest);
		
		System.out.println("Enter the amount you would like to Deposit: ");
		double newDeposit = input.nextDouble();
		myBankAccount.deposit(newDeposit);
		
		System.out.println("Enter the amount you would like to Withdraw: ");
		double newWithdrawal = input.nextDouble();
		myBankAccount.withdraw(newWithdrawal);
		
		myBankAccount.calcInterest();
		
		
		System.out.println("Your balance is: " + myBankAccount.getBalance());
		
	}
}
