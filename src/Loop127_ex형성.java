import java.util.Scanner;

public class Loop127_ex형성 {
    public static void main(String[] args) {
        //0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면
        //그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
        //(평균은 반올림하여 소수 첫째자리까지 출력한다.)
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while(true) {
            int n = sc.nextInt();
            if (0 <= n && n <= 100) {
                total += n;
                count++;
            } else {
        double average = (double)total/count;
                System.out.println("sum : "+total);
                System.out.printf("avg : %.1f",average);
                break;
            }
        }
    }
}
