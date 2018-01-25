-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 25-Jan-2018 às 18:41
-- Versão do servidor: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtrw`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_adicionais`
--

CREATE TABLE `tbl_adicionais` (
  `id_ads` int(11) NOT NULL,
  `nome_ads` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_cadastro_lanches`
--

CREATE TABLE `tbl_cadastro_lanches` (
  `id_lanche` int(11) NOT NULL,
  `nome_lanche` varchar(30) DEFAULT NULL,
  `ingredientes_lanche` varchar(100) DEFAULT NULL,
  `categoria_lanche` int(11) DEFAULT NULL,
  `valor_lanche` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_categorias`
--

CREATE TABLE `tbl_categorias` (
  `id_cat` int(11) NOT NULL,
  `nome_cat` varchar(40) DEFAULT NULL,
  `desc_cat` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_clientes`
--

CREATE TABLE `tbl_clientes` (
  `id_cli` int(11) NOT NULL,
  `nome_cli` varchar(80) DEFAULT NULL,
  `data_nasc` date DEFAULT NULL,
  `genero` varchar(20) NOT NULL,
  `fone1_cli` varchar(20) DEFAULT NULL,
  `fone2_cli` varchar(20) DEFAULT NULL,
  `email_cli` varchar(50) DEFAULT NULL,
  `rg_cli` varchar(20) DEFAULT NULL,
  `cpf_cli` varchar(20) DEFAULT NULL,
  `cep` varchar(20) DEFAULT NULL,
  `estado_cli` varchar(10) DEFAULT NULL,
  `cidade_cli` varchar(40) DEFAULT NULL,
  `bairro_cli` varchar(40) DEFAULT NULL,
  `endereco_cli` varchar(50) DEFAULT NULL,
  `numero_cli` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbl_clientes`
--

INSERT INTO `tbl_clientes` (`id_cli`, `nome_cli`, `data_nasc`, `genero`, `fone1_cli`, `fone2_cli`, `email_cli`, `rg_cli`, `cpf_cli`, `cep`, `estado_cli`, `cidade_cli`, `bairro_cli`, `endereco_cli`, `numero_cli`) VALUES
(21, 'William José Dias', NULL, 'Masculino', '(22)22222-2222', '(22)22222-2222', 'william@william.com.br', '55.555.555-5', '555.555.555-55', '13179072', 'SP', 'Sumaré', 'Jardim Minezotta (Nova Veneza)', 'Rua Denilson de Oliveira', 500),
(22, 'Thiago Moyses', NULL, 'Feminino', '(11)11111-1111', '(11)11111-1111', 'thiago@thiago.com.br', '88.888.888-8', '888.888.888-88', '13179071', 'SP', 'Sumaré', 'Jardim Minezotta (Nova Veneza)', 'Rua Manoel Messias da Silva de 601/602 a 1999/2000', 200),
(23, 'Rafael Angolano', NULL, 'Feminino', '(24)22222-2222', '(22)22222-2222', 'rafael@angola.com.br', '55.555.555-5', '555.555.555-55', '13179050', 'SP', 'Sumaré', 'Jardim Nova Terra (Nova Veneza)', 'Rua Luiz Matias da Silva', 24),
(24, 'Caralho', NULL, 'Masculino', '(24)24242-4242', '(24)24242-4242', 'caralho@caralho.com.br', '55.555.555-5', '555.555.555-55', '13179090', 'SP', 'Sumaré', 'Jardim Minezotta (Nova Veneza)', 'Rua Vinte e Sete', 800),
(25, 'Campo de Data do Caralho', NULL, 'Masculino', '(99)99999-9999', '(99)99999-9999', 'jdateChoserDoCaralho@tomarnocu.com.br', '55.555.555-5', '555.555.555-55', '13179040', 'SP', 'Sumaré', 'Jardim Nova Terra (Nova Veneza)', 'Rua Júlia Maria Galiêta', 500),
(26, 'uhjkhjkhjkh', NULL, 'Masculino', '(99)99999-9999', '(99)99999-9999', 'gfhfghf', '55.555.555-5', '555.555.555-55', '13179072', 'SP', 'Sumaré', 'Jardim Minezotta (Nova Veneza)', 'Rua Denilson de Oliveira', 519),
(27, 'thiago moyses', NULL, 'Masculino', '(21)65515-8615', '(65)41616-9196', 'rkjgbf@dcnvbd.com', '56.414.564-5', '854.489.446-49', '13053082', 'SP', 'Campinas', 'Residencial da Paz', 'Rua João Vitorino da Silva', 7);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_contas_pagar`
--

CREATE TABLE `tbl_contas_pagar` (
  `id_cont_pag` int(11) NOT NULL,
  `data_cont_pag` date DEFAULT NULL,
  `tipo_cont_pag` varchar(20) DEFAULT NULL,
  `num_doc` int(11) DEFAULT NULL,
  `desc_cont_pag` varchar(100) DEFAULT NULL,
  `fornec_cont_pag` int(11) DEFAULT NULL,
  `valor_cont_pag` float DEFAULT NULL,
  `data_venc_pag` date DEFAULT NULL,
  `data_pag` date DEFAULT NULL,
  `situacao_cont_pag` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_contas_receber`
--

CREATE TABLE `tbl_contas_receber` (
  `id_cont_rec` int(11) NOT NULL,
  `data_cont_rec` date DEFAULT NULL,
  `cli_cont_rec` int(11) DEFAULT NULL,
  `desc_cont_rec` varchar(40) DEFAULT NULL,
  `meiorecebimento_cont_rec` varchar(20) DEFAULT NULL,
  `datalimit_cont_rec` date DEFAULT NULL,
  `status_cont_rec` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_fornecedor`
--

CREATE TABLE `tbl_fornecedor` (
  `id_fornec` int(11) NOT NULL,
  `nome_fornec` varchar(40) DEFAULT NULL,
  `cnpj_fornec` varchar(20) DEFAULT NULL,
  `estado_fornec` varchar(30) DEFAULT NULL,
  `cidade_fornec` varchar(30) DEFAULT NULL,
  `endereco_fornec` varchar(50) DEFAULT NULL,
  `num_fornec` int(11) DEFAULT NULL,
  `inscr_estadual` varchar(20) DEFAULT NULL,
  `munic_fornec` varchar(30) DEFAULT NULL,
  `fone1_fornec` varchar(20) DEFAULT NULL,
  `fone2_fornec` varchar(20) DEFAULT NULL,
  `email_fornec` varchar(40) DEFAULT NULL,
  `sigla_fornec` varchar(20) DEFAULT NULL,
  `fantasia_fornec` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_itens_del`
--

CREATE TABLE `tbl_itens_del` (
  `id_del` int(11) NOT NULL,
  `produto_del` int(11) NOT NULL,
  `adicionais_del` int(11) DEFAULT NULL,
  `quantidade_del` int(11) DEFAULT NULL,
  `valor_del` int(11) DEFAULT NULL,
  `total_del` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_motoboy`
--

CREATE TABLE `tbl_motoboy` (
  `id_motoboy` int(11) NOT NULL,
  `nome_motoboy` varchar(30) DEFAULT NULL,
  `sobrenome_motoboy` varchar(30) DEFAULT NULL,
  `modelo_moto` varchar(30) DEFAULT NULL,
  `placa_motoboby` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produtos`
--

CREATE TABLE `tbl_produtos` (
  `id_prod` int(11) NOT NULL,
  `nome_prod` varchar(255) NOT NULL,
  `categoria_prod` int(11) NOT NULL,
  `fornec_prod` int(11) NOT NULL,
  `estoque_min` int(11) NOT NULL,
  `estoque_max` int(11) NOT NULL,
  `valor_prod` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuarios`
--

CREATE TABLE `tbl_usuarios` (
  `id_user` int(11) NOT NULL,
  `nome_user` varchar(50) NOT NULL,
  `login_user` varchar(20) NOT NULL,
  `senha_user` varchar(11) NOT NULL,
  `cargo_user` varchar(30) NOT NULL,
  `salario_user` int(11) DEFAULT NULL,
  `privilegio_user` int(11) DEFAULT NULL,
  `cpf_user` varchar(255) DEFAULT NULL,
  `rg_user` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbl_usuarios`
--

INSERT INTO `tbl_usuarios` (`id_user`, `nome_user`, `login_user`, `senha_user`, `cargo_user`, `salario_user`, `privilegio_user`, `cpf_user`, `rg_user`) VALUES
(3, 'dfgfdgdfg', 'fdgfdgfdgdfg', '123', 'fvgfdgdfg', 1000, NULL, '46932786885', '5454964'),
(4, 'Rafael Correa Mateus', 'rafael', '123', 'CEO', 100000, NULL, '12345678995', '586989657');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_adicionais`
--
ALTER TABLE `tbl_adicionais`
  ADD PRIMARY KEY (`id_ads`);

--
-- Indexes for table `tbl_cadastro_lanches`
--
ALTER TABLE `tbl_cadastro_lanches`
  ADD PRIMARY KEY (`id_lanche`),
  ADD KEY `fk_categoria_lanche` (`categoria_lanche`);

--
-- Indexes for table `tbl_categorias`
--
ALTER TABLE `tbl_categorias`
  ADD PRIMARY KEY (`id_cat`);

--
-- Indexes for table `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  ADD PRIMARY KEY (`id_cli`);

--
-- Indexes for table `tbl_contas_pagar`
--
ALTER TABLE `tbl_contas_pagar`
  ADD PRIMARY KEY (`id_cont_pag`),
  ADD KEY `fk_fornec_cont_pag` (`fornec_cont_pag`);

--
-- Indexes for table `tbl_contas_receber`
--
ALTER TABLE `tbl_contas_receber`
  ADD PRIMARY KEY (`id_cont_rec`),
  ADD KEY `fk_cli_cont_rec` (`cli_cont_rec`);

--
-- Indexes for table `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  ADD PRIMARY KEY (`id_fornec`);

--
-- Indexes for table `tbl_itens_del`
--
ALTER TABLE `tbl_itens_del`
  ADD PRIMARY KEY (`id_del`),
  ADD KEY `fk_produto_del` (`produto_del`),
  ADD KEY `fk_adicionais_del` (`adicionais_del`);

--
-- Indexes for table `tbl_motoboy`
--
ALTER TABLE `tbl_motoboy`
  ADD PRIMARY KEY (`id_motoboy`),
  ADD UNIQUE KEY `nome_motoboy` (`nome_motoboy`);

--
-- Indexes for table `tbl_produtos`
--
ALTER TABLE `tbl_produtos`
  ADD PRIMARY KEY (`id_prod`),
  ADD KEY `fk_Categoria_prod` (`categoria_prod`),
  ADD KEY `fk_Fornec_prod` (`fornec_prod`);

--
-- Indexes for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_adicionais`
--
ALTER TABLE `tbl_adicionais`
  MODIFY `id_ads` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_cadastro_lanches`
--
ALTER TABLE `tbl_cadastro_lanches`
  MODIFY `id_lanche` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_categorias`
--
ALTER TABLE `tbl_categorias`
  MODIFY `id_cat` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  MODIFY `id_cli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `tbl_contas_pagar`
--
ALTER TABLE `tbl_contas_pagar`
  MODIFY `id_cont_pag` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_contas_receber`
--
ALTER TABLE `tbl_contas_receber`
  MODIFY `id_cont_rec` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  MODIFY `id_fornec` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_itens_del`
--
ALTER TABLE `tbl_itens_del`
  MODIFY `id_del` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_motoboy`
--
ALTER TABLE `tbl_motoboy`
  MODIFY `id_motoboy` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_produtos`
--
ALTER TABLE `tbl_produtos`
  MODIFY `id_prod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbl_cadastro_lanches`
--
ALTER TABLE `tbl_cadastro_lanches`
  ADD CONSTRAINT `fk_categoria_lanche` FOREIGN KEY (`categoria_lanche`) REFERENCES `tbl_categorias` (`id_cat`);

--
-- Limitadores para a tabela `tbl_contas_pagar`
--
ALTER TABLE `tbl_contas_pagar`
  ADD CONSTRAINT `fk_fornec_cont_pag` FOREIGN KEY (`fornec_cont_pag`) REFERENCES `tbl_fornecedor` (`id_fornec`);

--
-- Limitadores para a tabela `tbl_contas_receber`
--
ALTER TABLE `tbl_contas_receber`
  ADD CONSTRAINT `fk_cli_cont_rec` FOREIGN KEY (`cli_cont_rec`) REFERENCES `tbl_clientes` (`id_cli`);

--
-- Limitadores para a tabela `tbl_itens_del`
--
ALTER TABLE `tbl_itens_del`
  ADD CONSTRAINT `fk_adicionais_del` FOREIGN KEY (`adicionais_del`) REFERENCES `tbl_adicionais` (`id_ads`),
  ADD CONSTRAINT `fk_produto_del` FOREIGN KEY (`produto_del`) REFERENCES `tbl_produtos` (`id_prod`);

--
-- Limitadores para a tabela `tbl_produtos`
--
ALTER TABLE `tbl_produtos`
  ADD CONSTRAINT `fk_Categoria_prod` FOREIGN KEY (`categoria_prod`) REFERENCES `tbl_categorias` (`id_cat`),
  ADD CONSTRAINT `fk_Fornec_prod` FOREIGN KEY (`fornec_prod`) REFERENCES `tbl_fornecedor` (`id_fornec`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
