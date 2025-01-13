/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionRemote.java to edit this template
/**
 *
 * @author ACER
 */
package libro;

import jakarta .ejb.Remote;
import java.util.List;

/**
 *
 * @author ACER
 */
@Remote
public interface LibroEJBRemote {
    
    public void saveLibro(LibroEntity l);
    public void removeLibro(LibroEntity l);
    public List<LibroEntity> trovaTutti();
    public LibroEntity trovaId(Long id);
    public List<LibroEntity> trovaNome(String titolo);
    public void updateLibro(LibroEntity l);
    
}