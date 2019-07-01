import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args){

        // This program prompts the user for a number between 1 and 10 and keeps asking until the entered number is in range. Your solution must be in a Java file called ValidNumber.

        // Preparing the scanner for input

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int tryAgain = 0;

        do
        {
            if(tryAgain == 0)
                System.out.println("Enter a number between 1 and 10");
            else
                System.out.println("You must enter a number between 1 and 10, please try again");
            number = scanner.nextInt();
            scanner.nextLine();

            if (number >= 1 && number <= 10)
            {
                System.out.println("Number entered is "+ number);
                //break;
            }
            else
                tryAgain =1;

        }while ((number < 1 || number >10  ));

    }
}
