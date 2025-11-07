public interface Corredor {
    void correr();
}

public class Arbol implements Corredor {

    @Override
    public void correr() {
        System.out.println("Los árboles no pueden correr.");
    }
}
