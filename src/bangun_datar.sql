-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2022 at 08:37 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bangun_datar`
--

-- --------------------------------------------------------

--
-- Table structure for table `persegi_panjang`
--

CREATE TABLE `persegi_panjang` (
  `no_bangun` int(11) NOT NULL,
  `panjang` double NOT NULL,
  `lebar` double NOT NULL,
  `luas` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `trapesium`
--

CREATE TABLE `trapesium` (
  `id_trapesium` int(11) NOT NULL,
  `panjang_atas` double NOT NULL,
  `panjang_bawah` double NOT NULL,
  `tinggi` double NOT NULL,
  `luas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persegi_panjang`
--
ALTER TABLE `persegi_panjang`
  ADD PRIMARY KEY (`no_bangun`);

--
-- Indexes for table `trapesium`
--
ALTER TABLE `trapesium`
  ADD PRIMARY KEY (`id_trapesium`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
