
    public class App {
        public static void main(String[] args) {
            int n = 5;

            System.out.println("Decreciente:");
            
            
            numDecreciente(n);                                                                                                                                                                                                      
            System.out.println("");
            
            System.out.println("Creciente:");
            
            numCreciente(n);
            System.out.println("");

        }

        public static int numDecreciente(int n){
            if (n == 0) {
                return 0;
            } else {
                System.out.print(n);
                return numDecreciente(n - 1); 
            }
        }

        
        public static void numCreciente(int n){
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
            }
            
        }
    }
    

