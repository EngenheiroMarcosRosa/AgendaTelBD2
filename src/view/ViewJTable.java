package view;

import controller.LoginController;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.bean.*;
import model.dao.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author engen
 */
public class ViewJTable extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form ViewJTable
     */
    public ViewJTable() throws SQLException {
        initComponents();

        //a linha abaixo centraliza a abertura da tela ao iniciar o sistema
        setLocationRelativeTo(null);
        //as linhas abaixo cancelam o redimensionamento da tela e o maximizar
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        //a linha abaixo troca o ícone jo java pela imagem salva no pacote imagens
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/red.png")).getImage());
        //as linhas abaixo chamam o método somenteNumeros() que bloqueia o teclado de letras nos campos DDD e Telefone 
        txtDDD.setDocument(new somenteNumeros());
        txtTelefone.setDocument(new somenteNumeros());
        //a linha abaixo chama o método somenteLetras() que bloqueia o teclado de numeros e caracteres
        txtNome.setDocument(new somenteLetras());
        //a linha abaixo insere uma caixa de diálogo suspensa no campo onde a seta do muse estiver sobreposto ao movimentarmos o mouse informando uma mensagem inserida
        txtNome.setToolTipText("digite aqui seu nome->..");

        DefaultTableModel modelo = (DefaultTableModel) jTAgenda.getModel();
        jTAgenda.setRowSorter(new TableRowSorter(modelo));
        readJTable();
        controller = new LoginController(this);

    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTAgenda.getModel();
        modelo.setNumRows(0);
        TableDAO pdao = new TableDAO();
        for (Table p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDdd(),
                p.getTel()
            });
        }
    }

    public void readJTableForDesc(String desc) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTAgenda.getModel();
        modelo.setNumRows(0);
        TableDAO pdao = new TableDAO();
        for (Table p : pdao.readForDesc(desc)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDdd(),
                p.getTel()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtPesquisaNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAgenda = new javax.swing.JTable();
        txtDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDA");

        txtNome.setToolTipText("");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME");

        jLabel2.setText("DDD");

        jLabel3.setText("TELEFONE");

        jLabel4.setText("NOME PARA PESQUISA");

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PESQUISAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DDD", "TELEFONE"
            }
        ));
        jTAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAgendaMouseClicked(evt);
            }
        });
        jTAgenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAgendaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTAgenda);

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPesquisaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnLimpar))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // MÉTODO DO BOTÃO BUSCAR:
        try {
            readJTableForDesc(txtPesquisaNome.getText());

            txtPesquisaNome.setText("");
        } catch (SQLException e) {

            Logger.getLogger(ViewJTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // MÉTODO DO BOTÃO DE CADASTRAR:
        Table p = new Table();
        TableDAO dao = new TableDAO();
        if (txtNome.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório ser preenchido!!!");
        } else {
            p.setNome(txtNome.getText());

        }
        if (txtDDD.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo DDD é obrigatório ser preenchido!!!");
        } else {
            p.setDdd(txtDDD.getText());
        }
        if (txtTelefone.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Telefone é obrigatório ser preenchido!!!");
        } else {
            p.setTel(txtTelefone.getText());
            dao.create(p);
            txtNome.setText("");
            txtDDD.setText("");
            txtTelefone.setText("");
            txtPesquisaNome.setText("");
        }

        try {
            readJTable();
        } catch (SQLException e) {
            Logger.getLogger(ViewJTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // MÉTODO DO BOTÃO EXCLUIR:

        if (jTAgenda.getSelectedRow() != -1) {
            Table p = new Table();
            TableDAO dao = new TableDAO();

            p.setId((int) jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 0));
            dao.delete(p);
            txtNome.setText("");
            txtDDD.setText("");
            txtTelefone.setText("");
            try {
                readJTable();
            } catch (SQLException e) {
                Logger.getLogger(ViewJTable.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "o erro esta aqui!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para Excluir!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // MÉTODO DO BOTÃO ATUALIZAR:
        if (jTAgenda.getSelectedRow() != -1) {
            Table p = new Table();
            TableDAO dao = new TableDAO();
            p.setNome(txtNome.getText());
            p.setDdd(txtDDD.getText());
            p.setTel(txtTelefone.getText());
            p.setId((int) jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 0));
            dao.update(p);
            txtNome.setText("");
            txtDDD.setText("");
            txtTelefone.setText("");
            try {
                readJTable();
            } catch (SQLException e) {
                Logger.getLogger(ViewJTable.class.getName()).log(Level.SEVERE, null, e);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    }
    private void jTAgendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAgendaKeyReleased

        if (jTAgenda.getSelectedRow() != -1) {
            txtNome.setText(jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 1).toString());
            txtDDD.setText(jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 2).toString());
            txtTelefone.setText(jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jTAgendaKeyReleased

    private void jTAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAgendaMouseClicked
        // EVENTO DO CLIQUE DO MOUSE:
        if (jTAgenda.getSelectedRow() != -1) {
            txtNome.setText(jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 1).toString());
            txtDDD.setText(jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 2).toString());
            txtTelefone.setText(jTAgenda.getValueAt(jTAgenda.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jTAgendaMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:

        controller.limparTelaViewJTable(this);
        //txtNome.setText("");
        //txtTelefone.setText("");
        //txtDDD.setText("");
        // txtPesquisaNome.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewJTable().setVisible(true);
                } catch (SQLException e) {
                    Logger.getLogger(ViewJTable.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        });
    }

    public JTextField getTxtDDD() {
        return txtDDD;
    }

    public void setTxtDDD(JTextField txtDDD) {
        this.txtDDD = txtDDD;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtPesquisaNome() {
        return txtPesquisaNome;
    }

    public void setTxtPesquisaNome(JTextField txtPesquisaNome) {
        this.txtPesquisaNome = txtPesquisaNome;
    }

    public JTextField getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(JTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAgenda;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
