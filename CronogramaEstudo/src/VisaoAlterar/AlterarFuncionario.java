package VisaoAlterar;
import VisaoCadastrar.*;
import DAO.Conexao;
import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import Principal.Opcoes;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class AlterarFuncionario extends javax.swing.JFrame {

    public AlterarFuncionario() {
        initComponents();
        setSize(781,410);
    }
     private void InserirDados(int cod) {
        Connection con = Conexao.AbrirConexao();
        FuncionarioDAO sql = new FuncionarioDAO(con);
        List<Funcionario> lista = new ArrayList<>();
        lista = sql.CapturarUsuario(cod);
        for (Funcionario b : lista) {
            nome.setText("" + b.getNome());
            login.setText("" + b.getLogin());
            senha.setText("" + b.getSenha());
            Fcod.setText(""+ b.getCod());
        }
        Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancelar = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        alterar = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Fcod = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 30, 290, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 780, 10);

        cancelar.setBackground(new java.awt.Color(255, 0, 0));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(600, 260, 120, 40);

        ok.setBackground(new java.awt.Color(204, 204, 204));
        ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(440, 100, 120, 40);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(160, 170, 400, 40);

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 170, 90, 40);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Informe o Cod");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 100, 110, 40);

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        getContentPane().add(cod);
        cod.setBounds(160, 100, 220, 40);

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha);
        senha.setBounds(160, 290, 400, 40);

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Senha:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 290, 90, 40);

        alterar.setBackground(new java.awt.Color(0, 153, 0));
        alterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterar.setText("ALTERAR");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(600, 170, 120, 40);

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(160, 230, 400, 40);

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Login:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 230, 90, 40);

        Fcod.setEditable(false);
        getContentPane().add(Fcod);
        Fcod.setBounds(600, 100, 120, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 780, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
   new Opcoes().setVisible(true);
    dispose();        
    }//GEN-LAST:event_cancelarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String codigo = cod.getText();
        Connection con = Conexao.AbrirConexao();
        FuncionarioDAO sql = new FuncionarioDAO(con);
        int cod = Integer.parseInt(codigo);
        if (sql.TestarUsuario(cod) == false) {
            JOptionPane.showMessageDialog(null, "O código não foi encontrado!", "Cronograma", JOptionPane.WARNING_MESSAGE);
            Conexao.FecharConexao(con);
        }
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código!", "Cronograma", JOptionPane.WARNING_MESSAGE);
        }
        nome.setText("");
        login.setText("");
        Fcod.setText("");
        senha.setText("");
        InserirDados(cod);     
    }//GEN-LAST:event_okActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        String cont = nome.getText();
        String dat = login.getText();
        String h = senha.getText();
        String f = Fcod.getText();
        if (nome.equals("") || login.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode está vazio.", "Cronograma", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            FuncionarioDAO sql = new FuncionarioDAO(con);
            int idF = Integer.parseInt(f);
            Funcionario b = new Funcionario();
            b.setCod(idF);
            b.setNome(cont);
            b.setLogin(dat);
            b.setSenha(h);
            sql.AlterarUsuario(b);
            Conexao.FecharConexao(con);
            nome.setText("");
            Fcod.setText("");
            cod.setText("");
            login.setText("");
            senha.setText("");
            JOptionPane.showMessageDialog(null, "Alteração concluida!", "Cronograma", JOptionPane.INFORMATION_MESSAGE);
           
        }       
       new Opcoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_alterarActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fcod;
    private javax.swing.JButton alterar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nome;
    private javax.swing.JButton ok;
    private javax.swing.JTextField senha;
    // End of variables declaration//GEN-END:variables

    
}
