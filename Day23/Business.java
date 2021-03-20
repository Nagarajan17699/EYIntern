 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashSet;

/**
 *
 * @author Nagarajan
 */
public interface Business extends Remote{
     int createInvoice(InvoiceDetails id) throws RemoteException;
     public int insertBuyingItems(HashSet<BuyingItems> bi) throws RemoteException;
     public void createPDF(String invno) throws RemoteException;
     public void createExcel(String invno) throws RemoteException;

       
}
