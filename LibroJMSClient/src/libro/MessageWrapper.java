/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class MessageWrapper implements Serializable {
    private String titolo;
    private String autore;
    private String collocazione;

    public MessageWrapper(String titolo, String autore, String collocazione) {
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
    
    
}
