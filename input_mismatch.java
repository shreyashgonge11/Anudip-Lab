import java.util.InputMismatchException;
import java.util.Scanner;

class input_mismatch
{
      public static void main(String[] args) 
      {
            Scanner sc=new Scanner(System.in);
            try
            {
                  //Get a input form user for array size
                  System.out.print("Enter a Array Size--->");
                  int size=sc.nextInt();
                  
                  //Declare an Array
                  int arr[]=new int[size];

                  //Get a element form user and store in array
                  for(int i=0;i<arr.length;i++)
                  {
                        arr[i]=sc.nextInt();
                  }

                  //Display array
                  for(int j=0;j<arr.length;j++)
                  {
                        System.out.print(arr[j]+" ");
                  }
            }
            //Applied exception for invalid input
            catch(InputMismatchException e)
            {
                  e.printStackTrace();
            }
      }
}