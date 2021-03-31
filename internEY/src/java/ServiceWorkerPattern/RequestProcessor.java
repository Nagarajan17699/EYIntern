/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceWorkerPattern;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nagarajan
 */
public class RequestProcessor {
    
    public static RequestProcessor obj;
    public static RequestProcessor getRequestProcessorObject()
    {
        if(obj == null)
        {
            obj = new RequestProcessor();
        }
        
        return obj;
    }
    
    public void execute(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        //res.getWriter().println(req.getParameter("name"));
        if(req.getParameter("name").equalsIgnoreCase("Naga")){
            try {
                req.setAttribute("name",req.getParameter("name"));
                RequestDispatcher rd = req.getRequestDispatcher("ServiceWorkerDemo/welcome.jsp");
                rd.forward(req, res);
            } catch (Exception ex) {
                 Logger.getLogger(RequestProcessor.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
}
