public class UtilizacionColaPrioridad {

    public static ColaPrioridadDesordenada combinar(ColaPrioridadDesordenada cp1, ColaPrioridadDesordenada cp2) {

        ColaPrioridadDesordenada resultado = new ColaPrioridadDesordenada(100);

        while (!cp1.esVacia()) {
            int prioridad = cp1.verPrioridadMax();
            int elemento = cp1.extraerMax();

            resultado.insertar(elemento, prioridad);
        }

        while (!cp2.esVacia()) {
            int prioridad = cp2.verPrioridadMax();
            int elemento = cp2.extraerMax();

            resultado.insertar(elemento, prioridad);
        }

        return resultado;
    }

    public static Cola invertirColaConColaPrioridad(Cola c) {

    ColaPrioridadDesordenada auxiliar = new ColaPrioridadDesordenada(100);

    int prioridad = 1;

    while (!c.esVacia()) {
        int elemento = c.desencolar();
        auxiliar.insertar(elemento, prioridad);
        prioridad++;
    }

    Cola resultado = new Cola(100);

    while (!auxiliar.esVacia()) {
        resultado.encolar(auxiliar.extraerMax());
    }

    return resultado;
}

    public static int sumarValoresPrioridadPar(ColaPrioridadDesordenada cp) {

    ColaPrioridadDesordenada auxiliar = new ColaPrioridadDesordenada(100);

    int suma = 0;

    while (!cp.esVacia()) {

        int prioridad = cp.verPrioridadMax();
        int elemento = cp.extraerMax();

        if (prioridad % 2 == 0) {
            suma += elemento;
        }

        auxiliar.insertar(elemento, prioridad);
    }

    while (!auxiliar.esVacia()) {

        int prioridad = auxiliar.verPrioridadMax();
        int elemento = auxiliar.extraerMax();

        cp.insertar(elemento, prioridad);
    }

    return suma;
}

}