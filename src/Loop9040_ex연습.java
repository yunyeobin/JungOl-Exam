public class Loop9040_ex연습 {
    public static void main(String[] args) {
        //정수 변수 num을 선언하여 1을 대입한 후 1씩 증가시키면서
        // 10까지의 누적 합을 구하는 프로그램을 while문을 이용하여 작성하고,
        // 1부터 10까지의 합과 while문이 끝난 후의 num의 값을 출력하는 프로그램을 작성하시오.
        int num = 1;
        int total=0;
        while (num<=10){
            total += num++;
        }
        System.out.println("1부터 10까지의 합 = "+total);
        System.out.println("while문이 끝난 후의 num의 값 = "+num);

    }
}
