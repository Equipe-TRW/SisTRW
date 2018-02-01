/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.modeloConfigEmail;
import db.Conexao;
import java.io.File;
import java.sql.*;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class controlConfigEmail {
    Conexao conectaEmail=new Conexao();
    
    public void ConfiguraEmail(modeloConfigEmail mod){
        conectaEmail.conexao();
            try {
                PreparedStatement pst=conectaEmail.conn.prepareStatement("update tbl_config_mail set serv_smtp=?,porta=?,email=?,nome=?,senha=? where id_email=?");
                pst.setString(1, mod.getEnd_smtp());
                pst.setInt(2, mod.getPorta());
                pst.setString(3, mod.getEmail());
                pst.setString(4, mod.getNome());
                pst.setString(5, mod.getSenha());
                pst.setInt(6, mod.getId());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dados Atualizados");
            } catch (Exception e) {
                
            }
        conectaEmail.desconecta();
    }
    
    public int RetornaIDEmail(modeloConfigEmail mod){
        conectaEmail.conexao();
        int id=0;
            try {
                conectaEmail.executaSQL("select * from tbl_config_mail");
                conectaEmail.rs.first();
                id=conectaEmail.rs.getInt("id_email");
            } catch (Exception e) {
                
            }
        conectaEmail.desconecta();
        return id;
    }
    public void EmailAnexo(modeloConfigEmail mod) {      
        try {
            conectaEmail.conexao();
                    conectaEmail.executaSQL("select * from tbl_config_mail");
                    conectaEmail.rs.first();
            
            //usuario e senha do seu gmail
            final String usuario = conectaEmail.rs.getString("email");
            final String senha = conectaEmail.rs.getString("senha");

            //config. do gmail
            Properties mailProps = new Properties();
            mailProps.put("mail.transport.protocol", "smtp");
            mailProps.put("mail.smtp.starttls.enable", "true");
            mailProps.put("mail.smtp.host", conectaEmail.rs.getString("serv_smtp"));
            mailProps.put("mail.smtp.auth", "true");
            mailProps.put("mail.smtp.user", usuario);
            mailProps.put("mail.debug", "true");
            mailProps.put("mail.smtp.port", conectaEmail.rs.getInt("porta"));
            mailProps.put("mail.smtp.socketFactory.port", conectaEmail.rs.getInt("porta"));
            mailProps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            mailProps.put("mail.smtp.socketFactory.fallback", "false");

            //eh necessario autenticar
            Session mailSession = Session.getInstance(mailProps, new Authenticator() {

                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, senha);
                }
            });
            mailSession.setDebug(false);

            //config. da mensagem
            Message mailMessage = new MimeMessage(mailSession);

            //remetente
            mailMessage.setFrom(new InternetAddress(conectaEmail.rs.getString("email"), conectaEmail.rs.getString("nome")));
            
            //destinatario
            mailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mod.getDestinatario()));

            //mensagem que vai no corpo do email
            MimeBodyPart mbpMensagem = new MimeBodyPart();
            mbpMensagem.setText(mod.getMensagem());

            //partes do email
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbpMensagem);
            
            /*
            String Endereco_Anexo = "";
            if (Anexo != null) { // se tiver alguma coisa anexada ela inicializar o comando abaixo
                for (File element : Anexo) {
                    Endereco_Anexo = element.getPath();
                    String imagem = Endereco_Anexo;
                    File Arquivo = new File(imagem);
                    //setando o anexo
                    MimeBodyPart mbpAnexo = new MimeBodyPart();
                    mbpAnexo.setDataHandler(new DataHandler(new FileDataSource(Arquivo)));
                    mbpAnexo.setFileName(Arquivo.getName());
                    mp.addBodyPart(mbpAnexo);
                }
            }
            */

            //assunto do email
            mailMessage.setSubject(mod.getAssunto());

            //seleciona o conteudo 
            mailMessage.setContent(mp);
            
            //envia o email
            Transport.send(mailMessage);
            JOptionPane.showMessageDialog(null, "Email Enviado com Sucesso");
            conectaEmail.desconecta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro no Envio !\n"+e);
        }
    }
}
