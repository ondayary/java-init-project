package Learning;

import java.util.Scanner;

public class EvenOdd_1156 {
    public static void main(String[] args) {
        // 어떤 자연수가 입력되면 홀수이면 "odd" 를 출력하고, 짝수이면 "even"을 출력

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0) {
            // 짝수일 경우
            System.out.println("even");
        } else {
            // 홀수일 경우
            System.out.println("odd");
        }
    }
}
