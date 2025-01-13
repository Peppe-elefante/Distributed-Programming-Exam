/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librojmsclient;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import libro.MessageWrapper;

/**
 *
 * @author ACER
 */
public class LibroJMSClient {

    
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination d = (Destination) ctx.lookup("jms/javaee7/Topic");
        MessageWrapper msg = new MessageWrapper("La Peste","Camus", "FILOSOFIA");
        int priority = 0;
        if (msg.getCollocazione() == "AVVENTURA") priority = 9;
        try(JMSContext jc = cf.createContext()){
            jc.createProducer().setPriority(priority).send(d, msg);
        }
     
        
    }
    
}
