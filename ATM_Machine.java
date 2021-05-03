import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int initial_amount =10000;
		int amount=0;
		System.out.println("Enter your 4-digit pin");
		int pin = sc.nextInt();

	if(pin==1000){
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
			amount = sc.nextInt();
			initial_amount = initial_amount+amount;
			System.out.println("Your amount is successful");
			break;
			
		case 2:
			System.out.println("Please Enter Amount");
			amount = sc.nextInt();
			if(initial_amount>=amount) {
			System.out.println("Your amount is successful!");
			initial_amount = initial_amount-amount;
			
			}
			else {
				System.out.println("Invalid. amount Failed");
			}
			break;
			
		case 3:
			System.out.println("Your balance is " +initial_amount);
			break;
			
		case 4:{
			
			System.out.println("Thankyou!");
			System.exit(0);
		
			break;}
		}
		

			
	}
}
else{
	System.out.println("Invalid pin");
}

}
}
