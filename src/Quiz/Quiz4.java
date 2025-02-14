package Quiz;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        System.out.println("Enter 10 scores: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        int total = sum(scores);
        float avg = average(scores);
        int max = max(scores);
        int min = min(scores);

    }
    public static int sum(int[] studentScore) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < studentScore.length; i++) {
            total += studentScore[i];
        }
        return total;
    }

    public static float average(int[] studentScore) {
       int total = sum(studentScore);
       float average = (float) total / studentScore.length;
        return average;
    }
    public static int max(int[] stdentScore) {
        int max=stdentScore[0];
        for (int i = 1; i < stdentScore.length; i++) {
            if(stdentScore[i]>max){
                max=stdentScore[i];
            }
        }
        return max;
    }
    public static int min(int[] stdentScore) {
        int min=stdentScore[0];
        for (int i = 1; i < stdentScore.length; i++) {
            if(stdentScore[i]<min){
                min=stdentScore[i];
            }
        }
        return min;
    }

}
