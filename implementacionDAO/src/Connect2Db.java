import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect2Db {
    private static Connect2Db connectInstance;
    private Connection conn;
    private final String URL= "jdbc:sqlite:base1.db";
    private final String USER= "user";
    private final String PASSWORD= "password";
    private Connect2Db(){
        try {
            conn= DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado!");
        } catch (SQLException e) {
            Logger.getLogger(Connect2Db.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            System.out.println("ok");
        }
    }
    
    public static Connect2Db getInstance(){
        if (connectInstance == null ){
            connectInstance = new Connect2Db();
        }
        return connectInstance;
    }
       
    public Connection getConn(){
        return conn;
    }
    
}
