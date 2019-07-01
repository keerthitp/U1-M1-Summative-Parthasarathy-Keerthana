public class ArrayFunReverseIt {

    public static void main(String[] args){

        int[] array = {1,2,3,4,5};
        int[] reverseArray = new int[array.length];

        for (int i = 0; i< array.length; i++)
        {
            reverseArray[array.length-i -1 ] =array[i];

        }

        for (int i = 0; i< array.length; i++)
        {
            System.out.println("array["+i+"]-> "+array[i]);

        }

        for (int i = 0; i< array.length; i++)
        {
            System.out.println("reverseArray["+i+"]-> "+reverseArray[i]);

        }
    }

}
