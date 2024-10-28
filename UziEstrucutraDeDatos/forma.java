public abstract class forma {
    String color;

    public forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public String describir(){

        return "Esta figura es de color: "+color;
        
    }

}
