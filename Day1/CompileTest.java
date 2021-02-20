/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author Nagarajan
 */
public class CompileTest {
    public static void main(String[] args) {
        
    }
    
}

protected class Base{ 
    //Class should not contain protected modifier its either public or default
	String method() {
		return "wow";
	}
}

class Derived{  
	public void useD() {
		Base zBase=new Base();
		System.out.println("base says "+zBase.method());
		
	}
}
