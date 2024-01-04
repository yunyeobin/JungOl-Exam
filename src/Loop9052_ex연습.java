import java.util.Scanner;

public class Loop9052_ex연습 {
    public static void main(String[] args) {
        //5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램을 작성하시오.
        // (평균은 반올림하여 소수 첫째자리까지 출력한다.)



        Scanner sc = new Scanner(System.in);
        int total=0;
        double avg;
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            total+=score;
        }
        avg=(double)total/5;
        System.out.println("총점 : "+total);
        System.out.printf("평균 : %.1f",avg);


    }
}
