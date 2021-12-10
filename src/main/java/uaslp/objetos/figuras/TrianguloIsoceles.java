package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo{
    private String description;
    private String name;

    public String getDescription() {
        description = "2 Lados iguales y 1 diferente";
        return description;
    }

    public String getName() {
        name = "Triangulo Isoceles";
        return name;
    }
}
