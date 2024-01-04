import java.util.Scanner;

public class Loop539_self1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true) {
            int a = sc.nextInt();
            total += a;
            count++;
            if (a >= 100) {
                break;
            }
        }
        double avg = ((double) total /count);

        System.out.println(total);
        System.out.printf("%.1f", avg);
        
    }
}
