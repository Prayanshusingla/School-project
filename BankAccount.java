package class2;
import java.util.Scanner;
public class BankAccount
{
	private final double roi = 0.25; // rate of interest 
   private static int accNum = 216615429;              
   String name;             //Attributes
   double balance;         
 
   // Constructor 1: initialize all 3 instance variables
  
   public BankAccount()
   {
	 name = null ;
	 balance = 0.00;
   }
 
   // Constructor 2: parameterized constructor and set all the attributes to parameterized values. 

   public BankAccount(String n, double bk)
   {
	 name = n;
	 balance = bk;
   }
 
   public void setname(String newName ) {
	   name = newName; }
   
   public void setbalance(double newBalance) {
	   balance = newBalance;  }
  
   public int getaccNum() {
	   return accNum;
   }
   
   public String getname() {
	   return name;
   }
    
   public double getbalance() {
	   return balance;
   }
   
   
   public void account() {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter your account number:");
	   int number = scan.nextInt();
	   System.out.println("You entered:"+ number);
	   
	   if (number==accNum) {
		   System.out.println("Enter the withdraw ammount:");
		   double Wamount = scan.nextDouble();
		   System.out.println("Your bank balance:"+ (balance-Wamount));
		   System.out.println("Enter the deposit amount: ");
		   double Damount = scan.nextDouble();
		   System.out.println("Your bank balance:"+ (balance+Damount));
		   
		   
	   }
	   else 
		   {System.out.println("Wrong account number!!!");}
	   
      }
   public String toString() {
	   String result = ("Customer Name: " + name + "\n Balance: "+ balance);
	   return result;
   }
   public static void main(String[] args) {
   BankAccount acc = new BankAccount("Pray",7500);
   System.out.println(acc);
   acc.account();
   }
}