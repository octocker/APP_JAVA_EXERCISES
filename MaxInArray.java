import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements:");
        int N = scanner.nextInt();
        int[] Array = new int[N];

        for (int a = 0; a < N; a++) {
            System.out.print("Enter element " + (a + 1) + ": ");
            Array[a] = scanner.nextInt();
        }


        int Max = Array[0];
        for (int b = 1; b < N; b++) {
            if (Array[b] > Max) {
                Max = Array[b];
            }
        }

        System.out.println("The max value is : " + Max);
        scanner.close();
    }
}
