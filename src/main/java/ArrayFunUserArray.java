import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args){

        // Your code must read 5 ints from the user, put them in an array, and print the array elements to the screen.

        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];

        for (int i = 0; i< 5; i++)
        {
            System.out.println("Enter a number");
            number[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // printing the numbers from the array

        for (int i =0; i<5; i++)
            System.out.println("Number from the array number" +  "["+i + "]: "+ number[i]  );

    }

}
