import java.util.Scanner;

public class Loop136_ex형성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int result = 0;
        for(int i = 1; i<= 10; i++){
            result += num1;
            System.out.print(result + " ");
        }

    }
}
