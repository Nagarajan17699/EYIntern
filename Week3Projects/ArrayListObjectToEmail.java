/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Nagarajan
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Nagarajan
 */
public class ArrayListObjectToEmail {
    
    public void CustomerDetailsToString(ArrayList<CustomerDetails> cd)
    {
        StringBuffer msg = new StringBuffer("The Details of the customer are mentioned Below \n");
        for(CustomerDetails x: cd)
        {
            StringBuffer temp = new StringBuffer(x.name+" "+x.emailid+" "+x.phonenumber+" "+x.amount+" "+x.date+"\n");
            msg.append(temp);
        }
            System.out.println(msg);
            this.send(msg.toString(),"Customer Details","munna17699@gmail.com");
    }

    public String send(String messege, String subject, String to) {
        final String user = "nagarajan17699@gmail.com";//change accordingly  
        final String pass = ""; //passsword has been removed... to make this work add the email and password ... 
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");//change accordingly  
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(messege);

            //3rd step)send message  
            Transport.send(message);

            System.out.println("E-Mail Sent Successfully ... ");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    return "Done";
    }

}
