package Escenario4;

public class Juego {

    public Nodo actual;

    public Juego() {
        this.actual = null;
    }

    public void agregar(String jugador) {

        Nodo nuevo = new Nodo(jugador);

        if(actual == null) {
            actual = nuevo;
            actual.siguiente = actual;
            actual.anterior = actual;
        }else {
            Nodo ultimo = actual.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = actual;
            actual.anterior = nuevo;
        }
    }

    public void siguiente() {
        if(actual != null) {
            actual = actual.siguiente;
            System.out.println("Turno de: " + actual.jugador);
        }
    }

    public void anterior() {
        if(actual != null) {
            actual = actual.anterior;
            System.out.println("Turno de: " + actual.jugador);
        }
    }

    public void eliminar(String jugador) {
        if(actual == null) return;

        Nodo aux = actual;

        do{
            if(aux.jugador.equals(jugador)) {
                if(aux.siguiente == aux) {
                    actual = null;
                    return;
                }
                aux.anterior.siguiente = aux.siguiente;
                aux.siguiente.anterior = aux.anterior;

                if(aux == actual) {
                    actual = aux.siguiente;
                }
                return;
            }
            aux = aux.siguiente;

        } while (aux != actual);
    }

    public void mostrar() {

        if(actual == null) return;

        Nodo aux = actual;

        do{
            System.out.println(aux.jugador);
            aux = aux.siguiente;
        } while(aux != actual);
    }
}
