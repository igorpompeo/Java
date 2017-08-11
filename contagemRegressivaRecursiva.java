public class contagemRegressivaRecursiva {

    public static void main(String[] args) {
        contagemRegressiva(15);
    }

    public static void contagemRegressiva(int n) {
        if (n == 0) {
            System.out.println("Buon anno!");
        } else {
            System.out.println(n);
            contagemRegressiva(n - 1);
        }
    }
}
