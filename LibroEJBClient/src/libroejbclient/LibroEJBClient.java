/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libroejbclient;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import libro.LibroEJBRemote;
import libro.LibroEntity;

/**
 *
 * @author ACER
 */
public class LibroEJBClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        LibroEJBRemote ejb = (LibroEJBRemote) ctx.lookup("java:global/LibroServer/LibroEJB!libro.LibroEJBRemote");
        List<LibroEntity> tuttiLibri = ejb.trovaTutti();
        for(LibroEntity libro : tuttiLibri){
            System.out.println(libro);
        }
        
        List<LibroEntity> divina = ejb.trovaNome("La Divina Commedia");
        for(LibroEntity d : divina){
            ejb.removeLibro(d);
        }
        
        LibroEntity l = ejb.trovaId(Long.valueOf(1));
        l.setStato("Disponibile");
        ejb.updateLibro(l);
    }
    
}