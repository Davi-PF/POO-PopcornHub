/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popcornhub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import popcornhub.Connection_Mysql.ConnectionFactory;

import popcornhub.PopCornHUBLogin;

/**
 *
 * @author wesle
 */
public class PopCornHUBEscolherFilmes extends javax.swing.JFrame {

    /**
     * Creates new form PopCornHUBJFrame
     */
    public PopCornHUBEscolherFilmes() {
        initComponents();
        atualizarTabela();
        atualizarComboBox();
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

        jPanel1 = new javax.swing.JPanel();
        jButtonMinhaLista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSairEscolherFilmes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEscolherFilmes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabelEF_ID = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabelEF_Titulo = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabelEF_tempoDuracao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdicionarPUsuario = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldEFUsuario = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabelEF_Genero = new javax.swing.JLabel();
        jComboBoxPesquisarGeneroEF = new javax.swing.JComboBox<>();
        jTextFieldPesquisarEF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonPesquisarEF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de Escolha de Filmes");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonMinhaLista.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMinhaLista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMinhaLista.setText("Minha lista");
        jButtonMinhaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMinhaListaMouseClicked(evt);
            }
        });
        jButtonMinhaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinhaListaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PopCorn HUB");

        jButtonSairEscolherFilmes.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSairEscolherFilmes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSairEscolherFilmes.setText("Sair");
        jButtonSairEscolherFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairEscolherFilmesMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adicionando filmes à minha lista:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSairEscolherFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMinhaLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMinhaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSairEscolherFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jTableEscolherFilmes.setBackground(new java.awt.Color(0, 0, 0));
        jTableEscolherFilmes.setForeground(new java.awt.Color(255, 255, 255));
        jTableEscolherFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID:", "Título:", "Gênero:", "Tempo de duração:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEscolherFilmes.setToolTipText("");
        jTableEscolherFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEscolherFilmesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEscolherFilmes);

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("ID:"));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Título:"));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempo de duração:"));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_tempoDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_tempoDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filme");

        jButtonAdicionarPUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdicionarPUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAdicionarPUsuario.setText("Adicionar");
        jButtonAdicionarPUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarPUsuarioMouseClicked(evt);
            }
        });
        jButtonAdicionarPUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarPUsuarioActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário:"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldEFUsuario)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTextFieldEFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Gênero:"));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEF_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionarPUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButtonAdicionarPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBoxPesquisarGeneroEF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero" }));
        jComboBoxPesquisarGeneroEF.setToolTipText("");
        jComboBoxPesquisarGeneroEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarGeneroEFActionPerformed(evt);
            }
        });

        jTextFieldPesquisarEF.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pesquisar");

        jButtonPesquisarEF.setText("Pesquisar");
        jButtonPesquisarEF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPesquisarEFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisarEF, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButtonPesquisarEF)
                        .addGap(35, 35, 35)
                        .addComponent(jComboBoxPesquisarGeneroEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxPesquisarGeneroEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisarEF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPesquisarEF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTextFieldPesquisarEF.getAccessibleContext().setAccessibleName("");
        jTextFieldPesquisarEF.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinhaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinhaListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMinhaListaActionPerformed

    private void jComboBoxPesquisarGeneroEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarGeneroEFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPesquisarGeneroEFActionPerformed

    private void jButtonAdicionarPUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarPUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicionarPUsuarioActionPerformed

    private void jButtonSairEscolherFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairEscolherFilmesMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_jButtonSairEscolherFilmesMouseClicked

    private void jButtonPesquisarEFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPesquisarEFMouseClicked
        // TODO add your handling code here:
        
        
        
        Connection con = ConnectionFactory.getConnection();
        String pesquisar_nome = jTextFieldPesquisarEF.getText();
        String posicao_combo = (String) jComboBoxPesquisarGeneroEF.getSelectedItem();
        String query = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        
        if(posicao_combo.trim().equals("Selecione um gênero")){
            query = "SELECT m.movie_id, title, GROUP_CONCAT(genre_name ORDER BY genre_name SEPARATOR ', ') AS genre, runtime\n" +
"	FROM \n" +
"		movie m, movie_genres mg, genre g\n" +
"			WHERE \n" +
"				m.title LIKE '%"+ pesquisar_nome +"%' " +
                "             AND (mg.movie_id = m.movie_id AND mg.genre_id = g.genre_id)\n" +
"				GROUP BY m.movie_id;";

        } else{
            query = "SELECT m.movie_id, title, GROUP_CONCAT(genre_name ORDER BY genre_name SEPARATOR ', ') AS genre, runtime\n" +
"	FROM \n" +
"		movie m, movie_genres mg, genre g\n" +
"			WHERE \n" +
"				m.title LIKE '%"+ pesquisar_nome +"%' AND (g.genre_name = '"+ posicao_combo +
                "'             AND (mg.movie_id = m.movie_id AND mg.genre_id = g.genre_id))\n" +
"				GROUP BY m.movie_id;";

        }
                
        try{

            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)jTableEscolherFilmes.getModel();
            tm.setRowCount(0);
        
            while(rs.next()){
                Object o[] = {rs.getInt("movie_id"), rs.getString("title"),rs.getString("genre"),rs.getFloat("runtime")};
                tm.addRow(o);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }
        
    }//GEN-LAST:event_jButtonPesquisarEFMouseClicked

    private void jButtonAdicionarPUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarPUsuarioMouseClicked
        // TODO add your handling code here:
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        
        int codigo_usuario = 0;
        String usuario = jTextFieldEFUsuario.getText();
        if(usuario.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Erro: usuário inválido.", "Aviso",1);
        }
        
        int id_filme = Integer.parseInt(jLabelEF_ID.getText());
        
        String query_pegarUsuario = "SELECT cod_usuario FROM usuarios WHERE username = '" + usuario + "';";
        String query_insert = "INSERT INTO lista_filmes (cod_usuario_lf, movie_id_lf, tempo_assistido) VALUES (?, ?, 0)";
        
        
        try{
            stmt = con.prepareStatement(query_pegarUsuario);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                codigo_usuario = Integer.parseInt(rs.getString("cod_usuario"));
            }
            stmt = null;
            
            stmt = con.prepareStatement(query_insert);
            stmt.setInt(1, codigo_usuario);
            stmt.setInt(2, id_filme);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Filme adicionado com sucesso.");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }

        
        
    }//GEN-LAST:event_jButtonAdicionarPUsuarioMouseClicked

    private void jTableEscolherFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEscolherFilmesMouseClicked
        // TODO add your handling code here:
        
        PreparedStatement stmt = null;
        Connection con = ConnectionFactory.getConnection();
        
        try{
            int row = jTableEscolherFilmes.getSelectedRow();
            int Table_click = Integer.parseInt((jTableEscolherFilmes.getModel().getValueAt(row, 0).toString()));

            String sql = "SELECT m.movie_id, title, GROUP_CONCAT(genre_name ORDER BY genre_name SEPARATOR ', ') AS genre, runtime\n" +
"	FROM \n" +
"		movie m, movie_genres mg, genre g\n" +
"			WHERE \n" +
"				m.movie_id = "+ Table_click + " AND "
                    + "         (mg.movie_id = m.movie_id AND mg.genre_id = g.genre_id)\n" +
"				GROUP BY m.movie_id";
            
            
            stmt = con.prepareStatement(sql);
            ResultSet rs;
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                
                String add1 = rs.getString("movie_id");
                jLabelEF_ID.setText(add1);
                
                String add2 = rs.getString("title");
                jLabelEF_Titulo.setText(add2);
                
                String add3 = rs.getString("genre");
                jLabelEF_Genero.setText(add3);
                
                String add4 = rs.getString("runtime");
                jLabelEF_tempoDuracao.setText(add4);
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e);
        }
        
        
    }//GEN-LAST:event_jTableEscolherFilmesMouseClicked

    private void jButtonMinhaListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinhaListaMouseClicked
        // TODO add your handling code here:
        
        PopCornHUBLogin login = new PopCornHUBLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jButtonMinhaListaMouseClicked

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
            java.util.logging.Logger.getLogger(PopCornHUBEscolherFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopCornHUBEscolherFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopCornHUBEscolherFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopCornHUBEscolherFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopCornHUBEscolherFilmes().setVisible(true);
            }
        });
    }
    
    public void atualizarTabela(){
        
        String query = "SELECT m.movie_id, title, GROUP_CONCAT(genre_name ORDER BY genre_name SEPARATOR ', ') AS genre, runtime \n" +
"	FROM movie m, genre g, movie_genres mg \n" +
"		WHERE (mg.movie_id = m.movie_id AND mg.genre_id = g.genre_id) GROUP BY m.movie_id;";
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)jTableEscolherFilmes.getModel();
            tm.setRowCount(0);
        
            while(rs.next()){
                Object o[] = {rs.getInt("movie_id"), rs.getString("title"), rs.getString("genre"), rs.getFloat("runtime")};
                tm.addRow(o);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void atualizarComboBox(){
        
        String query = "SELECT genre_name FROM genre;";
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                String genero = rs.getString("genre_name");
                jComboBoxPesquisarGeneroEF.addItem(genero);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarPUsuario;
    private javax.swing.JButton jButtonMinhaLista;
    private javax.swing.JButton jButtonPesquisarEF;
    private javax.swing.JButton jButtonSairEscolherFilmes;
    private javax.swing.JComboBox<String> jComboBoxPesquisarGeneroEF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEF_Genero;
    private javax.swing.JLabel jLabelEF_ID;
    private javax.swing.JLabel jLabelEF_Titulo;
    private javax.swing.JLabel jLabelEF_tempoDuracao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEscolherFilmes;
    private javax.swing.JTextField jTextFieldEFUsuario;
    private javax.swing.JTextField jTextFieldPesquisarEF;
    // End of variables declaration//GEN-END:variables
}