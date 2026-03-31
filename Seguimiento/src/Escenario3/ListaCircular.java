package Escenario3;

public class ListaCircular {

    public Nodo inicio;

    public ListaCircular() {
        this.inicio = null;
    }

    public void agregar(String cancion){
        Nodo nuevo = new Nodo(cancion);

        if(inicio == null){
            inicio = nuevo;
            inicio.siguiente = inicio;
        }else{
            Nodo aux = inicio;

            while(aux.siguiente != inicio){
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
            nuevo.siguiente = inicio;
        }
    }

    public void eliminiar(String cancion){
        if(inicio == null) return;

        if(inicio.cancion.equals(cancion)){

            if(inicio.cancion.equals(cancion)){
                inicio = null;
                return;
            }

            Nodo aux = inicio;

            while(aux.siguiente != inicio){
                aux = aux.siguiente;
            }

            aux.siguiente = inicio.siguiente;
            inicio = inicio.siguiente;
            return;
        }

        Nodo actual = inicio;

        while(actual.siguiente != inicio && !actual.siguiente.cancion.equals(cancion)){
            actual = actual.siguiente;
        }
        if(actual.siguiente != inicio){
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void mostrar(){
        if(inicio == null){
            System.out.println("La lista esta vacia");
            return;
        }

        Nodo aux = inicio;

        do{
            System.out.println(aux.cancion);
            aux = aux.siguiente;
        }while(aux != inicio);
    }

    public void siguiente(){
        if(inicio != null){
            inicio = inicio.siguiente;
            System.out.println("Reproduciendo: " + inicio.cancion);
        }
    }
}
