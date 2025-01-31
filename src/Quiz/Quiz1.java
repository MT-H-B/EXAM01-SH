package Quiz;

import java.util.Scanner;


public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}