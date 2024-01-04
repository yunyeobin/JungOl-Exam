import java.util.Scanner;

public class Loop135_ex형성 {
    public static void main(String[] args) {
        // 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에
        // 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
        // (평균은 반올림하여 소수 첫째자리까지 출력한다.)

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        if (a>b) {
            c = a;
            a = b;
            b = c;
        }

        double total=0;
        double count = 0;
        for (int i = a; i <= b; i++) {
            if (i%3==0||i%5==0){
                total += i;
                count++;
            }

        }
        System.out.println("sum : "+(int)total);
        System.out.printf("avg : %.1f", (total/count));

    }
}
