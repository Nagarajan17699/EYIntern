/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

/**
 *
 * @author Nagarajan
 */
public class ClassExperiment_22 {
    
    public static void main(String[] args) {
        Example e= new Example();
        e.numDefault = 5;
        e.numPublic = 10;
        e.numProtected = 15;
        
        e.funcDefault();
        e.funcPublic();
        e.funcProtected();
    }
}

class Example
{
    int numDefault;
    public int numPublic;
    private int numPrivate;
    protected int numProtected;
    
    void funcDefault(){}
    public void funcPublic(){}
    private void funcPrivate(){}
    protected void funcProtected(){}
}