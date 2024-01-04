import java.util.Scanner;

public class Loop9050_ex연습 {
    public static void main(String[] args) {
        //자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i <= a; i++) {
            b+=i;
        }
        System.out.println(b);

    }
}
