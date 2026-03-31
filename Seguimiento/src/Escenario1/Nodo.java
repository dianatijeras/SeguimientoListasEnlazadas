package Escenario1;

public class Nodo {
    public String cliente;
    public Nodo siguiente;

    public Nodo(String cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }
}
