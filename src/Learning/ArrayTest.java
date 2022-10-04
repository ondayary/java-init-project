package Learning;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello"); // Run : control + option + R

        // 10칸의 int array를 만들고
        // 1부터 10까지 채워서 출력

        int[] arr = new int[10];
        for(int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 다른 방법
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(arr2[i] + " ");
        }
    }
}
