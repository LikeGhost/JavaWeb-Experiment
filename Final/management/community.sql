-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: community
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `community`
--

DROP TABLE IF EXISTS `community`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `community` (
  `cId` int NOT NULL AUTO_INCREMENT,
  `cName` varchar(30) NOT NULL,
  `cProvince` varchar(30) DEFAULT NULL,
  `cCity` varchar(30) DEFAULT NULL,
  `cStreet` varchar(30) DEFAULT NULL,
  `cTel` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`cId`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community`
--

LOCK TABLES `community` WRITE;
/*!40000 ALTER TABLE `community` DISABLE KEYS */;
INSERT INTO `community` VALUES (23,'五社区','福建省','厦门市','集美大学集美街道','05920005'),(28,'六社区','福建省','厦门市','集美街道','05920006');
/*!40000 ALTER TABLE `community` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `mId` int NOT NULL AUTO_INCREMENT,
  `mName` varchar(30) NOT NULL,
  `mPhone` varchar(30) NOT NULL,
  `mSex` varchar(10) DEFAULT NULL,
  `mAge` int DEFAULT NULL,
  `mHouseNumber` varchar(50) DEFAULT NULL,
  `mWorkUnit` varchar(50) DEFAULT NULL,
  `mCarNumber` varchar(20) DEFAULT NULL,
  `mIsHousehold` tinyint(1) DEFAULT '1',
  `cId` int DEFAULT NULL,
  PRIMARY KEY (`mId`),
  KEY `cId` (`cId`),
  CONSTRAINT `members_ibfk_1` FOREIGN KEY (`cId`) REFERENCES `community` (`cId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (12,'游嘉升','18950705591','男',20,'五号楼519','集美大学','闽B28373',0,23),(14,'肖泓宇','18950705593','男',20,'五号楼519','集美大学','闽C28375',0,23),(18,'王宇','18950705592','男',20,'五号楼519','集美大学','闽B28373',1,23),(20,'王小宇','18950705594','男',20,'四号楼419','集美大学','闽B28312',1,28);
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `record` (
  `rId` int NOT NULL AUTO_INCREMENT,
  `mId` int NOT NULL,
  `cId` int NOT NULL,
  `rIsOutCity` tinyint(1) DEFAULT '0',
  `rIsFromForei` tinyint(1) DEFAULT '0',
  `rIsHosehold` tinyint(1) DEFAULT '1',
  `rNowTime` datetime DEFAULT NULL,
  PRIMARY KEY (`rId`),
  KEY `mId` (`mId`),
  KEY `cId` (`cId`),
  CONSTRAINT `record_ibfk_1` FOREIGN KEY (`mId`) REFERENCES `members` (`mId`),
  CONSTRAINT `record_ibfk_2` FOREIGN KEY (`cId`) REFERENCES `community` (`cId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES (20,12,23,0,0,0,'2021-07-05 02:45:00'),(21,20,23,1,1,0,'2021-07-05 22:49:00'),(22,18,28,0,0,0,'2021-07-05 00:53:00');
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-06  1:02:47
