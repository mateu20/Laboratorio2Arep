package edu.escuelaing.arep.LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List<T> {
	/**
	Numero de elementos de la LinkedList
	*/
	private int size;
    /**
      Nodo cabeza de la LinkedList
      */
    private Nodo<T> head;

    /**
     * Nodo final de la LinkedLsit
     */
    private Nodo<T> tail;
    

    /**
      Metodo constructor de la LinkedList
     */
    public LinkedList() {
        head = tail = null;
        size = 0;
    }
    /**
     Devuelve el numero de elementos de la LinkedList
     */
    public int size() {
        return size;
    }
    /**
     * Devuelve si la LinkedList esta vacia
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
      Añade el elemento al final de la lista
      @param Data es el elemento a ser añadido
     */
    public boolean add(T data) {
        if (isEmpty()) {
            head = tail = new Nodo<T>(data, null);
        } else {
            Nodo<T> NuevoNodo = new Nodo<T>(data, null);
            tail.setNextNodo(NuevoNodo);
            tail = NuevoNodo;
        }
        size++;
        return true;
    }
    
    public T remove(int i) {
        if (i<0||i>=size) {
            throw new IndexOutOfBoundsException();
        }
        Nodo<T> removeNodo = null;
        if (i == 0) {
            removeNodo = head;
            head = head.getnextNodo();
        } else {
            Nodo<T> currentNodo = head;
            for (int num=0;num<i-1;num++) {
                currentNodo = currentNodo.getnextNodo();
            }
            removeNodo = currentNodo.getnextNodo();
            currentNodo.setNextNodo(removeNodo.getnextNodo());
        }
        size--;
        return removeNodo.getData();
    }
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Nodo<T> currentNodo = head;

            public boolean hasNext() {
                return currentNodo != null;
            }

            public T next() {
                T data = currentNodo.getData();
                currentNodo = currentNodo.getnextNodo();
                return data;
            }
        };
    }


    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Iterator<T> iterator = iterator();
        while (i-- > 0) {
            iterator.next();
        }
        return iterator.next();
    }  
    

    
	

	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	public void add(int arg0, T arg1) {
		// TODO Auto-generated method stub
		
	}
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

   


}
