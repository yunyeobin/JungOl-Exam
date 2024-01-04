import java.util.Scanner;

public class Loop545_self1 {
    public static void main(String[] args) {
        //10개의 정수를 입력받아
        // 3의 배수의 개수와 5의 배수의 개수를
        // 각각 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int count3 = 0;
        int count5 = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a % 3 == 0) {
                count3++;
            }
            if (a % 5 == 0) {
                count5++;
            }
        }
            System.out.printf("Multiples of 3 : %d\n", count3);
            System.out.printf("Multiples of 5 : %d", count5);

    }


}

