package Principal;
import VisaoCadastrar.Banco;
import VisaoCadastrar.CadastrarBiologia;
import VisaoCadastrar.Ed;
import VisaoCadastrar.Espanhol;
import VisaoCadastrar.Filosofia;
import VisaoCadastrar.Fisica;
import VisaoCadastrar.Geografia;
import VisaoCadastrar.Historia;
import VisaoCadastrar.Ingles;
import VisaoCadastrar.Matematica;
import VisaoCadastrar.Php;
import VisaoCadastrar.Portugues;
import VisaoCadastrar.Quimica;
import VisaoCadastrar.Redes;
import VisaoCadastrar.Sociologia;
import java.net.URL;
import javax.swing.JOptionPane;

public class Cronograma extends javax.swing.JFrame {

    
    public Cronograma() {
        initComponents();
        setSize(777,382);
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        humanas = new javax.swing.JComboBox<>();
        curso = new javax.swing.JComboBox<>();
        linguagem = new javax.swing.JComboBox<>();
        natureza = new javax.swing.JComboBox<>();
        matematica = new javax.swing.JComboBox<>();
        salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel1.setBounds(160, 20, 400, 50);

        humanas.setBackground(new java.awt.Color(102, 102, 102));
        humanas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        humanas.setForeground(new java.awt.Color(255, 255, 255));
        humanas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HUMANAS:", "HISTÓRIA", "GEOGRAFIA", "FILOSOFIA", "SOCIOLOGIA" }));
        humanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanasActionPerformed(evt);
            }
        });
        getContentPane().add(humanas);
        humanas.setBounds(170, 110, 140, 23);

        curso.setBackground(new java.awt.Color(102, 102, 102));
        curso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        curso.setForeground(new java.awt.Color(255, 255, 255));
        curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURSO:", "P.O.O", "J.S", "S.O" }));
        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });
        getContentPane().add(curso);
        curso.setBounds(620, 110, 140, 23);

        linguagem.setBackground(new java.awt.Color(102, 102, 102));
        linguagem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linguagem.setForeground(new java.awt.Color(255, 255, 255));
        linguagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LINGUAGENS:", "PORTUGUÊS", "INGLES", "ESPANHOL", "ED. FISICA" }));
        linguagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linguagemActionPerformed(evt);
            }
        });
        getContentPane().add(linguagem);
        linguagem.setBounds(20, 110, 140, 23);

        natureza.setBackground(new java.awt.Color(102, 102, 102));
        natureza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        natureza.setForeground(new java.awt.Color(255, 255, 255));
        natureza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NATUREZA:", "FISICA", "QUIMICA", "BIOLOGIA" }));
        natureza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturezaActionPerformed(evt);
            }
        });
        getContentPane().add(natureza);
        natureza.setBounds(320, 110, 140, 23);

        matematica.setBackground(new java.awt.Color(102, 102, 102));
        matematica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        matematica.setForeground(new java.awt.Color(255, 255, 255));
        matematica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATEMATICA:", "MATEMATICA" }));
        matematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matematicaActionPerformed(evt);
            }
        });
        getContentPane().add(matematica);
        matematica.setBounds(470, 110, 140, 23);

        salvar.setBackground(new java.awt.Color(255, 255, 255));
        salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvar.setText("SAIR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(330, 320, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produtos-de-informatica.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 150, 640, 160);

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

    private void humanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanasActionPerformed
        int op = humanas.getSelectedIndex();
        if(op == 0){
          JOptionPane.showMessageDialog(rootPane, "ESCOLHA UMA OPÇÃO", "ALERTA!", JOptionPane.ERROR_MESSAGE, null);
      }
      else if(op == 1){
             new Historia().setVisible(true); 
           dispose();
        }if(op == 2){
             new Geografia().setVisible(true); 
           dispose();
        }if(op == 3){
             new Filosofia().setVisible(true); 
           dispose();
        }if(op == 4){
            new Sociologia().setVisible(true); 
           dispose();
        }
    }//GEN-LAST:event_humanasActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        int op = curso.getSelectedIndex();
      if(op == 0){
          JOptionPane.showMessageDialog(rootPane, "ESCOLHA UMA OPÇÃO", "ALERTA!", JOptionPane.ERROR_MESSAGE, null);
      }
      else if (op == 1){
          new Banco().setVisible(true);
          dispose();
      }else if(op == 2){
          new Php().setVisible(true);
        dispose();
      }else if(op == 3){
            new Redes().setVisible(true);
          dispose();
      }
    }//GEN-LAST:event_cursoActionPerformed

    private void linguagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linguagemActionPerformed
      int op = linguagem.getSelectedIndex();
      if(op == 0){
          JOptionPane.showMessageDialog(rootPane, "ESCOLHA UMA OPÇÃO", "ALERTA!", JOptionPane.ERROR_MESSAGE, null);
      }
      else if (op == 1){
          new Portugues().setVisible(true);
          dispose();
          
      }else if(op == 2){
          new Ingles().setVisible(true);
        dispose();
      }else if(op == 3){
            new Espanhol().setVisible(true);
          dispose();
      }
      else if(op == 4){
            new Ed().setVisible(true);
          dispose();
      }
      
    }//GEN-LAST:event_linguagemActionPerformed

    private void naturezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturezaActionPerformed
        int op = natureza.getSelectedIndex();
      if(op == 0){
          JOptionPane.showMessageDialog(rootPane, "ESCOLHA UMA OPÇÃO", "ALERTA!", JOptionPane.ERROR_MESSAGE, null);
      }
      else if (op == 1){
         new Fisica().setVisible(true);
          dispose();
      }else if(op == 2){
          new Quimica().setVisible(true);
        dispose();
      }else if(op == 3){
            new CadastrarBiologia().setVisible(true);
          dispose();
      }
    }//GEN-LAST:event_naturezaActionPerformed

    private void matematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matematicaActionPerformed
      int op = matematica.getSelectedIndex();
     if(op == 0){
          JOptionPane.showMessageDialog(rootPane, "ESCOLHA UMA OPÇÃO", "ALERTA!", JOptionPane.ERROR_MESSAGE, null);
      }
      else  if (op == 1){
          new Matematica().setVisible(true);
          dispose();
      }
    }//GEN-LAST:event_matematicaActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
  dispose();
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
                new Cronograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> curso;
    private javax.swing.JComboBox<String> humanas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> linguagem;
    private javax.swing.JComboBox<String> matematica;
    private javax.swing.JComboBox<String> natureza;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
