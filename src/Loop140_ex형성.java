import java.util.Scanner;

public class Loop140_ex형성 {
    public static void main(String[] args) {
        //정수 20 개를 입력받아서 그 합과 평균을 출력하되
        // 0 이 입력되면 20개 입력이 끝나지 않았더라도
        // 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
        //평균은 소수부분은 버리고 정수만 출력한다.
        // (0이 입력된 경우 0을 제외한 합과 평균을 구한다.)

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        for (int i = 0; i < 20; i++) {
            int n = sc.nextInt();
            if (n != 0) {
                total += n;
                count++;
            } else {
                break;
            }
        }
        System.out.print(total + " ");
        System.out.println(total / count);

    }
}
