-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : Dim 07 mars 2021 à 16:28
-- Version du serveur :  10.4.17-MariaDB
-- Version de PHP : 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `dbtestarchi`
--

-- --------------------------------------------------------

--
-- Structure de la table `Etudiant`
--

CREATE TABLE `Etudiant` (
  `matricule` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `id_universite` int(255) NOT NULL,
  `nbLivreMensuel_Autorise` int(255) NOT NULL,
  `getNbLivreEmprunte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Etudiant`
--

INSERT INTO `Etudiant` (`matricule`, `nom`, `prenom`, `email`, `pwd`, `id_universite`, `nbLivreMensuel_Autorise`, `getNbLivreEmprunte`) VALUES
(909988, 'Randa', 'randa', 'mpo@gmail.com', 'xxxxxxx', 1, 0, 0),
(37373, 'meriem', 'amar', 'amar@gmail.com', 'xxxxxxx', 0, 0, 0),
(8, 'mer', 'mer', 'mer@gmail.com', 'xxxxxxx', 0, 0, 1),
(899, 'bat', 'bat', 'batata@gmail.com', 'xxxxxxx', 0, 0, 1),
(8099, 'hh', 'hh', 'bathhata@gmail.com', 'xxxxxxx', 0, 0, 1),
(806, 'rand', 'mer', 'mend@gmail.com', 'xxxxxxx', 0, 0, 1),
(866, 'mr', 'mr', 'mr@gmail.com', 'xxxxxxx', 10, 0, 1),
(822, 'mhellor', 'hello', 'hello@gmail.com', 'xxxxxxx', 10, 0, 1),
(982, 'mhellor', 'hello', 'hllo@gmail.com', 'xxxxxxx', 10, 0, 1),
(300, 'mhr', 'hhrlo', 'hhrlo@gmail.com', 'xxxxxxx', 10, 0, 1),
(405, 'mhr', 'hhrlo', 'pprlo@gmail.com', 'xxxxxxx', 1, 10, 0),
(100, 'oll', 'meol', 'lol@gmail.com', 'ddddd', 1, 10, 0),
(123, 'randou', 'randou', 'randou@gmail.com', 'merimmm', 1, 10, 0),
(1, 'user', 'user', 'user@gmail.com', 'motdepasse', 1, 10, 0),
(3, 'user3', 'user3', 'user3@gmail.com', 'motdepasse', 1, 10, 0),
(4, 'user4', 'user4', 'user4@gmail.com', 'motdepasse', 1, 10, 0);

-- --------------------------------------------------------

--
-- Structure de la table `universite`
--

CREATE TABLE `universite` (
  `id_universite` int(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `pack` enum('Standard','Premium') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `universite`
--

INSERT INTO `universite` (`id_universite`, `nom`, `pack`) VALUES
(1, 'meriem', 'Standard');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
