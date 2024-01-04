import java.util.Scanner;

public class Loop9061_ex연습 {
    public static void main(String[] args) {
        //자연수 n을 입력받아 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                a++;
                System.out.print(a+" ");

            }
            System.out.println();

        }

    }
}
