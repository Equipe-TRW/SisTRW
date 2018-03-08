/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import db.Conexao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import modelo.modeloTabela;
import controle.controleContasPagar;
import controle.controleContasPagar.RendererCustom;
import static java.awt.SystemColor.control;
import static java.lang.System.exit;
import java.text.SimpleDateFormat;
import static javafx.application.Platform.exit;
import modelo.modeloContasPagar;

public class PesqContasPagar extends javax.swing.JFrame {

    Conexao conectaPesq=new Conexao();
    controleContasPagar control=new controleContasPagar();
    modeloContasPagar mod=new modeloContasPagar();
    //CAMPOS JA TABLE, DECLAREI AQUI PARA ENVIAR AO FORM DE CONTAS A PAGAR
    String id,dataCont,tipoCont,numDoc,descCont,fornecCont,valorCont,dataVenc,dataPag,sit;
    
    public PesqContasPagar() {
        initComponents();
        preenchetblPesquisa("select * from tbl_contas_pagar where situacao_cont_pag='"+ListFiltro.getSelectedItem()+"'");
        pintaCelula();
    }

    //METODO RESPONSAVEL POR CARREGAR OS DADOS DA TABELA CLIENTES DO BD NA JTABLE DO PROJETO
    public void preenchetblPesquisa(String sql){
        ArrayList dados=new ArrayList();
            //VETOR COLUNAS COM OS CABEÇALHOS
            String[] colunas=new String[]{"Status","ID","Data de Cadastro","Tipo de Conta","Num Doc","Descrição","Fornecedor","Valor R$","Data de Vencimento","Data de Pagamento"};
            //ABRINDO CONEXÃO
            conectaPesq.conexao();
            //CRIANDO UMA CONSULTA SQL
            conectaPesq.executaSQL(sql);
            try {
                //SETANDO O RESULTSET DA CONSULTA NA PRIMEIRA LINHA
                conectaPesq.rs.first();
                //LOOP QUE VAI ALIMENTAR MEU VETOR DE OBJETO COM TODOS OS REGISTROS DA STRING SQL PASSADO ACIMA
                do{
                    dados.add(new Object[]{conectaPesq.rs.getString("situacao_cont_pag"),conectaPesq.rs.getInt("id_cont_pag"),conectaPesq.rs.getDate("data_cont_pag"),conectaPesq.rs.getString("tipo_cont_pag"),conectaPesq.rs.getInt("num_doc"),conectaPesq.rs.getString("desc_cont_pag"),conectaPesq.rs.getInt("fornec_cont_pag"),conectaPesq.rs.getFloat("valor_cont_pag"),conectaPesq.rs.getDate("data_venc_pag"),conectaPesq.rs.getDate("data_pag")});                      
                //ENQUANTO EXISTIR REGISTRO PULE PARA A PROXIMA LINHA
                }while(conectaPesq.rs.next());
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Erro ao preencher Tabela!"+e);
            }
            conectaPesq.desconecta();
            modeloTabela tabela=new modeloTabela(dados, colunas);
            
            tblPesquisa.setModel(tabela);
            tblPesquisa.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblPesquisa.getColumnModel().getColumn(0).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblPesquisa.getColumnModel().getColumn(1).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(2).setPreferredWidth(110);
            tblPesquisa.getColumnModel().getColumn(2).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(3).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(4).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(5).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(6).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(7).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(8).setResizable(true);
            tblPesquisa.getColumnModel().getColumn(9).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(9).setResizable(true);
            
            tblPesquisa.getTableHeader().setReorderingAllowed(false);
            tblPesquisa.setAutoResizeMode(tblPesquisa.AUTO_RESIZE_OFF);
            tblPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    //METODO QUE FAZ A VERIFICAÇÃO DO STATUS DA TABELA E APLICA A COR NA CELULA DESEJADA
    public void pintaCelula(){
        for(int i=0; i<tblPesquisa.getRowCount();i++){
            if(tblPesquisa.getValueAt(i, 0).equals("Em Aberto")){
                tblPesquisa.getColumnModel().getColumn(0).setCellRenderer(control.new RendererCustom().getCor());
            }
            if(tblPesquisa.getValueAt(i, 0).equals("Pago")){
                tblPesquisa.getColumnModel().getColumn(0).setCellRenderer(control.new RendererCustom().getCor2());
            }
        }
    }
    
    //METODO QUE FAZ O FILTRO DE PESQUISA
    public void filtroPesq(){
        if((ListFiltro.getSelectedItem().equals("Todos"))&&(opHabilitaData.isSelected()==false)){
            preenchetblPesquisa("select * from tbl_contas_pagar");
            pintaCelula();
        }
        if((ListFiltro.getSelectedItem().equals("Pago"))&&(opHabilitaData.isSelected()==false)){
            preenchetblPesquisa("select * from tbl_contas_pagar where situacao_cont_pag='"+ListFiltro.getSelectedItem()+"'");
            pintaCelula();
        }
        if((ListFiltro.getSelectedItem().equals("Em Aberto"))&&(opHabilitaData.isSelected()==false)){
            preenchetblPesquisa("select * from tbl_contas_pagar where situacao_cont_pag='"+ListFiltro.getSelectedItem()+"'");
            pintaCelula();
        }
        if(opHabilitaData.isSelected()){
            java.sql.Date Data1=new java.sql.Date(cxtData1.getDate().getTime());
            java.sql.Date Data2=new java.sql.Date(cxtData2.getDate().getTime());
            preenchetblPesquisa("select * from tbl_contas_pagar where data_venc_pag between '"+Data1+"' and '"+Data2+"' and situacao_cont_pag='"+ListFiltro.getSelectedItem()+"'");
            pintaCelula();
        }        
        if((ListFiltro.getSelectedItem().equals("Todos")&&(opHabilitaData.isSelected()))){
            java.sql.Date Data1=new java.sql.Date(cxtData1.getDate().getTime());
            java.sql.Date Data2=new java.sql.Date(cxtData2.getDate().getTime());
            preenchetblPesquisa("select * from tbl_contas_pagar where data_venc_pag between '"+Data1+"' and '"+Data2+"'");
            pintaCelula();
        }
    }
   

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisa = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAltera = new javax.swing.JButton();
        btnPagamento = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ListFiltro = new javax.swing.JComboBox<>();
        cxtData1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        cxtData2 = new com.toedter.calendar.JDateChooser();
        opHabilitaData = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Contas a Pagar");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblPesquisa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPesquisa);

        btnNovo.setBackground(new java.awt.Color(0, 102, 51));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAltera.setBackground(new java.awt.Color(204, 51, 0));
        btnAltera.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAltera.setForeground(new java.awt.Color(255, 255, 255));
        btnAltera.setText("Alterar");
        btnAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraActionPerformed(evt);
            }
        });

        btnPagamento.setBackground(new java.awt.Color(102, 0, 0));
        btnPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamento.setText("Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        btnExclui.setBackground(new java.awt.Color(204, 0, 0));
        btnExclui.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExclui.setForeground(new java.awt.Color(255, 255, 255));
        btnExclui.setText("Excluir");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Filtro:");

        ListFiltro.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        ListFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Aberto", "Pago", "Todos" }));

        cxtData1.setEnabled(false);

        jLabel2.setText("á");

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/find.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        cxtData2.setEnabled(false);

        opHabilitaData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opHabilitaData.setText("Habilita Data");
        opHabilitaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opHabilitaDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAltera)
                        .addGap(7, 7, 7)
                        .addComponent(btnExclui))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opHabilitaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cxtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusca)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ListFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opHabilitaData))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cxtData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAltera, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnExclui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(670, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        ContasPagar abreContasPagar=new ContasPagar();
        abreContasPagar.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        filtroPesq();      
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void opHabilitaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opHabilitaDataActionPerformed
        if(opHabilitaData.isSelected()){
            cxtData1.setEnabled(true);
            cxtData2.setEnabled(true);
        }else{
            cxtData1.setEnabled(false);
            cxtData2.setEnabled(false);
        }
        
    }//GEN-LAST:event_opHabilitaDataActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        int id=0;
        int op=JOptionPane.showConfirmDialog(null, "Tem certeza que deseja efetuar o pagamento dessa conta ?","Atenção",JOptionPane.YES_NO_OPTION);    
        id=(int) tblPesquisa.getModel().getValueAt(tblPesquisa.getSelectedRow(),1);
        if(id==0){
            JOptionPane.showMessageDialog(null, "Selecione uma conta ou um intervalo de contas para estar concluindo a operação");
            return;
        }
        if(op==JOptionPane.YES_OPTION){
           java.util.Date dataUtil = new java.util.Date();  
           java.sql.Date dataHoje = new java.sql.Date(dataUtil.getTime());              
           mod.setId(id);
           mod.setData_paga(dataHoje);
           control.quitaConta(mod);
           filtroPesq(); 
        }               
                
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        int id=0;
        int op=JOptionPane.showConfirmDialog(null, "Tem certeza que deseja efetuar a exclusão dessa conta ?","Atenção",JOptionPane.YES_NO_OPTION);    
        id=(int) tblPesquisa.getModel().getValueAt(tblPesquisa.getSelectedRow(),1);
        if(id==0){
            JOptionPane.showMessageDialog(null, "Selecione uma conta ou um intervalo de contas para estar concluindo a operação");
            return;
        }
        if(op==JOptionPane.YES_OPTION){             
           mod.setId(id);
           control.ExcluiConta(mod);
           filtroPesq(); 
        }
        
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void btnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraActionPerformed
        int id=0;
        int op=JOptionPane.showConfirmDialog(null, "Tem certeza que deseja efetuar a exclusão dessa conta ?","Atenção",JOptionPane.YES_NO_OPTION);    
        id=(int) tblPesquisa.getModel().getValueAt(tblPesquisa.getSelectedRow(),1);
        if(id==0){
            JOptionPane.showMessageDialog(null, "Selecione uma conta para estar alterando os dados");
            return;
        }
        sit=(String)tblPesquisa.getModel().getValueAt(tblPesquisa.getSelectedRow(),0);
        id=(int)tblPesquisa.getModel().getValueAt(tblPesquisa.getSelectedRow(),1);
        dataCont=(String)tblPesquisa.getModel().getValueAt(tblPesquisa.getSelectedRow(),2);
        
    }//GEN-LAST:event_btnAlteraActionPerformed

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
            java.util.logging.Logger.getLogger(PesqContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesqContasPagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListFiltro;
    private javax.swing.JButton btnAltera;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPagamento;
    private com.toedter.calendar.JDateChooser cxtData1;
    private com.toedter.calendar.JDateChooser cxtData2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox opHabilitaData;
    private javax.swing.JTable tblPesquisa;
    // End of variables declaration//GEN-END:variables
}
