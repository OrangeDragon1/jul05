package udemy.section08;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = { 23, 7, 24, 30, 35, 99 };
        System.out.println(Arrays.toString(array));
        int[] revArray = reverse(array);
        System.out.println(Arrays.toString(revArray));
    }

    private static int[] reverse(int[] array) {
        int[] revArray = Arrays.copyOf(array, array.length);
        int maxIndex = revArray.length - 1;
        int halfIndex = revArray.length / 2;
        for (int i = 0; i < halfIndex; i++) {
            int temp = revArray[i];
            revArray[i] = revArray[maxIndex - i];
            revArray[maxIndex - i] = temp;
        }
        return revArray;
    }
}
