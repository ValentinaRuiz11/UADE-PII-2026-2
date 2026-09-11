public class Main {    public static void main(String[] args) {

        ColaPrioridadDesordenada cp1 = new ColaPrioridadDesordenada(100);
        ColaPrioridadDesordenada cp2 = new ColaPrioridadDesordenada(100);

        cp1.insertar(10, 2);
        cp1.insertar(20, 5);
        cp1.insertar(30, 1);

        cp2.insertar(40, 4);
        cp2.insertar(50, 3);

        ColaPrioridadDesordenada resultado =
                UtilizacionColaPrioridad.combinar(cp1, cp2);

        System.out.println("Resultado combinar:");

        while (!resultado.esVacia()) {
            System.out.println(resultado.extraerMax());
        }
    }
}