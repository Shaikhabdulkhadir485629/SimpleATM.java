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
System.out.println("Current Balance is Rupees-" + balance);
}

public void getCash(int amount){
if(amount<=0){
System.out.println("Invalid amount, Please enter valid amount");
return;
}
if(balance >= amount){
balance -=amount;
System.out.println("Dispensed" + amount);
System.out.println("Remaining Balance is: Rupees-" + balance);
}else{
System.out.println("Insufficiant Balance... Available Balance is ₹" + balance);
}
}
public static void main(String[] ar){
Scanner scanner = new Scanner(System.in);
ATM atm= new SimpleATM();
atm.getMyBalance();
System.out.print("Enter the amount you want to withdraw: Rupees-");
int amount = scanner.nextInt();
atm.getCash(amount);  
scanner.close();
}
}