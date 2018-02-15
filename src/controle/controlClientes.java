/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import db.Conexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.modeloClientes;

public class controlClientes {
    Conexao conectaCli=new Conexao();
    public void cadastraClientes(modeloClientes mod){
        conectaCli.conexao();
        
        try {
            //PESQUISANDO O NOME DO USUARIONO BANCO
            PreparedStatement pst2 = conectaCli.conn.prepareStatement("SELECT * FROM tbl_clientes WHERE nome_cli = '"
                    + mod.getNome_cli() + "'");
            ResultSet rs=null;
            rs=pst2.executeQuery();
            //TESTANDO SE USUARIO JÁ EXISTE
            if(rs.next()){
            
                JOptionPane.showMessageDialog(null, "Usuario Ja Cadastrado!");
                
            }else{
                //CADASTRANDO NOVO USUARIO CASO NAO EXISTA
                PreparedStatement pst=conectaCli.conn.prepareStatement("insert into tbl_clientes (nome_cli, data_nasc, genero, fone1_cli, fone2_cli, email_cli, rg_cli, cpf_cli, cep, estado_cli, cidade_cli, bairro_cli, endereco_cli, numero_cli)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, mod.getNome_cli());
                pst.setDate(2, mod.getData_nasc());
                pst.setString(3, mod.getGenero());
                pst.setString(4, mod.getFone1());
                pst.setString(5, mod.getFone2());
                pst.setString(6, mod.getEmail());
                pst.setString(7, mod.getRg());
                pst.setString(8, mod.getCpf());
                pst.setString(9, mod.getCep());
                pst.setString(10, mod.getEstado());
                pst.setString(11, mod.getCidade());
                pst.setString(12, mod.getBairro());
                pst.setString(13, mod.getEndereco());
                pst.setInt(14, mod.getNumero());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso !");
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi Possivel Cadastrar Usuario!" + ex.getMessage());
        }
        
        /*#############################################################################################*/
        
        conectaCli.desconecta();
    }
    
    public void ExcluiCliente(modeloClientes mod){
            conectaCli.conexao();
                try {
                    PreparedStatement pst=conectaCli.conn.prepareStatement("delete from tbl_clientes where id_cli=?");
                    pst.setInt(1, mod.getId_cli());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Cliente Excluido com Sucesso !");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir Cliente !");
                }
            conectaCli.desconecta();
    }
    
    public void AlteraCliente(modeloClientes mod){
        conectaCli.conexao();
            try {
                PreparedStatement pst=conectaCli.conn.prepareStatement("update tbl_clientes set nome_cli=?, data_nasc=?, genero=?, fone1_cli=?, fone2_cli=?, email_cli=?, rg_cli=?, cpf_cli=?, cep=?, estado_cli=?, cidade_cli=?, bairro_cli=?, endereco_cli=?, numero_cli=? where id_cli=?");
                pst.setString(1, mod.getNome_cli());
                pst.setDate(2, mod.getData_nasc());
                pst.setString(3, mod.getGenero());
                pst.setString(4, mod.getFone1());
                pst.setString(5, mod.getFone2());
                pst.setString(6, mod.getEmail());
                pst.setString(7, mod.getRg());
                pst.setString(8, mod.getCpf());
                pst.setString(9, mod.getCep());
                pst.setString(10, mod.getEstado());
                pst.setString(11, mod.getCidade());
                pst.setString(12, mod.getBairro());
                pst.setString(13, mod.getEndereco());
                pst.setInt(14, mod.getNumero());
                pst.setInt(15, mod.getId_cli());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados de Cliente !");
            }
        conectaCli.desconecta();
    }
}

