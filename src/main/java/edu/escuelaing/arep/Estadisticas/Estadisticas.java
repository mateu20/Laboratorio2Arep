package edu.escuelaing.arep.Estadisticas;

import java.util.List;
public class Estadisticas {
	/**
         * 
         * @param num Recibe una lista de Double
         * @return la sumatoria del arreglo dividido por la cantidad de elementos
         * del mismo
         */
	 public static double Sumatoria(List<Double> num){
	        int respuesta = num.size();
	        double sum = 0;
	        for (Double numb : num){
	            sum += numb;
	        }
	        return sum/respuesta;
	    }
         /**
          * 
          * @param num Recibe una lista de tipo Double
          * @return La desviacoin estandar de nuestro arreglo redondeada a dos
          * digitos
          */
	    public static double Desviacion(List<Double> num){
	        double total = num.size();
	        double promedio = Sumatoria(num);
	        double n = 0;
	        for (Double numb : num) {
	            n += Math.pow(numb - promedio, 2);
	        }
	        return Math.sqrt(n/(total-1));
	    }

}