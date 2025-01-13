/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
@MessageDriven(mappedName = "jms/javaee7/Topic")
public class LibroMDB implements MessageListener {
    
    @Inject
    private LibroEJB ejb;

    @Override
    public void onMessage(Message msg) {
        try {
            MessageWrapper update = msg.getBody(MessageWrapper.class);
            LibroEntity l = new LibroEntity(update.getTitolo(), update.getAutore(), update.getCollocazione());
            ejb.saveLibro(l);
            System.out.println("Nuovo Libro " + update.getTitolo() + " di "+ update.getAutore() + " in collocazione " + update.getCollocazione());
        } catch (JMSException ex) {
            
        }
    }
    
}
