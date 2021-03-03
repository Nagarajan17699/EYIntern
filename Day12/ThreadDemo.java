/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class ThreadDemo {

    public static void main(String[] args) {

        System.out.println("Printing from main...");
        new Thread(() -> {
            disp();
        });
        System.out.println("Printing at last in main...");
    }

    public static void disp() {
        try {
            Thread.sleep(1000);
            System.out.println("Displaying from disp");
        } catch (Exception ex) {
                System.out.println(ex);
        }
        
    }
}
