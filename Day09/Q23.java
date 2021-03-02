/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day09;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Q23 {
    
    public static void main(String[] args) {
        
        double radius = new Scanner(System.in).nextInt();
        double height = new Scanner(System.in).nextInt();

        double pi = Math.PI;
        double area = pi * Math.pow(radius,2) + 2*pi*radius*height;
        System.out.println("area is "+Math.round(area));
    }
}
