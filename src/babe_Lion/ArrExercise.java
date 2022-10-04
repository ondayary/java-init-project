package babe_Lion;

public class ArrExercise {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        // System.out.println(Array.toString(arr));

        System.out.printf("0번에는 %d가 들어있습니다.\n", arr[0]);
        System.out.printf("1번에는 %d가 들어있습니다.\n", arr[1]);
        System.out.printf("2번에는 %d가 들어있습니다.\n", arr[2]);
        System.out.printf("3번에는 %d가 들어있습니다.\n", arr[3]);
        System.out.printf("4번에는 %d가 들어있습니다.\n", arr[4]);

        /*
        // 배열에 5만원부터 10원까지 넣기
        int[] money = new int[8];
        // int[] money = new int[50000, 10000, 5000, 1000, 500, 100, 50, 10];
        money[0] = 50000;
        money[1] = 10000;
        money[2] = 5000;
        money[3] = 1000;
        money[4] = 500;
        money[5] = 100;
        money[6] = 10;

        for(int i = 0; i < money[i]; i++) {
            System.out.println(money[i] + "원");
        }
        */

        // 축약형
        int[] money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
        // new int[8] ==> 자동으로 해줌

        for(int i = 0; i < 8; i++) {
            System.out.printf("%d번에는 %d가 들어있습니다.\n", i, money[i]);
        }

    }
}
