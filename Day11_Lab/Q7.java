/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Q7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Print p = new Print();
        p.printf();

    }
}

class Print {

    public void printf() {
        Scanner s = new Scanner(System.in);
        int num, den, flag = 0;

        while (true) {
            String num1 = s.nextLine();
            if (num1.startsWith("q") || num1.startsWith("Q")) {
                System.exit(0);
            }
            num = Integer.parseInt(num1);
            den = s.nextInt();
            s.nextLine();
            while (den == 0) {
                System.out.println("Enter Correct denominator...");
                den = s.nextInt();
                flag = 1;
            }
            
            if(flag == 1){
                s.nextLine();
                flag = 0;
                
            }
            System.out.println("Numerator is " + num + " Denominator is " + den + " division is " + (float) num / den);

        }

    }
}
