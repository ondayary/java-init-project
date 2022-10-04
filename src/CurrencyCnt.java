public class CurrencyCnt {
    public static void main(String[] args) {

        // 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        // 5만원짜리는 몇장 만원짜리는 몇장 5천원짜리는 몇장을 나눠줘야 할까요?
        int money = 25000;

        int m1 = (int)(money % 50000) / 50000;
        int m2 = (int)(money % 50000) / 10000;
        int m3 = (int)(money % 10000) / 5000;

        System.out.println("금액 : " + money);
        System.out.println("5만원권 : " + m1 + " " + "1만원권 : " + m2 + " " + "5천원권 : " + m3);

        /*
        // 강사님 풀이
        int[] currencyType = new int[]{50000, 10000, 5000, 1000, 500, 100};

        int refund = 25000;
        for(int i = 0; i < currencyType.length; i++){

        }
        */
    }
}
