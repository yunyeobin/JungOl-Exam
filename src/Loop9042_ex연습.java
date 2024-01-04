import java.util.Scanner;

public class Loop9042_ex연습 {
    public static void main(String[] args) {
        //정수를 계속 입력을 받다가 0이 입력되면 0을 제외하고
        // 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램을 작성하시오.
        // (평균은 반올림하여 소수 둘째자리까지 출력한다.)

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int total = 0;
        while (true) {
        int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            count++;
            total += a;
        }
        double avg = (double) total /count;
            System.out.println("입력된 자료의 개수 = "+count);
            System.out.println("입력된 자료의 합계 = "+total);
            System.out.printf("입력된 자료의 평균 = %.2f", avg);
    }
}
