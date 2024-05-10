/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tsp;
import java.math.BigDecimal;
import java.time.LocalDate;
/**
 *
 * @author utentepc
 */
public class Travel {
   private String città;
   private String durata;
   private BigDecimal prezzo;
   private String trasporto;
   private LocalDate datapartenza;

    public Travel(String città, String durata, BigDecimal prezzo, String trasporto, LocalDate datapartenza) {
        this.città = città;
        this.durata = durata;
        this.prezzo = prezzo;
        this.trasporto = trasporto;
        this.datapartenza = datapartenza;
    }

    public String getCittà() {
        return città;
    }

    public LocalDate getDatapartenza() {
        return datapartenza;
    }

    public String getDurata() {
        return durata;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public String getTrasporto() {
        return trasporto;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setDatapartenza(LocalDate datapartenza) {
        this.datapartenza = datapartenza;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setTrasporto(String trasporto) {
        this.trasporto = trasporto;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
}

