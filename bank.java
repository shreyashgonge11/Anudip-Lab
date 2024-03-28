import java.util.Scanner;

class bankAccount
{
      //Create varaible balance
      private double balance;

      //make a bankAccount menthod to store a balance 
      public bankAccount(double bl) 
      {
            balance=bl;
      }

      //make a deposit method to deposit a balance
      public void deposit(double amount)
      {
            //Formula for balance deposit
            balance=balance+amount;
            //Display the balance
            System.out.println("Balance is--->"+balance);
      }

      //make a method to withdraw money and create a customised exception
      public void withdraw(double amount) throws InsufficientFundsException
      {
            //check if withdraw amount is grether than balance to throw a exception
            //else display withdraw amount
                  if(amount>balance)
                  {
                        throw new InsufficientFundsException("Insufficient Balance");
                  }
                  else
                  {
                        System.out.println("Balance withdraw Successfull "+amount);
                  }
      }
//create a class for exception and pass a massage
class InsufficientFundsException extends Exception
      {
            public InsufficientFundsException(String message)
            {
                  super(message);
            }
      }
}
public class bank 
{
      public static void main(String[] args) 
      {
            Scanner sc=new Scanner(System.in);
            //Get a input from user to add money in account
            System.out.print("Enter a Balance--->");
            double bl=sc.nextDouble();
            bankAccount b1=new bankAccount(bl);
            //use while loop for continious run this method
            while(true)
            {
                  //Display this message deposit and withdraw money
                  System.out.println("1.Deposit");
                  System.out.println("2.Withdraw");

                  //Get a input from user two deposit and withdraw money
                  System.out.print("Enter your choise--->");
                  int choise=sc.nextInt();

                  //apply the switch case to check user input number and perform the task
                  switch (choise) 
                  {
                        case 1:
                              //Display this message for user to enter deposit money
                              System.out.print("Enter Deposit Money--->");
                              double depositmoney=sc.nextDouble();
                              //call the deposit method to perfrom
                              b1.deposit(depositmoney);
                              break;
                        case 2:
                              //Display this message for user to enter withdraw money
                              System.out.print("Enter Withdraw Money--->");
                              double withdrawmoney=sc.nextDouble();
                              //apply try catch block withdraw money grether than balance 
                              //then get a exception
                              try
                              {
                                    b1.withdraw(withdrawmoney);
                              }catch(Exception e)
                              {
                                    //Display exception message
                                    System.out.println(e.getMessage());
                              }
                              break;
                  
                        default:
                              System.out.println("Invalid Input!!!");
                              break;
                  }
            }
            
      }      
}

