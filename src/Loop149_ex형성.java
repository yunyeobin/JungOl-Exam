import java.util.Scanner;

public class Loop149_ex형성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a+" ");
                a+=2;
                if (a>10){
                    a=1;
                }

            }
            System.out.println();

        }

    }
}
