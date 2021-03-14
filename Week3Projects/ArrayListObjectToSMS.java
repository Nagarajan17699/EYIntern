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


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.util.ArrayList;

public class ArrayListObjectToSMS {
    // Find your Account Sid and Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC6149593aa99a3acc734efe3cdfdc31d4";
    public static final String AUTH_TOKEN = "0a2f606a1ce436cb90f4cf02206f3ffb";

    public void send(ArrayList<CustomerDetails> al)
    {
         StringBuffer msg = new StringBuffer("The Details of the customer are mentioned Below \n");
        for(CustomerDetails x: al)
        {
            StringBuffer temp = new StringBuffer(x.name+" "+x.emailid+" "+x.phonenumber+" "+x.amount+" "+x.date+"\n");
            msg.append(temp);
        }
            System.out.println(msg);
            sendSMS(msg.toString());
            
    }
    
    public void sendSMS(String str)
    {
        System.out.println(ACCOUNT_SID);
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+919003294904"), //
                new com.twilio.type.PhoneNumber("+15017122661"),
                str)
            .create(); 

        System.out.println(message.getSid());
    }
}