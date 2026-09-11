public class ColaPrioridadDesordenada {
    private int[] elementos;
    private int cantidad;
    private int[] prioridades;

    public ColaPrioridadDesordenada(int capacidad) {
        elementos = new int[capacidad];
        prioridades = new int[capacidad];
        cantidad = 0;
    }
    
    public boolean esVacia() {
        return cantidad == 0;
    }

    public void insertar (int elemento, int prioridad) {
        if (cantidad  == elementos.length) {
            throw new RuntimeException("La cola está llena");
        }

        elementos[cantidad] = elemento;
        prioridades[cantidad] = prioridad;
        cantidad++;
    }

public int verMax() {
    if (esVacia()) {
        throw new RuntimeException("La cola está vacía");
    }

    int posicionMax = 0;

    for (int i = 1; i < cantidad; i++) {
        if (prioridades[i] > prioridades[posicionMax]) {
            posicionMax = i;
        }
    }

    return elementos[posicionMax];
}

    public int extraerMax() {
        if (esVacia()) {
            throw new RuntimeException("La cola está vacía");
        }

        int posicionMax = 0;

        for (int i = 1; i < cantidad; i++) {
            if (prioridades[i] > prioridades[posicionMax]) {
                posicionMax = i;
            }
        }

        int maximo = elementos[posicionMax];

        for (int i =posicionMax; i < cantidad - 1; i++) {
            elementos[i] = elementos[i + 1];
            prioridades[i] = prioridades[i + 1];
        }

        cantidad--;

        return maximo;
    }
    public int verPrioridadMax() {
    if (esVacia()) {
        throw new RuntimeException("La cola está vacía");
    }

    int posicionMax = 0;

    for (int i = 1; i < cantidad; i++) {
        if (prioridades[i] > prioridades[posicionMax]) {
            posicionMax = i;
        }
    }

    return prioridades[posicionMax];
}

    
}
