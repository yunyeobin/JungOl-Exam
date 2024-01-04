import java.util.Scanner;

public class Loop544_self1 {
    public static void main(String[] args) {
        //100 이하의 정수를 입력받아서
        // 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = a; i <= 100; i++) {
            b+=i;
        }
        System.out.println(b);
        
    }
}
