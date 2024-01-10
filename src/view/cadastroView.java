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

/**
 *
 * @author engen
 */
public class cadastroView extends javax.swing.JFrame {

    /**
     * Creates new form cadastroView
     */
    public cadastroView() {
        initComponents();
        jPanel1.setFocusable(true);

        //a linha abaixo troca o ícone jo java pela imagem salva no pacote imagens
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/red.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        btnVoltarTelaCadastro = new javax.swing.JButton();
        txtConfirmaSenhaTelCadastro = new javax.swing.JPasswordField();
        txtNomeTelaCadastro = new javax.swing.JTextField();
        txtEmailTelaCadastro = new javax.swing.JTextField();
        txtSenhaTelaCadastro = new javax.swing.JPasswordField();
        lblCadastroLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela  Cadastro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setBorder(null);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 100, 30));

        btnVoltarTelaCadastro.setBorder(null);
        btnVoltarTelaCadastro.setContentAreaFilled(false);
        btnVoltarTelaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarTelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        txtConfirmaSenhaTelCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConfirmaSenhaTelCadastro.setForeground(new java.awt.Color(153, 153, 153));
        txtConfirmaSenhaTelCadastro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmaSenhaTelCadastro.setText("Confirme aqui sua Senha");
        txtConfirmaSenhaTelCadastro.setBorder(null);
        txtConfirmaSenhaTelCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmaSenhaTelCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmaSenhaTelCadastroFocusLost(evt);
            }
        });
        getContentPane().add(txtConfirmaSenhaTelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 240, 20));

        txtNomeTelaCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNomeTelaCadastro.setForeground(new java.awt.Color(153, 153, 153));
        txtNomeTelaCadastro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeTelaCadastro.setText("Digite aqui seu Nome");
        txtNomeTelaCadastro.setBorder(null);
        txtNomeTelaCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeTelaCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeTelaCadastroFocusLost(evt);
            }
        });
        getContentPane().add(txtNomeTelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 240, 30));

        txtEmailTelaCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmailTelaCadastro.setForeground(new java.awt.Color(153, 153, 153));
        txtEmailTelaCadastro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmailTelaCadastro.setText("Digite aqui seu E-mail");
        txtEmailTelaCadastro.setBorder(null);
        txtEmailTelaCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailTelaCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailTelaCadastroFocusLost(evt);
            }
        });
        getContentPane().add(txtEmailTelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 240, 30));

        txtSenhaTelaCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenhaTelaCadastro.setForeground(new java.awt.Color(153, 153, 153));
        txtSenhaTelaCadastro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaTelaCadastro.setText("Digite aqui sua Senha");
        txtSenhaTelaCadastro.setBorder(null);
        txtSenhaTelaCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaTelaCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaTelaCadastroFocusLost(evt);
            }
        });
        getContentPane().add(txtSenhaTelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 240, 30));

        lblCadastroLogin.setForeground(new java.awt.Color(153, 153, 153));
        lblCadastroLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro_imagem.png"))); // NOI18N
        getContentPane().add(lblCadastroLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:]
        //abaixo o método para chamar o controler que realizará o cadastro

      /*  LoginController cadastro = new LoginController();
        loginView voltarTelaLogin = new loginView();
        if (txtNomeTelaCadastro.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório ser preenchido!!!");
        } else if (txtEmailTelaCadastro.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo email é obrigatório ser preenchido!!!");
        } else if (txtSenhaTelaCadastro.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Senha é obrigatório ser preenchido!!!");
        } else if (txtConfirmaSenhaTelCadastro.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Confirmar Senha é obrigatório ser preenchido!!!");
        } else {
            try {

                cadastro.cadastroUsuario(this);
                cadastro.limparTelaDeCadastro(this);
                voltarTelaLogin.setVisible(true);
                dispose();

            } catch (SQLException ex) {
                Logger.getLogger(cadastroView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
      //abaixo código novo inserido em 10 de março 2023
      LoginController cadastro = new LoginController();
        loginView voltarTelaLogin = new loginView();

        if (txtNomeTelaCadastro.getText().toString().equals("") || txtNomeTelaCadastro.getText().toString().equals("Digite aqui seu Nome")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório ser preenchido!!!");
        } else if (txtEmailTelaCadastro.getText().toString().equals("") || txtEmailTelaCadastro.getText().toString().equals("Digite aqui seu E-mail")) {
            JOptionPane.showMessageDialog(null, "Campo email é obrigatório ser preenchido!!!");
        } else if (txtSenhaTelaCadastro.getText().toString().equals("") || txtSenhaTelaCadastro.getText().toString().equals("Digite aqui sua Senha")) {
            JOptionPane.showMessageDialog(null, "Campo Senha é obrigatório ser preenchido!!!");
        } else if (txtConfirmaSenhaTelCadastro.getText().toString().equals("") || txtConfirmaSenhaTelCadastro.getText().toString().equals("Confirme aqui sua Senha")) {
            JOptionPane.showMessageDialog(null, "Campo Confirmar Senha é obrigatório ser preenchido!!!");
            //esta linha abaixo compara o conteúdo das texts passwords e confirma se são iguais se for entra no try senão vai pro else "senhas não conferem"
        } else if (txtSenhaTelaCadastro.getText().equals(txtConfirmaSenhaTelCadastro.getText())) {
            // JOptionPane.showMessageDialog(null, "Senhas conferem!");   
            try {

                cadastro.cadastroUsuario(this);
                cadastro.limparTelaDeCadastro(this);
                voltarTelaLogin.setVisible(true);
                dispose();

            } catch (SQLException ex) {
                Logger.getLogger(cadastroView.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Senhas não conferem!");

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaCadastroActionPerformed
        // TODO add your handling code here:
        loginView voltarTelaLogin = new loginView();
        voltarTelaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarTelaCadastroActionPerformed

    private void txtNomeTelaCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeTelaCadastroFocusGained
        // TODO add your handling code here:
        if (txtNomeTelaCadastro.getText().equals("Digite aqui seu Nome")) {
            //abaixo a primeira linha somente letras inserido im 10 de março 2023
            txtNomeTelaCadastro.setDocument(new somenteLetras());
            txtNomeTelaCadastro.setText("");

        }
        txtNomeTelaCadastro.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNomeTelaCadastroFocusGained

    private void txtNomeTelaCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeTelaCadastroFocusLost
        // TODO add your handling code here:
        if (txtNomeTelaCadastro.getText().equals("")) {

            txtNomeTelaCadastro.setText("Digite aqui seu Nome");

        }
        txtNomeTelaCadastro.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtNomeTelaCadastroFocusLost

    private void txtEmailTelaCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailTelaCadastroFocusGained
        // TODO add your handling code here:
        if (txtEmailTelaCadastro.getText().equals("Digite aqui seu E-mail")) {

            txtEmailTelaCadastro.setText("");

        }
        txtEmailTelaCadastro.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEmailTelaCadastroFocusGained

    private void txtEmailTelaCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailTelaCadastroFocusLost
        // TODO add your handling code here:
        if (txtEmailTelaCadastro.getText().equals("")) {

            txtEmailTelaCadastro.setText("Digite aqui seu E-mail");

        }
        txtEmailTelaCadastro.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtEmailTelaCadastroFocusLost

    private void txtSenhaTelaCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaTelaCadastroFocusGained
        // TODO add your handling code here:
        if (txtSenhaTelaCadastro.getText().equals("Digite aqui sua Senha")) {

            txtSenhaTelaCadastro.setText("");
        }
        txtSenhaTelaCadastro.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSenhaTelaCadastroFocusGained

    private void txtSenhaTelaCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaTelaCadastroFocusLost
        // TODO add your handling code here:
        if (txtSenhaTelaCadastro.getText().equals("")) {

            txtSenhaTelaCadastro.setText("Digite aqui sua Senha");

        }
        txtSenhaTelaCadastro.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtSenhaTelaCadastroFocusLost

    private void txtConfirmaSenhaTelCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmaSenhaTelCadastroFocusGained
        // TODO add your handling code here:
        if (txtConfirmaSenhaTelCadastro.getText().equals("Confirme aqui sua Senha")) {

            txtConfirmaSenhaTelCadastro.setText("");
        }
        txtConfirmaSenhaTelCadastro.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtConfirmaSenhaTelCadastroFocusGained

    private void txtConfirmaSenhaTelCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmaSenhaTelCadastroFocusLost
        // TODO add your handling code here:
        if (txtConfirmaSenhaTelCadastro.getText().equals("")) {

            txtConfirmaSenhaTelCadastro.setText("Confirme aqui sua Senha");
        }
        txtConfirmaSenhaTelCadastro.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtConfirmaSenhaTelCadastroFocusLost

    public JPasswordField getTxtConfirmaSenhaTelCadastro() {
        return txtConfirmaSenhaTelCadastro;
    }

    public void setTxtConfirmaSenhaTelCadastro(JPasswordField txtConfirmaSenhaTelCadastro) {
        this.txtConfirmaSenhaTelCadastro = txtConfirmaSenhaTelCadastro;
    }

    public JTextField getTxtEmailTelaCadastro() {
        return txtEmailTelaCadastro;
    }

    public void setTxtEmailTelaCadastro(JTextField txtEmailTelaCadastro) {
        this.txtEmailTelaCadastro = txtEmailTelaCadastro;
    }

    public JTextField getTxtNomeTelaCadastro() {
        return txtNomeTelaCadastro;
    }

    public void setTxtNomeTelaCadastro(JTextField txtNomeTelaCadastro) {
        this.txtNomeTelaCadastro = txtNomeTelaCadastro;
    }

    public JPasswordField getTxtSenhaTelaCadastro() {
        return txtSenhaTelaCadastro;
    }

    public void setTxtSenhaTelaCadastro(JPasswordField txtSenhaTelaCadastro) {
        this.txtSenhaTelaCadastro = txtSenhaTelaCadastro;
    }

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
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroView().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarTelaCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastroLogin;
    private javax.swing.JPasswordField txtConfirmaSenhaTelCadastro;
    private javax.swing.JTextField txtEmailTelaCadastro;
    private javax.swing.JTextField txtNomeTelaCadastro;
    private javax.swing.JPasswordField txtSenhaTelaCadastro;
    // End of variables declaration//GEN-END:variables
}
