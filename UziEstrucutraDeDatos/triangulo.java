public class triangulo extends forma implements OpGeometricas {



    double base;
    double altura;


    public triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
       return (base *  altura)/2;
    }

    @Override
    public double perimetro() {
        return base * altura;
    }

    
    
}

