import java.util.Scanner;

public class null_point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        try {
            // Attempt to convert the user input to an integer
            int convertedNumber = Integer.parseInt(userInput);
            System.out.println("Converted number: " + convertedNumber);
        } catch (NumberFormatException e) {
            // Handle if user input is not a valid integer
            System.out.println("Error: Input is not a valid integer.");
        } catch (NullPointerException e) {
            // Handle if user input is null
            System.out.println("Error: Input is null.");
        }
    }
}

