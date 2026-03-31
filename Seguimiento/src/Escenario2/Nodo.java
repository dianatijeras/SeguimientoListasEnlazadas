package Escenario2;

public class Nodo {

    public String pagina;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(String pagina) {
        this.pagina = pagina;
        this.siguiente = null;
        this.anterior = null;
    }
}
