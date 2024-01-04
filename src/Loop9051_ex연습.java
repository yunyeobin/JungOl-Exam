import java.util.Scanner;

public class Loop9051_ex연습 {
    public static void main(String[] args) {
        //10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int b = 0;
        int c = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            c++;
            if(a % 2 == 0){
                b++;
                if(c==10){
                    break;
                }
            }
        }
            System.out.printf("입력받은 짝수는 %d개입니다.", b);


    }
}
