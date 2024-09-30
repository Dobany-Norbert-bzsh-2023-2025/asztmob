package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String user = "test01";
        String password = "titok";
        //mariadb - String url = "jdbc:mariadb://localhost:3306/test01";
        String url = "jdbc:sqlite:database.sqlite";

        //sqlite - database.sqlite created in main directory

        //mariadb - Connection con = DriverManager.getConnection(url, user, password);
        Connection con = DriverManager.getConnection(url);
        Statement stmt = con.createStatement();

        String insertSql = """
                INSERT INTO jarmuvek 
                (rendszam, marka)

                VALUES
                (?,?),
                (?,?),
                (?,?);
                """;
        PreparedStatement pstmt = con.prepareStatement(insertSql);

        pstmt.setString(1,"ABC123");
        pstmt.setString(2,"Opel");
        pstmt.setString(3,"DEF456");
        pstmt.setString(4,"Volkswagen");
        pstmt.setString(5,"GHI789");
        pstmt.setString(6,"Renault");
        pstmt.executeUpdate();
        

        
        
        /* mariadb -
        stmt.execute("CREATE TABLE if not exists jarmuvek (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY (id), rendszam varchar(20), marka varchar(20));");
        stmt.execute("REPLACE INTO jarmuvek (id,rendszam, marka) VALUES (1,'ABC123', 'Opel'), (2,'DEF456', 'Volkswagen'), (3,'GHI789', 'Renault')");*/

        // sqlite - 
        stmt.execute("CREATE TABLE IF NOT EXISTS jarmuvek (id INTEGER NOT NULL PRIMARY KEY, rendszam text, marka text);");
        stmt.execute("REPLACE INTO jarmuvek (id,rendszam, marka) VALUES (1,'ABC123', 'Opel'), (2,'DEF456', 'Volkswagen'), (3,'GHI789', 'Renault');");

        String sql = "SELECT * FROM jarmuvek";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString("rendszam") + " " + rs.getString("marka"));
        }
        con.close();
    }
}