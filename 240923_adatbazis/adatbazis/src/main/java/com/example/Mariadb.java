package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Mariadb implements iDatabase {
    @Override
    public Connection connectDb(){
        Connection conn = null;
        try {
            conn = tryConnectDb();
        }catch(SQLException e) {
            System.err.println("Hiba! A kapcsolódás sikertelen");
            System.err.println(e.getMessage());
        }
        return conn;
    }
    
    private Connection tryConnectDb() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/surubt";
        return DriverManager.getConnection(url, 
                "surubt", "titok");

        
    }    
    @Override
    public void closeDb(Connection conn){        
        try {
            tryCloseDb(conn);
        }catch(SQLException e) {
            System.err.println("Hiba! A kapcsolat zárása sikertelen!");
            System.err.println(e.getMessage());
        }
    }
    private void tryCloseDb(Connection conn) throws SQLException {
        conn.close();
    }
    
}
