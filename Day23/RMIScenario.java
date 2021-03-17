/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Nagarajan
 */
public class RMIScenario {
    
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        RMIServer rmi = new RMIServer();
        System.out.println("RMI Server Ready ... ");
        Naming.bind("rmi://localhost:1099/myService", rmi);
    }
}
