/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

import java.io.File;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Nagarajan
 */
public class SAXParserDemo {

    public static void main(String[] args) {

        try {
            File inputFile = new File(FilePath.path+"customer.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            SAXHandlerXML shx = new SAXHandlerXML();
            saxParser.parse(inputFile, shx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

