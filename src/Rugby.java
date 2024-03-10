import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int[] arrTeam1 = new int[25];
        int[] arrTeam2 = new int[25];

        System.out.print("Вік учасників першої команди: ");
        for (int i = 0; i < arrTeam1.length; i++) {
            arrTeam1[i] = randomNum.nextInt(40 - 18 + 1) + 18;
            System.out.print(" " + arrTeam1[i]);
        }

        System.out.print("\nВік учасників другої команди: ");
        for (int i = 0; i < arrTeam2.length; i++) {
            arrTeam2[i] = randomNum.nextInt(40 - 18 + 1) + 18;
            System.out.print(" " + arrTeam2[i]);
        }

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i : arrTeam1) {
            sumTeam1 += i;
        }

        for (int i : arrTeam2) {
            sumTeam2 += i;
        }


        double averageTeam1 = sumTeam1 / (double) arrTeam1.length;
        double averageTeam2 = sumTeam2 / (double) arrTeam1.length;

        System.out.println("\nСередній вік першої команди: " + averageTeam1);
        System.out.println("Середній вік другої команди: " + averageTeam2);
    }
}