public class ColaPrioridadOrdenada {
    
    private int[] elementos;
    private int[] prioridades;
    private int cantidad;

    public ColaPrioridadOrdenada(int capacidad) {
        elementos = new int[capacidad];
        prioridades = new int[capacidad];
        cantidad = 0;
    }

    public boolean esVacia(){
        return cantidad == 0;
    }

    public void insertar(int elemento, int prioridad) {
        if (cantidad == elementos.length) {
            throw new RuntimeException("La cola está llena");
        }

        int posicion = cantidad;

        while (posicion > 0 && prioridad < prioridades[posicion - 1]) {
            elementos[posicion] = elementos[posicion - 1];
            prioridades[posicion] = prioridades[posicion - 1];
            posicion--;
        }

        elementos[posicion] = elemento;
        prioridades[posicion] = prioridad;
        cantidad++;
    }

    public int verMax() {
        if (esVacia()) {
            throw new RuntimeException("La cola está vacía");
        }

        return elementos[cantidad - 1];
    }

    public int extraerMax() {
        if (esVacia()) {
            throw new RuntimeException("La cola está vacía");
        }

        int maximo = elementos[cantidad - 1];
        cantidad--;
        return maximo;
    }
    
    public int verPrioridadMax() {
    if (esVacia()) {
        throw new RuntimeException("La cola está vacía");
    }

    return prioridades[cantidad - 1];
}
    
}
