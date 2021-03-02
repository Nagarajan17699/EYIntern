/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class Q4 {
    public static void main(String[] args) {
        Trailer t = new Trailer();
        try {
            t.getInt(0);
        } catch (MyException ex) {
            System.out.println(ex);
        }
    }
}

class Trailer 
{
    public void getInt(int i) throws MyException
    {
        if(i==0)
            throw new MyException("The Number is Zero");
            
    }
}
class MyException extends Throwable
{
    String str;
    MyException(String str)
    {
        this.str = str;
    }
    
    public String toString()
    {
        return "Exception returned is: "+str;
    }
}