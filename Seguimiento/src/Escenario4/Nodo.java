package Escenario4;

public class Nodo {
    public String jugador;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(String jugador) {
        this.jugador = jugador;
        this.siguiente = null;
        this.anterior = null;
    }

}
