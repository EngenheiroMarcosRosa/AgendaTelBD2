/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LoginController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.bean.Login;

/**
 *
 * @author engen
 */
public class loginView extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form loginView
     */
    public loginView() {
        initComponents();

        jPanel1.setFocusable(true);

        controller = new LoginController((this));

        txtNomeLogin.setToolTipText("DIGITE AQUI SEU NOME->");
        txtSenhaTelaLogin.setToolTipText("DIGITE AQUI SUA SENHA->");

        //a linha abaixo troca o ícone jo java pela imagem salva no pacote imagens
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/red.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrarLogin = new javax.swing.JButton();
        btnChamarTelaDeCadastro = new javax.swing.JButton();
        txtNomeLogin = new javax.swing.JTextField();
        txtSenhaTelaLogin = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrarLogin.setBorder(null);
        btnEntrarLogin.setContentAreaFilled(false);
        btnEntrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 393, 100, 30));

        btnChamarTelaDeCadastro.setBorder(null);
        btnChamarTelaDeCadastro.setContentAreaFilled(false);
        btnChamarTelaDeCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChamarTelaDeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamarTelaDeCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnChamarTelaDeCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 160, 20));

        txtNomeLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtNomeLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeLogin.setText("Digite aqui seu Nome");
        txtNomeLogin.setBorder(null);
        txtNomeLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeLoginFocusLost(evt);
            }
        });
        getContentPane().add(txtNomeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 240, 30));

        txtSenhaTelaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenhaTelaLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtSenhaTelaLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaTelaLogin.setText("Digite aqui sua Senha");
        txtSenhaTelaLogin.setBorder(null);
        txtSenhaTelaLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaTelaLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaTelaLoginFocusLost(evt);
            }
        });
        getContentPane().add(txtSenhaTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 240, 30));

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login_imagem.png"))); // NOI18N
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChamarTelaDeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamarTelaDeCadastroActionPerformed
        // TODO add your handling code here:
        // o código abaixo instância uma nova "cadastro view" com um objeto novo chamado "chamaTelaDeCadastro"
        cadastroView chamaTelaDeCadastro = new cadastroView();
        //o código abaixo chama o novo objeto criado e seta ele como visível ou seja abre(chama ou invoca) a tela de cadastro
        chamaTelaDeCadastro.setVisible(true);
        //o código abaixo oculta a tela que esta chamando a proxima pois como estamos na tela login view usamos this para referenciá-la não sendo necessário instanciá-la
        this.setVisible(false);
    }//GEN-LAST:event_btnChamarTelaDeCadastroActionPerformed

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        /*if (txtNomeLogin.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório ser preenchido!!!");
        } else if (txtSenhaTelaLogin.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Senha é obrigatório ser preenchido!!!");
        } else {
            try {
                controller.autenticar(this);

            } catch (SQLException ex) {
                Logger.getLogger(loginView.class.getName()).log(Level.SEVERE, null, ex);

            }
            controller.limpaTelaLogin(this);
        }*/
        
        //abaixo linhas novas inseridas em 10 de março 2023
        if (txtNomeLogin.getText().toString().equals("") || txtNomeLogin.getText().toString().equals("Digite aqui seu Nome")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório ser preenchido!!!");
        } else if (txtSenhaTelaLogin.getText().toString().equals("") || txtSenhaTelaLogin.getText().toString().equals("Digite aqui sua Senha")) {
            JOptionPane.showMessageDialog(null, "Campo Senha é obrigatório ser preenchido!!!");
        } else {
            try {
                controller.autenticar(this);

            } catch (SQLException ex) {
                Logger.getLogger(loginView.class.getName()).log(Level.SEVERE, null, ex);

            }
            controller.limpaTelaLogin(this);
        }
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

    private void txtNomeLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeLoginFocusGained
        // TODO add your handling code here:
        if (txtNomeLogin.getText().equals("Digite aqui seu Nome")) {
            //abaixo a primeira linha inserida em 10 de março 2023
            txtNomeLogin.setDocument(new somenteLetras());
            txtNomeLogin.setText("");

        }
        txtNomeLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNomeLoginFocusGained

    private void txtNomeLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeLoginFocusLost
        // TODO add your handling code here:
        if (txtNomeLogin.getText().equals("")) {

            txtNomeLogin.setText("Digite aqui seu Nome");

        }
        txtNomeLogin.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtNomeLoginFocusLost

    private void txtSenhaTelaLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaTelaLoginFocusGained
        // TODO add your handling code here:
        if (txtSenhaTelaLogin.getText().equals("Digite aqui sua Senha")) {

            txtSenhaTelaLogin.setText("");
        }
        txtSenhaTelaLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSenhaTelaLoginFocusGained

    private void txtSenhaTelaLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaTelaLoginFocusLost
        // TODO add your handling code here:
        if (txtSenhaTelaLogin.getText().equals("")) {

            txtSenhaTelaLogin.setText("Digite aqui sua Senha");
        }
        txtSenhaTelaLogin.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtSenhaTelaLoginFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginView().setVisible(true);
            }
        });
    }

    public JTextField getTxtNomeLogin() {
        return txtNomeLogin;
    }

    public void setTxtNomeLogin(JTextField txtNomeLogin) {
        this.txtNomeLogin = txtNomeLogin;
    }

    public JPasswordField getTxtSenhaTelaLogin() {
        return txtSenhaTelaLogin;
    }

    public void setTxtSenhaTelaLogin(JPasswordField txtSenhaTelaLogin) {
        this.txtSenhaTelaLogin = txtSenhaTelaLogin;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChamarTelaDeCadastro;
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtNomeLogin;
    private javax.swing.JPasswordField txtSenhaTelaLogin;
    // End of variables declaration//GEN-END:variables
}
