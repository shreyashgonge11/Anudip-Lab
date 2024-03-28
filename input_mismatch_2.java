import java.util.InputMismatchException;
import java.util.Scanner;

public class input_mismatch_2 
{
      public static void main(String[] args) 
      {
            try
            {
                  double sum=0;
                  //create a scnner object
                  Scanner sc=new Scanner(System.in);
                  //get a first value from user
                  System.out.print("Enter a first value--->");
                  double num1=sc.nextInt();
                  //get a second value from user
                  System.out.print("Enter a Second value--->");
                  double num2=sc.nextInt();

                  //Display this massage 
                  System.out.println("1.Addition");
                  System.out.println("2.Substraction");
                  System.out.println("3.Multiplication");
                  System.out.println("4.Division");
                  
                  //get a input from user to perform a arithmatic operation
                  System.out.print("Enter your Choise--->");
                  int choise=sc.nextInt();

                  switch (choise) 
                  {
                        case 1:
                              sum=num1+num2;
                              System.out.println(num1+"+"+num2+"="+sum);
                              break;
                        case 2:
                              sum=num1-num2;
                              System.out.println(num1+"-"+num2+"="+sum);
                              break;
                        case 3:
                              sum=num1*num2;
                              System.out.println(num1+"x"+num2+"="+sum);
                              break;
                        case 4:
                              sum=num1/num2;
                              System.out.println(num1+"/"+num2+"="+sum);
                              break;
                        default:
                              System.out.println("Invalid Choise!!! Please Try again");
                              break;
                  }
            }catch(InputMismatchException e)
            {
                  System.out.println("Invalid Input ");
            }
      }      
}
