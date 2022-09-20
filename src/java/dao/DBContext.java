package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sap-lap
 */
public class DBContext {

    private final String serverName ="localHost";
    private final String portName ="1433";
    private final String dbName = "SNG";
    private final String user = "sa";
    private final String password = "123456";

    public Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://"+serverName+":"+portName+"; databaseName = "
                +dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url,user,password);
    }

}
