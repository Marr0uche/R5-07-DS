public class Q4 {

    public static void main(String[] args) {

        for (int i = 1; i < Integer.parseInt(args[0])+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}