/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librowsclient;

import java.util.List;

/**
 *
 * @author ACER
 */
public class LibroWSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] input = {1, 4, 100};
        for(long i : input){
            List<String> libro = libroService(i);
            System.out.println("libro di titolo" + libro.get(0) + " e autore " + libro.get(1));
        }
    }

    private static java.util.List<java.lang.String> libroService(long arg0) {
        libro.LibroEJBService service = new libro.LibroEJBService();
        libro.LibroEJB port = service.getLibroEJBPort();
        return port.libroService(arg0);
    }
    
}
