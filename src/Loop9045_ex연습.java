import java.util.Scanner;

public class Loop9045_ex연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("1. 입력하기");
        System.out.println("2. 출력하기");
        System.out.println("3. 삭제하기");
        System.out.println("4. 끝내기");
        System.out.print("작업할 번호를 선택하세요.");
        int a = sc.nextInt();
        System.out.println();
            if (a == 1){
            System.out.println("입력하기를 선택하였습니다.");
                System.out.println();}
            else if (a == 2) {
                System.out.println("출력하기를 선택하였습니다.");
                System.out.println();
            } else if (a == 3) {
                System.out.println("삭제하기를 선택하였습니다.");
                System.out.println();
            } else if (a == 4) {
                System.out.println("끝내기를 선택하였습니다.");
                break;
            } else {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
            }
        }
    }
}
