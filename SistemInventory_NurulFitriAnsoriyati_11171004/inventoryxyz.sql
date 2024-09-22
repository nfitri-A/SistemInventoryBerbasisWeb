-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 13, 2020 at 01:19 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventoryxyz`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `satuan` varchar(10) NOT NULL,
  `qty` int(5) NOT NULL,
  `harga_beli` int(15) NOT NULL,
  `no_kategori` varchar(20) NOT NULL,
  `no_lokasi` varchar(20) NOT NULL,
  `harga_jual` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_brg`, `item`, `nm_brg`, `satuan`, `qty`, `harga_beli`, `no_kategori`, `no_lokasi`, `harga_jual`) VALUES
('BR00001', '23100K36BA0', 'V-belt Vario 125/150', 'PCS', 30106, 125000, 'HGP', 'A1.2.3', 150000),
('BR00002', '06455kvbt01', 'Kanvas rem depan matic', 'pcs', 26, 50000, 'HGP', 'A1.1.2', 55000),
('BR00003', '42711K59A12', 'Ban motor', 'PCS', 23, 200000, 'HGP', 'A2.1.1', 229000);

-- --------------------------------------------------------

--
-- Table structure for table `cancel_stock_out`
--

CREATE TABLE `cancel_stock_out` (
  `kd_cancel` char(8) NOT NULL,
  `kd_karyawan` char(8) NOT NULL,
  `deskripsi` varchar(30) NOT NULL,
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cancel_stock_out`
--

INSERT INTO `cancel_stock_out` (`kd_cancel`, `kd_karyawan`, `deskripsi`, `kd_brg`, `item`, `nm_brg`, `qty`, `tgl`) VALUES
('CL00001', 'KRY00001', 'aaaaaa', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 1, '2020-05-28'),
('CL00002', 'KRY00001', 'aaaaaa', 'BR00002', '123456', 'rem', 1, '2020-05-28'),
('CL00003', 'KRY00001', 'BK000002', 'BR00003', '42711K59A12', 'Ban motor', 1, '2020-05-28'),
('CL00004', 'KRY00002', 'BK000004', 'BR00003', '42711K59A12', 'Ban motor', 1, '2020-07-15'),
('CL00005', 'KRY00001', 'BK000005', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, '2020-07-15'),
('CL00006', 'KRY00003', 'BK000007', 'BR00003', '42711K59A12', 'Ban motor', 1, '2020-07-18'),
('CL00007', 'KRY00001', 'BK000008', 'BR00003', '42711K59A12', 'Ban motor', 1, '2020-07-18'),
('CL00008', 'null', 'BK000010', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, '2020-07-18');

--
-- Triggers `cancel_stock_out`
--
DELIMITER $$
CREATE TRIGGER `setelah_cancel_barang` AFTER INSERT ON `cancel_stock_out` FOR EACH ROW BEGIN
UPDATE barang SET qty = qty + new.qty WHERE kd_brg=new.kd_brg;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_finish_retur`
--

CREATE TABLE `detail_finish_retur` (
  `kd_finish_retur` char(8) NOT NULL,
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_finish_retur`
--

INSERT INTO `detail_finish_retur` (`kd_finish_retur`, `kd_brg`, `item`, `nm_brg`, `qty`) VALUES
('RT000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 2),
('RT000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 2),
('RT000002', 'BR00002', '123456', 'rem', 2),
('RT000003', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000005', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000006', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000007', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000008', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000009', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000010', 'BR00003', '42711K59A12', 'Ban motor', 1);

--
-- Triggers `detail_finish_retur`
--
DELIMITER $$
CREATE TRIGGER `setelah_finish_retur` AFTER INSERT ON `detail_finish_retur` FOR EACH ROW UPDATE barang SET qty = qty + new.qty WHERE kd_brg=new.kd_brg
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_pesan`
--

CREATE TABLE `detail_pesan` (
  `kd_pesan` char(8) NOT NULL,
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL,
  `harga_beli` int(15) NOT NULL,
  `sub_total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_pesan`
--

INSERT INTO `detail_pesan` (`kd_pesan`, `kd_brg`, `item`, `nm_brg`, `qty`, `harga_beli`, `sub_total`) VALUES
('PS000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 10000, 31, 310000),
('PS000002', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 10000, 31, 310000),
('PS000007', 'BR00002', '123456', 'rem', 10000, 2, 20000),
('PS000008', 'BR00002', '123456', 'rem', 2, 10000, 20000),
('PS000009', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 3, 10000, 30000),
('PS000001', 'BR00002', '123456', 'rem', 2, 10000, 20000),
('PS000002', 'BR00003', '42711K59A12', 'Ban motor', 20, 200000, 4000000),
('PS000003', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 1, 10000, 10000),
('PS000004', 'BR00002', '123456', 'rem', 1, 10000, 10000),
('PS000005', 'BR00002', '123456', 'rem', 1, 10000, 10000),
('PS000006', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000006', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000007', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000007', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000008', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000008', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000009', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000009', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000010', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000010', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000011', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000011', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000012', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000013', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000014', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000015', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000016', 'BR00001', '23100K36BA0', 'V-belt Vario 125/150', 1, 125000, 125000);

-- --------------------------------------------------------

--
-- Table structure for table `detail_retur_barang`
--

CREATE TABLE `detail_retur_barang` (
  `kd_retur` char(8) NOT NULL,
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_retur_barang`
--

INSERT INTO `detail_retur_barang` (`kd_retur`, `kd_brg`, `item`, `nm_brg`, `qty`) VALUES
('RT000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 2),
('RT000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 2),
('RT000002', 'BR00002', '123456', 'rem', 2),
('RT000003', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000004', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000005', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000006', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000007', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000008', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000009', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000010', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000011', 'BR00003', '42711K59A12', 'Ban motor', 1),
('RT000012', 'BR00001', '23100K36BA0', 'V-belt Vario 125/150', 1);

--
-- Triggers `detail_retur_barang`
--
DELIMITER $$
CREATE TRIGGER `setelah_retur_barang` AFTER INSERT ON `detail_retur_barang` FOR EACH ROW UPDATE barang SET qty = qty - new.qty WHERE kd_brg=new.kd_brg
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_stock_in`
--

CREATE TABLE `detail_stock_in` (
  `kd_brg_msk` char(8) NOT NULL,
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL,
  `harga_beli` int(15) NOT NULL,
  `sub_total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_stock_in`
--

INSERT INTO `detail_stock_in` (`kd_brg_msk`, `kd_brg`, `item`, `nm_brg`, `qty`, `harga_beli`, `sub_total`) VALUES
('PS000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 10000, 31, 310000),
('PS000002', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 10000, 31, 310000),
('PS000008', 'BR00002', '123456', 'rem', 2, 10000, 20000),
('PS000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 10000, 31, 310000),
('PS000001', 'BR00002', '123456', 'rem', 2, 10000, 20000),
('PS000002', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 10000, 31, 310000),
('PS000002', 'BR00003', '42711K59A12', 'Ban motor', 20, 200000, 4000000),
('PS000003', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 1, 10000, 10000),
('PS000006', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000006', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000008', 'BR00002', '123456', 'rem', 2, 10000, 20000),
('PS000008', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000008', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000009', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 3, 10000, 30000),
('PS000009', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000009', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000005', 'BR00002', '123456', 'rem', 1, 10000, 10000),
('PS000010', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000010', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000011', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000011', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000007', 'BR00002', '123456', 'rem', 10000, 2, 20000),
('PS000007', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000007', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000013', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000014', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1, 50000, 50000),
('PS000012', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000),
('PS000015', 'BR00003', '42711K59A12', 'Ban motor', 1, 200000, 200000);

--
-- Triggers `detail_stock_in`
--
DELIMITER $$
CREATE TRIGGER `setelah_barang _masuk` AFTER INSERT ON `detail_stock_in` FOR EACH ROW BEGIN
UPDATE barang SET qty = qty + new.qty WHERE kd_brg=new.kd_brg;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_stock_out`
--

CREATE TABLE `detail_stock_out` (
  `kd_brg_klr` char(8) NOT NULL,
  `kd_brg` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_stock_out`
--

INSERT INTO `detail_stock_out` (`kd_brg_klr`, `kd_brg`, `item`, `nm_brg`, `qty`) VALUES
('BK000001', 'BR00001', 'ROKOK', '', 1),
('BK000001', 'BR00001', 'ROKOK', '', 2),
('BK000001', 'BR00001', 'ROKOK', '', 2),
('BK000001', 'BR00002', '123456', '', 1),
('BK000001', 'BR00001', 'ROKOK', '', 2),
('BK000001', 'BR00001', 'ROKOK', '', 1),
('BK000001', 'BR00001', 'ROKOK', '', 1),
('BK000001', 'BR00001', '', 'ROKOK SEBATANG', 1),
('BK000001', 'BR00001', '', 'ROKOK SEBATANG', 2),
('BK000002', 'BR00001', '', 'ROKOK SEBATANG', 2),
('BK000002', 'BR00001', '', 'ROKOK SEBATANG', 2),
('BK000001', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 2),
('BK000002', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000003', 'BR00001', 'ROKOK', 'ROKOK SEBATANG', 2),
('BK000004', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000005', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000005', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1),
('BK000006', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000007', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000007', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1),
('BK000007', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000008', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000009', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 10001),
('BK000010', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1),
('BK000011', 'BR00003', '42711K59A12', 'Ban motor', 1),
('BK000012', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1),
('BK000013', 'BR00002', '06455kvbt01', 'Kanvas rem depan matic', 1);

--
-- Triggers `detail_stock_out`
--
DELIMITER $$
CREATE TRIGGER `setelah_barang_keluar` AFTER INSERT ON `detail_stock_out` FOR EACH ROW BEGIN
UPDATE barang SET qty = qty - new.qty WHERE kd_brg=new.kd_brg;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `finish_retur`
--

CREATE TABLE `finish_retur` (
  `kd_finish_retur` char(8) NOT NULL,
  `kd_retur` char(8) NOT NULL,
  `kd_supplier` char(8) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finish_retur`
--

INSERT INTO `finish_retur` (`kd_finish_retur`, `kd_retur`, `kd_supplier`, `tgl`) VALUES
('FR000001', 'RT000001', 'SP000001', '2020-06-01'),
('FR000002', 'RT000002', 'SP000001', '2020-06-05'),
('FR000003', 'RT000003', 'SP000002', '2020-07-11'),
('FR000004', 'RT000005', 'SP000001', '2020-07-15'),
('FR000005', 'RT000006', 'SP000001', '2020-07-15'),
('FR000006', 'RT000007', 'SP000002', '2020-07-18'),
('FR000007', 'RT000008', 'SP000002', '2020-07-18'),
('FR000008', 'RT000009', 'SP000002', '2020-07-18'),
('FR000009', 'RT000010', 'SP000002', '2020-07-18');

--
-- Triggers `finish_retur`
--
DELIMITER $$
CREATE TRIGGER `After_Finish_Retur` AFTER INSERT ON `finish_retur` FOR EACH ROW BEGIN
UPDATE retur_barang SET status = 'Close' 
WHERE kd_retur=new.kd_retur;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `finish_retur_sementara`
--

CREATE TABLE `finish_retur_sementara` (
  `nomor` char(8) NOT NULL,
  `kode` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `kd_karyawan` char(8) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jk` enum('perempuan','laki-laki') NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(16) NOT NULL,
  `divisi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`kd_karyawan`, `nama`, `jk`, `alamat`, `no_tlp`, `divisi`) VALUES
('KRY00001', 'Pemilik Perusahaan', 'laki-laki', '  BOGOR RAYA', '085695667739', 'Owner'),
('KRY00002', 'Nurul Fitri', 'perempuan', 'lingkungan ciriung', '628960111222', 'Admin Gudang'),
('KRY00003', 'Ansoriyati', 'perempuan', 'lingkungan ciriung', '021123222', 'Kepala Gudang');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `no_kategori` int(4) NOT NULL,
  `kategori` varchar(10) NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`no_kategori`, `kategori`, `type`) VALUES
(1, 'Accesoris', 'BRT'),
(2, 'HGP', 'Non ACC'),
(3, 'oli kpb', 'KPB'),
(4, 'sepeda', 'sss');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `no_lokasi` int(4) NOT NULL,
  `nm_rak` varchar(10) NOT NULL,
  `kd_rak` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`no_lokasi`, `nm_rak`, `kd_rak`) VALUES
(1, 'V-belt', 'A1.2.3'),
(2, 'Oli', 'A1.1.2'),
(3, 'Roller', 'A2.1.1');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan_barang`
--

CREATE TABLE `pemesanan_barang` (
  `kd_pesan` char(8) NOT NULL,
  `kd_supplier` char(8) NOT NULL,
  `status` enum('Open','Proses','Close') NOT NULL,
  `tgl` date NOT NULL,
  `no_user` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemesanan_barang`
--

INSERT INTO `pemesanan_barang` (`kd_pesan`, `kd_supplier`, `status`, `tgl`, `no_user`) VALUES
('PS000001', 'SP000001', 'Close', '2020-05-28', 'U001'),
('PS000002', 'SP000001', 'Close', '2020-05-28', 'U001'),
('PS000003', 'SP000001', 'Close', '2020-06-02', 'U001'),
('PS000004', 'SP000001', 'Proses', '2020-06-05', 'U001'),
('PS000005', 'SP000001', 'Close', '2020-06-05', 'U001'),
('PS000006', 'SP000001', 'Close', '2020-07-08', 'U001'),
('PS000007', 'SP000001', 'Close', '2020-07-08', 'U001'),
('PS000008', 'SP000001', 'Close', '2020-07-15', 'U001'),
('PS000009', 'SP000001', 'Close', '2020-07-01', 'U001'),
('PS000010', 'SP000002', 'Close', '2020-07-15', 'U002'),
('PS000011', 'SP000002', 'Close', '2020-07-17', 'U001'),
('PS000012', 'SP000002', 'Close', '2020-07-18', 'U001'),
('PS000013', 'SP000002', 'Close', '2020-07-17', 'U001'),
('PS000014', 'SP000004', 'Close', '2020-07-17', 'U001'),
('PS000015', 'SP000002', 'Close', '2020-12-08', 'U002'),
('PS000016', 'SP000002', 'Open', '2020-09-01', 'Nurul');

-- --------------------------------------------------------

--
-- Table structure for table `pesansementara`
--

CREATE TABLE `pesansementara` (
  `nomor` char(8) NOT NULL,
  `kode` varchar(15) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `qty` int(8) NOT NULL,
  `harga` int(15) NOT NULL,
  `subtotal` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `retur_barang`
--

CREATE TABLE `retur_barang` (
  `kd_retur` char(8) NOT NULL,
  `kd_supplier` char(8) NOT NULL,
  `status` enum('Open','Proses','Close') NOT NULL,
  `tgl` date NOT NULL,
  `no_user` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `retur_barang`
--

INSERT INTO `retur_barang` (`kd_retur`, `kd_supplier`, `status`, `tgl`, `no_user`) VALUES
('RT000001', 'SP000001', 'Close', '2020-05-27', 'U001'),
('RT000002', 'SP000001', 'Close', '2020-05-14', 'U002'),
('RT000003', 'SP000002', 'Close', '2020-06-16', 'U001'),
('RT000004', 'SP000001', 'Open', '2020-07-15', 'U003'),
('RT000005', 'SP000001', 'Close', '2020-07-08', 'U002'),
('RT000006', 'SP000001', 'Close', '2020-07-15', 'U001'),
('RT000007', 'SP000002', 'Close', '2020-07-18', 'U001'),
('RT000008', 'SP000002', 'Close', '2020-07-18', 'U001'),
('RT000009', 'SP000002', 'Close', '2020-07-17', 'U001'),
('RT000010', 'SP000002', 'Close', '2020-07-18', 'U002'),
('RT000011', 'SP000002', 'Open', '2020-09-08', 'Nurul'),
('RT000012', 'SP000002', 'Open', '2020-09-08', 'Fitri');

-- --------------------------------------------------------

--
-- Table structure for table `retur_sementara`
--

CREATE TABLE `retur_sementara` (
  `nomor` char(8) NOT NULL,
  `kode` char(8) NOT NULL,
  `item` varchar(30) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `qty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stock_in`
--

CREATE TABLE `stock_in` (
  `kd_brg_msk` char(8) NOT NULL,
  `kd_pesan` char(8) NOT NULL,
  `kd_supplier` char(8) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock_in`
--

INSERT INTO `stock_in` (`kd_brg_msk`, `kd_pesan`, `kd_supplier`, `tgl`) VALUES
('BM000001', 'PS000001', 'SP000001', '2020-05-25'),
('BM000002', 'PS000002', 'SP000001', '2020-05-25'),
('BM000003', 'PS000008', 'SP000001', '2020-05-27'),
('BM000004', 'PS000001', 'SP000001', '2020-05-28'),
('BM000005', 'PS000002', 'SP000001', '2020-05-29'),
('BM000006', 'PS000003', 'SP000001', '2020-07-14'),
('BM000007', 'PS000006', 'SP000001', '2020-07-15'),
('BM000008', 'PS000008', 'SP000001', '2020-07-15'),
('BM000009', 'PS000009', 'SP000001', '2020-07-15'),
('BM000010', 'PS000005', 'SP000001', '2020-07-15'),
('BM000011', 'PS000010', 'SP000002', '2020-07-16'),
('BM000012', 'PS000011', 'SP000002', '2020-07-18'),
('BM000013', 'PS000007', 'SP000001', '2020-07-18'),
('BM000014', 'PS000013', 'SP000002', '2020-07-18'),
('BM000015', 'PS000014', 'SP000004', '2020-07-18'),
('BM000016', 'PS000012', 'SP000002', '2020-07-18'),
('BM000017', 'PS000015', 'SP000002', '2020-12-08');

--
-- Triggers `stock_in`
--
DELIMITER $$
CREATE TRIGGER `After Stock In` AFTER INSERT ON `stock_in` FOR EACH ROW BEGIN
UPDATE pemesanan_barang SET status = 'Close' 
WHERE kd_pesan=new.kd_pesan;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `stock_in_sementara`
--

CREATE TABLE `stock_in_sementara` (
  `nomor` char(8) NOT NULL,
  `kode` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL,
  `harga_beli` int(15) NOT NULL,
  `sub_total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stock_out`
--

CREATE TABLE `stock_out` (
  `kd_brg_klr` char(8) NOT NULL,
  `kd_karyawan` char(8) NOT NULL,
  `no_user` char(8) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock_out`
--

INSERT INTO `stock_out` (`kd_brg_klr`, `kd_karyawan`, `no_user`, `tgl`) VALUES
('BK000001', 'KRY00001', 'U001', '2020-05-26'),
('BK000002', 'KRY00001', 'U002', '2020-05-28'),
('BK000003', 'KRY00001', 'U001', '2020-06-02'),
('BK000004', 'KRY00002', 'U003', '2020-07-14'),
('BK000005', 'KRY00001', 'U001', '2020-07-08'),
('BK000006', 'KRY00001', 'U001', '2020-07-14'),
('BK000007', 'KRY00002', 'U002', '2020-07-18'),
('BK000008', 'KRY00002', 'U001', '2020-07-18'),
('BK000009', 'KRY00003', 'U001', '2020-07-16'),
('BK000010', 'KRY00002', 'U002', '2020-07-18'),
('BK000011', 'KRY00002', 'U001', '2020-07-18'),
('BK000012', 'KRY00002', 'Nurul', '2020-09-07'),
('BK000013', 'KRY00001', 'Fitri', '2020-09-01');

-- --------------------------------------------------------

--
-- Table structure for table `stock_out_sementara`
--

CREATE TABLE `stock_out_sementara` (
  `nomor` char(8) NOT NULL,
  `kode` char(8) NOT NULL,
  `item` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `qty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `kd_supplier` char(8) NOT NULL,
  `nm_supplier` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(16) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`kd_supplier`, `nm_supplier`, `alamat`, `no_tlp`, `email`) VALUES
('SP000001', 'PANCA ABADI', '   BOGOR RAYA', '085695667739', 'vc17129g@gmail.co,id'),
('SP000002', 'Daya', 'Bandung', '6281231231', 'daya@gmail.com'),
('SP000004', 'AHM', ' cibinong', '62812111', 'daya@gmail.');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `no_user` char(8) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `hak_akses` enum('Kepala Gudang','Admin Gudang') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`no_user`, `username`, `password`, `hak_akses`) VALUES
('U001', 'Nurul', '11171004', 'Kepala Gudang'),
('U002', 'Fitri', '11171004', 'Admin Gudang'),
('U003', 'Ansoriyati', '123456', 'Kepala Gudang');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_brg`),
  ADD KEY `no_kategori` (`no_kategori`),
  ADD KEY `no_lokasi` (`no_lokasi`);

--
-- Indexes for table `cancel_stock_out`
--
ALTER TABLE `cancel_stock_out`
  ADD PRIMARY KEY (`kd_cancel`);

--
-- Indexes for table `finish_retur`
--
ALTER TABLE `finish_retur`
  ADD PRIMARY KEY (`kd_finish_retur`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`kd_karyawan`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`no_kategori`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`no_lokasi`);

--
-- Indexes for table `pemesanan_barang`
--
ALTER TABLE `pemesanan_barang`
  ADD PRIMARY KEY (`kd_pesan`);

--
-- Indexes for table `retur_barang`
--
ALTER TABLE `retur_barang`
  ADD PRIMARY KEY (`kd_retur`);

--
-- Indexes for table `stock_in`
--
ALTER TABLE `stock_in`
  ADD PRIMARY KEY (`kd_brg_msk`);

--
-- Indexes for table `stock_out`
--
ALTER TABLE `stock_out`
  ADD PRIMARY KEY (`kd_brg_klr`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`kd_supplier`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`no_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `no_kategori` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `lokasi`
--
ALTER TABLE `lokasi`
  MODIFY `no_lokasi` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
