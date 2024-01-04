public class Loop9059_ex연습 {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = (a-1)-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i*2)+1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
