package edu.escuelaing.arep.Estadisiticas;
import edu.escuelaing.arep.Estadisticas.Estadisticas;
import edu.escuelaing.arep.LinkedList.LinkedList;

/**import junit.framework.TestCase;
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

public class EstadisticasTest{
	
	@Test
	public void deberiaCalcularElMeanBien(){
        List<Double> lin = new LinkedList<Double>();
        
        lin.add(160.0);
        lin.add(591.0);
        lin.add(114.0);
        lin.add(229.0);
        lin.add(230.0);
        lin.add(270.0);
        lin.add(128.0);
        lin.add(1657.0);
        lin.add(624.0);
        lin.add(1503.0);
        
        double mean = Estadisticas.Sumatoria(lin);
        assertEquals(550.6,(double)Math.round(mean * 10d) / 10d);
	
	}

        @Test
        public void deberiaDarLaDesviacionCorrecta(){
            
        List<Double> link = new LinkedList<Double>();
        
        link.add(160.0);
        link.add(591.0);
        link.add(114.0);
        link.add(229.0);
        link.add(230.0);
        link.add(270.0);
        link.add(128.0);
        link.add(1657.0);
        link.add(624.0);
        link.add(1503.0);
        
        double desviacion= Estadisticas.Desviacion(link);
        assertEquals(572.03,(double)Math.round(desviacion * 100d) / 100d);
        }
}