/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
/**
 *
 * @author Onur Eğe
 */
public class DBConn {
    
    private static DBConn dbconn;
    
    private Connection conn;
    
    // fill here
    String url = "";
    String uname = "";
    String password = "";

    private DBConn() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,uname,password);
    }
    
    public static DBConn getInstance() throws ClassNotFoundException, SQLException{
        
        if (dbconn == null){
            dbconn = new DBConn();
        }
        return dbconn;
    }
    
    public Connection getConnection(){
        return conn;
    }  
}
