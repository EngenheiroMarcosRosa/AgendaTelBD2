package controller;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.dao.CadastroDAO;
import view.cadastroView;
import model.bean.Login;
import model.dao.LoginDAO;
import view.ViewJTable;
import view.loginView;

public class LoginController {

    private loginView view;

    //  public LoginController(loginView view){
    //   this.view = view;
    // }
    public LoginController(ViewJTable view) {

    }

    public LoginController(loginView view) {
        this.view = view;
    }

    public LoginController() {

    }

    public void cadastroUsuario(cadastroView view) throws SQLException {

        Connection con = ConnectionFactory.getConnection();

        CadastroDAO cadastro = new CadastroDAO();

        cadastro.cadastrarUsuario(view.getTxtNomeTelaCadastro().getText(), view.getTxtEmailTelaCadastro().getText(), view.getTxtSenhaTelaCadastro().getText());
    }

    public void limpaTelaLogin(loginView view) {

        view.getTxtNomeLogin().setText("");
        view.getTxtSenhaTelaLogin().setText("");

    }

    public void limparTelaViewJTable(ViewJTable view) {

        view.getTxtNome().setText("");
        view.getTxtDDD().setText("");
        view.getTxtPesquisaNome().setText("");
        view.getTxtTelefone().setText("");
    }

    public void limparTelaDeCadastro(cadastroView view) {

        view.getTxtNomeTelaCadastro().setText("");
        view.getTxtEmailTelaCadastro().setText("");
        view.getTxtSenhaTelaCadastro().setText("");
        view.getTxtConfirmaSenhaTelCadastro().setText("");

    }

    public void autenticar(loginView view) throws SQLException {

        String nome = view.getTxtNomeLogin().getText();
        String senha = view.getTxtSenhaTelaLogin().getText();
        //  System.out.println(nome+" "+senha);
        Login usuarioAutenticar = new Login(nome, senha);

        Connection con = ConnectionFactory.getConnection();

        LoginDAO objLoginDAO = new LoginDAO();

        System.out.println(con);

        boolean existe = objLoginDAO.existeUsuarioEsenhaNoBancoDeDados(usuarioAutenticar);

        if (existe) {

            ViewJTable telaView = new ViewJTable();
            System.out.println(existe);
            telaView.setVisible(existe);
            view.setVisible(false);
        } else {

            JOptionPane.showMessageDialog(null, "Usuário não encontrado no banco de Dados!!! ");

        }

    }

}
