package VisaoConsultar;
import DAO.Conexao;
import DAO.EdDAO;
import Modelo.Ed;
import Principal.Opcoes;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ConsultarEd extends javax.swing.JFrame {

    public ConsultarEd() {
        initComponents();
        setSize(781,410);
          AtualizaTable();
    }
     private void AtualizaTable() {
        Connection con = Conexao.AbrirConexao();
        EdDAO bd = new EdDAO(con);
        List<Ed> lista = new ArrayList<>();
        lista = bd.ListarEd();
        DefaultTableModel tbm = (DefaultTableModel) Tabela.getModel();
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        int i = 0;
        for (Ed tab : lista) {
            tbm.addRow(new String[i]);
            Tabela.setValueAt(tab.getId(), i, 0);
            Tabela.setValueAt(tab.getConteudo(), i, 1);
            Tabela.setValueAt(tab.getData(), i, 2);
            Tabela.setValueAt(tab.getHora(), i, 3);
            i++;
        }
        Conexao.FecharConexao(con);
    }
     public void BuscarNome(){
        Connection con = Conexao.AbrirConexao();
        EdDAO bd =  new EdDAO(con);
        List<Ed> lista = new ArrayList();
        lista = bd.PesquisarNomeEd(nome.getText());
        DefaultTableModel tbm = (DefaultTableModel) Tabela.getModel();
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        int i = 0;
        for(Ed tab : lista){
            tbm.addRow(new String[i]);
            Tabela.setValueAt(tab.getId(), i, 0);
            Tabela.setValueAt(tab.getConteudo(), i, 1);
            Tabela.setValueAt(tab.getData(), i, 2);
            Tabela.setValueAt(tab.getHora(), i, 3);
            i++;
            cod.setText("");
        }
        Conexao.FecharConexao(con); 
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancelar = new javax.swing.JButton();
        todos = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BNome = new javax.swing.JButton();
        BCod1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ed. Fisica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 290, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 780, 10);

        cancelar.setBackground(new java.awt.Color(204, 0, 0));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setText("VOLTAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(630, 30, 110, 40);

        todos.setBackground(new java.awt.Color(0, 153, 0));
        todos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        todos.setText("TODOS");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });
        getContentPane().add(todos);
        todos.setBounds(520, 30, 90, 40);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(110, 110, 160, 30);

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 110, 90, 30);

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        getContentPane().add(cod);
        cod.setBounds(430, 110, 240, 30);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cod");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 110, 90, 30);

        BNome.setBackground(new java.awt.Color(204, 204, 204));
        BNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BNome.setText("OK");
        BNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNomeActionPerformed(evt);
            }
        });
        getContentPane().add(BNome);
        BNome.setBounds(280, 110, 60, 30);

        BCod1.setBackground(new java.awt.Color(204, 204, 204));
        BCod1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BCod1.setText("OK");
        BCod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCod1ActionPerformed(evt);
            }
        });
        getContentPane().add(BCod1);
        BCod1.setBounds(680, 110, 60, 30);

        Tabela.setBackground(new java.awt.Color(204, 204, 204));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Conteudo", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 720, 190);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 780, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
      AtualizaTable();
    }//GEN-LAST:event_todosActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void BNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNomeActionPerformed
       BuscarNome();
    }//GEN-LAST:event_BNomeActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
   new Opcoes().setVisible(true);
   dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void BCod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCod1ActionPerformed
      String codigo = cod.getText();
        Connection con = Conexao.AbrirConexao();
        EdDAO sql = new EdDAO(con);
        List<Ed> lista = new ArrayList<>();
        lista = sql.PesquisarCodigoEd(codigo);
        DefaultTableModel tbm = (DefaultTableModel) Tabela.getModel();
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        int i = 0;
        for (Ed tab : lista) {      
            tbm.addRow(new String[i]);
            Tabela.setValueAt(tab.getId(), i, 0);
            Tabela.setValueAt(tab.getConteudo(), i, 1);
            Tabela.setValueAt(tab.getData(), i, 2);
            Tabela.setValueAt(tab.getHora(), i, 3);
            i++; 
            nome.setText("");
        }
        Conexao.FecharConexao(con);     
    }//GEN-LAST:event_BCod1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarEd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCod1;
    private javax.swing.JButton BNome;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton todos;
    // End of variables declaration//GEN-END:variables

    
}
