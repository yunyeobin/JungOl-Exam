import java.util.Scanner;

public class Loop541_self1 {
    public static void main(String[] args) {
        //문자를 입력받아서 입력받은 문자를
        // 20번 반복하여 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < 20; i++) {
            System.out.print(a);
        }
        
    }
}
