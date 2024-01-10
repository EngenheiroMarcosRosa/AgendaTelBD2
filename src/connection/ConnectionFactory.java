
package connection;

import java.sql.*;
import java.util.logging.*;


public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/agenda";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão",e);
        }
        
    }
    public static void closeConnection(Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    public static void closeConnection (Connection con, PreparedStatement psmt){
        closeConnection(con);
        try {
            if(psmt !=null){
                psmt.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    public static void closeConnection (Connection con, PreparedStatement psmt, ResultSet rs){
        closeConnection(con, psmt);
        try {
            if(rs !=null){
                rs.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null, e);
        }
    }
}
