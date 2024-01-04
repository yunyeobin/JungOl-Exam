import java.util.Scanner;

public class Loop633_self1 {
    public static void main(String[] args) {
        //아래와 같이 나라 이름을 출력하고
        // 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가
        // 해당하는 번호 이외의 숫자가 입력되면
        // "none"라고 출력한 후 종료하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? \n");
            int number = sc.nextInt();
            if (number==1){
                System.out.println();
                System.out.println("Seoul");
                System.out.println();
            }else if(number==2){
                System.out.println();
                System.out.println("Washington");
                System.out.println();
            }else if(number==3){
                System.out.println();
                System.out.println("Tokyo");
                System.out.println();
            }else if(number==4){
                System.out.println();
                System.out.println("Beijing");
                System.out.println();
            }else{
                System.out.println("none");
                break;
            }
        }


    }
}
