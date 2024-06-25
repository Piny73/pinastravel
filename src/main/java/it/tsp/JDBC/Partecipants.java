
package it.tsp.JDBC;

public class Partecipants {
    private Long idPartecipante;
    private Long idAccounTurista;
    private Long idViaggio;

    public Partecipants(Long idPartecipante, Long idAccounTurista, Long idViaggio) {
        this.idPartecipante = idPartecipante;
        this.idAccounTurista = idAccounTurista;
        this.idViaggio = idViaggio;
    }

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

    /*public static void delete(Partecipants partecipants) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM partecipants WHERE id_partecipante=?");
        stmt.setLong(1, partecipants.getIdPartecipante());
        stmt.executeUpdate();
        conn.close();
    } */
}