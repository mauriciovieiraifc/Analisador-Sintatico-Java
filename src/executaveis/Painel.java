/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaveis;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import lexico.Tokens;
import lexico.Lexico;
import sintatico.Sintatico;

/**
 *
 * @author mauricio
 */
public class Painel extends javax.swing.JFrame {

    /**
     * Creates new form AnalisadorSintatico
     */
    public Painel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void analisarLexico() throws IOException {
        int cont = 1;

        String expr = (String) txtEntrada.getText();
        Lexico lexico = new Lexico(new StringReader(expr));
        String result = "LINHA " + cont + "\t\tSÍMBOLO\n";
        while (true) {
            Tokens tokens = lexico.yylex();
            if (tokens == null) {
                txtResultadoLex.setText(result);
                return;
            }

            switch (tokens) {
                case Linha:
                    cont++;
                    result += "\nLINHA " + cont + "\n";
                    break;
                case Igual:
                    result += "\n<Operador de Atribuição>" + lexico.lexema + "\n";
                    break;
                case Aspas:
                    result += "\n<Aspas Duplas>\t " + lexico.lexema + "\n";
                    break;
                case Static:
                    result += "\n<Reservada Static>\t " + lexico.lexema + "\n";
                    break;
                case String:
                    result += "\n<Tipo de dado>\t " + lexico.lexema + "\n";
                    break;
                case Int:
                    result += "\n<Tipo de dado>\t " + lexico.lexema + "\n";
                    break;
                case If:
                    result += "<Reservada If>\t " + lexico.lexema + "\n";
                    break;
                case Else:
                    result += "<Reservada Else>\t " + lexico.lexema + "\n";
                    break;
                case For:
                    result += "<Reservada For>\t " + lexico.lexema + "\n";
                    break;
                case Public:
                    result += "<Reservada Public>\t " + lexico.lexema + "\n";
                    break;
                case Void:
                    result += "<Reservada Void>\t " + lexico.lexema + "\n";
                    break;
                case Main:
                    result += "<Reservada Main>\t " + lexico.lexema + "\n";
                    break;
                case Do:
                    result += "<Reservada Do>\t " + lexico.lexema + "\n";
                    break;
                case While:
                    result += "<Reservada While>\t " + lexico.lexema + "\n";
                    break;
                case Tipo_Dado:
                    result += "<Tipo de dado>\t" + lexico.lexema + "\n";
                    break;
                case Operador_Logico:
                    result += "<Operador Lógico>\t" + lexico.lexema + "\n";
                    break;
                case Operador_Relacional:
                    result += "<Operador Relacional>\t" + lexico.lexema + "\n";
                    break;
                case Operador_Incremento:
                    result += "<Operador Incremento/Decremento>\t" + lexico.lexema + "\n";
                    break;
                case Operador_Atribuicao:
                    result += "<Operador de Atribuição>\t" + lexico.lexema + "\n";
                    break;
                case Operador_Booleano:
                    result += "<Operador Booleano>\t" + lexico.lexema + "\n";
                    break;
                case Operador_Aritmetico:
                    result += "<Operador Aritmético>\t" + lexico.lexema + "\n";
                    break;
                case Abre_Parenteses:
                    result += "<Abre Parenteses>\t " + lexico.lexema + "\n";
                    break;
                case Fecha_Parenteses:
                    result += "<Fecha Parenteses>\t " + lexico.lexema + "\n";
                    break;
                case Abre_Chaves:
                    result += "<Abre Chaves>\t\t " + lexico.lexema + "\n";
                    break;
                case Fecha_Chaves:
                    result += "<Fecha Chaves>\t " + lexico.lexema + "\n";
                    break;
                case Ponto_Virgula:
                    result += "<Ponto e Vírgula>\t " + lexico.lexema + "\n";
                    break;
                case Identificador:
                    result += "<Identificador>\t " + lexico.lexema + "\n";
                    break;
                case Numero:
                    result += "<Número>\t\t " + lexico.lexema + "\n";
                    break;
                case ERROR:
                    result += "<Simbolo não definido>\n";
                    break;
                default:
                    result += "  < " + lexico.lexema + " >\n";
                    break;
            }
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

        jLabel1 = new javax.swing.JLabel();
        btnArquivo = new javax.swing.JButton();
        btnLimparLex = new javax.swing.JButton();
        btnLimparSin = new javax.swing.JButton();
        btnAnalisarSin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultadoLex = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultadoSin = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnAnalisarLex = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Análise Léxica");

        btnArquivo.setText("Carregar Arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });

        btnLimparLex.setText("Limpar");
        btnLimparLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparLexActionPerformed(evt);
            }
        });

        btnLimparSin.setText("Limpar");
        btnLimparSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSinActionPerformed(evt);
            }
        });

        btnAnalisarSin.setText("Analisar");
        btnAnalisarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarSinActionPerformed(evt);
            }
        });

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        txtResultadoLex.setColumns(20);
        txtResultadoLex.setRows(5);
        jScrollPane2.setViewportView(txtResultadoLex);

        txtResultadoSin.setColumns(20);
        txtResultadoSin.setRows(5);
        jScrollPane3.setViewportView(txtResultadoSin);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Análise Sintática");

        btnAnalisarLex.setText("Analisar");
        btnAnalisarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarLexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparLex))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnalisarSin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparSin))
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnalisarLex)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(373, 373, 373)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(365, 365, 365))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArquivo)
                    .addComponent(btnLimparLex)
                    .addComponent(btnAnalisarLex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparSin)
                    .addComponent(btnAnalisarSin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = new File(chooser.getSelectedFile().getAbsolutePath());

        String ST;
        try {
            ST = new String(Files.readAllBytes(file.toPath()));
            txtEntrada.setText(ST);
        } catch (IOException ex) {
            Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArquivoActionPerformed

    private void btnAnalisarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarLexActionPerformed
        try {
            // TODO add your handling code here:
            analisarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalisarLexActionPerformed

    private void btnAnalisarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarSinActionPerformed
        // TODO add your handling code here:
        String ST = txtEntrada.getText();
        Sintatico sintatico = new Sintatico(new sintatico.LexicoCup(new StringReader(ST)));

        try {
            sintatico.parse();
            txtResultadoSin.setText("Análise realizada sem erros!");
            txtResultadoSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = sintatico.getS();
            txtResultadoSin.setText("Erro de sintaxe. Linha: "
                    + (sym.right + 1)
                    + ", Coluna: " + (sym.left + 1)
                    + ", Texto: " + sym.value);
            txtResultadoSin.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnAnalisarSinActionPerformed

    private void btnLimparLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparLexActionPerformed
        // TODO add your handling code here:
        txtResultadoLex.setText(null);
    }//GEN-LAST:event_btnLimparLexActionPerformed

    private void btnLimparSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSinActionPerformed
        // TODO add your handling code here:
        txtResultadoSin.setText(null);
    }//GEN-LAST:event_btnLimparSinActionPerformed

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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisarLex;
    private javax.swing.JButton btnAnalisarSin;
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnLimparLex;
    private javax.swing.JButton btnLimparSin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtResultadoLex;
    private javax.swing.JTextArea txtResultadoSin;
    // End of variables declaration//GEN-END:variables
}
