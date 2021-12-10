package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;
    private double area;
    private String name;

    public Cuadrado() {

    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    public double getArea(){
        area = lado * lado;
        return area;
    }

    public String getName() {
        name = "Cuadrado";
        return name;
    }
}
