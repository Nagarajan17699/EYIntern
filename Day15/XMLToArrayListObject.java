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
import java.util.ArrayList;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XMLToArrayListObject {

    String filename;
    XMLToArrayListObject(String filename)
    {
        this.filename = filename;
    }
    
    public ArrayList<CustomerDetails> readXMl() throws Exception
    {
        XMLParsing xp = new XMLParsing(filename);
        return xp.readXML();
         
    }
    
}



interface readXML {

    public void createFile();

    public ArrayList<CustomerDetails> readXML() throws Exception;
}



class XMLParsing implements readXML {

    String filename;

    XMLParsing(String filename) {
        this.filename = filename;
    }

     public void setFilename(String filename) {
        this.filename = filename;
    }
    @Override
    public ArrayList<CustomerDetails> readXML() throws Exception {
        ArrayList<CustomerDetails> al = new ArrayList<>();
        File f = new File(filename);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(f);
        doc.getDocumentElement().normalize();

        NodeList nl = doc.getElementsByTagName("customer");
        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;
                String name = elem.getElementsByTagName("name").item(0).getTextContent();
                String phone = elem.getElementsByTagName("phone").item(0).getTextContent();
                String email = elem.getElementsByTagName("email").item(0).getTextContent();
                String amount = elem.getElementsByTagName("amount").item(0).getTextContent();
                String date = elem.getElementsByTagName("date").item(0).getTextContent();
                al.add(new CustomerDetails(name, phone, email, amount, date));
            }
        }
        return al;
    }

    @Override
    public void createFile() {

    }

}



class CustomerDetails {

     String name, emailid, phonenumber, date, amount;

    CustomerDetails(String name, String emailid, String pnonenumber, String amount, String date) {
        this.name = name;
        this.emailid = emailid;
        this.phonenumber = phonenumber;
        this.amount = amount;
        this.date = date;
    }

}
