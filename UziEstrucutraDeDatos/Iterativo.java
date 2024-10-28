public class Iterativo {
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 4;
        int res = factorial(num);
        System.out.println("El factorial de " + num+ " es: " + res);
    }
}
