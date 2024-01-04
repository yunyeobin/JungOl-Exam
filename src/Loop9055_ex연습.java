import java.util.Scanner;

public class Loop9055_ex연습 {
    public static void main(String[] args) {
        //1부터 차례로 누적하여 합을 구하다가 합이 입력받은 수를 넘으면 중단하고
        // 마지막으로 더해진 값과 그 때까지의 합을 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = 0;
        int b = 0;
        while (true){
            b++;
            total+=b;
            if (total>a){
                break;
            }
        }
            System.out.printf(b+" ");
            System.out.println(total);

    }
}
