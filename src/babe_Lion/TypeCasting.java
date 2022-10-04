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
        TypeCasting tc = new TypeCasting();
        tc.divide(2, 3);

        // int(Integer)는 소수점이 없다.
        // TypeCasting Type(형)이 바뀐다. => 형변환
        // int first = 2;
        // int second = 3;
        // System.out.println(first / second);
    }
}
