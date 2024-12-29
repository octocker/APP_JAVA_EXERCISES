import java.util.Scanner;

public class AboveClassAvg {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("How many students are there ? ");
        int N = scanner .nextInt();
        float[] score = new float[N];
        float Sum = 0;

        // Input score
        for (int i = 0; i < N; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score[i] = scanner  .nextFloat();
            Sum += score[i];
        }

        float average = Sum / N;
        System.out.println("Class average: " + average);

        // Count students scoring above average
        int Counter = 0;
        for (float studentScore : score) {
            if (studentScore > average) {
                Counter++;
            }
        }

        System.out.println("Students with scores above avg: " + Counter);
        scanner .close();
    }
}
