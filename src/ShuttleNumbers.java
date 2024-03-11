import java.util.Random;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0, j = 0; i < arr.length; i++) {
            int numberOfShuttle = i + 1;
            if (numberOfShuttle % 10 != 4 && numberOfShuttle % 10 != 9 && numberOfShuttle / 10 % 10 != 4 && numberOfShuttle / 10 % 10 != 9) {
                arr[j++] = numberOfShuttle;
            } else {
                arr[j++] = -1;
            }

        }

        for (int array : arr) {
            if (array != 0) {
                if (array != -1) {
                    System.out.println("Номер шатла: " + array);
                } else {
                    int randomNum;
                    do {
                        randomNum = new Random().nextInt(100 - 1) + 1;
                    } while (randomNum % 10 == 4 || randomNum % 10 == 9 || randomNum / 10 % 10 == 4 || randomNum / 10 % 10 == 9);
                    System.out.println("Номер шатла: " + randomNum);
                }
            }
        }
    }
}


