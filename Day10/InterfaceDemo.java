/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

/**
 *
 * @author Nagarajan
 */
interface teacher {

    public void doTeach();
}

interface doctor {

    public void doCure();
}

class Human implements teacher,doctor {

    public void doTeach() {
        System.out.println("Human Teaching...");
    }
    public void doCure()
    {
        System.out.println("Doctor Curing...");   
    }
}

class Hospital {}
public class InterfaceDemo {

    public static void main(String[] args) {
        
    Human human = new Human();
    teacher teach = (teacher)human;
    teach.doTeach();
    doctor dr = (doctor)human;
    dr.doCure();
    
    }
}
