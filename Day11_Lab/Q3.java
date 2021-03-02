/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

import java.io.IOException;

/**
 *
 * @author Nagarajan
 */
public class Q3 {
    
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        s.mtd1();
    }
    
}

class Sample2
{
    public void mtd1()
    {
        mtd2();
        System.out.println("Caller");
    }
    
    public void mtd2()
    {
        try{
            
            //throw new IOException();
           System.exit(0);  //-> this line is Unreachable due to the error thrown in the above line.
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
        finally{
            System.out.println("Finally mtd-2");
        }
    }
}