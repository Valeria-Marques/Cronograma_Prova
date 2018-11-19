package Principal;


import DAO.Conexao;
import DAO.FuncionarioDAO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        setSize(777,420);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 82, 780, 10);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRONOGRAMA DE ESTUDOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 400, 50);

        salvar.setBackground(new java.awt.Color(0, 102, 0));
        salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvar.setText("Entrar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(310, 280, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 90, 70, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 180, 70, 40);
        getContentPane().add(email);
        email.setBounds(210, 140, 320, 30);
        getContentPane().add(senha);
        senha.setBounds(210, 230, 320, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produtos-de-informatica.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 650, 190);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(90, 334, 620, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 780, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Connection con = Conexao.AbrirConexao();
        FuncionarioDAO sql = new FuncionarioDAO(con);
        String login = email.getText();
        String Senha = senha.getText();
        if (login.equalsIgnoreCase("") || Senha.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode ficar vazio.", "Video Locadora",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (sql.Logar(login, Senha) == true) {
                new Thread() {
                    public void run() {
                        for (int i = 0; i < 101; i++) {
                            jProgressBar1.setValue(i);
                            try {
                                Thread.sleep(35);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        new Cronograma().setVisible(true);
                        dispose();
                    }
                }
                        .start();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário/Senha Incorreto!.", "Video Locadora",
                    JOptionPane.WARNING_MESSAGE);
                email.setText("");
                senha.setText("");
            }

        }
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(Cronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton salvar;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
