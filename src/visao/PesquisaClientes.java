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
    
    //VARIAVEIS PARA RECEBER VALORES DA TABELA AO CLICAR NO REGISTRO DESEJADO
    String id,nome,data,genero,fon1,fone2,email,rg,cpf,cep,estado,cidade,bairro,endereco,numero;
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
            String[] colunas=new String[]{"ID","Nome","Data de Nascimento","Genero","Fone 1","Fone 2","Email","RG","CPF","cep","Estado","Cidade","Bairro","Endereço","Numero"};
            //ABRINDO CONEXÃO
            conectaCli.conexao();
            //CRIANDO UMA CONSULTA SQL
            conectaCli.executaSQL(sql);
            try {
                //SETANDO O RESULTSET DA CONSULTA NA PRIMEIRA LINHA
                conectaCli.rs.first();
                //LOOP QUE VAI ALIMENTAR MEU VETOR DE OBJETO COM TODOS OS REGISTROS DA STRING SQL PASSADO ACIMA
                do{
                    dados.add(new Object[]{conectaCli.rs.getInt("id_cli"),conectaCli.rs.getString("nome_cli"),conectaCli.rs.getDate("data_nasc"),conectaCli.rs.getString("genero"),conectaCli.rs.getString("fone1_cli"),conectaCli.rs.getString("fone2_cli"),conectaCli.rs.getString("email_cli"),conectaCli.rs.getString("rg_cli"),conectaCli.rs.getString("cpf_cli"),conectaCli.rs.getString("cep"),conectaCli.rs.getString("estado_cli"),conectaCli.rs.getString("cidade_cli"),conectaCli.rs.getString("bairro_cli"),conectaCli.rs.getString("endereco_cli"),conectaCli.rs.getInt("numero_cli")});                      
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
            tablePesqCli.getColumnModel().getColumn(14).setPreferredWidth(90);
            tablePesqCli.getColumnModel().getColumn(14).setResizable(true);
            
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePesqCli = new javax.swing.JTable();
        btnCarregar = new javax.swing.JButton();
        cxtPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

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
        tablePesqCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesqCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePesqCli);

        btnCarregar.setBackground(new java.awt.Color(0, 102, 51));
        btnCarregar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("IR");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        cxtPesquisa.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cxtPesquisa.setToolTipText("");

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
            if(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 0)==""){
                JOptionPane.showMessageDialog(null, "Favor selecionar um cliente !");
            }else{
                id=String.valueOf(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 0));
                nome=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 1);
                data=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 2);
                genero=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 3);
                fon1=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 4);
                fone2=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 5);
                email=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 6);
                rg=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 7);
                cpf=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 8);
                cep=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 9);
                estado=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 10);
                cidade=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 11);
                bairro=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 12);
                endereco=String.valueOf(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 13));
                numero=String.valueOf(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 14));
                this.dispose();
            } 
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        preenchetablePesqCli("select * from tbl_clientes where nome_cli like '%"+cxtPesquisa.getText()+"%'");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablePesqCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesqCliMouseClicked
        if(evt.getClickCount()>1){
            if(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 0).equals("")){
                JOptionPane.showMessageDialog(null, "Favor selecionar um cliente !");
            }else{
                id=String.valueOf(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 0));
                nome=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 1);
                data=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 2);
                genero=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 3);
                fon1=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 4);
                fone2=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 5);
                email=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 6);
                rg=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 7);
                cpf=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 8);
                cep=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 9);
                estado=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 10);
                cidade=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 11);
                bairro=(String) tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 12);
                endereco=String.valueOf(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 13));
                numero=String.valueOf(tablePesqCli.getModel().getValueAt(tablePesqCli.getSelectedRow(), 14));
                this.dispose();
            }    
        }
    }//GEN-LAST:event_tablePesqCliMouseClicked

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JTextField cxtPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePesqCli;
    // End of variables declaration//GEN-END:variables
}
