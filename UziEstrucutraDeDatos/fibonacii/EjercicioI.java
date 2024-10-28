import java.util.Arrays;

public class EjercicioI {
    public class App {
        public static void main(String[] args) throws Exception {
    
            int[] num={1,9,6,3,2,5,8,7,4};
    
            System.out.println("Nums"+Arrays.toString(num));
    
            System.out.println(Arrays.toString(insertion(num)));

            public static int[] insertion(int[] arr){
                for(int i=1;i<arr.length;i++){
                    for(int j=i;j>0;j--){
                        if(arr[j]<arr[j-1]){int tm=arr[j];
                            arr[j]=arr[j-1];
                            arr[j-1]=tm;
                        }
                    }
                } return arr;
        }
        }
       
}
}