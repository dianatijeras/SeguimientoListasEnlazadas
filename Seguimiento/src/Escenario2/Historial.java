package Escenario2;

public class Historial {

    private Nodo inicio;
    private Nodo actual;

    public Historial(){
        this.inicio = null;
        this.actual = null;
    }

    public void visitar(String pagina){
        Nodo nuevo = new Nodo(pagina);

        if(inicio == null){
            inicio = nuevo;
            actual = nuevo;
        }else{
            actual.siguiente = null;

            nuevo.anterior = actual;
            actual.siguiente = nuevo;
            actual = nuevo;

        }
    }

    public void atras(){
        if(actual != null && actual.anterior != null){
            actual = actual.anterior;
        }else{
            System.out.println("No hay pagina anterior");
        }
    }

    public void adelante(){
        if(actual != null && actual.siguiente != null){
            actual = actual.siguiente;
        }else{
            System.out.println("No hay pagina siguiente");
        }
    }

    public void mostrarActual(){
        if(actual == null){
            System.out.println("No hay paginas");
        }else{
            System.out.println("Pagina actual: " + actual.pagina);
        }
    }
}
