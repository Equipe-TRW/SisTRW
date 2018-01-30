/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.modeloUser;
import db.Conexao;
import controle.controlUsuarios;

public class Usuarios extends javax.swing.JFrame {
    Conexao conecta = new Conexao();

    BufferedImage imagemBuffer=null;
    
    public Usuarios() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpPrevilegios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelDadosCadastrais = new javax.swing.JPanel();
        OpenImg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cxtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cxtSenha = new javax.swing.JPasswordField();
        cxtCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cxtCPF = new javax.swing.JTextField();
        cxtRG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cxtSalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        PanelNivelAcesso = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        opUser = new javax.swing.JRadioButton();
        opAdmin = new javax.swing.JRadioButton();
        opPerso = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        checkCli = new java.awt.Checkbox();
        checkProd = new java.awt.Checkbox();
        checkForne = new java.awt.Checkbox();
        checkCat = new java.awt.Checkbox();
        checkLanc = new java.awt.Checkbox();
        checkUser = new java.awt.Checkbox();
        checkMoto = new java.awt.Checkbox();
        checkDel = new java.awt.Checkbox();
        checkPdv = new java.awt.Checkbox();
        checkAgend = new java.awt.Checkbox();
        checkRel = new java.awt.Checkbox();
        checkFinan = new java.awt.Checkbox();
        jButton2 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnPesquisasr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        PanelDadosCadastrais.setBackground(new java.awt.Color(255, 255, 255));

        OpenImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/psquisar.png"))); // NOI18N
        OpenImg.setToolTipText("Procurar Cliente");
        OpenImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenImgActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel1.setText("Nome:");

        cxtNome.setBackground(new java.awt.Color(255, 255, 204));
        cxtNome.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel2.setText("Login:");

        cxtLogin.setBackground(new java.awt.Color(255, 255, 204));
        cxtLogin.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel3.setText("Senha:");

        cxtSenha.setBackground(new java.awt.Color(255, 255, 204));
        cxtSenha.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        cxtCargo.setBackground(new java.awt.Color(255, 255, 204));
        cxtCargo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel4.setText("Cargo:");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel5.setText("CPF:");

        cxtCPF.setBackground(new java.awt.Color(255, 255, 204));
        cxtCPF.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        cxtRG.setBackground(new java.awt.Color(255, 255, 204));
        cxtRG.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel6.setText("RG:");

        cxtSalario.setBackground(new java.awt.Color(255, 255, 204));
        cxtSalario.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel7.setText("Salario Base R$:");

        lblFoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Inserir Foto");
        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PanelDadosCadastraisLayout = new javax.swing.GroupLayout(PanelDadosCadastrais);
        PanelDadosCadastrais.setLayout(PanelDadosCadastraisLayout);
        PanelDadosCadastraisLayout.setHorizontalGroup(
            PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OpenImg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 210, Short.MAX_VALUE))
                            .addComponent(cxtNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cxtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxtSenha, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(cxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxtCargo)
                            .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(cxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        PanelDadosCadastraisLayout.setVerticalGroup(
            PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OpenImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(PanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelDadosCadastraisLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(46, 46, 46))))
        );

        jTabbedPane1.addTab("Dados Cadastrais", PanelDadosCadastrais);

        PanelNivelAcesso.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Previlégio:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 11))); // NOI18N

        gpPrevilegios.add(opUser);
        opUser.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opUser.setText("Usuário");
        opUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUserActionPerformed(evt);
            }
        });

        gpPrevilegios.add(opAdmin);
        opAdmin.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opAdmin.setText("Administrador");
        opAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAdminActionPerformed(evt);
            }
        });

        gpPrevilegios.add(opPerso);
        opPerso.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        opPerso.setText("Personalizado");
        opPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPersoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(opUser)
                .addGap(38, 38, 38)
                .addComponent(opAdmin)
                .addGap(29, 29, 29)
                .addComponent(opPerso)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(opUser)
                .addComponent(opAdmin)
                .addComponent(opPerso))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telas á Liberar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 11))); // NOI18N

        checkCli.setEnabled(false);
        checkCli.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkCli.setLabel("Clientes");

        checkProd.setEnabled(false);
        checkProd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkProd.setLabel("Produtos");

        checkForne.setEnabled(false);
        checkForne.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkForne.setLabel("Fornecedores");

        checkCat.setEnabled(false);
        checkCat.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkCat.setLabel("Categorias");

        checkLanc.setEnabled(false);
        checkLanc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkLanc.setLabel("Lanches");

        checkUser.setEnabled(false);
        checkUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkUser.setLabel("Usuários");

        checkMoto.setEnabled(false);
        checkMoto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkMoto.setLabel("Motoboys");

        checkDel.setEnabled(false);
        checkDel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkDel.setLabel("Delivery");

        checkPdv.setEnabled(false);
        checkPdv.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkPdv.setLabel("PDV");

        checkAgend.setEnabled(false);
        checkAgend.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkAgend.setLabel("Agenda");

        checkRel.setEnabled(false);
        checkRel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkRel.setLabel("Relatórios");

        checkFinan.setEnabled(false);
        checkFinan.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkFinan.setLabel("Financeiro");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(checkProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkForne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(checkMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(checkPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(checkAgend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(checkFinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkForne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAgend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkFinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelNivelAcessoLayout = new javax.swing.GroupLayout(PanelNivelAcesso);
        PanelNivelAcesso.setLayout(PanelNivelAcessoLayout);
        PanelNivelAcessoLayout.setHorizontalGroup(
            PanelNivelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNivelAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNivelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelNivelAcessoLayout.setVerticalGroup(
            PanelNivelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNivelAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Niveis de Acesso", PanelNivelAcesso);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton2.setText("Novo");
        jButton2.setToolTipText("Novo Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Cadastrar Cliente");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        jButton4.setText("Alterar");
        jButton4.setToolTipText("Alterar Cliente");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setToolTipText("Excluir Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnPesquisasr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/psquisar.png"))); // NOI18N
        btnPesquisasr.setText("Procurar");
        btnPesquisasr.setToolTipText("Procurar Cliente");
        btnPesquisasr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisasrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisasr)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(btnPesquisasr))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisasrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisasrActionPerformed

    }//GEN-LAST:event_btnPesquisasrActionPerformed

    private void OpenImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenImgActionPerformed
        try {      
            JFileChooser abrir = new JFileChooser();  
            abrir.setFileFilter(new FileNameExtensionFilter("Imagem","bmp", "png", "jpg", "jpeg"));
            abrir.setAcceptAllFileFilterUsed(false);
            abrir.setDialogTitle("Selecionar Imagem");
            abrir.showOpenDialog(this);
            String caminho=""+abrir.getSelectedFile().getAbsolutePath();
            imagemBuffer=ImageIO.read(new File(caminho));
            Image diminuirImagem=imagemBuffer.getScaledInstance(131, 157, 0);
            lblFoto.setText("");
            lblFoto.setIcon(new ImageIcon(diminuirImagem));
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_OpenImgActionPerformed

    private void opPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPersoActionPerformed
        checkAgend.setEnabled(true);
        checkCat.setEnabled(true);
        checkCli.setEnabled(true);
        checkDel.setEnabled(true);
        checkFinan.setEnabled(true);
        checkForne.setEnabled(true);
        checkLanc.setEnabled(true);
        checkMoto.setEnabled(true);
        checkPdv.setEnabled(true);
        checkProd.setEnabled(true);
        checkRel.setEnabled(true);
        checkUser.setEnabled(true);
        
        checkAgend.setState(false);
        checkCat.setState(false);
        checkCli.setState(false);
        checkDel.setState(false);
        checkFinan.setState(false);
        checkForne.setState(false);
        checkLanc.setState(false);
        checkMoto.setState(false);
        checkPdv.setState(false);
        checkProd.setState(false);
        checkRel.setState(false);
        checkUser.setState(false);
    }//GEN-LAST:event_opPersoActionPerformed

    private void opUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUserActionPerformed
        checkAgend.setEnabled(false);
        checkCat.setEnabled(false);
        checkCli.setEnabled(true);
        checkDel.setEnabled(true);
        checkFinan.setEnabled(false);
        checkForne.setEnabled(false);
        checkLanc.setEnabled(false);
        checkMoto.setEnabled(false);
        checkPdv.setEnabled(true);
        checkProd.setEnabled(false);
        checkRel.setEnabled(false);
        checkUser.setEnabled(false);
        
        checkAgend.setState(false);
        checkCat.setState(false);
        checkCli.setState(true);
        checkDel.setState(true);
        checkFinan.setState(false);
        checkForne.setState(false);
        checkLanc.setState(false);
        checkMoto.setState(false);
        checkPdv.setState(true);
        checkProd.setState(false);
        checkRel.setState(false);
        checkUser.setState(false);
    }//GEN-LAST:event_opUserActionPerformed

    private void opAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAdminActionPerformed
        checkAgend.setEnabled(true);
        checkCat.setEnabled(true);
        checkCli.setEnabled(true);
        checkDel.setEnabled(true);
        checkFinan.setEnabled(true);
        checkForne.setEnabled(true);
        checkLanc.setEnabled(true);
        checkMoto.setEnabled(true);
        checkPdv.setEnabled(true);
        checkProd.setEnabled(true);
        checkRel.setEnabled(true);
        checkUser.setEnabled(true);
        
        checkAgend.setState(true);
        checkCat.setState(true);
        checkCli.setState(true);
        checkDel.setState(true);
        checkFinan.setState(true);
        checkForne.setState(true);
        checkLanc.setState(true);
        checkMoto.setState(true);
        checkPdv.setState(true);
        checkProd.setState(true);
        checkRel.setState(true);
        checkUser.setState(true);
        
    }//GEN-LAST:event_opAdminActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //PASSANDO INFORMAÇOES PARA O MODELO USER       
        modeloUser mod = new modeloUser();
        controlUsuarios controle = new controlUsuarios();
        
        mod.setNome(cxtNome.getText());
        mod.setLogin(cxtLogin.getText());
        mod.setSenha(cxtSenha.getText());
        mod.setCargo(cxtCargo.getText());
        mod.setCPF(cxtCPF.getText());
        mod.setRG(cxtRG.getText());
        mod.setSalario(Integer.parseInt(cxtSalario.getText()));
        
        controle.cadastra_user(mod);
        
        cxtNome.setText("");
        cxtLogin.setText("");
        cxtSenha.setText("");
        cxtCargo.setText("");
        cxtCPF.setText("");
        cxtRG.setText("");
        cxtSalario.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpenImg;
    private javax.swing.JPanel PanelDadosCadastrais;
    private javax.swing.JPanel PanelNivelAcesso;
    private javax.swing.JButton btnPesquisasr;
    private javax.swing.JButton btnSalvar;
    private java.awt.Checkbox checkAgend;
    private java.awt.Checkbox checkCat;
    private java.awt.Checkbox checkCli;
    private java.awt.Checkbox checkDel;
    private java.awt.Checkbox checkFinan;
    private java.awt.Checkbox checkForne;
    private java.awt.Checkbox checkLanc;
    private java.awt.Checkbox checkMoto;
    private java.awt.Checkbox checkPdv;
    private java.awt.Checkbox checkProd;
    private java.awt.Checkbox checkRel;
    private java.awt.Checkbox checkUser;
    private javax.swing.JTextField cxtCPF;
    private javax.swing.JTextField cxtCargo;
    private javax.swing.JTextField cxtLogin;
    private javax.swing.JTextField cxtNome;
    private javax.swing.JTextField cxtRG;
    private javax.swing.JTextField cxtSalario;
    private javax.swing.JPasswordField cxtSenha;
    private javax.swing.ButtonGroup gpPrevilegios;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JRadioButton opAdmin;
    private javax.swing.JRadioButton opPerso;
    private javax.swing.JRadioButton opUser;
    // End of variables declaration//GEN-END:variables
}
