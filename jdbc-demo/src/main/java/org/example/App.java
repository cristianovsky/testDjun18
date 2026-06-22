package org.example;
import org.example.entity.Client;
import org.example.config.ConexionBD;
import org.example.dao.ClientDao;

import java.sql.*;
import org.h2.tools.Server;
import java.util.ArrayList;
import java.util.List;



public class App {
  public static void main(String[] args) throws SQLException {

    Connection con = ConexionBD.getConnection();
    Server h2Server = Server.createWebServer("-webAllowOthers").start();
    List<Client> clientes = new ArrayList<>();
    
    Client client1 = new Client(4, "Luis");
    ClientDao clientDao = new ClientDao();
    
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM CLIENTES"); 

    while(rs.next()){
      System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));

    }

    con.close();
    h2Server.stop();
}
}