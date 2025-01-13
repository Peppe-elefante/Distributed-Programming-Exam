/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FindTitolo", query = "Select l from LibroEntity l where l.titolo = :titolo"),
    @NamedQuery(name = "FindStato", query = "Select l from LibroEntity l where l.stato  = :stato"),
    @NamedQuery(name = "FindAll", query = "Select l from LibroEntity l")
})
public class LibroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titolo;
    private String autore;
    private String collocazione;
    private LocalDate data;
    @Nullable
    private int giorniInPrestito;
    
    public LibroEntity(){}

    public LibroEntity(String titolo, String autore, String collocazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.collocazione = collocazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getCollocazione() {
        return collocazione;
    }

    public void setCollocazione(String collocazione) {
        this.collocazione = collocazione;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
    private String stato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Titolo " + titolo + " Autore " + autore + " Genere " + collocazione ;
    }
    
}
