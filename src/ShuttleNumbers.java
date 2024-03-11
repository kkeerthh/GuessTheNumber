import java.util.Arrays;
import java.util.Random;

public class ShuttleNumbers {
    public static void main(String[] args) {
            int[] arr = new int[100];
            int numberOfShuttle = 1;

            for (int i = 0; i < arr.length; i++) {
                if (numberOfShuttle % 10 != 4 && numberOfShuttle % 10 != 9 && numberOfShuttle / 10 % 10 != 4 && numberOfShuttle / 10 % 10 != 9) {
                    arr[i] = numberOfShuttle;
                    numberOfShuttle++;
                } else {
                    numberOfShuttle++;
                    i--;
                }
            }

            System.out.println("Номери шатлів: " + Arrays.toString(arr));
        }
}


