package it.tsp.JDBC;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author utentepc
 */
public class Travel {
   private String città;
   private String durata;
   private BigDecimal prezzo;
   private String trasporto;
   private LocalDateTime datapartenza;

    public Travel(String città, String durata, BigDecimal prezzo, String trasporto, LocalDateTime datapartenza) {
        this.città = città;
        this.durata = durata;
        this.prezzo = prezzo;
        this.trasporto = trasporto;
        this.datapartenza = datapartenza;
    }


    public String getCittà() {
        return città;
    }

    public LocalDateTime getDatapartenza() {
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

    public void setDatapartenza(LocalDateTime datapartenza) {
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