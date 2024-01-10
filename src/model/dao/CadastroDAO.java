package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Login;

public class CadastroDAO {

    public void cadastrarUsuario(String nome_login, String email_login, String senha_login) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO login(nome_login, email_login, senha_login) values('" + nome_login + "','" + email_login + "','" + senha_login + "')";
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.execute();
        ConnectionFactory.closeConnection(con, psmt);
    }

    /*
    public void create(Login p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = con.prepareStatement("INSERT INTO login(nome_login, email_login, senha_login) values(?,?,?)");
            psmt.setString(1, p.getNome_login());
            psmt.setString(2, p.getEmail_login());
            psmt.setString(3, p.getSenha_login());
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!!!" + e);
        } finally {
            ConnectionFactory.closeConnection(con, psmt);
        }
    }*/
}
