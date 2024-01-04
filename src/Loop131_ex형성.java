import java.util.Scanner;

public class Loop131_ex형성 {
    public static void main(String[] args) {
        //100 이하의 두 개의 정수를 입력받아
        // 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>=b){
            for (int i = b; i <= a; i++) {
                System.out.print(b+" ");
                b++;
            }
        }else if(a<b){
            for (int i = a; i <= b; i++) {
                System.out.print(a+" ");
                a++;
            }
        }


    }
}
