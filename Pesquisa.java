package questionariojava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *
 * @author almei
 */

public class Pesquisa extends javax.swing.JFrame {
    
        ArrayList<String> Perguntas = new ArrayList();
        
    public Pesquisa() {
        
        initComponents();
        
        Perguntas.add("1 ) Qual seu nível de satisfação em relação ao atual desenvolvimento da cidade?\n");
        Perguntas.add("2 ) Como você considera o trânsito da cidade?\n");
        Perguntas.add("3 ) Em relação aos inventimentos com saúde sua opinião é?\n");
        Perguntas.add("4 ) Qual seu grau de satisfação em relação infraestrutura da cidade?\n");
        Perguntas.add("5 ) Sua opinião em relação a educação pública é?\n");
        Perguntas.add("6 ) Como você considera a conservação dos patrimônios públicos de nossa cidade?\n");
        Perguntas.add("7 ) Quanto a disponibilidade de vagas de empregos qual sua opinião?\n");
        Perguntas.add("8 ) Em relação ao comércio, considerando a variedade e qualidade de produtos, qual seu nível de satisfação?\n");
        Perguntas.add("9 ) Considerando o entretenimento qual seu nível de satisfação?\n");
        Perguntas.add("10 ) Como você considera a segurança pública de nossa cidade?\n");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        IniciarPesqSat = new javax.swing.JButton();
        VoltarP = new javax.swing.JButton();
        CadastroPerg = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Tema da pesquisa: Satisfação da cidade de Santo Ângelo Custódio.");

        IniciarPesqSat.setText("Iniciar Pesquisa Satisfação");
        IniciarPesqSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarPesqSatActionPerformed(evt);
            }
        });

        VoltarP.setText("Voltar");
        VoltarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarPActionPerformed(evt);
            }
        });

        CadastroPerg.setText("Adicionar pergunta");
        CadastroPerg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroPergActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastroPerg)
                .addGap(161, 161, 161)
                .addComponent(IniciarPesqSat)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IniciarPesqSat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoltarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastroPerg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarPesqSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarPesqSatActionPerformed
        IniciarPesqSat.addActionListener(e -> this.dispose());
        this.salvarTudo();
        new Perguntas1().setVisible(true);
    }//GEN-LAST:event_IniciarPesqSatActionPerformed

    private void VoltarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarPActionPerformed
        VoltarP.addActionListener(e -> this.dispose());
        new Entrada().setVisible(true);
    }//GEN-LAST:event_VoltarPActionPerformed

    private void CadastroPergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroPergActionPerformed
        CadastroPerg.addActionListener(e -> this.dispose());
        new CadastroPerguntas(this).setVisible(true);
    }//GEN-LAST:event_CadastroPergActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }
    public void salvarTudo() {
        try {
            FileOutputStream arquivo = new FileOutputStream("d:\\perguntas.txt"); //criando arquivo.txt para armazenar as respostas da pesquisa
            ObjectOutput gravarPerg = new ObjectOutputStream(arquivo);
            gravarPerg.writeObject(this.Perguntas);
            gravarPerg.close();
            arquivo.close();
            System.out.printf("Perguntas gravadas em arquivo: perguntas.txt em d:\\\n\n");
        } catch (IOException ex) {
            Logger.getLogger(Perguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroPerg;
    private javax.swing.JButton IniciarPesqSat;
    private javax.swing.JButton VoltarP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}