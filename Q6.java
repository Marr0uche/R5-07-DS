public class Q6 {

    public static void main(String[] args) {

        for (int i = Integer.parseInt(args[0]); i > 0 ; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}