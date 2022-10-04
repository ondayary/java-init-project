package babe_Lion;

public class VariableExercise {
    public static void main(String[] args) {
        /*
        // 50000 ~ 10 원까지 배열에 넣어보세요.
        int[] money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for(int i = 0; i < 8; i++) {
            System.out.printf("%d\n", money[i]);
        }
        */


        // 계산기
        // arr 0번 + arr 1번  --- 1번 계산
        // arr 2번 + arr 3번  --- 2번 계산
        // 1번 - 2번          --- 3번 계산
        // 각 1번 결과, 2번 결과, 3번 결과 모두 출력

        int[] money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};

        int result1 = 0;
        int result2 = 0;

        result1 = money[0] + money[1];
        result2 = money[2] * money[3];

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + (result1 - result2));
    }
}
