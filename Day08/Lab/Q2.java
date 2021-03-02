/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day08.Lab;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r1, r2, i1, i2;
        r1 = s.nextInt();
        r2 = s.nextInt();
        i1 = s.nextInt();
        i2 = s.nextInt();
        
        complex c1 = new complex(r1,i1);
        complex c2 = new complex(r2,i2);
        CompAddition cmp = new CompAddition();
        cmp.add(c1, c2);
    }
}

class complex {

    int real, complex;

    
    complex(int real, int complex) {
        this.real = real;
        this.complex = complex;
    }
}

class CompAddition
{
    void add(complex c1, complex c2)
    {
        int r3 = c1.real+c2.real;
        int i3 = c1.complex+c2.complex;
        
        complex c3 = new complex(r3,i3);
        System.out.println(c3.real+"+"+c3.complex+"i");
        
    }
}