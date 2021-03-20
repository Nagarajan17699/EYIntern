package Day23;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

public class XMLToArrayList {

    String filename;

    XMLToArrayList(String filename) {
        this.filename = filename;
    }

    public ArrayList<BuyingList> readXMl() throws Exception {
        XMLParsing xp = new XMLParsing(filename);
        System.out.println("in readXML Function in XML->AL");
        return xp.readXML();

    }

}

interface readXML {

    public void createFile();

    public ArrayList<BuyingList> readXML() throws Exception;
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
    public ArrayList<BuyingList> readXML() throws Exception {
        ArrayList<BuyingList> al = new ArrayList<>();
        File f = new File(filename);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(f);
        doc.getDocumentElement().normalize();

        NodeList nl = doc.getElementsByTagName("invoice");
        for (int i = 0; i < nl.getLength(); i++) {
            System.out.println(nl.getLength());
            Node node = nl.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;
                NodeList innerList = elem.getChildNodes();
                String name = elem.getElementsByTagName("invno").item(0).getTextContent();
                String phone = elem.getElementsByTagName("itemno").item(0).getTextContent();
                String email = elem.getElementsByTagName("qty").item(0).getTextContent();
                String amount = elem.getElementsByTagName("price").item(0).getTextContent();
                al.add(new BuyingList(name, phone, email, amount));

/*                ArrayList al2 = new ArrayList();
                for (int j = 0; j < innerList.getLength(); j++) {
                    System.out.println(innerList.item(j).getNodeName());
                    al2.add(innerList.item(j).getTextContent().toString());
                    for (Object x : al2) {
                        System.out.println(x.toString());
                    }
                }

             al.add(new CustomerDetails(name, phone,
                         email), amount, date));
                al.add(new CustomerDetails(al2.get(0).toString(), al2.get(1).toString(),
                         al2.get(2).toString(), al2.get(3).toString(), al2.get(4).toString())); 
                
    This code is to dynaically pick up the rows in the XML 
                */
            }
        }
        System.out.println("Done Converting XML to ArrayList....");
        return al;
    }
    
    @Override
    public void createFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
