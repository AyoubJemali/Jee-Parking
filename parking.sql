-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 21 jan. 2022 à 17:05
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `parking`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `parking` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`id`, `email`, `username`, `password`, `parking`) VALUES
(6, 'mt13444132@gmail.com', 'Tahiri 1', '123', 'Tahiri 011111'),
(5, 'mhdtahiri01@gmail.com', 'tahiri', '123', 'Tahiri-Parking');

-- --------------------------------------------------------

--
-- Structure de la table `etage`
--

DROP TABLE IF EXISTS `etage`;
CREATE TABLE IF NOT EXISTS `etage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(10) NOT NULL,
  `nbr_section` int(10) NOT NULL,
  `id_parking` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etage`
--

INSERT INTO `etage` (`id`, `numero`, `nbr_section`, `id_parking`) VALUES
(45, 2, 5, 4),
(47, 4, 5, 4),
(44, 1, 5, 4),
(46, 3, 5, 4);

-- --------------------------------------------------------

--
-- Structure de la table `parking`
--

DROP TABLE IF EXISTS `parking`;
CREATE TABLE IF NOT EXISTS `parking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `parking`
--

INSERT INTO `parking` (`id`, `nom`, `address`) VALUES
(4, 'Tahiri-Parking', 'Lot charaf, Numero 621 , Elizdihar Marrakech'),
(5, 'Tahiri 011111', 'lot charaf');

-- --------------------------------------------------------

--
-- Structure de la table `place`
--

DROP TABLE IF EXISTS `place`;
CREATE TABLE IF NOT EXISTS `place` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(10) NOT NULL,
  `etat` tinyint(1) NOT NULL DEFAULT '0',
  `section` varchar(10) NOT NULL,
  `etage` int(11) NOT NULL,
  `parking` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `place`
--

INSERT INTO `place` (`id`, `nom`, `etat`, `section`, `etage`, `parking`) VALUES
(2, 'A1-1', 1, 'A1', 1, 4),
(3, 'A1-2', 1, 'A1', 1, 4),
(4, 'A1-3', 1, 'A1', 1, 4),
(5, 'A1-4', 0, 'A1', 1, 4),
(6, 'A1-5', 0, 'A1', 1, 4),
(7, 'A2-1', 1, 'A2', 1, 4),
(8, 'A2-2', 0, 'A2', 1, 4),
(9, 'A2-3', 0, 'A2', 1, 4),
(10, 'A2-4', 0, 'A2', 1, 4),
(11, 'A2-5', 0, 'A2', 1, 4),
(12, 'C1-1', 1, 'C1', 3, 4),
(13, 'C1-2', 0, 'C1', 3, 4),
(14, 'C1-3', 0, 'C1', 3, 4),
(15, 'C1-4', 0, 'C1', 3, 4),
(16, 'C1-5', 0, 'C1', 3, 4),
(17, 'D1-1', 0, 'D1', 4, 4),
(18, 'D1-2', 0, 'D1', 4, 4),
(19, 'D1-3', 0, 'D1', 4, 4),
(20, 'D1-4', 0, 'D1', 4, 4),
(21, 'D1-5', 0, 'D1', 4, 4);

-- --------------------------------------------------------

--
-- Structure de la table `section`
--

DROP TABLE IF EXISTS `section`;
CREATE TABLE IF NOT EXISTS `section` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(10) NOT NULL,
  `nbrPlace` int(11) NOT NULL DEFAULT '5',
  `id_etage` int(11) NOT NULL,
  `id_parking` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=97 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `section`
--

INSERT INTO `section` (`id`, `nom`, `nbrPlace`, `id_etage`, `id_parking`) VALUES
(96, 'D5', 10, 4, 4),
(95, 'D4', 10, 4, 4),
(94, 'D3', 10, 4, 4),
(93, 'D2', 10, 4, 4),
(92, 'D1', 10, 4, 4),
(91, 'C5', 10, 3, 4),
(90, 'C4', 10, 3, 4),
(89, 'C3', 10, 3, 4),
(88, 'C2', 10, 3, 4),
(82, 'A1', 5, 1, 4),
(83, 'A2', 5, 1, 4),
(84, 'A3', 5, 1, 4),
(85, 'A4', 5, 1, 4),
(86, 'A5', 5, 1, 4),
(87, 'C1', 10, 3, 4);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
