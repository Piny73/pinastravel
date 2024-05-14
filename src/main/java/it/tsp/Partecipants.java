/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tsp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author utentepc
 */
public class Partecipants {

    private String nome;
    private String cognome;
    private String telefono;    
    private String città;
    private LocalDateTime dataPartenza;
    private BigDecimal prezzofinale;

    public Partecipants(String nome, String cognome, String città) {
        this.nome = nome;
        this.cognome = cognome;
        this.città = città;
    }
    
    public Partecipants(String nome, String cognome, String telefono, String città, LocalDateTime dataPartenza, BigDecimal prezzofinale) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.città = città;
        this.dataPartenza = dataPartenza;
        this.prezzofinale = prezzofinale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public LocalDateTime getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(LocalDateTime dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public BigDecimal getPrezzofinale() {
        return prezzofinale;
    }

    public void setPrezzofinale(BigDecimal prezzofinale) {
        this.prezzofinale = prezzofinale;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.cognome);
        hash = 29 * hash + Objects.hashCode(this.telefono);
        hash = 29 * hash + Objects.hashCode(this.città);
        hash = 29 * hash + Objects.hashCode(this.dataPartenza);
        hash = 29 * hash + Objects.hashCode(this.prezzofinale);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partecipants other = (Partecipants) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.città, other.città)) {
            return false;
        }
        if (!Objects.equals(this.dataPartenza, other.dataPartenza)) {
            return false;
        }
        return Objects.equals(this.prezzofinale, other.prezzofinale);
    }

    @Override
    public String toString() {
        return "Partecipants{" + "nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", citt\u00e0=" + città + ", dataPartenza=" + dataPartenza + ", prezzofinale=" + prezzofinale + '}';
    }

}
