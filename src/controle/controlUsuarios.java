package controle;

import db.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.modeloUser;
import visao.Usuarios;
import modelo.modeloLogin;

//INSERINDO OS DADOS NO BANCO
public class controlUsuarios {
    Conexao con = new Conexao();
    modeloUser mod_user = new modeloUser();
    public void cadastra_user(modeloUser mod_user){
        con.conexao();            
            try {
                String sql = "INSERT INTO tbl_usuarios(nome_user, login_user, senha_user, cargo_user, "
                        + "cpf_user, rg_user, salario_user) values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.conn.prepareStatement(sql);
                pst.setString(1, mod_user.getNome());
                pst.setString(2, mod_user.getLogin());
                pst.setString(3, mod_user.getSenha());
                pst.setString(4, mod_user.getCargo());
                pst.setString(5, mod_user.getCPF());
                pst.setString(6, mod_user.getRG());
                pst.setInt(7, mod_user.getSalario());
                pst.execute();               
                JOptionPane.showMessageDialog(null, "Usuario Inserido com Sucesso");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Usuario!" + ex.getMessage());
            }
        
        con.desconecta();   
    }
    
    public void cadastra_privilegio(modeloUser mod){
        con.conexao();
        try {
            PreparedStatement pst=con.conn.prepareStatement("insert into tbl_privilegio (iduser_privilegio,tela_privilegio)values(?,?)");
            for(int i=0; i<mod.getTelas().size();i++){
                pst.setInt(1, mod.getId_user());
                pst.setString(2, (String) mod.getTelas().get(i));
                pst.execute();
            }
        } catch (Exception e) {
        }
        con.desconecta();
    }
    
    public int descobreIdUser(modeloUser mod){
        con.conexao();
        int id=0;
        try {
            con.executaSQL("select * from tbl_usuarios where rg_user="+mod.getRG());
            con.rs.first();
            id=con.rs.getInt("id_user");
        } catch (Exception e) {
        
        }
        con.desconecta();
        return id;
        
    }
}
