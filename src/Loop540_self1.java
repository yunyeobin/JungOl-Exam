import java.util.Scanner;

public class Loop540_self1 {
    public static void main(String[] args) {
        //정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고
        //3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
        //-1이 입력되면 종료하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        while (true) {
        int a = sc.nextInt();
        int b = a/3;
            if (a % 3 == 0) {
                System.out.println(b);
            } else if (a % 3 != 0) {
            }
            if (a==-1){
                break;
            }
        }

    }
}
