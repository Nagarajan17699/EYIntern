/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
////import org.jdom2.Element;
////import org.jdom2.Document;
//import org.jdom2.output.Format;
//import org.jdom2.output.XMLOutputter;
import java.io.File;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import static org.jdom2.filter.Filters.document;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Nagarajan
 */
public class XMLClass {

    public static String xmlFilePath = "d:/NetBeans Project/InternExercise/src/Day23/newxml.xml";

    public void createXML(HashSet<BuyingList> al) {

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            // root element
            Element root = document.createElement("invoices");
            document.appendChild(root);

                Element invoice = document.createElement("invoice");
                Element invno = document.createElement("invno");
                invno.appendChild(document.createTextNode("InvNo"));
                invoice.appendChild(invno);
                
                Element itemno = document.createElement("itemno");
                itemno.appendChild(document.createTextNode("itemno"));
                invoice.appendChild(itemno);
                
                Element qty = document.createElement("qty");
                qty.appendChild(document.createTextNode("Qty"));
                invoice.appendChild(qty);
                
                Element price = document.createElement("price");
                price.appendChild(document.createTextNode("Price"));
                invoice.appendChild(price);
                
                root.appendChild(invoice);
                
            for(BuyingList x:al)
            {
                 invoice = document.createElement("invoice");
                 invno = document.createElement("invno");
                invno.appendChild(document.createTextNode(x.getInvno()));
                invoice.appendChild(invno);
                
                 itemno = document.createElement("itemno");
                itemno.appendChild(document.createTextNode(x.getItemno()));
                invoice.appendChild(itemno);
                
                 qty = document.createElement("qty");
                qty.appendChild(document.createTextNode(x.getQuantity()));
                invoice.appendChild(qty);
                
                 price = document.createElement("price");
                price.appendChild(document.createTextNode(x.getPrice()));
                invoice.appendChild(price);
                
                root.appendChild(invoice);
                
            }
            // employee element
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging
            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");
        } catch (Exception ex) {
            Logger.getLogger(XMLClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
