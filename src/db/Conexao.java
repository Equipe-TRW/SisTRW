/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import  java.sql.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
   public Statement stm;
   public ResultSet rs;
   
   private String driver="com.mysql.jdbc.Driver";
   private String caminho="jdbc:mysql://localhost:3306/dbtrw";
   private String usuario="root";
   private String senha="";
   public Connection conn;

    public void conexao(){
       try {
           System.setProperty("jdbc.Drivers", driver);
           conn=DriverManager.getConnection(caminho, usuario, senha);
           //JOptionPane.showMessageDialog(null, "Conectado com Sucesso !");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao se Conectar com o Banco: "+ex);
       }
   }
    
    public void executaSQL(String sql){
       try {
           stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);          
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "erro ao executar SQL"+ex);
       }
      
    }
   
   public void desconcta(){
       try {
           conn.close();
           //JOptionPane.showMessageDialog(null, "Desconectado com Sucesso ");
       } catch (Exception e) {
           //JOptionPane.showMessageDialog(null, "Erro ao Desconectar: "+e);
       }
   }
}



