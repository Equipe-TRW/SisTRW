package controle;

import db.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import visao.Login;
import visao.Menu;
import modelo.modeloLogin;
import modelo.modeloUser;
/**
 *
 * @author informatica01
 */
public class controlLogin {
    Conexao con = new Conexao();
    ResultSet rs=null;
    
    public void valida(modeloLogin mod){
            con.conexao();
                try{
                    PreparedStatement pst=con.conn.prepareStatement("select * from tbl_usuarios where login_user=? and senha_user=?");
                    pst.setString(1, mod.getUsuario());
                    pst.setString(2, mod.getSenha());
                    rs=pst.executeQuery();
           
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            con.desconecta();
    }
    
    public int descobreIdUser(modeloLogin mod){
        con.conexao();
        int id=0;
        try {
            con.executaSQL("select * from tbl_usuarios where login_user='"+mod.getUsuario()+"'");
            con.rs.first();
            id=con.rs.getInt("id_user");
        } catch (Exception e) {
        
        }
        con.desconecta();
        return id;
        
    }
    
    public void liberaTelas(modeloLogin mod){
        con.conexao();
        try {
            con.executaSQL("select * from tbl_privilegio where iduser_privilegio='"+mod.getId_user()+"'");
            con.rs.first();
            Menu abreMenu=new Menu();
            abreMenu.setVisible(true);
            
            int tamanhoVetor=0;
            
            while(con.rs.next()){
                tamanhoVetor++;
            }
            
            String telas[]=new String[tamanhoVetor+1];
            con.rs.first();
            int pos=0;
            do{
                telas[pos]=con.rs.getString("tela_privilegio");
                pos++;
            }while(con.rs.next());
            
            do{
                for(int i=0; i<telas.length;i++){
                    if(telas[i].equals(abreMenu.menu_cad_cli.getName())){
                        abreMenu.menu_cad_cli.setEnabled(true);
                    }                  
                    if(telas[i].equals(abreMenu.menu_finan.getName())){
                        abreMenu.menu_finan.setEnabled(true);
                    }                   
                    if(telas[i].equals(abreMenu.menu_cad_cat.getName())){
                        abreMenu.menu_cad_cat.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_cad_forn.getName())){
                        abreMenu.menu_cad_forn.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_cad_lanc.getName())){
                        abreMenu.menu_cad_lanc.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_cad_moto.getName())){
                        abreMenu.menu_cad_moto.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_cad_prod.getName())){
                        abreMenu.menu_cad_prod.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_cad_user.getName())){
                        abreMenu.menu_cad_user.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_ferr_agend.getName())){
                        abreMenu.menu_ferr_agend.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_rel.getName())){
                        abreMenu.menu_rel.setEnabled(true);
                    }
                    if(telas[i].equals(abreMenu.menu_vend_pdv.getName())){
                        abreMenu.menu_vend_pdv.setEnabled(true);
                    } 
                }              
            }while(con.rs.next());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        con.desconecta();
    }
}


