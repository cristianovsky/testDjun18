package org.example.dao;
import org.example.entity.Client;
import org.example.config.ConexionBD;

import java.sql.*;

public class ClientDao {

    public ClientDao(Client client) {
        try {
            insertClient(client);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Insertar cliente
    public void insertClient(Client client) throws SQLException {
        // Lógica para insertar un cliente en la base de datos
        String sql = "INSERT INTO CLIENTES (id, nombre) VALUES (?, ?)";
        Connection con = ConexionBD.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, client.getId());
        st.setString(2, client.getNombre());
        st.executeUpdate();

        st.close();
    }

}
