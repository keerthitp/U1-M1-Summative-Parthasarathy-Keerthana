import java.util.Scanner;

public class MonthConverterSwitch {

    public static void main(String[] args){

        //This program converts a number entered by the user into a month using switch - case

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


        switch (month)
        {
            case 1:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 2:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 3:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 4:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 5:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 6:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 7:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 8:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 9:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 10:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 11:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            case 12:
                System.out.println("month "+ month + " is "+ monthArrays[month-1]);
                break;
            default:
                System.out.println("Number entered "+ month+ " is out of range");

        }
    }


}
