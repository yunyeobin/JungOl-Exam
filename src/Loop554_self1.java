import java.util.Scanner;

public class Loop554_self1 {
    public static void main(String[] args) {
        //자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자
        // 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        char b = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a++;
                System.out.print(a+" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(b+" ");
                b++;
            }
            System.out.println();
        }

        
    }
}
