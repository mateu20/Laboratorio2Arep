package edu.escuelaing.arep.LinkedList;



/**
import junit.framework.TestCase;
//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static junit.framework.Assert.*;
import org.junit.jupiter.api.Test;**/



import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

//import static org.junit.Assert.*;

public class LinkedListTest{
	
	@Test
	public void deberiaAnadirElementosaLaLista(){
		LinkedList <Integer> Lin = new LinkedList<Integer>();
		for(int num=0;num<20;num++) {
			Lin.add(num);
		}
		
		assertEquals(20,Lin.size());
	
	}
	
	@Test
	
	public void deberiaRemoverUnElementoDeLaLista() {
		LinkedList Lin = new LinkedList<Integer>();
		for (int num=0;num<20;num++) {
			Lin.add(num);
		}
		Lin.remove(6);
		assertEquals(19,Lin.size());
	}
	
        
	@Test
        public void deberiaDarUnElementoPorSuIndice(){
            LinkedList Lin = new LinkedList<Integer>();
            for (int num=0;num<20;num++) {
		Lin.add(num);
            }
            assertEquals(17,Lin.get(17));
}
        

}
