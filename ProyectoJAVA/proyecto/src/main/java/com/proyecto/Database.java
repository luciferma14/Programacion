package com.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database{
    private static String driv = "com.mysql.jdbc.Driver";
    private static String bibl = "jdbc:mysql:33006/Biblioteca";
    private static String usr= "root";
    private static String pass = "dbrootpass";	

    private Database(){

    }

    private void conect(){
        try{
            Connection con = DriverManager.getConnection(bibl,usr,pass);	
        }catch(SQLException e){
        }
    }
    public static Connection getDBConnection() throws SQLException {
        Connection con = DriverManager.getConnection(bibl,usr,pass);

        try {
        	Class.forName(driv);

        } catch (ClassNotFoundException exception) {
        }

        try {
        	con = DriverManager.getConnection(bibl, usr, pass);
        	return con;
        } catch (SQLException e) {
    
            return con;
        
        }
    }
}