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
public class Q5 {
    public static void main(String[] args) {
        Main t = new Main();
        try {
            t.getInt(0);
        } catch (MyOwnException ex) {
            System.out.println(ex); // Without the catchblock the program will not be executed
        }
    }
}

class Main 
{
    public void getInt(int i) throws MyOwnException
    {
        if(i==0)
            throw new MyOwnException("The Number is Zero");
            
    }
}
class MyOwnException extends Throwable
{
    String str;
    MyOwnException(String str)
    {
        this.str = str;
    }
    
    public String toString()
    {
        return "Exception returned is: "+str;
    }
}