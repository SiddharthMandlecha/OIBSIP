import java.util.Scanner;

public class Atm {
    public static void main (String[] args){
     int balance = 520000, withdraw,deposit;
     Scanner scanner = new Scanner (System.in);
     while(true)
     {
        System.out.println("Automatic Atm Machine");
        System.out.println("chosse 1 for Withdraw Money");
        System.out.println("chosse 2 for Deposit Money");
        System.out.println("chosse 3 for Account Statement");
        System.out.println("chosse 4 to Check Account Balance");
        System.out.println("chosse 5 to Quit");

        System.out.println("Choose the operation you want to perform :");

        int n = scanner.nextInt();
       switch (n)
    {
       case 1:
       System.out.println("Enter Money to be Withdrawn :");
       withdraw = scanner.nextInt();
       if (balance >= withdraw)
       {
        balance = balance - withdraw;
        System.out.println("Please collect your money :");
    }
    else 
{
    System.out.println("Insufficient Balance ");

}
System.out.println();
break;


case 2:
System.out.println("Enter Money to be Deposited :");
deposit = scanner.nextInt();
balance = balance + deposit;
System.out.println("Your Money has Been Deposited");
System.out.println();
break;

case 3:
System.out.print("Total Balance :" +balance);
System.out.println();
break;

case 4:
System.exit(0);
 
                  }
      
      
      
             }
      
      
      
        }    
  
  
  
}
