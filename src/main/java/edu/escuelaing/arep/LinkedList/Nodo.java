package edu.escuelaing.arep.LinkedList;


public class Nodo<T> {
	//El elemento de nuestra LinkedList capaz de referenciar al siguiente
        //elemento
	private Nodo<T> nextNodo;
        //EL elemento de nuestro arreglo
	private T Data;	
	/**
         * 
         * @param Data recibe un elemento 
         * @param nextNode El elemento a ser referenciado
         */
	public Nodo(T Data, Nodo<T> nextNode){
		this.Data = Data;
	    this.nextNodo = nextNode;
	    }
	/**
         * 
         * @return el nodo siguiente a nuestro elemento
         */
	public Nodo<T> getnextNodo() {
		return nextNodo;
	}
        /**
         * 
         * @return devuelve el nodo
         */ 
	public T getData() {
		return Data;
	}
        /**
         * 
         * @param nextNodo el nodo al cual referenciaremos
         * @return el siguiente nodo
         * 
         */
	public void setNextNodo(Nodo<T> nextNodo) {
		this.nextNodo = nextNodo;
	}
}