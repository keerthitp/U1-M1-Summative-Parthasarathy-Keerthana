public class SomeMath {

    public static void main(String[] args) {

        /*
        Create a method called total5.  This method must take 5 int parameters and return the total. You must call the method with the following parameters and print the returned total to the screen: 1, 2, 3, 4, 5.
Create a method called average5. This method must take 5 int parameters and return the average of the numbers as a double. You must call the method with the following parameters and print the returned average to the screen: 1, 3, 5, 7, 9.
Create a method called largest5. This method must take 5 double parameters and return the largest. You must call the method with the following parameters and print the returned value to the screen: 42.0, 35.1, 2.3, 40.2, 15.6.
         */

        int total = total5(1, 2, 3, 4, 5);
        int avg = average5(1, 3, 5, 7, 9);
        double largest = largest5(42.0, 35.1, 2.3, 40.2, 15.6);

        System.out.println("total5 returned: "+ total);
        System.out.println("average5 returned: "+ avg);
        System.out.println("largest5 returned: "+ largest);
    }

    public static int total5(int a, int b, int c, int d, int e) {

        return a + b + c + d + e;
    }

    public static int average5(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }

    public static double largest5(double a, double b, double c, double d, double e) {

        double largest = a;

        double[] largestArr = {a,b,c,d,e};

        for (int i = 0; i <5; i++)
        {
            if (largestArr[i] > largest)
                largest = largestArr[i];
        }

        return largest;

    }




    }