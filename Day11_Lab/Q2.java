/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

/**
 *
 * @author Nagarajan
 */
public class Q2 {
    
    public static void main(String[] args) {
        Sample s = new Sample();
        s.mtd1();
    }
    
}

class Sample
{
    public void mtd1()
    {
        mtd2();
        System.out.println("Caller");
    }
    
    public void mtd2()
    {
        try{
            
            throw new ClassCastException();
            //return;  -> this line is Unreachable due to the error thrown in the above line.
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
        finally{
            System.out.println("Finally mtd-2");
        }
    }
}