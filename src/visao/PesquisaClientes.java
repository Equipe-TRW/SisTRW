/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

//IMPORTANDO CLASSE DE CONEXÃO
import db.Conexao;
//IMPORTANDO CLASSE MODELO TABELA
import modelo.modeloTabela;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaClientes extends javax.swing.JFrame {

    //CRIANDO UM OBJETO DA MINHA CLASSE CONEXÃO
    Conexao conectaCli=new Conexao();
    
    public PesquisaClientes() {
        initComponents();
        //ABRENDIO CONEXÃO
        conectaCli.conexao();
        //CHAMANDO O METODO PREENCHE TABELA E PASSANDO A STRING SQL DESEJADA
        preenchetablePesqCli("select * from tbl_clientes order by nome_cli");
    }
    
    //METODO RESPONSAVEL POR CARREGAR OS DADOS DA TABELA CLIENTES DO BD NA JTABLE DO PROJETO
    public void preenchetablePesqCli(String sql){
        ArrayList dados=new ArrayList();
            //VETOR COLUNAS COM OS CABEÇALHOS
            String[] colunas=new String[]{"ID","Nome","Data de Nascimento","Genero","Fone 1","Fone 2","Email","RG","CPF","Estado","Cidade","Bairro","Endereço","Numero"};
            //ABRINDO CONEXÃO
            conectaCli.conexao();
            //CRIANDO UMA CONSULTA SQL
            conectaCli.executaSQL(sql);
            try {
                //SETANDO O RESULTSET DA CONSULTA NA PRIMEIRA LINHA
                conectaCli.rs.first();
                //LOOP QUE VAI ALIMENTAR MEU VETOR DE OBJETO COM TODOS OS REGISTROS DA STRING SQL PASSADO ACIMA
                do{
                    dados.add(new Object[]{conectaCli.rs.getInt("id_cli"),conectaCli.rs.getString("nome_cli"),conectaCli.rs.getDate("data_nasc"),conectaCli.rs.getString("genero"),conectaCli.rs.getString("fone1_cli"),conectaCli.rs.getString("fone2_cli"),conectaCli.rs.getString("email_cli"),conectaCli.rs.getString("rg_cli"),conectaCli.rs.getString("cpf_cli"),conectaCli.rs.getString("estado_cli"),conectaCli.rs.getString("cidade_cli"),conectaCli.rs.getString("bairro_cli"),conectaCli.rs.getString("endereco_cli"),conectaCli.rs.getInt("numero_cli")});                      
                //ENQUANTO EXISTIR REGISTRO PULE PARA A PROXIMA LINHA
                }while(conectaCli.rs.next());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher Tabela!"+e);
            }
            conectaCli.desconecta();
            modeloTabela tabela=new modeloTabela(dados, colunas);
            
            tablePesqCli.setModel(tabela);
            tablePesqCli.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablePesqCli.getColumnModel().getColumn(0).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablePesqCli.getColumnModel().getColumn(1).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(2).setPreferredWidth(110);
            tablePesqCli.getColumnModel().getColumn(2).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(3).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(4).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(5).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(5).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(6).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(6).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(7).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(7).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(8).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(8).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(9).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(9).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(10).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(10).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(11).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(11).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(12).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(12).setResizable(true);
            tablePesqCli.getColumnModel().getColumn(13).setPreferredWidth(100);
            tablePesqCli.getColumnModel().getColumn(13).setResizable(true);
            
            
            tablePesqCli.getTableHeader().setReorderingAllowed(false);
            tablePesqCli.setAutoResizeMode(tablePesqCli.AUTO_RESIZE_OFF);
            tablePesqCli.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
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
        jPanel2 = new javax.swing.JPanel();
        opNome = new javax.swing.JRadioButton();
        opGenero = new javax.swing.JRadioButton();
        opCidade = new javax.swing.JRadioButton();
        opEstado = new javax.swing.JRadioButton();
        opId = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePesqCli = new javax.swing.JTable();
        btnCarregar = new javax.swing.JButton();
        cxtPesquisa = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();
        ListGenero = new javax.swing.JComboBox<>();
        cxtEstado = new javax.swing.JTextField();
        cxtID = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de Pesquisa - Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        opNome.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opNome.setText("Nome");

        opGenero.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opGenero.setText("Genero");
        opGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGeneroActionPerformed(evt);
            }
        });

        opCidade.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opCidade.setText("Cidade");
        opCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCidadeActionPerformed(evt);
            }
        });

        opEstado.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opEstado.setText("Estado");
        opEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEstadoActionPerformed(evt);
            }
        });

        opId.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opId.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(opNome)
                .addComponent(opGenero)
                .addComponent(opCidade)
                .addComponent(opEstado)
                .addComponent(opId))
        );

        tablePesqCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablePesqCli);

        btnCarregar.setBackground(new java.awt.Color(0, 102, 51));
        btnCarregar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("IR");

        cxtPesquisa.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cxtPesquisa.setText("Nome");
        cxtPesquisa.setToolTipText("");

        cxCidade.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cxCidade.setText("Cidade");
        cxCidade.setToolTipText("");
        cxCidade.setEnabled(false);

        ListGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Genero>", "Masculino", "Feminino" }));
        ListGenero.setEnabled(false);

        cxtEstado.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cxtEstado.setText("Estado");
        cxtEstado.setToolTipText("");
        cxtEstado.setEnabled(false);

        cxtID.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cxtID.setText("ID");
        cxtID.setEnabled(false);
        cxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtIDActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGeneroActionPerformed
        if(ListGenero.isEnabled()==false){
            ListGenero.setEnabled(true);
        }else{
            ListGenero.setEnabled(false);
        }
    }//GEN-LAST:event_opGeneroActionPerformed

    private void opCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCidadeActionPerformed
        if(cxCidade.isEnabled()==false){
            cxCidade.setEnabled(true);
        }else{
            cxCidade.setEnabled(false);
        }
    }//GEN-LAST:event_opCidadeActionPerformed

    private void opEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEstadoActionPerformed
        if(cxtEstado.isEnabled()==false){
            cxtEstado.setEnabled(true);
        }else{
            cxtEstado.setEnabled(false);
        }
    }//GEN-LAST:event_opEstadoActionPerformed

    private void cxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtIDActionPerformed
        if(cxtID.isEnabled()==false){
            cxtID.setEnabled(true);
        }else{
            cxtID.setEnabled(false);
        }
    }//GEN-LAST:event_cxtIDActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListGenero;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxtEstado;
    private javax.swing.JTextField cxtID;
    private javax.swing.JTextField cxtPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opCidade;
    private javax.swing.JRadioButton opEstado;
    private javax.swing.JRadioButton opGenero;
    private javax.swing.JRadioButton opId;
    private javax.swing.JRadioButton opNome;
    private javax.swing.JTable tablePesqCli;
    // End of variables declaration//GEN-END:variables
}
