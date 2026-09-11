public class Cola {

    private int[] elementos;
    private int cantidad;

    public Cola(int capacidad) {
        elementos = new int[capacidad];
        cantidad = 0;
    }

    public boolean esVacia() {
        return cantidad == 0;
    }

    public void encolar(int elemento) {
        if (cantidad == elementos.length) {
            throw new RuntimeException("La cola está llena");
        }

        elementos[cantidad] = elemento;
        cantidad++;
    }

    public int desencolar() {
        if (esVacia()) {
            throw new RuntimeException("La cola está vacía");
        }

        int elemento = elementos[0];

        for (int i = 0; i < cantidad - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        cantidad--;

        return elemento;
    }
}