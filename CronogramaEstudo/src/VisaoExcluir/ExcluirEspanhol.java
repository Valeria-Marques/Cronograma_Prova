package VisaoExcluir;
import VisaoCadastrar.*;
import DAO.Conexao;
import DAO.EspanholDAO;
import Modelo.Espanhol;
import Principal.Opcoes;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class ExcluirEspanhol extends javax.swing.JFrame {

    public ExcluirEspanhol() {
        initComponents();
        setSize(781,410);
         AtualizarCombo();
    }
    private void AtualizarCombo(){
    Connection con = Conexao.AbrirConexao();
    EspanholDAO sql = new EspanholDAO(con);
    List<Espanhol> lista = new ArrayList<>();
    lista =  sql.ListarComboEspanhol();
    for(Espanhol b : lista){
       ComboBio.addItem(b.getConteudo()); 
    }
    Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        alterar = new javax.swing.JButton();
        Cod = new javax.swing.JTextField();
        ComboBio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Excluir Espanhol");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 30, 290, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 780, 10);

        cancelar.setBackground(new java.awt.Color(204, 0, 0));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(230, 270, 120, 40);

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EXCLUIR");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 110, 80, 40);

        alterar.setBackground(new java.awt.Color(255, 51, 51));
        alterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterar.setText("EXCLUIR");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(470, 270, 120, 40);

        Cod.setEditable(false);
        getContentPane().add(Cod);
        Cod.setBounds(110, 180, 70, 40);

        ComboBio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboBio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Um Conteudo" }));
        ComboBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBioActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBio);
        ComboBio.setBounds(210, 180, 520, 40);

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Conteudo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 180, 70, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 780, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
   new Opcoes().setVisible(true);
   dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
    String codigo = Cod.getText();
    String nome = ComboBio.getSelectedItem().toString();
    
    Connection con = Conexao.AbrirConexao();
    EspanholDAO sql = new EspanholDAO(con);
    Espanhol e = new Espanhol();
    
    if(nome.equals("")){
        JOptionPane.showMessageDialog(null,"Nenhum Nome Selecionado","Cronograma",JOptionPane.WARNING_MESSAGE);
    }else{
        int bio = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir?"+"\n ("+codigo+")("+nome+")","Cronograma"
        ,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(bio == 0){
            int cod = Integer.parseInt(codigo);
            e.setConteudo(nome);
            e.setId(cod);
            sql.ExcluirEspanhol(e);
            Conexao.FecharConexao(con);
            dispose();
        }
    }
    new Opcoes().setVisible(true);
    dispose();
    }//GEN-LAST:event_alterarActionPerformed

    private void ComboBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBioActionPerformed
    Connection con = Conexao.AbrirConexao();
    EspanholDAO sql = new EspanholDAO(con);
    List<Espanhol> lista = new ArrayList<>();
    String nome = ComboBio.getSelectedItem().toString();
    
    lista = sql.ConsultaCodigoEspanhol(nome);
    
    for(Espanhol b: lista){
        int a = b.getId();
        Cod.setText("" + a);    
    }
    Conexao.FecharConexao(con);  
    }//GEN-LAST:event_ComboBioActionPerformed

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
            java.util.logging.Logger.getLogger(Espanhol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Espanhol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Espanhol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Espanhol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirEspanhol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cod;
    private javax.swing.JComboBox<String> ComboBio;
    private javax.swing.JButton alterar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
