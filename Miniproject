import java.util.Scanner;
class Miniproject
{
public static void main(String [ ] args)
{
Scanner sc = new Scanner(System.in) ;
double balance = 1000;
while(true)
{
System.out.println("===== BANK MANAGEMENT SYSTEM ===== ") ;
System.out.println(" Enter your choice :") ;
int number = sc.nextInt();
switch(number) {
case 1:
System.out.println("Deposit Amount:");
double amount = sc.nextDouble();
balance = balance + amount;
System.out.println("Balance: " + balance);
break;
case 2:
System.out.println("Withdrawal amount:");
double withdrawal = sc.nextDouble();

if(withdrawal > balance)
{
System.out.println("Insufficient Balance");
}
else
{
balance = balance - withdrawal;
System.out.println("Balance: " + balance);
}
break;
case 3:
System.out.println("Current Balance: " + balance);
break;
case 4:
System.out.println("4.Exit the program completely ") ;
System.out.println("Thank you for using Bank Management System.");
System.exit(0);
break;
default :
System.out.println(" Invalid ") ;
break;
}
}
}
}
