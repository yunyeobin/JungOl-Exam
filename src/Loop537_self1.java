import java.util.Scanner;

public class Loop537_self1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int c = 0;
        while (true) {
        c++;
        b+=c;
        if (c==a){
            break;
        }
        }
        System.out.println(b);
    }
}
