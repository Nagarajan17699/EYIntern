/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.ItemDAO;
import model.ItemDAOImpl;
import model.ItemDTO;

/**
 *
 * @author Nagarajan
 */
public class InvoiceService {

    public static HashMap<ItemDTO, Integer> getInvoiceDetails(HttpSession session, HttpServletRequest request) {
        HashMap<ItemDTO, Integer> hmf = new HashMap<>();
        Properties prop = (Properties) request.getServletContext().getAttribute("configproperties");

        ItemDAOImpl id = ItemDAOImpl.getItemDAOImpl();
        HashMap<String, Integer> hm = (HashMap<String, Integer>) session.getAttribute("invoicedetails");
        Iterator hmIterator = hm.entrySet().iterator();
        while (hmIterator.hasNext()) {
            //System.out.println("Inside InvoiceService.java " );
            Map.Entry me = (Map.Entry) hmIterator.next();
            ItemDTO idt = id.getByName((String) me.getKey(), prop);
            hmf.put(idt, (Integer) me.getValue());
            // System.out.println("HMF in InvoiceSearch"+hmf);
        }
        return hmf;
    }

    public static ArrayList<ItemDTO> getItemsList(HttpSession session, HttpServletRequest request) {
        ArrayList<ItemDTO> al = new ArrayList<>();
        Properties prop = (Properties) request.getServletContext().getAttribute("configproperties");
        HashMap<String, Integer> hm = (HashMap<String, Integer>) session.getAttribute("invoicedetails");
        if (hm != null) {
            System.out.println("HashMap from GetItemsList " + hm.size());
            ItemDAOImpl id = ItemDAOImpl.getItemDAOImpl();
            Iterator hmIterator = hm.entrySet().iterator();
            while (hmIterator.hasNext()) {
                Map.Entry me = (Map.Entry) hmIterator.next();
                ItemDTO idt = id.getByName((String) me.getKey(), prop);
                idt.setQuantity(me.getValue().toString());
                al.add(idt);
            }
        }
        return al;
    }

    public int getQuantityByName() {
        return 0;
    }
}
