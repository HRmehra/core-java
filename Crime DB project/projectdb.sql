-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 27, 2018 at 04:24 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `projectdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `addcrime`
--

CREATE TABLE IF NOT EXISTS `addcrime` (
  `Srno` int(100) NOT NULL AUTO_INCREMENT,
  `FIR` int(100) NOT NULL,
  `City` varchar(100) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Missing` varchar(100) NOT NULL,
  `Colour` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Time` varchar(100) NOT NULL,
  PRIMARY KEY (`Srno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `addcrime`
--

INSERT INTO `addcrime` (`Srno`, `FIR`, `City`, `Type`, `Missing`, `Colour`, `Date`, `Time`) VALUES
(1, 101, 'Patna', 'Car', 'Swift', 'Black', '2018-08-07', '5:40am'),
(2, 102, 'Ludhiana', 'Bike', 'Splender', 'Red', '2011-11-09', '11:15pm'),
(3, 103, 'Chandigard', 'Car', 'Nano', 'Red', '2018-05-03', '12:34pm'),
(4, 104, 'Patna', 'Car', 'Maruti Suzuki', 'White', '2010-09-09', '1:10am'),
(6, 106, 'Patiala', 'Cycle', 'Hero cycle', 'Red', '2018-07-09', '4:34pm');

-- --------------------------------------------------------

--
-- Table structure for table `addmurder`
--

CREATE TABLE IF NOT EXISTS `addmurder` (
  `Srno` int(100) NOT NULL AUTO_INCREMENT,
  `FIR` int(100) NOT NULL,
  `City` varchar(100) NOT NULL,
  `VictimName` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Weapon` varchar(100) NOT NULL,
  `PlaceofCrime` varchar(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  PRIMARY KEY (`Srno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `addmurder`
--

INSERT INTO `addmurder` (`Srno`, `FIR`, `City`, `VictimName`, `Date`, `Weapon`, `PlaceofCrime`, `Time`) VALUES
(1, 101, 'Ludhiana', 'Karan', '2010-09-08', 'Gun', 'Shimla', '5:05am'),
(2, 102, 'Patiala', 'Harish', '2018-09-08', 'Knife', 'Sushil palace', '5:05pm'),
(3, 103, 'Patna', 'Kamal', '2010-09-12', 'Unknown', 'Knaught Place', '11:45pm'),
(6, 104, 'Nepal', 'Suresh', '2018-11-12', 'Poison', 'Rim Lake', '5:39pm'),
(7, 105, 'Patiala', 'Ramesh', '2018-09-14', 'Rope', 'Sirhind Road', '6:15pm');

-- --------------------------------------------------------

--
-- Table structure for table `akidnap`
--

CREATE TABLE IF NOT EXISTS `akidnap` (
  `Srno` int(100) NOT NULL AUTO_INCREMENT,
  `FIR` int(100) NOT NULL,
  `City` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Person` varchar(100) NOT NULL,
  `PlaceofCrime` varchar(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  PRIMARY KEY (`Srno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `akidnap`
--

INSERT INTO `akidnap` (`Srno`, `FIR`, `City`, `Date`, `Person`, `PlaceofCrime`, `Time`) VALUES
(1, 100, 'Patiala', '2006-12-09', 'Rashid', 'Urban Estate', '2:15am'),
(2, 101, 'Patiala', '2018-07-09', 'Neha', 'Rajpura', '4:45pm'),
(3, 105, 'Patiala', '2018-07-22', 'Simran', 'Tripuri', '11:11am'),
(4, 106, 'Chandigard', '2018-12-28', 'Anmol', '22 No. market', '2:30pm'),
(5, 107, 'Patiala', '2018-09-07', 'Jaspreet', 'Modern School', '5:03am');

-- --------------------------------------------------------

--
-- Table structure for table `arob`
--

CREATE TABLE IF NOT EXISTS `arob` (
  `Srno` int(100) NOT NULL AUTO_INCREMENT,
  `FIR` int(100) NOT NULL,
  `City` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Persons` int(100) NOT NULL,
  `PlaceofRobery` varchar(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  PRIMARY KEY (`Srno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `arob`
--

INSERT INTO `arob` (`Srno`, `FIR`, `City`, `Date`, `Persons`, `PlaceofRobery`, `Time`) VALUES
(1, 101, 'Patiala', '2018-09-08', 5, 'HDFC Bank', '4:00am'),
(2, 102, 'Patiala', '2012-09-08', 4, 'Haveli', '8:15am'),
(3, 103, 'Moga', '2018-11-16', 2, 'Near Green Park', '12:35pm'),
(4, 104, 'Rajpura', '2017-09-09', 5, 'KFC Rajpura', '3:04pm'),
(5, 105, 'Chandigard', '2017-09-05', 10, 'Elante  Mall', '4:07pm');

-- --------------------------------------------------------

--
-- Table structure for table `crime`
--

CREATE TABLE IF NOT EXISTS `crime` (
  `S.no` int(100) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Branch` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  PRIMARY KEY (`S.no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `crime`
--

INSERT INTO `crime` (`S.no`, `Name`, `Password`, `Branch`, `Gender`) VALUES
(1, 'Mishan', '5788', 'Male', 'crime');

-- --------------------------------------------------------

--
-- Table structure for table `pass`
--

CREATE TABLE IF NOT EXISTS `pass` (
  `S.no` int(100) NOT NULL AUTO_INCREMENT,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`S.no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `pass`
--

INSERT INTO `pass` (`S.no`, `Password`) VALUES
(3, 'mishan88');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE IF NOT EXISTS `signup` (
  `srno` int(100) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`srno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`srno`, `username`, `password`, `gender`, `state`) VALUES
(1, 'java', 'lava', 'female', 'punjab'),
(2, 'Mishan', '5799', 'male', 'punjab'),
(3, 'Manjinder', '1234', 'male', 'punjab');
