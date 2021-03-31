/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import InvoiceDetails.ArrayListObjectToEmail;
import InvoiceDetails.ArrayListObjectToExcel;
import InvoiceDetails.ArrayListtoPDF;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.InvoiceService;

/**
 *
 * @author Nagarajan
 */
public class InvoiceAction extends Action{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

           HttpSession sess = request.getSession();
           String mode = request.getParameter("mode");
           ArrayList<ItemDTO> al = InvoiceService.getItemsList(sess, request);
           
           if(mode.equalsIgnoreCase("pdf")){
              ArrayListtoPDF.createPDF(al);
              System.out.println("Created PDF");
                System.out.println("PDF Created ...");
           }
           else if(mode.equalsIgnoreCase("excel"))
               ArrayListObjectToExcel.ObjecttoExcel(al);
           else if(mode.equalsIgnoreCase("email"))
               new ArrayListObjectToEmail().CustomerDetailsToString(al);
           
           return "shop.shop3";
    }
    
}
