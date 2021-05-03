import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int initial_amount =10000;
		int transaction=0;

		while(true) {
		System.out.println("*** Welcome to ATM Machine ***");
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Balance");
		System.out.println("4. Exit");
		
		
		int option1 = sc.nextInt();
		
		switch(option1) {
		case 1:
		
			System.out.println("Please Enter Amount");
			transaction = sc.nextInt();
			initial_amount = initial_amount+transaction;
			System.out.println("Your transaction is successful");
			break;
			
		case 2:
			System.out.println("Please Enter Amount");
			transaction = sc.nextInt();
			if(initial_amount>=transaction) {
			System.out.println("Your Transaction is successful!");
			initial_amount = initial_amount-transaction;
			
			}
			else {
				System.out.println("Invalid. Transaction Failed");
			}
			break;
			
		case 3:
			System.out.println("Your balance is " +initial_amount);
			break;
			
		case 4:{
			
			System.out.println(0);
		
			break;}
		}
		
//		break;
			
	}

}
}
