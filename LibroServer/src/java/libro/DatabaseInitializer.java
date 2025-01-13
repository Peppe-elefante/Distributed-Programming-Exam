/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SingletonEjbClass.java to edit this template
 */
package libro;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Singleton;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;


/**
 *
 * @author ACER
 */
@Singleton
@LocalBean
@Startup
public class DatabaseInitializer {
    
    @Inject 
    private LibroEJB ejb;
    private LibroEntity l1, l2, l3, l4;
   
    
    @PostConstruct
    private void populateDB(){
        l1 = new LibroEntity("Dracula", "Bram Stoker", "HORROR");
        l2 = new LibroEntity("Frankenstein", "Mary Shelley", "SCIENCE-FICTION");
        l3 = new LibroEntity("La Divina Commedia", "Dante", "POEMA");
        
        
        ejb.saveLibro(l1);
        ejb.saveLibro(l2);
        ejb.saveLibro(l3);
    }
    
    @PreDestroy
    private void clearDB(){
        ejb.removeLibro(l1);
        ejb.removeLibro(l2);
        ejb.removeLibro(l3);
    }
    
    
}
