public class ShuttleNumbers {

    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0, j = 0; i < arr.length; i++) {
                if (i + 1 != 4 && i + 1 != 9) {
                    arr[j++] = i + 1;
            }
        }

        int[] newArr = new int[arr.length-2];
        System.arraycopy(arr, 0, newArr, 0, newArr.length);

            for (int array : newArr) {

                System.out.println("Номер шатла: " + array);
        }

    }
}
