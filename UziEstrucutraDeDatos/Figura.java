public class Figura {
    public static void main(String[] args) {
    
        triangulo triangulo = new triangulo("blanco", 3, 4);

    
        double area = triangulo.area();
        System.out.println("Área del triángulo: " + area);

        double perimetro = triangulo.perimetro();
        System.out.println("Perímetro del triángulo: " + perimetro);

    
        String descripcion = triangulo.describir();
        System.out.println(descripcion);
    }
}


