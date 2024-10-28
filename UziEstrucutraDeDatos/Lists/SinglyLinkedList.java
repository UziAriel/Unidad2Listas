package Lists;

public class SinglyLinkedList {
    Nodo cabeza;

    public SinglyLinkedList() {
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        //Crear un nodo
        Nodo nuevoNodo = new Nodo(dato);
        //Verificar si la lista esta vacia
        if (cabeza == null) {
            //Coloca el nuevoNodo como la cabeza
            cabeza = nuevoNodo;
        }else{
            Nodo temp=cabeza;//Iniciamos desde el cabeza
            //Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {

                temp=temp.siguiente;
                
            }
            temp.siguiente = nuevoNodo; 
        }
    }

    public void mostrar(){
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.dato+ "->");
            temp =temp.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor){
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        }else{
            Nodo temp=cabeza;//Iniciamos desde el cabeza
            //Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp != null) {
                if (temp.dato == valor) {
                    System.out.println("Valor encontrado");
                    return true;
                }
                temp=temp.siguiente;
            }
            System.out.println("Valor no encontrado");
        }
        return false;
    }

    //metodo para eliminar 
    public void eliminar(Integer valor) {
        if (cabeza == null) {
            System.out.println("No se puede eliminar porque la lista está vacía");
            return;
        }
    
        // Caso especial: eliminar la cabeza
        if (cabeza.dato.equals(valor)) {
            cabeza = cabeza.siguiente;
            System.out.println("Se eliminó correctamente " + valor);
            return;
        }
    
        Nodo temp = cabeza;
        Nodo anterior = null;
    
        // Recorrer hasta encontrar el nodo con el valor
        while (temp != null && !temp.dato.equals(valor)) {
            anterior = temp;
            temp = temp.siguiente;
        }
    
        // Si el nodo no fue encontrado
        if (temp == null) {
            System.out.println("No se encontró el valor " + valor);
            return;
        }
    
        // Aquí sabemos que temp es el nodo a eliminar
        anterior.siguiente = temp.siguiente;
        System.out.println("Se eliminó correctamente " + valor);
    }
    

}