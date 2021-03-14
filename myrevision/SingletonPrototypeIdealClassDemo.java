/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrevision;

/**
 *
 * @author Nagarajan
 */
public class SingletonPrototypeIdealClassDemo {
    
}


class Example implements Cloneable
{
    private Example(){
        
    }
    
    private static Example example;
    
    synchronized public static Example createExample()
    {
        if(example==null)
        {
            example = new Example();
        }
        return example;
    }
    
    synchronized public  Example createClone()
    {
        try{
            if(example == null)
            {
                example = new Example();
             //  Example cloneExample = example.getClone();
            }else return (Example)super.clone();;
            
        }catch(Exception e){}
        return null;
    }
}