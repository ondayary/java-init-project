
package babe_Lion;

public class ForStatement {

    public static void main(String[] args) {

        // 반복문
        // 1 ~ 5 까지 출력
        for(int i = 1; i < 6; i+=1) { // i+=1 대신 i++
            System.out.print(i + " ");
        }
        System.out.println();

        // 2, 4, 6, 8, 10
        for(int i = 2; i <= 10; i+=2) {
            System.out.print(i + " ");
        }

        /*
        for(int i = 1; i <= 5; i+=1) {
            System.out.print(i * 2);
        }
        */

    }

}
