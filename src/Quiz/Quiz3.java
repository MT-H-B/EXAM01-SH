package Quiz;

import java.util.Scanner;


public class Quiz3 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.print("1~100 사이의 수 입력:");
            int user = sc.nextInt();
            if (user > 0 && user <= 100) {
                if (answer == user) {
                    System.out.println("정답입니다. 총 횟수:" + count);
                    break;
                } else if (answer < user) {
                    System.out.println("더 작습니다.");
                } else {
                    System.out.println("더 큽니다.");
                }
                count++;
            } else {
                System.out.println("1~100사이 값만 입력해주세요.");
            }
        }
    }
}
