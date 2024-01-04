import java.util.Scanner;

public class Loop9043_ex연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true){
        int a = sc.nextInt();
            if (a%2==1){
                total += a;
                count++;
            }
            if (a==0){
            System.out.println("홀수의 합 = " +total);
            System.out.println("홀수의 평균 = " +(total/count));
            break;
        }}

    }
}
