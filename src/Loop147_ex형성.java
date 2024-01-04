import java.util.Scanner;

public class Loop147_ex형성 {
    public static void main(String[] args) {
        //자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
        //주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");

            }
            for (int j = n; j >= i; j--) {
                a++;
                System.out.print(a+" ");

            }
            System.out.println();

        }
    }
}
