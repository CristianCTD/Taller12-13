public class MainFigura {
    public static void main(String[] args) {
        Figura rect = new Rectangulo(5, 3);
        Figura tri = new Triangulo(4, 6);

        System.out.println("Área del rectángulo: " + rect.calcularArea());
        System.out.println("Área del triángulo: " + tri.calcularArea());
    }
}
