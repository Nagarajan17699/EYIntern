/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

/**
 *
 * @author Nagarajan
 */


import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXHandlerXML extends DefaultHandler {

   boolean name = true;
   boolean email = false;
   boolean phone = false;
   boolean amount = false;
   boolean date = false;
   ArrayList<CustomerDetails> al = new ArrayList<>();
   @Override
   public void startElement(String uri, 
   String localName, String qName, Attributes attributes) throws SAXException {

      if (qName.equalsIgnoreCase("Customer")) {
         //String rollNo = attributes.getValue("rollno");
        // System.out.println("Roll No : " + rollNo);
        
      } else if (qName.equalsIgnoreCase("name")) {
         name = false;
      } else if (qName.equalsIgnoreCase("email")) {
         email = true;
      } else if (qName.equalsIgnoreCase("phone")) {
         phone = true;
      }
      else if (qName.equalsIgnoreCase("amount")) {
         amount = true;
      }
      else if (qName.equalsIgnoreCase("date")) {
         date = true;
      }
   }

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("customer")) {
         System.out.println("End Element :" + qName);
      }
   }

   @Override
   public void characters(char ch[], int start, int length) throws SAXException {
      
      if (name) {
         System.out.println("Name: " 
            + new String(ch, start, length));
         name = false;
      } else if (email) {
         System.out.println("E-Mail: " + new String(ch, start, length));
         email = false;
      } else if (phone) {
         System.out.println("Phone: " + new String(ch, start, length));
         phone = false;
      } else if (amount) {
         System.out.println("Amount: " + new String(ch, start, length));
         amount = false;
      }
       else if (date) {
         System.out.println("Date: " + new String(ch, start, length));
         date = false;
      }
   }
}