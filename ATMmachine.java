package srujan;
import java.util.Scanner;

class bank{
	private double balance;
	
	public bank(double initialbalance) {
		this.balance = initialbalance;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("successfully money has deposit. your new balance is : " + balance);
		}else {
			System.out.println("Invalid amount for deposit.");
		}
		
	}
	public void witdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("withdrawal successful. remaining balance : " + balance);
		}else {
			System.out.println("Insufficient funds for withdrawal");
		}
	}
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
}
class ATM{
	private bank account;
	private Scanner scanner;
	
	public ATM(bank account) {
		this.account = account;
		this.scanner = new Scanner(System.in); 
		}
	public void showMenu() {
		System.out.println("i) check balance");
		System.out.println("ii) deposit");
		System.out.println("iii) withdraw");
		System.out.println("iv) exit");
	}
	public void run() {
		int choice;
		do {
			showMenu();
			System.out.print("enter your choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				checkbalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("thank you for using the ATM! ");
				break;
			default:
				System.out.println("invalid choice.");
			}
		}while(choice != 4);
	}
	private void checkbalance() {
		System.out.println("your current balance is: "  + account.getbalance());
	}
	private void deposit() {
		System.out.println("enter the amount to deposit: ");
		double amount = scanner.nextDouble();
		account.deposit(amount);
	}
	private void withdraw() {
		System.out.print("enter the amount to withdraw: ");
		double amount = scanner.nextDouble();
		account.withdraw(amount);
		
	}
	
}
public class ATMmachine {
		public static void main(String[] args) {
			System.out.println("welcome");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your four digit PIN:");
			int enteredPin = sc.nextInt();
			
			bank useraccount = new bank(1500.0);
			ATM atm = new ATM(useraccount);
			atm.run();
		}
}
