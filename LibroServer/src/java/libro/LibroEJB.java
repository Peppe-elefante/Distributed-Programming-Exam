/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package libro;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author ACER
 */

@WebService
@Stateless
@LocalBean
public class LibroEJB implements LibroEJBRemote {
    @Inject EntityManager em;
    
    public void saveLibro(LibroEntity l){
        em.persist(l);
    }
    
    public void removeLibro(LibroEntity l){
        
        em.remove(em.merge(l));
    }
    
    public List<LibroEntity> trovaTutti(){
        return em.createNamedQuery("FindAll", LibroEntity.class).getResultList();
    }
    
    public List<LibroEntity> trovaNome(String titolo){
        return em.createNamedQuery("FindTitolo", LibroEntity.class).setParameter("titolo", titolo).getResultList();
    }
    
    public LibroEntity trovaId(Long id){
        return em.find(LibroEntity.class, id);
    }
    
    public void updateLibro(LibroEntity l){
        em.merge(l);
    }
    
    @WebMethod
    public String[] libroService(long id){
        LibroEntity l = trovaId(id);
        if(l != null){
        return new String[]{l.getTitolo(), l.getAutore()};
        }
        else{
            return new String[]{"",""};
        }
    }
    
}
