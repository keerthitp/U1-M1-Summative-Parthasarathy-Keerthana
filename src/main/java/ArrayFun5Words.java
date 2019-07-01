import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        // Your code must get 5 words from the user, put them in an array, and print the array elements to the screen.

        String[] strArray = new String[5];

        // Prepare the scanner
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< 5; i++){
            System.out.println("Enter a name: ");
            strArray[i] = scanner.nextLine();
        }

        System.out.println("Printing out the string array");

        for (int i = 0; i< 5 ; i++)
            System.out.println("Array[" + i + "]->"+ strArray[i]);

    }
}
