import java.util.Scanner;

public class Loop538_self1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("number? ");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("positive integer");
        }
        if (a < 0) {
                System.out.println("negative number");
            }
        if (a==0){
            break;
        }
        }

    }
}
