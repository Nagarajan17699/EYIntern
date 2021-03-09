/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day16;

/**
 *
 * @author Nagarajan
 */
public class StringFormatterExample {

    public static void main(String[] args) {

        String str = String.format("%d %03d %.15f", 3, 3, Math.PI);
        System.out.println(str);
    }
}
