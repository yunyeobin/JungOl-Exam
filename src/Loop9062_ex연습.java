public class Loop9062_ex연습 {
    public static void main(String[] args) {
        int a = 0;
        char b = 'a';
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(b+" ");
                b++;
            }
            for (int j = 5-i; j > 0; j--) {
                a++;
                System.out.print(a+" ");

            }
            System.out.println();
            
        }

    }
}
