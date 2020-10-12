
public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount myBankAccount = new BankAccount(1000);
		System.out.println("A new account was created with a balance of $1000");
		myBankAccount.deposit(1500);
		System.out.println("An amount of $1500 was deposited into the account");
		myBankAccount.withdraw(500);
		System.out.println("An amount of $500 was withdrawn from the account");
		System.out.println("The balance is: " + myBankAccount.getBalance());
		
		
		
		
	}
		
}
