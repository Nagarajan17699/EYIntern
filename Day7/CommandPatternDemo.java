/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7;

/**
 *
 * @author Nagarajan
 */
public class CommandPatternDemo {

    static {

    }

    public static void main(String[] args) {

    }
}

abstract class Action {

//    abstract void execute();
//   // Action(Police ps, Corporation cp, FoodAuthority){
//        
    //}
}

class HotelCertification extends Action
{
    void execute(){
        
    }
}

class Police {

    public void doInvestigate() {
        System.out.println("Police Investigation Done Successfully");
    }

    public void doCertify() {
        System.out.println("Police Certification givern successfully...");
    }
}

class Corporation {

    public void doInvestigate() {
        System.out.println("Corporation Investigation Under Process...");
    }

    public void doCertify() {
        System.out.println("Corporation Certification Done...");
    }
}

class FoodAuthority {

    public void doAnalysis() {
        System.out.println("FoodAuthority Analysis done successfully...");
    }

    public void doCertify() {
        System.out.println("Food Authority Certified Succeddfully...");
    }
}

class Hospital {

    public void doMedicalAnalysis() {
        System.out.println("Hospital Analysis done Successfully...");
    }

    public void doCertify() {
        System.out.println("Hostpial Certification Done Successfully...");
    }
}
