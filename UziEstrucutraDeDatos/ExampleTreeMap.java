import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> frutas = new TreeMap<>();
    frutas.put(3,"Manzana");
    frutas.put(2,"Platano");
    frutas.put(5,"Calabaza");
    frutas.put(4,"Durazno");
    frutas.put(1,"Camello");

    System.out.println("Las frutas son: " + frutas);


    frutas.forEach((key, value)->{
        System.out.println("El key es: " + key + " y la fruta es: " + value);
    });

    frutas.remove(5);
    System.out.println("Frutas despues de eliminacion: "+ frutas );

    }
    
}
