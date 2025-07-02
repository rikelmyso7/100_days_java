public class MathUtils {
    public static int fatorialIterativo(int n) {
        if (n < 0) throw new IllegalArgumentException("n deve ser >= 0");
        int resultado = 1;
        for (int i = 2; i <= n; i++) { // O(n)
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int n) {
        if (n < 0) throw new IllegalArgumentException("n deve ser >= 0");
        if (n == 0 || n == 1) return 1;
        return n * fatorialRecursivo(n - 1);
    }
}
