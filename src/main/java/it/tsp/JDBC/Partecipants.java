/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tsp.JDBC;

/**
 *
 * @author utentepc
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    // Metodi per l'insert, update e select
    public static void insert(Partecipants partecipants) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO partecipants (id_partecipante, id_accoun_turista, id_viaggio) VALUES (?, ?, ?)");
        stmt.setLong(1, partecipants.getIdPartecipante());
        stmt.setLong(2, partecipants.getIdAccounTurista());
        stmt.setLong(3, partecipants.getIdViaggio());
        stmt.executeUpdate();
        conn.close();
    }

    public static List<Partecipants> selectAll() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM partecipants");
        List<Partecipants> partecipantsList = new ArrayList<>();
        while (rs.next()) {
            Partecipants partecipant = new Partecipants(
                    rs.getLong("id_partecipante"),
                    rs.getLong("id_accoun_turista"),
                    rs.getLong("id_viaggio")
            );
            partecipantsList.add(partecipant);
        }
        conn.close();
        return partecipantsList;
    }

    public static void update(Partecipants partecipants) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        PreparedStatement stmt = conn.prepareStatement("UPDATE partecipants SET id_partecipante=?, id_accoun_turista=?, id_viaggio=? WHERE id_partecipante=?");
        stmt.setLong(1, partecipants.getIdPartecipante());
        stmt.setLong(2, partecipants.getIdAccounTurista());
        stmt.setLong(3, partecipants.getIdViaggio());
        stmt.setLong(4, partecipants.getIdPartecipante());
        stmt.executeUpdate();
        conn.close();
    }

    public static void delete(Partecipants partecipants) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM partecipants WHERE id_partecipante=?");
        stmt.setLong(1, partecipants.getIdPartecipante());
        stmt.executeUpdate();
        conn.close();
    }
}
