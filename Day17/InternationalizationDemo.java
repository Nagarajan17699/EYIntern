/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day17;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Nagarajan
 */
public class InternationalizationDemo {
    
    public static void main(String[] args) {
            Locale.setDefault(new Locale("ta"));
            Locale lc = Locale.getDefault();
            System.out.println(lc);
            ResourceBundle rb  = ResourceBundle.getBundle("Day17.Dictionary",lc);
            System.out.println(rb.getString("hello"));
            

    }
}
