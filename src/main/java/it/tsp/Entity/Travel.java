package it.tsp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTravel")
    private Long idViaggio;

    @Column(name = "Destination",nullable = false)
    private String città;

    @Column(name = "Length",nullable = false)
    private String durata;

    @Column(name = "DayPrice",nullable = false, precision = 10, scale = 2)
    private BigDecimal prezzo;

    @Column(name = "Carriage",nullable = false)
    private String trasporto;

    @Column(name = "DepartureDate",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime datapartenza;

    public Travel(String text, int int1, float float1, String text2, String text3) {
        //TODO Auto-generated constructor stub
    }

    // Getters and Setters
    public Long getId() {
        return idViaggio;
    }

    public void setId(Long idViaggio) {
        this.idViaggio = idViaggio;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getTrasporto() {
        return trasporto;
    }

    public void setTrasporto(String trasporto) {
        this.trasporto = trasporto;
    }

    public LocalDateTime getDatapartenza() {
        return datapartenza;
    }

    public void setDatapartenza(LocalDateTime datapartenza) {
        this.datapartenza = datapartenza;
    }
}
