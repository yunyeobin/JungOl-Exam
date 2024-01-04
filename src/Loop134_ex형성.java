import java.util.Scanner;

public class Loop134_ex형성 {
    public static void main(String[] args) {
        //10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int count2=0;
        for (int i = 0; i < 10; i++) {
        int a = sc.nextInt();
        if (a%2==0){
            count2++;
        }
        }
        System.out.println("even : "+count2);
        System.out.println("odd : "+(10-count2));

    }
}
