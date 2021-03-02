/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day02;

/**
 *
 * @author Nagarajan
 */
public class Q13 {

    public static void main(String[] args) {

        int i = 9;
        switch (i) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
        }

    }
}

/* Output: default
           zero

Since break is not present it executes till the last case */