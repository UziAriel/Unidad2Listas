import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<Integer, String> frutas = new HashMap<>();
        frutas.put(1,"Pera");
        frutas.put(2,"Sandia");
        frutas.put(3,"Guayaba");
        frutas.put(4,"Jicama");
        frutas.put(5,"Manza");
        System.out.println("Las frutas son: " + frutas);


         frutas.forEach((key, value)->{
            System.out.println("El key es: " + key + " y el valor es: " + value);
         });

         String fruta1 = frutas.get(5);
         System.out.println("La fruta 1 es: " + fruta1);

         frutas.remove(5);
         System.out.println("Frutas despues de eliminar la ultima fruta");
    }
    
}
