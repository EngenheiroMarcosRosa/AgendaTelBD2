package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Login;

public class LoginDAO {

    //  public LoginDAO(Connection con) {
    // }
    public boolean existeUsuarioEsenhaNoBancoDeDados(Login objLoginDAO) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM login WHERE nome_login ='" + objLoginDAO.getNome_login() + "' AND senha_login ='" + objLoginDAO.getSenha_login() + "'";
        // String sql = "SELECT * FROM login WHERE nome_login = 'teste' AND senha_login = '123456789'";
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.executeQuery();

        ResultSet resultSet = psmt.getResultSet();
        return resultSet.next();

    }

}
