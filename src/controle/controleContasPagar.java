/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import db.Conexao;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import modelo.modeloContasPagar;

public class controleContasPagar {
    Conexao conectaCont=new Conexao();
    
    public void cadastraConta(modeloContasPagar mod){
        conectaCont.conexao();
        try {
            PreparedStatement pst=conectaCont.conn.prepareStatement("insert into tbl_contas_pagar (data_cont_pag, tipo_cont_pag, num_doc, desc_cont_pag, fornec_cont_pag, valor_cont_pag, data_venc_pag, data_pag, situacao_cont_pag)values(?,?,?,?,?,?,?,?,?)");
            pst.setDate(1, mod.getData_inclusao());
            pst.setString(2, mod.getTip_pag());
            pst.setInt(3, mod.getCod_barras());
            pst.setString(4, mod.getDesc());
            pst.setInt(5, mod.getFornec());
            pst.setFloat(6, mod.getValor());
            pst.setDate(7, mod.getData_venc());
            pst.setDate(8, mod.getData_paga());
            pst.setString(9, mod.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);       
        }
        conectaCont.desconecta();
    }
    
    //METODO RESPONSAVEL POR PINTAR UMA CELULA DA JTABLE DE ACORDO COM O STATUS
    public class RendererCustom{
       DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();       
       // Alinhamento da coluna
        public DefaultTableCellRenderer getAlinhamentoColumn(String tipo){    
             cellRender.setHorizontalAlignment(getAlinhamentoColum(tipo));   
             return cellRender;
        }

        private int getAlinhamentoColum(String alinhamento){   
             switch(alinhamento){
                 case "centro": return SwingConstants.CENTER;
                 case "direita": return SwingConstants.RIGHT;
                 default: return SwingConstants.LEFT;
             }   
        }
         // Mudar a cor da coluna para vemelho
        public DefaultTableCellRenderer getCor(){    
             cellRender.setBackground(Color.red);
             cellRender.setForeground(Color.WHITE);
             return cellRender;
        }
         // Mudar a cor da coluna para Verde
        public DefaultTableCellRenderer getCor2(){    
             cellRender.setBackground(Color.blue);
             cellRender.setForeground(Color.WHITE);
             return cellRender;
        } 
    }
    
    //METODO RESPONSAVEL POR QUITAR UMA CONTA
    public void quitaConta(modeloContasPagar mod){
       conectaCont.conexao();
        try {
            PreparedStatement pst=conectaCont.conn.prepareStatement("update tbl_contas_pagar set situacao_cont_pag=?, data_pag=? where id_cont_pag=?");
            pst.setString(1, "Pago");
            pst.setDate(2, mod.getData_paga());
            pst.setInt(3, mod.getId());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pagamento efetuado com sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);       
        }
        conectaCont.desconecta(); 
    }
    
    public void ExcluiConta(modeloContasPagar mod){
       conectaCont.conexao();
        try {
            PreparedStatement pst=conectaCont.conn.prepareStatement("delete from tbl_contas_pagar where id_cont_pag=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Exclusão efetuado com Sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);       
        }
        conectaCont.desconecta(); 
    }
}
