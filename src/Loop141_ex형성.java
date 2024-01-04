import java.util.Scanner;

public class Loop141_ex형성 {
    public static void main(String[] args) {
        //1부터 100까지의 정수 중 한 개를 입력받아
        // 100 보다 작은 배수들을 차례로 출력하다가
        // 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
            while (b < 100) {
                System.out.print(b+" ");
                if (b%10==0){
                    break;
                }
                b+=a;

        }
    }
}
