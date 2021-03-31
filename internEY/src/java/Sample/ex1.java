/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nagarajan
 */
public class ex1 extends HttpServlet {

    public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        out.println(name);
        out.println("<h2>Hello "+name+"</h2>");
        
    }
    
    //Exercise 2
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        out.println(name);
        out.println("<h2>Hello "+name+"</h2>");
        
    }
}
