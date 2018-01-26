/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.modeloCategorias;
import db.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class controlCatego {
    Conexao conectaCat=new Conexao();
    
    public void cadastraCat(modeloCategorias mod){
        conectaCat.conexao();
            try {
                PreparedStatement pst=conectaCat.conn.prepareStatement("insert into tbl_categorias(nome_cat, desc_cat)values(?,?)");
                pst.setString(1, mod.getCategoria());
                pst.setString(2, mod.getDescricao());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Categoria cadastrada com Sucesso !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar categoria !");
            }
        conectaCat.desconecta();
    }
}
