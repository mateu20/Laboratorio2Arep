/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep;
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
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/Calcular", (req, res) -> CalcularPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>\n"
                +"<head>\n" +
                    "<title> EstadisticasDesviacionYMedia</title>"
                +"</head>\n"
                + "<body>\n"
                + "<h2>HTML Forms</h2>\n"
                + "<form action=\"/results\">\n"
                + "  First name:<br>\n"
                + "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\n"
                + "  <br>\n"
                + "  Last name:<br>\n"
                + "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\n"
                + "  <br><br>\n"
                + "  <input type=\"submit\" value=\"Submit\">\n"
                + "</form>\n"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>\n"
                + "</body>\n"
                + "</html>\n";
        return pageContent;
    }

    private static String CalcularPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
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