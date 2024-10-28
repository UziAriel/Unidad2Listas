public class fibonaci {
    
    
    // Método iterativo 
    public int fibonacciIterativo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Método recursivo 
    public int fibonacciRecursivo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    
}
