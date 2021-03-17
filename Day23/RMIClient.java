/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class RMIClient {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Business bus = (Business)Naming.lookup("rmi://localhost:1099/myService");
        System.out.println("Select the option to continue ... \n 1.Create Invoice \n 2.Date & Time of Invoice \n 3.Generate PDF of the Invoice"
                + "\n 4.Generate Excel of the invoice \n 5. Enter new Items");
        int num = Integer.parseInt(br.readLine());
        RMIServer rmse = new RMIServer();
        switch(num){
            case 1:createInvoiceClient( );
                    break;
            case 2:
                break;
            case 3:
                generatePDF();
                break;
            case 4:
                GenerateExcel();
                break;
            case 5:
                EnterNewItems();
        }
                
    }

    private static void createInvoiceClient() {
        try {
            
            String invno, custname ,amount ,invdate ,nodays ;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            invno =br.readLine();
            custname = br.readLine();
            amount = br.readLine();
            invdate = br.readLine();
            nodays = br.readLine();
            InvoiceDetails id = InvoiceDetails.getobject();
            id.setInvno(invno);
            id.setCustname(custname);
            id.setAmount(amount);
            id.setInvdate(invdate);
            id.setNodays(nodays);
            int res = new RMIServer().createInvoice(id);
            if(res != -1)
            {
                BufferedWriter brw = new BufferedWriter(new OutputStreamWriter(System.out));
                System.out.println("Creation Successful ... ");
            }
            System.out.println("Enter the number of items bought");
            HashSet<BuyingItems> hs = new HashSet<>();
            int num = Integer.parseInt(br.readLine());
            while(num-->0)
            {
                BuyingItems by = new BuyingItems();
                by.setInvno(br.readLine());
                by.setItemno(br.readLine());
                by.setQty(br.readLine());
                by.setPrice(br.readLine());
                hs.add(by);
            }
            
            new RMIServer().insertBuyingItems(hs);
            
        } catch (IOException ex) {
            Logger.getLogger(RMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    private static void generatePDF() {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String invno = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(RMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void GenerateExcel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void EnterNewItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
