package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double area;
    private String description;
    private String name;

    public Triangulo(){

    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        area = (base * altura)/2;
        return area;
    }

    public String getDescription() {
        description = "Cualquier triangulo";
        return description;
    }

    public String getName() {
        name = "Triangulo";
        return name;
    }
}
