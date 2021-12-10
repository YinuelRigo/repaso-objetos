package uaslp.objetos.figuras;

public class PoligonoRegular {
    private int numeroDeLados;
    private double area;
    private double lado;

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
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
}
