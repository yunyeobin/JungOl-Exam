import java.util.Scanner;

public class Loop132_ex형성 {
    public static void main(String[] args) {
        //정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (i%5==0){
                b+=i;
            }

        }
        System.out.println(b);

    }
}
