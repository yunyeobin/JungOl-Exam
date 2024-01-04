import java.util.Scanner;

public class Loop126_ex형성 {
    public static void main(String[] args) {
        //0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
        //0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
        //홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = -1;
        while (true) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                count1++;
            }
            else if (n % 2 == 0) {
                count2++;
            }
            if (n == 0) {
                System.out.println("odd : "+count1);
                System.out.println("even : "+count2);
                break;
            }
        }


    }
}
