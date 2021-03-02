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
public class ObjectCloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneDemo cd = new CloneDemo();
        cd.setName("Clone 1");
        CloneDemo cd2 = cd.getClone();
        cd2.setName("Clone 2");

        System.out.println("Clone 1: -> " + cd.getName());
        System.out.println("Clone 2: -> " + cd2.getName());

    }
}

class CloneDemo {

    private String cloneName;

    public void setName(String str) {
        this.cloneName = str;
    }

    public String getName() {
        return this.cloneName;
    }

    public CloneDemo getClone() throws CloneNotSupportedException {
        return (CloneDemo) super.clone();
    }
}
