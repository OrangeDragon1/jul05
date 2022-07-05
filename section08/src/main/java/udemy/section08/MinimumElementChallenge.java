package udemy.section08;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] myNum = readIntegers();
        System.out.println(Arrays.toString(myNum));
        System.out.println("Smallest value >> " + findMin(myNum));

    }

    public static int[] readIntegers() {
        System.out.print("Enter number of integers >> ");
        int input = scanner.nextInt();
        int[] array = new int[input];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer >> ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }
}
