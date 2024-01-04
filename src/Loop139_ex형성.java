import java.util.Scanner;

public class Loop139_ex형성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
if (a<b){
        for (int j = 1; j < 10; j++) {
            for (int i = a; i <= b; i++) {
                System.out.printf("%d * %d =%3d   ", i, j, i * j);
            }
            System.out.println();
        }}else{
                for (int j = 1; j < 10; j++) {
            for (int i = a; i >= b; i--) {
                    System.out.printf("%d * %d =%3d   ", i, j, i * j);
                }
                System.out.println();
            }
        }

    }
}
