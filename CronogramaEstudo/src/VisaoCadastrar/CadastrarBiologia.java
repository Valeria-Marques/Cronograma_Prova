package VisaoCadastrar;
import DAO.BiologiaDAO;
import DAO.Conexao;
import Modelo.Biologia;
import Principal.Cronograma;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class CadastrarBiologia extends javax.swing.JFrame {

    public CadastrarBiologia() {
        initComponents();
        setSize(781,410);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        conteudo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        hora = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biologia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 30, 290, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 780, 10);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HORA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 250, 60, 40);

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INFORMAR:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 110, 90, 40);

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(600, 260, 120, 40);

        salvar.setBackground(new java.awt.Color(255, 255, 255));
        salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(600, 170, 120, 40);

        conteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conteudoActionPerformed(evt);
            }
        });
        getContentPane().add(conteudo);
        conteudo.setBounds(160, 170, 400, 40);

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONTEUDO: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 170, 90, 40);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 250, 50, 40);

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(data);
        data.setBounds(160, 250, 200, 40);

        try {
            hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(hora);
        hora.setBounds(450, 240, 100, 50);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 780, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conteudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conteudoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
       String nome = conteudo.getText();
       String dat = data.getText();
       String h = hora.getText();
       if (conteudo.equals("") || data.equals("") || hora.equals("")) {
               JOptionPane.showMessageDialog(null, "Nenhum campo pode está vazio.", "Cronograma", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            BiologiaDAO sql = new BiologiaDAO(con);
            Biologia b = new Biologia();
            b.setConteudo(nome);
            b.setData(dat);
            b.setHora(h);
            sql.InserirBiologia(b);
            Conexao.FecharConexao(con);
            JOptionPane.showMessageDialog(null, "Cadastro concluido!", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
        new Cronograma().setVisible(true);
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
            java.util.logging.Logger.getLogger(Portugues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portugues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portugues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portugues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarBiologia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField conteudo;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables

    
}
