-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 28. Apr 2016 um 13:12
-- Server-Version: 10.1.10-MariaDB
-- PHP-Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `em2016`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `benutzer`
--

CREATE TABLE `benutzer` (
  `benutzerid` int(11) NOT NULL,
  `benutzerName` varchar(20) DEFAULT NULL,
  `autologin` varchar(32) DEFAULT NULL,
  `IP` varchar(15) NOT NULL,
  `sessionID` varchar(32) NOT NULL,
  `nickname` varchar(30) NOT NULL,
  `passwort` varchar(32) NOT NULL,
  `gruppenname` varchar(32) DEFAULT NULL,
  `email` varchar(70) NOT NULL,
  `show_Email` bit(1) DEFAULT NULL,
  `registrierungsdatum` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `benutzer`
--

INSERT INTO `benutzer` (`benutzerid`, `benutzerName`, `autologin`, `IP`, `sessionID`, `nickname`, `passwort`, `gruppenname`, `email`, `show_Email`, `registrierungsdatum`) VALUES
(1, '', '', '192.168.178.1', '1234', 'Tipper1', '1234', 'Gruppe1', 'a@a.de', b'1', '0000-00-00'),
(2, '', '', '192.168.178.1', '1234', 'Tipper2', '1234', 'Gruppe2', 'a@b.de', b'1', '0000-00-00'),
(3, '', '', '192.168.178.1', '1234', 'Tipper3', '1234', 'Gruppe3', 'a@c.de', b'1', '0000-00-00'),
(4, '', '', '192.168.178.1', '1234', 'Tipper4', '1234', 'Gruppe3', 'a@d.de', b'1', '0000-00-00'),
(5, '', '', '192.168.178.1', '1234', 'Tipper5', '1234', 'Gruppe2', 'a@e.de', b'1', '0000-00-00'),
(6, '', '', '192.168.178.1', '1234', 'Tipper6', '1234', 'Gruppe4', 'a@f.de', b'1', '0000-00-00'),
(7, '', '', '192.168.178.1', '1234', 'Tipper7', '1234', 'Gruppe5', 'a@g.de', b'1', '0000-00-00'),
(8, '', '', '192.168.178.1', '1234', 'Tipper8', '1234', 'Gruppe5', 'a@h.de', b'1', '0000-00-00'),
(9, '', '', '192.168.178.1', '1234', 'Tipper9', '1234', 'Gruppe1', 'a@i.de', b'1', '0000-00-00'),
(10, '', '', '192.168.178.1', '1234', 'Tipper10', '1234', 'Gruppe1', 'a@j.de', b'1', '0000-00-00');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ranking`
--

CREATE TABLE `ranking` (
  `datum` datetime DEFAULT NULL,
  `tipper` int(11) DEFAULT NULL,
  `punkte` int(10) DEFAULT NULL,
  `platz` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `ranking`
--

INSERT INTO `ranking` (`datum`, `tipper`, `punkte`, `platz`) VALUES
('2016-04-21 20:24:11', 1, 0, 0),
('2016-04-21 20:24:11', 2, 0, 0),
('2016-04-21 20:24:11', 3, 0, 0),
('2016-04-21 20:24:11', 4, 0, 0),
('2016-04-21 20:24:11', 5, 0, 0),
('2016-04-21 20:24:11', 6, 0, 0),
('2016-04-21 20:24:11', 7, 0, 0),
('2016-04-21 20:24:11', 8, 0, 0),
('2016-04-21 20:24:11', 9, 0, 0),
('2016-04-21 20:24:11', 10, 0, 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `spiele`
--

CREATE TABLE `spiele` (
  `spieleid` int(10) NOT NULL,
  `spielbezeichnung` varchar(20) DEFAULT NULL,
  `spielort` varchar(20) DEFAULT NULL,
  `datumuhrzeit` datetime DEFAULT NULL,
  `heimmannschaft` varchar(20) DEFAULT NULL,
  `gastmannschaft` varchar(20) DEFAULT NULL,
  `heimmannschafthz` int(2) DEFAULT NULL,
  `gastmannschafthz` int(2) DEFAULT NULL,
  `heimmannschaftende` int(2) DEFAULT NULL,
  `gastmannschaftende` int(2) DEFAULT NULL,
  `verlaengerung` bit(1) DEFAULT b'0',
  `heimmannschaftverl` int(2) DEFAULT NULL,
  `gastmannschaftverl` int(2) DEFAULT NULL,
  `elfmeter` bit(1) DEFAULT b'0',
  `heimmannschaftelf` int(2) DEFAULT NULL,
  `gastmannschaftelf` int(2) DEFAULT NULL,
  `gelbekartenheim` int(2) DEFAULT NULL,
  `gelbekartengast` int(2) DEFAULT NULL,
  `rotekartenheim` int(2) DEFAULT NULL,
  `rotekartengast` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `spiele`
--

INSERT INTO `spiele` (`spieleid`, `spielbezeichnung`, `spielort`, `datumuhrzeit`, `heimmannschaft`, `gastmannschaft`, `heimmannschafthz`, `gastmannschafthz`, `heimmannschaftende`, `gastmannschaftende`, `verlaengerung`, `heimmannschaftverl`, `gastmannschaftverl`, `elfmeter`, `heimmannschaftelf`, `gastmannschaftelf`, `gelbekartenheim`, `gelbekartengast`, `rotekartenheim`, `rotekartengast`) VALUES
(1, 'Gruppe A', 'Saint-Denis', '2016-04-15 21:00:00', 'Frankreich', 'Rumänien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'Gruppe A', 'Lens', '2016-04-15 15:00:00', 'Albanien', 'Schweiz\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'Gruppe A', 'Paris', '2016-06-15 18:00:00', 'Rumänien', 'Schweiz\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'Gruppe A', 'Marseille', '2016-06-15 21:00:00', 'Frankreich', 'Albanien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(5, 'Gruppe A', 'Lille', '2016-06-19 21:00:00', 'Schweiz', 'Frankreich\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(6, 'Gruppe A', 'Lyon', '2016-06-19 21:00:00', 'Rumänien', 'Albanien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(7, 'Gruppe B', 'Bordeaux', '2016-06-11 18:00:00', 'Wales', 'Slowakei\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(8, 'Gruppe B', 'Marseille', '2016-06-11 21:00:00', 'England', 'Russland\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(9, 'Gruppe B', 'Lille', '2016-06-15 15:00:00', 'Russland', 'Slowakei\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(10, 'Gruppe B', 'Lens', '2016-06-16 15:00:00', 'England', 'Wales\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(11, 'Gruppe B', 'Saint-Étienne', '2016-06-20 21:00:00', 'Slowakei', 'England\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(12, 'Gruppe B', 'Toulouse', '2016-06-20 21:00:00', 'Russland', 'Wales\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(13, 'Gruppe C', 'Nizza', '2016-06-12 18:00:00', 'Polen', 'Nordirland\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(14, 'Gruppe C', 'Lille', '2016-06-12 21:00:00', 'Deutschland', 'Ukraine\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(15, 'Gruppe C', 'Lyon', '2016-06-16 18:00:00', 'Ukraine', 'Nordirland\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(16, 'Gruppe C', 'Saint-Denis', '2016-06-16 21:00:00', 'Deutschland', 'Polen\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(17, 'Gruppe C', 'Marseille', '2016-06-21 18:00:00', 'Ukraine', 'Polen\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(18, 'Gruppe C', 'Paris', '2016-06-21 18:00:00', 'Nordirland', 'Deutschland\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(19, 'Gruppe D', 'Paris', '2016-06-12 15:00:00', 'Türkei', 'Kroatien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(20, 'Gruppe D', 'Toulouse', '2016-06-13 15:00:00', 'Spanien', 'Tschechien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(21, 'Gruppe D', 'Saint-Étienne', '2016-06-17 18:00:00', 'Tschechien', 'Kroatien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(22, 'Gruppe D', 'Nizza', '2016-06-17 21:00:00', 'Spanien', 'Türkei\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(23, 'Gruppe D', 'Bordeaux', '2016-06-21 21:00:00', 'Kroatien', 'Spanien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(24, 'Gruppe D', 'Lens', '2016-06-21 21:00:00', 'Tschechien', 'Türkei\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(25, 'Gruppe E', 'Saint-Denis', '2016-06-13 18:00:00', 'Irland', 'Schweden\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(26, 'Gruppe E', 'Lyon', '2016-06-13 21:00:00', 'Belgien', 'Italien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(27, 'Gruppe E', 'Toulouse', '2016-06-17 15:00:00', 'Italien', 'Schweden\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(28, 'Gruppe E', 'Bordeaux', '2016-06-18 15:00:00', 'Belgien', 'Irland\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(29, 'Gruppe E', 'Lille', '2016-06-22 21:00:00', 'Italien', 'Irland\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(30, 'Gruppe E', 'Nizza', '2016-06-22 21:00:00', 'Schweden', 'Belgien\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(31, 'Gruppe F', 'Bordeaux', '2016-06-14 18:00:00', 'Österreich', 'Ungarn\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(32, 'Gruppe F', 'Saint-Étienne', '2016-06-14 21:00:00', 'Portugal', 'Island\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(33, 'Gruppe F', 'Marseille', '2016-06-18 18:00:00', 'Island', 'Ungarn\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(34, 'Gruppe F', 'Paris', '2016-06-18 21:00:00', 'Portugal', 'Österreich\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(35, 'Gruppe F', 'Lyon', '2016-06-22 18:00:00', 'Ungarn', 'Portugal\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(36, 'Gruppe F', 'Saint-Denis', '2016-06-22 18:00:00', 'Island', 'Österreich\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(37, 'Achtelfinale', 'Saint-Étienne', '2016-04-15 15:00:00', 'Zweiter Gruppe A', 'Zweiter Gruppe C\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(38, 'Achtelfinale', 'Paris', '2016-06-25 18:00:00', 'Sieger Gruppe B', 'Dritter Gruppe A/C/D', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(39, 'Achtelfinale', 'Lens', '2016-06-25 21:00:00', 'Sieger Gruppe D', 'Dritter Gruppe B/E/F', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(40, 'Achtelfinale', 'Lyon', '2016-06-26 15:00:00', 'Sieger Gruppe A', 'Dritter Gruppe C/D/E', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(41, 'Achtelfinale', 'Lille', '2016-06-26 18:00:00', 'Sieger Gruppe C', 'Dritter Gruppe A/B/F', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(42, 'Achtelfinale', 'Toulouse', '2016-06-26 21:00:00', 'Sieger Gruppe F', 'Zweiter Gruppe E\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(43, 'Achtelfinale', 'Saint-Denis', '2016-06-27 18:00:00', 'Sieger Gruppe E', 'Zweiter Gruppe D\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(44, 'Achtelfinale', 'Nizza', '2016-06-27 21:00:00', 'Zweiter Gruppe B', 'Zweiter Gruppe F\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(45, 'Viertelfinale', 'Marseille', '2016-06-30 21:00:00', 'Sieger AF 1', 'Sieger AF 3\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(46, 'Viertelfinale', 'Lille', '2016-07-01 21:00:00', 'Sieger AF 2', 'Sieger AF 6\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(47, 'Viertelfinale', 'Bordeaux', '2016-07-02 21:00:00', 'Sieger AF 5', 'Sieger AF 7\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(48, 'Viertelfinale', 'Saint-Denis', '2016-07-03 21:00:00', 'Sieger AF 4', 'Sieger AF 8\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(49, 'Halbfinale', 'Lyon', '2016-07-06 21:00:00', 'Sieger VF 1', 'Sieger VF 2\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(50, 'Halbfinale', 'Marseille', '2016-07-07 21:00:00', 'Sieger VF 3', 'Sieger VF 4\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL),
(51, 'Finale   ', 'Saint-Denis', '2016-07-10 21:00:00', 'Sieger HF 1', 'Sieger HF 2\r', NULL, NULL, NULL, NULL, b'0', NULL, NULL, b'0', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tipps`
--

CREATE TABLE `tipps` (
  `tippid` int(10) NOT NULL,
  `benutzerid` int(10) DEFAULT NULL,
  `spieleid` int(10) DEFAULT NULL,
  `tippdatum` datetime DEFAULT NULL,
  `tippheimhz` int(4) DEFAULT NULL,
  `tippgasthz` int(4) DEFAULT NULL,
  `tippheimende` int(4) DEFAULT NULL,
  `tippgastende` int(4) DEFAULT NULL,
  `tippheimverl` int(4) DEFAULT NULL,
  `tippgastverl` int(4) DEFAULT NULL,
  `tippheimelf` int(4) DEFAULT NULL,
  `tippgastelf` int(4) DEFAULT NULL,
  `tippgelbeheim` int(4) DEFAULT NULL,
  `tippgelbegast` int(4) DEFAULT NULL,
  `tipproteheim` int(4) DEFAULT NULL,
  `tipprotegast` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `tipps`
--

INSERT INTO `tipps` (`tippid`, `benutzerid`, `spieleid`, `tippdatum`, `tippheimhz`, `tippgasthz`, `tippheimende`, `tippgastende`, `tippheimverl`, `tippgastverl`, `tippheimelf`, `tippgastelf`, `tippgelbeheim`, `tippgelbegast`, `tipproteheim`, `tipprotegast`) VALUES
(1, 1, 1, '0000-00-00 00:00:00', 1, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 0),
(2, 1, 2, '0000-00-00 00:00:00', 1, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 0),
(3, 1, 37, '0000-00-00 00:00:00', 1, 2, 2, 2, 3, 3, 7, 6, 0, 1, 1, 0),
(4, 2, 1, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 1),
(5, 2, 2, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 1),
(6, 2, 37, '0000-00-00 00:00:00', 2, 2, 2, 2, 3, 3, 7, 6, 0, 1, 1, 1),
(7, 3, 1, '0000-00-00 00:00:00', 4, 2, 4, 2, 0, 0, 0, 0, 1, 1, 1, 0),
(8, 3, 2, '0000-00-00 00:00:00', 1, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 0),
(9, 3, 37, '0000-00-00 00:00:00', 1, 2, 2, 2, 3, 3, 7, 6, 0, 1, 1, 0),
(10, 4, 1, '0000-00-00 00:00:00', 1, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 1),
(11, 4, 2, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 1),
(12, 4, 37, '0000-00-00 00:00:00', 2, 2, 2, 2, 3, 3, 5, 6, 0, 1, 1, 2),
(13, 5, 1, '0000-00-00 00:00:00', 1, 2, 2, 5, 0, 0, 0, 0, 1, 1, 1, 0),
(14, 5, 2, '0000-00-00 00:00:00', 1, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 0),
(15, 5, 37, '0000-00-00 00:00:00', 1, 2, 2, 2, 3, 3, 7, 6, 0, 1, 1, 0),
(16, 6, 1, '0000-00-00 00:00:00', 2, 2, 3, 4, 0, 0, 0, 0, 0, 1, 1, 1),
(17, 6, 2, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 0, 2, 1, 1),
(18, 6, 37, '0000-00-00 00:00:00', 2, 2, 2, 2, 3, 3, 7, 6, 1, 1, 1, 1),
(19, 7, 1, '0000-00-00 00:00:00', 0, 2, 4, 2, 0, 0, 0, 0, 1, 0, 1, 0),
(20, 7, 2, '0000-00-00 00:00:00', 1, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 0),
(21, 7, 37, '0000-00-00 00:00:00', 1, 0, 2, 2, 4, 3, 0, 0, 0, 1, 1, 0),
(22, 8, 1, '0000-00-00 00:00:00', 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1),
(23, 8, 2, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 1),
(24, 8, 37, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 1, 1, 1, 0),
(25, 9, 1, '0000-00-00 00:00:00', 0, 2, 4, 2, 0, 0, 0, 0, 1, 0, 1, 0),
(26, 9, 2, '0000-00-00 00:00:00', 1, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 0),
(27, 9, 37, '0000-00-00 00:00:00', 1, 0, 2, 2, 4, 3, 0, 0, 0, 1, 1, 0),
(28, 10, 1, '0000-00-00 00:00:00', 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1),
(29, 10, 2, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 0, 1, 1, 1),
(30, 10, 37, '0000-00-00 00:00:00', 2, 2, 3, 2, 0, 0, 0, 0, 1, 1, 1, 0);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `benutzer`
--
ALTER TABLE `benutzer`
  ADD PRIMARY KEY (`benutzerid`),
  ADD UNIQUE KEY `nickname` (`nickname`,`email`);

--
-- Indizes für die Tabelle `ranking`
--
ALTER TABLE `ranking`
  ADD KEY `FK_ranking_benutzer` (`tipper`);

--
-- Indizes für die Tabelle `spiele`
--
ALTER TABLE `spiele`
  ADD PRIMARY KEY (`spieleid`);

--
-- Indizes für die Tabelle `tipps`
--
ALTER TABLE `tipps`
  ADD PRIMARY KEY (`tippid`),
  ADD KEY `FK_tipps_benutzer` (`benutzerid`),
  ADD KEY `FK_tipps_spiele` (`spieleid`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `benutzer`
--
ALTER TABLE `benutzer`
  MODIFY `benutzerid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT für Tabelle `spiele`
--
ALTER TABLE `spiele`
  MODIFY `spieleid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;
--
-- AUTO_INCREMENT für Tabelle `tipps`
--
ALTER TABLE `tipps`
  MODIFY `tippid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `ranking`
--
ALTER TABLE `ranking`
  ADD CONSTRAINT `FK_ranking_benutzer` FOREIGN KEY (`tipper`) REFERENCES `benutzer` (`benutzerid`);

--
-- Constraints der Tabelle `tipps`
--
ALTER TABLE `tipps`
  ADD CONSTRAINT `FK_tipps_benutzer` FOREIGN KEY (`benutzerid`) REFERENCES `benutzer` (`benutzerid`),
  ADD CONSTRAINT `FK_tipps_spiele` FOREIGN KEY (`spieleid`) REFERENCES `spiele` (`spieleid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
