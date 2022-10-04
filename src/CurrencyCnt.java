public class CurrencyCnt {
    public static void main(String[] args) {

        // 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        // 5만원짜리는 몇장 만원짜리는 몇장 5천원짜리는 몇장을 나눠줘야 할까요?

        /*
        // 내 풀이
        int money = 25000;

        int m1 = (int)(money % 50000) / 50000;
        int m2 = (int)(money % 50000) / 10000;
        int m3 = (int)(money % 10000) / 5000;

        System.out.println("금액 : " + money);
        System.out.println("5만원권 : " + m1 + " " + "1만원권 : " + m2 + " " + "5천원권 : " + m3);
        */

        /*
        // 강사님 풀이
        int[] currencyType = new int[]{50000, 10000, 5000, 1000, 500, 100};

        int refund = 25000; // 25000이라면 만원짜리 2장 5000원짜리 1장
        refund = 5000;
        for(int i = 0; i < currencyType.length; i++){
            // 나머지 연산
            // 각 화폐 단위로 나누었을 때의 몫과 나머지를 구하는 문제
            // 나머지를 변수에 누적 만원 2장
            // 5000

            System.out.println(refund / currencyType[i]);
            // 버블, 삽입
            // swap
        }
        */

        // 다른 풀이
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;

        // 50,000 0장
        // 10,000 ...

        // raw 익히지 않은
        int refund = 25400; // 25000이라면 만원짜리 2장 5000원짜리 1장

        System.out.printf("5만원권 %d장\n", refund / curr50000); // 25000을 5만원으로 거슬러주면?
        // 25,000원을 5만원으로 나누었을 때 몫,나머지
        // 25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하는 코드를 작성해주세요.
        // 각 화폐 단위는 위와 같이 각각 변수로 선언해주세요.

        System.out.printf("1만원권 몫:%d장 나머지:%d\n", refund / curr10000, refund % curr10000);
        // 5000원권은 1장만 나오게 하고싶다. 왜냐하면 25000원에서 2만원은 만원짜리 두장으로 처리했기 때문이다.
        refund = refund - (curr10000 * 2);
        // refund는 25000을 1원으로 나눈 나머지로 값을 업데이트 한다.
            // refund = refund % 10000; // modulo 나머지 mod %

        System.out.printf("5천원권 몫:%d장 나머지:%d\n", refund / curr5000, refund % curr5000);
        refund = refund % 5000; // modulo 나머지 mod %

        System.out.printf("1천원권 몫:%d장 나머지:%d\n", refund / 1000, refund % 1000);
        refund = refund % 1000;

        System.out.printf("500원권 몫:%d장 나머지:%d\n", refund / 500, refund % 500);
        refund = refund % 500;

        System.out.printf("100원권 몫:%d장 나머지:%d\n", refund / 100, refund % 100);
        refund = refund % 100;

        System.out.printf("50원권 몫:%d장 나머지:%d\n", refund / 50, refund % 50);
        refund = refund % 50;

        System.out.printf("10원권 몫:%d장 나머지:%d\n", refund / 10, refund % 10);
        refund = refund % 10;
    }
}
