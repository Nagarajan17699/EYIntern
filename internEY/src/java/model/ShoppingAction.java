package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.InvoiceService;

public class ShoppingAction extends Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            // TODO Auto-generated method stub
            ArrayList<ItemDTO> al = new ArrayList<>();
            String shopid = request.getParameter("shopid");

            Properties propdb =(Properties)request.getServletContext().getAttribute("properties");

            ServletContext application=request.getServletContext();
            String path=(String)application.getAttribute("path");
            Properties prop=new Properties();
            prop.load(new FileInputStream(path));
            
            HttpSession hs = request.getSession();
            ItemDAOImpl id = ItemDAOImpl.getItemDAOImpl();
            //System.out.println("property:" + prop);
            String catagory = prop.getProperty(shopid + ".catagory");
            //System.out.println(catagory);
            al = id.getByCatagory(catagory, propdb);
           // System.out.println("ArrayList: "+al);
            hs.setAttribute("items", al);
            //System.out.println(hs);

            Map<String, Integer> hashmap;
            
            System.out.println(hs.isNew());
            if (hs.getAttribute("invoicedetails") == null) {
                hashmap = new HashMap<String, Integer>();
            } else {
                hashmap = (HashMap<String, Integer>) hs.getAttribute("invoicedetails");
            }

            String select[] = request.getParameterValues("selected");
            System.out.println("select array "+Arrays.toString(select));
            if (select != null) {
                for (String x : select) {
                    String quantity = request.getParameter(x);
                    System.out.println("Quantity "+ quantity);
                    System.out.println("x:"+x);
                    hashmap.put(x, Integer.parseInt(quantity));
                }
            } 
            hs.setAttribute("invoicedetails", hashmap);
            //System.out.println("hms:"+ hashmap);

            if(!shopid.equalsIgnoreCase("shop0")){
            Map<ItemDTO,Integer> hms = InvoiceService.getInvoiceDetails(hs, request);
            hs.setAttribute("invoiceitems", hms);
            System.out.println("hms:"+ hms);
            }
            
            return "shop." + shopid;
        } catch (IOException ex) {
            Logger.getLogger(ShoppingAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
