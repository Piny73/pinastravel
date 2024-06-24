package it.tsp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


@Entity
@Table (name = "partecipants")
public class Partecipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPartecipants")
    private Long idPartecipante;

    @Column(name = "idAccounturist")
    private Long idAccounTurista;

    @Column(name = "idTravel")
    private Long idViaggio;

    public Long getIdPartecipante() {
        return idPartecipante;
    }

    public void setIdPartecipante(Long idPartecipante) {
        this.idPartecipante = idPartecipante;
    }

    public Long getIdAccounTurista() {
        return idAccounTurista;
    }

    public void setIdAccounTurista(Long idAccounTurista) {
        this.idAccounTurista = idAccounTurista;
    }

    public Long getIdViaggio() {
        return idViaggio;
    }

    public void setIdViaggio(Long idViaggio) {
        this.idViaggio = idViaggio;
    }

    public Partecipants(Long idPartecipante, Long idAccounTurista, Long idViaggio) {
        this.idPartecipante = idPartecipante;
        this.idAccounTurista = idAccounTurista;
        this.idViaggio = idViaggio;
    }

    public Partecipants(int int1, int int2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPartecipante == null) ? 0 : idPartecipante.hashCode());
        result = prime * result + ((idAccounTurista == null) ? 0 : idAccounTurista.hashCode());
        result = prime * result + ((idViaggio == null) ? 0 : idViaggio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Partecipants other = (Partecipants) obj;
        if (idPartecipante == null) {
            if (other.idPartecipante != null)
                return false;
        } else if (!idPartecipante.equals(other.idPartecipante))
            return false;
        if (idAccounTurista == null) {
            if (other.idAccounTurista != null)
                return false;
        } else if (!idAccounTurista.equals(other.idAccounTurista))
            return false;
        if (idViaggio == null) {
            if (other.idViaggio != null)
                return false;
        } else if (!idViaggio.equals(other.idViaggio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Partecipants [idPartecipante=" + idPartecipante + ", idAccounTurista=" + idAccounTurista
                + ", idViaggio=" + idViaggio + ", getIdPartecipante()=" + getIdPartecipante()
                + ", getIdAccounTurista()=" + getIdAccounTurista() + ", getIdViaggio()=" + getIdViaggio()
                + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
                + "]";
    }

}
