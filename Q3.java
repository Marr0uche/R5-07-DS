public class Q3 {

    public static void main(String[] args) {
        String etoiles = "";
        
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            etoiles += "*";
        }

        System.out.println(etoiles);
    }
}