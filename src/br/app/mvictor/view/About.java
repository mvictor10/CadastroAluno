/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.view;

/**
 *
 * @author mvictor
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTituloDesenvolvedor = new javax.swing.JLabel();
        lbl_tag_nome = new javax.swing.JLabel();
        lbl_titulo_orientado = new javax.swing.JLabel();
        lbl_nome_professor = new javax.swing.JLabel();
        lbl_disciplina = new javax.swing.JLabel();
        lbl_nome_disciplina = new javax.swing.JLabel();
        lbl_titulo_instituicao = new javax.swing.JLabel();
        lbl_instituicao_name = new javax.swing.JLabel();
        lbl_turma = new javax.swing.JLabel();
        lbl_nome_turma = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acerca da Aplicação", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP));

        lblTituloDesenvolvedor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTituloDesenvolvedor.setText("Desenvolvido por:");

        lbl_tag_nome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_tag_nome.setText("Manoel Vitor Pau Ferro Silva Santos");

        lbl_titulo_orientado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl_titulo_orientado.setText("Projeto Orientado pelo Professor:");

        lbl_nome_professor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_nome_professor.setText("Jonatas Bastos");

        lbl_disciplina.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl_disciplina.setText("Disciplina");

        lbl_nome_disciplina.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_nome_disciplina.setText("P.O.O (Programação Orientada à Objetos");

        lbl_titulo_instituicao.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl_titulo_instituicao.setText("Instituição");

        lbl_instituicao_name.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_instituicao_name.setText("IFBA - (Instituto Federal de Educação, Ciência e Tecnológia do Estado da Bahia)  ");

        lbl_turma.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl_turma.setText("Turma");

        lbl_nome_turma.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_nome_turma.setText("ADS - 2019.3 ");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(lbl_instituicao_name)
                .addGap(21, 21, 21))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_titulo_orientado)
                            .addComponent(lblTituloDesenvolvedor)
                            .addComponent(lbl_disciplina)
                            .addComponent(lbl_titulo_instituicao)
                            .addComponent(lbl_turma)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lbl_tag_nome))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbl_nome_professor))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lbl_nome_disciplina))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbl_nome_turma)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTituloDesenvolvedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tag_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo_orientado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nome_professor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_disciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nome_disciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo_instituicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_instituicao_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_turma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nome_turma)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        menu.setText("Tela Principal");

        menu_item.setText("Voltar");
        menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_itemActionPerformed(evt);
            }
        });
        menu.add(menu_item);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_itemActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.setDefaultCloseOperation(About.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_menu_itemActionPerformed

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTituloDesenvolvedor;
    private javax.swing.JLabel lbl_disciplina;
    private javax.swing.JLabel lbl_instituicao_name;
    private javax.swing.JLabel lbl_nome_disciplina;
    private javax.swing.JLabel lbl_nome_professor;
    private javax.swing.JLabel lbl_nome_turma;
    private javax.swing.JLabel lbl_tag_nome;
    private javax.swing.JLabel lbl_titulo_instituicao;
    private javax.swing.JLabel lbl_titulo_orientado;
    private javax.swing.JLabel lbl_turma;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_item;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
