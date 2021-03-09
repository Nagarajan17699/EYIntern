/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

/**
 *
 * @author Nagarajan
 */

import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;
import java.util.Date;

public class XMLToPDF {
    
}

class XMLParsing implements readXML
{

    String filename;
    XMLParsing(String filename)
    {
        this.filename = filename;
    }
    
    @Override
    public void readXML() throws Exception{
        File f= new File(filename);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(f);
        doc.getDocumentElement().normalize();
        
        NodeList nl = doc.getElementsByTagName("customer");
        
        
    }

    @Override
    public void createFile() {
        
    }
    
}
interface readXML
{
    public void createFile();
    public void readXML() throws Exception;
}

class CustomerDetails
{
    private String name, emailid, phonenumber, address,date;
    private int amount;

    CustomerDetails(String name, String emailid, String pnonenumber, String Address, int amount, String date)
    {
        this.name = name;
        this.emailid = emailid;
        this.phonenumber = phonenumber;
        this.address = Address;
        this.amount = amount;
        this.date = date;
    }
}