-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Nov-2018 às 11:37
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cronograma`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `banco`
--

CREATE TABLE `banco` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `banco`
--

INSERT INTO `banco` (`id`, `conteudo`, `data`, `hora`) VALUES
(3, 'poo', '20/11/2018', '34:34'),
(4, 'Excluir informações e editar', '04/02/2018', '14:50');

-- --------------------------------------------------------

--
-- Estrutura da tabela `biologia`
--

CREATE TABLE `biologia` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `biologia`
--

INSERT INTO `biologia` (`id`, `conteudo`, `data`, `hora`) VALUES
(3, 'Bacteria/Protozoario', '29/08/2019', '23:02'),
(4, 'Virus', '30/11/2018', '01:40');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ed`
--

CREATE TABLE `ed` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `ed`
--

INSERT INTO `ed` (`id`, `conteudo`, `data`, `hora`) VALUES
(1, 'Sistema Muscular', '12/12/2018', '12:30'),
(2, 'Corpo humano', '10/02/2018', '12:30');

-- --------------------------------------------------------

--
-- Estrutura da tabela `espanhol`
--

CREATE TABLE `espanhol` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `espanhol`
--

INSERT INTO `espanhol` (`id`, `conteudo`, `data`, `hora`) VALUES
(1, 'Tempo verbais', '03/04/2018', '05:40');

-- --------------------------------------------------------

--
-- Estrutura da tabela `filosofia`
--

CREATE TABLE `filosofia` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fisica`
--

CREATE TABLE `fisica` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `login`, `senha`) VALUES
(2, 'admin', 'admin', 'admin'),
(3, 'Ana Valeria', 'ana', 'ana'),
(4, 'valzinha', 'val', 'val');

-- --------------------------------------------------------

--
-- Estrutura da tabela `geografia`
--

CREATE TABLE `geografia` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `historia`
--

CREATE TABLE `historia` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingles`
--

CREATE TABLE `ingles` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `ingles`
--

INSERT INTO `ingles` (`id`, `conteudo`, `data`, `hora`) VALUES
(1, 'Verbos', '30/04/2018', '02:30');

-- --------------------------------------------------------

--
-- Estrutura da tabela `matematica`
--

CREATE TABLE `matematica` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `php`
--

CREATE TABLE `php` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `php`
--

INSERT INTO `php` (`id`, `conteudo`, `data`, `hora`) VALUES
(1, 'castigo', '26/12/2018', '08:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `portugues`
--

CREATE TABLE `portugues` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `portugues`
--

INSERT INTO `portugues` (`id`, `conteudo`, `data`, `hora`) VALUES
(1, 'Acentuação(virgula)', '21/02/2018', '03:30');

-- --------------------------------------------------------

--
-- Estrutura da tabela `quimica`
--

CREATE TABLE `quimica` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `redes`
--

CREATE TABLE `redes` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `sociologia`
--

CREATE TABLE `sociologia` (
  `id` int(11) NOT NULL,
  `conteudo` varchar(150) NOT NULL,
  `data` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `banco`
--
ALTER TABLE `banco`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `biologia`
--
ALTER TABLE `biologia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ed`
--
ALTER TABLE `ed`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `espanhol`
--
ALTER TABLE `espanhol`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `filosofia`
--
ALTER TABLE `filosofia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fisica`
--
ALTER TABLE `fisica`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `geografia`
--
ALTER TABLE `geografia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `historia`
--
ALTER TABLE `historia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ingles`
--
ALTER TABLE `ingles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `matematica`
--
ALTER TABLE `matematica`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `php`
--
ALTER TABLE `php`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `portugues`
--
ALTER TABLE `portugues`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `quimica`
--
ALTER TABLE `quimica`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `redes`
--
ALTER TABLE `redes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sociologia`
--
ALTER TABLE `sociologia`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `banco`
--
ALTER TABLE `banco`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `biologia`
--
ALTER TABLE `biologia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `ed`
--
ALTER TABLE `ed`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `espanhol`
--
ALTER TABLE `espanhol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `filosofia`
--
ALTER TABLE `filosofia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `fisica`
--
ALTER TABLE `fisica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `geografia`
--
ALTER TABLE `geografia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `historia`
--
ALTER TABLE `historia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ingles`
--
ALTER TABLE `ingles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `matematica`
--
ALTER TABLE `matematica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `php`
--
ALTER TABLE `php`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `portugues`
--
ALTER TABLE `portugues`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `quimica`
--
ALTER TABLE `quimica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `redes`
--
ALTER TABLE `redes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sociologia`
--
ALTER TABLE `sociologia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
