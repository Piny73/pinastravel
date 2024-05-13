package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class AccounTurist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccounturist")
    private Long idAccounTurista;

    @Column(name = "Fname",nullable = false)
    private String nome;

    @Column(name = "Lname",nullable = false)
    private String cognome;

    @Column(name = "Phone",nullable = false)
    private String telefono;

    @Column(name = "Email",nullable = false, unique = true)
    private String email;

    // Getters and Setters
    public Long getId() {
        return idAccounTurista;
    }

    public void setidAccounTurista(Long idAccounTurista) {
        this.idAccounTurista = idAccounTurista;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
