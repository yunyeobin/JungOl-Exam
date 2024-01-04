import java.util.Scanner;

public class Loop133_ex형성 {
    public static void main(String[] args) {
        // 100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아
        // 평균을 출력하는 프로그램을 작성하시오.
        // (평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            total+=a;
        }
        double average = total/n;
        System.out.printf("%.2f", average);

    }
}
