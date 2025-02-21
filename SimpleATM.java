import java.util.Scanner;
interface ATM { 
void getMyBalance();
void getCash(int amount);
}

public class SimpleATM implements ATM{
double balance;

public SimpleATM(){
this.balance = 50000.00;
}

public void getMyBalance(){
System.out.println("Current Balance is Rupees:" + balance);
}

public void getCash(int amount){
if(amount<=0){
System.out.println("Invalid amount, Please enter valid amount");
return;
}
if(balance >= amount){
balance -=amount;
System.out.println("Dispensed" + amount);
System.out.println("Remaining Balance is: Rupees:" + balance);
}else{
System.out.println("Insufficiant Balance... Available Balance is Rupees:" + balance);
}
}
public static void main(String[] ar){
Scanner scanner = new Scanner(System.in);
SimpleATM atm= new SimpleATM();

while (true) {
System.out.println("\n===== Welcome to Simple ATM =====");
System.out.println("1. Check Balance");
System.out.println("2. Withdraw Cash");
System.out.println("3. Exit");
System.out.print("Choose an option (1-3): ");
int choice =scanner.nextInt();
switch (choice) {
	case 1: 
	atm.getMyBalance();
	break;
	case 2:
	System.out.print("Enter the amount you want to withdraw: Rupees:");
	int amount = scanner.nextInt();
	atm.getCash(amount);  
	break;
	case 3:
	System.out.println("Thank you for using Simple ATM. Have a great day!");
        scanner.close();
        return;
        default:
        System.out.println("Invalid choice. Please enter a valid option.");
}
}
}
}