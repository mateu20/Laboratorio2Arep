package edu.escuelaing.arep.LinkedList;


public class Nodo<T> {
	
	private Nodo<T> nextNodo;
	private T Data;	
	
	public Nodo(T Data, Nodo<T> nextNode){
		this.Data = Data;
	    this.nextNodo = nextNode;
	    }
	
	public Nodo<T> getnextNodo() {
		return nextNodo;
	}
	public T getData() {
		return Data;
	}
	public void setNextNodo(Nodo<T> nextNodo) {
		this.nextNodo = nextNodo;
	}
}