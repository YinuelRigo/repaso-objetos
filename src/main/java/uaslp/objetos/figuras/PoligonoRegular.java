package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private int numeroDeLados;
    private double area;
    private double lado;
    private String name;

    public PoligonoRegular(int numeroDeLados) {
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        double elevado1 = Math.pow(lado,2);
        double elevado2 = Math.pow(lado/2,2);
        double elevado3;

        elevado3 = elevado1 - elevado2;
        elevado3 = Math.sqrt(elevado3);

        area = ((lado*numeroDeLados)*elevado3)/2;

        return area;
    }

    public String getName() {
        name = "Poligono Regular";
        return name;
    }
}
