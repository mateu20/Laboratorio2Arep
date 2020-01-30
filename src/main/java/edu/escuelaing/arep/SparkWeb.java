/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep;
import edu.escuelaing.arep.LinkedList.LinkedList;
import edu.escuelaing.arep.Estadisticas.Estadisticas;
import java.util.List;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 *
 * @author david.gonzalez-g
 */

import static spark.Spark.*;
public class SparkWeb {
  public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/calcular", (req, res) -> CalcularPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>\n"
                +"<head>\n" +
                    "<title> EstadisticasDesviacionYMedia</title>"
                +"</head>\n"
                + "<body>\n"
                + "<h2>EstadisticasDesviacionYMedia</h2>\n"
                + "<form method=\"post\" action=\"/calcular\">\n"
                + "  Ingrese Datos:<br>\n"
                + "  <input type=\"text\" name=\"Ingrese datos separados por espacios\">\n"
                + "  <br>\n"
                + "  <input type=\"submit\" value=\"calcular\">\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>\n";
        return pageContent;
    }

    private static String CalcularPage(Request req, Response res) {
        List<Double> lin = new LinkedList<>();
        String numeros = req.queryParams("Ingrese datos separados por espacios");
        String[] num = numeros.split("\\s*( )\\s*");
        
        for(String n:num){
            lin.add(Double.parseDouble(n));
        }
        double media = Estadisticas.Sumatoria(lin);
        double desviacion = Estadisticas.Desviacion(lin);
        
        
         String pageContent
                = "<!DOCTYPE html>"
                + "<html>\n"
                +"<head>\n" +
                    "<title> ResultadoDesviacionYMedia</title>"
                +"</head>\n"
                + "<body>\n"
                + "<h2>ResultadoDesviacionYMedia</h2>\n"
                + "<p> Los resultados para la desviacion estandar y la media son</p>/n"
                + "<p>El resultado de la desviacion es:"+media+"</p>\n"
                + "<p>El resultado de la desviacion es:"+desviacion+"</p>\n"
                + "  Ingrese Datos:<br>\n"
                + "  <input type=\"text\" name=\"Ingrese datos separados por espacios\">\n"
                + "  <br>\n"
                + "  <input type=\"submit\" value=\"calcular\">\n"
                
                + "</body>\n"
                + "</html>\n";
        return pageContent;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }//returns default port if heroku-port isn't set(i.e. on localhost)    }}
}