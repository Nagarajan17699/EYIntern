/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class QuadraticFormula_24 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c,x;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        x = s.nextInt();
        Quad q = new Quad(a,b,c);
        System.out.println(q.computeQuad(x));
    }
}

class Quad
{
    int a,b,c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    Quad()
    {
        a=b=c=1;
    }
    Quad(int a,int b, int c)
    {
       setA(a);
       setB(b);
       setC(c);
    }
    
    int computeQuad(int x)
    {
        return (int)((a*Math.pow(x,2))+ (b*x) + c);
    }
}