package babe_Lion;

import java.lang.reflect.Type;

public class TypeCasting {

    public void divide(int first, int second) {
        float fFirst = (float)first;
        float fSecond = (float)second;
        float result = fFirst / fSecond;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // int first = 2;
        // int second = 3;
        // int는 소수점이 없습니다. Integer
        // 소수점 있는 것 : 유리수
        // TypeCasting Type(형)이 바뀐다.
        // TypeCasting 형변환
        // System.out.println(first / second);

        TypeCasting tc = new TypeCasting();
        tc.divide(2, 3);
    }
}
