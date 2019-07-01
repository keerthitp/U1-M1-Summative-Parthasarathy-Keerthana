import java.beans.FeatureDescriptor;
import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] args){
        //This program converts a number entered by the user into a month. You must provide one version that uses an if/else/else-if structure

        // Prepare the scanner to get input from the user for the month

        Scanner scanner = new Scanner(System.in);

        int month;

        System.out.println("Enter the month number: ");
        month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The number entered is "+ month);

        String[] monthArrays = {"January", "February", "March", "April", "May",
                               "June", "July", "August", "September", "October",
                                    "November", "December"};

        if (month == 1)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 2)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 3)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 4)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 5)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 6)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 7)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 8)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 9)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);

        else if (month == 10)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 11)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else if (month == 12)
            System.out.println("month "+ month + " is "+ monthArrays[month-1]);
        else
            System.out.println("Number entered "+ month+ " is out of range");
    }

}
