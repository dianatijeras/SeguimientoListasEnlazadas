package Escenario1;

public class Cola {
    public Nodo inicio;
    public Nodo fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregar(String cliente) {
        Nodo nuevo = new Nodo(cliente);

        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public void eliminar(){
         if(inicio == null){
             System.out.println("Cola Vacia");
             return;
         }
         inicio = inicio.siguiente;

         if(inicio == null){
             fin = null;
         }
    }

    public void siguiente(){
        if(inicio == null){
            System.out.println("No hay clientes");
        }else{
            System.out.println("Siguiente: " + inicio.cliente);
        }
    }

    public boolean buscar(String cliente){
        Nodo aux = inicio;

        while(aux != null){
            if(aux.cliente.equals(cliente)){
                return true;
            }
            aux = aux.siguiente;
        }
        return false;
    }

    public void mostrar(){
        Nodo aux = inicio;

        while(aux != null){
            System.out.println(aux.cliente);
            aux = aux.siguiente;
        }
    }

}
