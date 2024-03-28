import java.util.Scanner;

public class calculator 
{
      public static void main(String[] args) 
      {
            double sum=0;//Initialise a sum variable to store calculation 
            Scanner sc=new Scanner(System.in);
            //Get a first value from user
            System.out.print("Enter a First Value--->");
            double num1=sc.nextDouble();

            //Get a second value from user
            System.out.print("Enter a Second Value--->");
            double num2=sc.nextDouble();
            
            //Display operators to perform operation
            System.out.println("+\n-\n*\n/");

            //Get a input form user to calculate a operation
            System.out.print("Enter your choise--->");
            char choise=sc.next().charAt(0);

            //Apply a try catch box to check a artihmatic expression 
            try
            {
                  switch (choise) 
                  {
                        case '+':
                              //Operation of Addition
                              sum=num1+num2;
                              System.out.println("Addition of "+num1+" + "+num2+" is "+sum);
                              break;
                        case '-':
                              //Operation of Substraction
                              sum=num1-num2;
                              System.out.println("Addition of "+num1+" - "+num2+" is "+sum);
                              break;
                        case '*':
                              //Operation of Multiplication
                              sum=num1*num2;
                              System.out.println("Addition of "+num1+" x "+num2+" is "+sum);
                              break;
                        case '/':
                              //Check a condition if number is zero then invalid operation
                              //else print the calculation
                              if(num2==0)
                              {
                                    //Created a customised throw ArithmeticException
                                    throw new ArithmeticException("Division by zero not allowed");
                              }
                              System.out.println("Addition of "+num1+" / "+num2+" is "+sum);
                              break;
                        default:
                              System.out.println("invalid operator");
                              break;
                  }
            }catch(ArithmeticException e)
            {
                  System.out.println("Error"+e.getMessage());
            }
      }      
}
