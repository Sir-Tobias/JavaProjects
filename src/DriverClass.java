public class DriverClass{
BankAccount[] accounts;
{
myAccount = new BankAccount("Tobias M", 10.00, "B12345");
System.out.println("A new account has been created with the details \n"
+ myAccount.toString());
}
{
//DEPOSIT
myAccount.deposit(505.22);
System.out.println("After depositing 505.22 euros.\n");
System.out.println("Your current balance is\n" + myAccount.toString());
}
{
//WITHDRAW
myAccount.withdraw(100.00);
System.out.println("After withdrawing 100.00 euros.\n");
System.out.println("Your current balance is\n" + myAccount.toString());
}
}