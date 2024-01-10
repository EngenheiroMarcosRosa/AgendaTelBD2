package model.dao;

import connection.ConnectionFactory;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import model.bean.Table;

public class TableDAO {

    //private boolean[] canEdit;
    public void create(Table p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = con.prepareStatement("INSERT INTO tabela(nome,ddd,tel) values(?,?,?)");
            psmt.setString(1, p.getNome());
            psmt.setString(2, p.getDdd());
            psmt.setString(3, p.getTel());
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!!!" + e);
        } finally {
            ConnectionFactory.closeConnection(con, psmt);
        }
    }

    public List<Table> read() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        List<Table> produtos = new ArrayList<>();
        try {
            psmt = con.prepareStatement("SELECT * FROM tabela");
            rs = psmt.executeQuery();
            while (rs.next()) {
                Table produto = new Table();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDdd(rs.getString("ddd"));
                produto.setTel(rs.getString("tel"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, psmt, rs);
        }
        return produtos;
    }

    public void update(Table p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = con.prepareStatement("UPDATE tabela SET nome=?, ddd=?, tel=? WHERE id=?");
            psmt.setString(1, p.getNome());
            psmt.setString(2, p.getDdd());
            psmt.setString(3, p.getTel());
            psmt.setInt(4, p.getId());
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!!!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o banco de dados" + e);
        } finally {
            ConnectionFactory.closeConnection(con, psmt);
        }
    }

    public void delete(Table p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement psmt = null;
        int op = 1;
        op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir", "EXCLUIR???", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (op == 0) {

            try {
                psmt = con.prepareStatement("DELETE FROM tabela WHERE id=?");
                psmt.setInt(1, p.getId());
                psmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Exccluído com Sucesso!!!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao exlcuir!!!" + e);

            } finally {
                ConnectionFactory.closeConnection(con, psmt);

            }

        } else {
            ConnectionFactory.closeConnection(con, psmt);
        }

    }

    public List<Table> readForDesc(String desc) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        List<Table> produtos = new ArrayList<>();
        try {
            psmt = con.prepareStatement("SELECT * FROM tabela WHERE nome LIKE? OR ddd LIKE? OR tel LIKE?");
            psmt.setString(1, desc + "%");
            psmt.setString(2, "%" + desc + "%");
            psmt.setString(3, "%" + desc + "%");
            rs = psmt.executeQuery();
            while (rs.next()) {
                Table produto = new Table();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDdd(rs.getString("ddd"));
                produto.setTel(rs.getString("tel"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura!!!" + e);
        } finally {
            ConnectionFactory.closeConnection(con, psmt, rs);
        }
        return produtos;
    }

}
