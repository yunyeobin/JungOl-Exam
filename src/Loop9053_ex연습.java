public class Loop9053_ex연습 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf(i+" ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf(j+" ");
            }
            System.out.println();

        }
    }
}
