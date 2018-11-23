package VisaoAlterar;
import VisaoCadastrar.*;
import DAO.Conexao;
import DAO.MatematicaDAO;
import Modelo.Matematica;
import Principal.CronogramaExcluir;
import Principal.Opcoes;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class AlterarMatematica extends javax.swing.JFrame {

    public AlterarMatematica() {
        initComponents();
        setSize(781,410);
    }
     private void InserirDados(int cod) {
        Connection con = Conexao.AbrirConexao();
        MatematicaDAO sql = new MatematicaDAO(con);
        List<Matematica> lista = new ArrayList<>();
        lista = sql.CapturarMatematica(cod);
        for (Matematica m : lista) {
            conteudo.setText("" + m.getConteudo());
            data.setText("" + m.getData());
            hora.setText("" + m.getHora());
            Fcod.setText(""+ m.getId());
        }
        Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        conteudo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        hora = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();
        Fcod = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matematica");
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

        Fcod.setEditable(false);
        getContentPane().add(Fcod);
        Fcod.setBounds(600, 100, 120, 40);

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
    new Opcoes().setVisible(true);
    dispose();        
    }//GEN-LAST:event_cancelarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String codigo = cod.getText();
        Connection con = Conexao.AbrirConexao();
        MatematicaDAO sql = new MatematicaDAO(con);
        int cod = Integer.parseInt(codigo);
        if (sql.TestarMatematica(cod) == false) {
            JOptionPane.showMessageDialog(null, "O código não foi encontrado!", "Cronograma", JOptionPane.WARNING_MESSAGE);
            Conexao.FecharConexao(con);
        }
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código!", "Cronograma", JOptionPane.WARNING_MESSAGE);
        }
        conteudo.setText("");
        data.setText("");
        Fcod.setText("");
        hora.setText("");
        InserirDados(cod);     
    }//GEN-LAST:event_okActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        String cont = conteudo.getText();
        String dat = data.getText();
        String h = hora.getText();
        String f = Fcod.getText();
        if (conteudo.equals("") || data.equals("") || hora.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode está vazio.", "Cronograma", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            MatematicaDAO sql = new MatematicaDAO(con);
            int idF = Integer.parseInt(f);
            Matematica m = new Matematica();
            m.setId(idF);
            m.setConteudo(cont);
            m.setData(dat);
            m.setHora(h);
            sql.AlterarMatematica(m);
            Conexao.FecharConexao(con);
            conteudo.setText("");
            Fcod.setText("");
            cod.setText("");
            data.setText("");
            hora.setText("");
            JOptionPane.showMessageDialog(null, "Alteração concluida!", "Cronograma", JOptionPane.INFORMATION_MESSAGE);
           
        }  
        new Opcoes().setVisible(true);
        dispose();
       
    }//GEN-LAST:event_alterarActionPerformed

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
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarMatematica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fcod;
    private javax.swing.JButton alterar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField conteudo;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables

    
}
