package fr.unicaen.magicmonkey.servlet;

import fr.unicaen.magicmonkey.personne.BddPersonne;
import fr.unicaen.magicmonkey.personne.InterfaceBdd;
import fr.unicaen.magicmonkey.personne.Personne;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    private static InterfaceBdd bdd = new BddPersonne();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        for (Personne personne : bdd.dumpList()) {
            pw.println(personne.getNom());
        }
        pw.println("</body></html>");
        pw.close();
    }
}