/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Nagarajan
 */
public class SerializationDemo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String path = "d:/NetBeans Project/InternExercise/src/Day15/";
        AppleExam ae = new AppleExam();
        System.out.println("The original price is "+ae.getPrize());
        ae.setPrize(5);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path+"Serializeabledemo.dat"));
        oos.writeObject(ae);
        System.out.println("The Price now is "+ae.getPrize());
        ae.setPrize(15);
        
        System.out.println("Retriving the old object back...");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path+"Serializeabledemo.dat"));
        AppleExam aecpy = (AppleExam)ois.readObject();
        System.out.println("The original price of the AppleExam is "+aecpy.getPrize()); 
        
    }
    
}

class AppleExam implements Serializable //Serializeable is a marker interface denoting the class can be serialized
{
    private int price = 20;

    public int getPrize() {
        return price;
    }

    public void setPrize(int price) {
        this.price = price;
    }
    public AppleExam()
    {
        System.out.println("AppleExam Object Created...");
    }
}
