import java.util.Scanner;


public class ATMOBJ {
	
	private Account[] _accounts = new Account[9];
	private int _currentAccount;
	
	public ATMOBJ(){
		//default constructor creates the 9 accounts with 100 in them
		for(int i = 0; i < 9; i++) {
			_accounts[i] = new Account(i, 100);
		}
	}
	
	public void run() {
		
			//get/validate account number
			int AccountChoice = getAccountNum();
		
			//if account choice is within the array size
         //could use the account array size to test
			if(AccountChoice >= 0 && AccountChoice <= 9){
				_currentAccount = AccountChoice;
			}
			else{
				//else get the account number again
				AccountChoice = getAccountNum();
			}
			
		
		
		//menu choice switch statement
		int menuChoice = showMenu();
		while(menuChoice != 5){
			switch(menuChoice){
				case 1:
					System.out.println("The account balance is: " + _accounts[_currentAccount].getBalance()); 
					break;
				case 2:
					Withdraw();
					System.out.println("The account balance is: " + _accounts[_currentAccount].getBalance()); 
					break;
				case 3:
					Deposit();
					System.out.println("The account balance is: " + _accounts[_currentAccount].getBalance()); 
					break;
            case 4:
               System.out.println(_accounts[_currentAccount].getDateMade());
				default:
					System.out.println("Must enter a valid menu choice. ");
					break;
			}
			menuChoice = showMenu();
		}
			

		
	}
	
	public int getAccountNum() {
		
		Scanner sc = new Scanner(System.in); //setting up that scanner
		int choice = 0;
		
		System.out.print("Enter an account ID: ");
		while(!sc.hasNextInt()){
			System.out.print("Error: Enter a valid account ID: ");
			sc.next(); // this is important!
		}
		choice = sc.nextInt();
		
		return choice;
		
	}
	
	
	public int showMenu() {
		
		System.out.println("====={M A I N  M E N U}=====");
		System.out.println("1. Check Balance.           ");
		System.out.println("2. Withdraw.                ");
		System.out.println("3. Deposit.                 ");
      System.out.println("4. info.                    ");
		System.out.println("5. exit.                    ");
		
		Scanner sc = new Scanner(System.in); //setting up that scanner
		int choice = 0;
		System.out.print("Enter a valid menu option: ");
		
		choice = sc.nextInt();
		
		return choice;
	}
	
	
	public void Withdraw() {
		
		Scanner sc = new Scanner(System.in); //setting up that scanner
		double amt = 0;
		
		System.out.println("Enter withdraw amount: ");
      
      //validates input as whatever you tell it hasNextInt / Double 
		while(!sc.hasNextDouble()){
			System.out.println("Enter withdraw amount: ");
			sc.next(); // this is important!
		}
		amt = sc.nextDouble();
		
		_accounts[_currentAccount].withdraw(amt);
		
	}
	
	public void Deposit() {
   
		Scanner sc = new Scanner(System.in); //setting up that scanner
		double amt = 0;
		
		System.out.print("Enter Deposit amount: ");
		while(!sc.hasNextDouble()){
			System.out.print("Enter Deposit amount: ");
			sc.next(); // this is important!
		}
		amt = sc.nextDouble();
		
		_accounts[_currentAccount].deposit(amt);
		
		

		
	}
	
	
	
}		


