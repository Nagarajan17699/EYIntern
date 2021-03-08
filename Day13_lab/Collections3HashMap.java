/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Nagarajan
 */
public class Collections3HashMap {
    
    public static void main(String[] args) {
         HashMap<Integer,String> hs = new HashMap<Integer,String>();
         hs.put(10,"Ten");
         hs.put(20,"Twenty");
         hs.put(30,"Thirty");
         
         
         
         Iterator it = hs.entrySet().iterator();
         while(it.hasNext())
         {
             Map.Entry mv = (Map.Entry)it.next();
             System.out.println(mv.getKey()+" "+mv.getValue());
         }
    }
}
