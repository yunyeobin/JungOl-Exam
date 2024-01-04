import java.util.Scanner;

public class Loop546_self1 {
    public static void main(String[] args) {
        //10 이하의 과목수 n이 주어진다.
        //
        //정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고
        //
        //평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
        //
        //평균은 반올림하여 소수 첫째자리까지 출력한다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            total += num;
        }
        double average = (double)total/n;
        System.out.printf("avg : %.1f\n",average);
        if (average>=80){
            System.out.println("pass");
        }else if(average<80){
            System.out.println("fail");
        }
    }
}
