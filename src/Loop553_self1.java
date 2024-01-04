import java.util.Scanner;

public class Loop553_self1 {
    public static void main(String[] args) {
        //자연수 n(1 \le n \le 6) 을 입력받아
        //다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(a);
                a++;
            }
            System.out.println();

        }
        
    }
}
