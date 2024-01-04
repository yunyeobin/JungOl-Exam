public class Loop9054_ex연습 {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++){

            for (int j = 2; j <= 4; j++) {
                System.out.printf("%d * %d =%3d   ", j,i,i*j);
            }
            System.out.println();
        }

    }
}
