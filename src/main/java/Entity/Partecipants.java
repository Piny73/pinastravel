package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "partecipants")
public class Partecipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPartecipants")
    private Long id;

    @Column(name = "Fname", nullable = false)
    private String nome;

    @Column(name = "Lname",nullable = false)
    private String cognome;

    @Column(name = "Phone",nullable = false)
    private String telefono;

    @Column(name = "Destination",nullable = false)
    private String città;

    @Column(name = "DepartureDate", nullable = false)
    private LocalDateTime dataPartenza;

    @Column(name = "TotalPrice", nullable = false, precision = 10, scale = 2)
    private BigDecimal prezzofinale;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
