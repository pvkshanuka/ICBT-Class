-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jkcompany
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch` (
  `Branch_ID` int NOT NULL AUTO_INCREMENT,
  `Location` varchar(45) NOT NULL,
  `Branch_Type` varchar(45) NOT NULL,
  PRIMARY KEY (`Branch_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (1,'Colombo','Head-Office'),(2,'Galle','Branch'),(4,'Matara','Branch'),(5,'Moratuwa','Branch'),(6,'Wattala','Branch'),(7,'Jaffna','Branch'),(8,'Mannar','Branch');
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch_products`
--

DROP TABLE IF EXISTS `branch_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch_products` (
  `Product_ID` int NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(45) NOT NULL,
  `Price` int NOT NULL,
  `Quantity` int NOT NULL,
  `Headofficeproduct_ID` int NOT NULL,
  `Branch_ID` int NOT NULL,
  PRIMARY KEY (`Product_ID`),
  KEY `Branch_ID_idx` (`Branch_ID`),
  KEY `fk_branchID_idx` (`Branch_ID`),
  CONSTRAINT `fk_bID` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_products`
--

LOCK TABLES `branch_products` WRITE;
/*!40000 ALTER TABLE `branch_products` DISABLE KEYS */;
INSERT INTO `branch_products` VALUES (1,'Electric Kettles',2500,82,1,2),(3,'Iron',2000,25,4,4),(4,'Table Fans',1250,80,3,2),(7,'Electric Kettles',2500,8,1,4),(8,'Water Filter',3500,20,5,2),(9,'Table Fans',1250,20,3,5);
/*!40000 ALTER TABLE `branch_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `Cart_ID` int NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(45) NOT NULL,
  `Price` int NOT NULL,
  `Quantity` int NOT NULL,
  `Date` varchar(45) NOT NULL,
  `BranchProduct_ID` int NOT NULL,
  `Customer_ID` int NOT NULL,
  `Order_Status` varchar(45) NOT NULL,
  `Branch_ID` int NOT NULL,
  PRIMARY KEY (`Cart_ID`),
  KEY `fkbrancID_idx` (`BranchProduct_ID`),
  KEY `fkcID_idx` (`Customer_ID`),
  CONSTRAINT `fkbrancID` FOREIGN KEY (`BranchProduct_ID`) REFERENCES `branch_products` (`Product_ID`),
  CONSTRAINT `fkcID` FOREIGN KEY (`Customer_ID`) REFERENCES `customers` (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (1,'Electric Kettles',2500,1,'Feb 10, 2021 8:41:05 PM',1,1,'Transaction Completed Successfully',2),(2,'Table Fans',1250,1,'Feb 10, 2021 8:46:03 PM',4,1,'Transaction Completed Successfully',2),(3,'Water Filter',3500,1,'Feb 10, 2021 9:47:06 PM',8,1,'Transaction Completed Successfully',2),(4,'Electric Kettles',2500,1,'Feb 10, 2021 10:01:27 PM',1,1,'Transaction Completed Successfully',2),(5,'Table Fans',1250,1,'Feb 10, 2021 10:02:02 PM',4,2,'Transaction Completed Successfully',2),(6,'Electric Kettles',2500,1,'Feb 10, 2021 10:02:05 PM',1,2,'Transaction Completed Successfully',2),(7,'Iron',2000,1,'Feb 11, 2021 12:21:12 AM',3,2,'Transaction Completed Successfully',4),(8,'Electric Kettles',2500,5,'Feb 13, 2021 10:36:19 PM',1,3,'Transaction Completed Successfully',2),(9,'Water Filter',3500,3,'Feb 13, 2021 10:36:44 PM',8,3,'Transaction Completed Successfully',2),(10,'Electric Kettles',2500,2,'Feb 14, 2021 1:16:47 AM',1,3,'Transaction Completed Successfully',2),(11,'Table Fans',1250,5,'Feb 14, 2021 1:16:54 AM',4,3,'Transaction Completed Successfully',2),(12,'Water Filter',3500,3,'Feb 14, 2021 1:17:01 AM',8,3,'Transaction Completed Successfully',2),(13,'Table Fans',1250,1,'Feb 14, 2021 1:21:57 AM',4,1,'Transaction Completed Successfully',2),(14,'Electric Kettles',2500,2,'Feb 14, 2021 1:26:10 AM',1,2,'Transaction Completed Successfully',2),(15,'Water Filter',3500,3,'Feb 14, 2021 1:26:22 AM',8,2,'Transaction Completed Successfully',2),(16,'Table Fans',1250,3,'Feb 14, 2021 1:34:50 AM',4,3,'Added To Cart',2),(17,'Electric Kettles',2500,2,'Feb 15, 2021 5:26:02 PM',1,4,'Transaction Completed Successfully',2),(18,'Table Fans',1250,1,'Feb 15, 2021 5:26:09 PM',4,4,'Transaction Completed Successfully',2),(19,'Table Fans',1250,2,'Feb 21, 2021 3:13:17 PM',9,4,'Transaction Completed Successfully',5);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `Customer_ID` int NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Contact_No` varchar(45) NOT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'chamal','peiris','chamal.peiris.3g@gmail.com','0704582771'),(2,'thamashi','lanerolle','thamashi1998@gmail.com','0773493918'),(3,'John','Smith','john@gmail.com','0112626362'),(4,'enok','peiris','enok@gmail.com','0773493918'),(8,'shehan','perera','almeda119@gmail.com','0112623622'),(9,'darren','sammu','darren@gmail.com','0779469895');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver` (
  `Driver_ID` int NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Branch_ID` int NOT NULL,
  PRIMARY KEY (`Driver_ID`),
  KEY `brid_idx` (`Branch_ID`),
  CONSTRAINT `brid` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES (1,'chamal','peiris','chamal.peiris.3g@gmail.com',2),(4,'adeesha','perera','adeesha98@gmail.com',2);
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `headoffice_products`
--

DROP TABLE IF EXISTS `headoffice_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `headoffice_products` (
  `Product_ID` int NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(55) NOT NULL,
  `Price` int NOT NULL,
  `Quantity` int NOT NULL,
  PRIMARY KEY (`Product_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `headoffice_products`
--

LOCK TABLES `headoffice_products` WRITE;
/*!40000 ALTER TABLE `headoffice_products` DISABLE KEYS */;
INSERT INTO `headoffice_products` VALUES (1,'Electric Kettles',2500,600),(3,'Table Fans',1250,470),(4,'Iron',2000,600),(5,'Water Filter',3500,380);
/*!40000 ALTER TABLE `headoffice_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_requests`
--

DROP TABLE IF EXISTS `stock_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock_requests` (
  `Request_ID` int NOT NULL AUTO_INCREMENT,
  `Date` varchar(45) NOT NULL,
  `Accepted_By` varchar(45) NOT NULL,
  `Quantity` int NOT NULL,
  `Branch_ID` int NOT NULL,
  `Product_ID` int NOT NULL,
  PRIMARY KEY (`Request_ID`),
  KEY `fkBranchID_idx` (`Branch_ID`),
  KEY `dkrprodiD_idx` (`Product_ID`),
  CONSTRAINT `dkrprodiD` FOREIGN KEY (`Product_ID`) REFERENCES `headoffice_products` (`Product_ID`),
  CONSTRAINT `fkBranchID` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_requests`
--

LOCK TABLES `stock_requests` WRITE;
/*!40000 ALTER TABLE `stock_requests` DISABLE KEYS */;
INSERT INTO `stock_requests` VALUES (3,'Feb 9, 2021 6:26:34 PM','Request still not accepted',10,2,3),(5,'Feb 9, 2021 6:58:18 PM','Goods Delivered Successfully',10,4,1),(6,'Feb 9, 2021 8:54:36 PM','Goods Delivered Successfully',2,2,1),(7,'Feb 10, 2021 1:39:28 PM','Goods Delivered Successfully',20,2,5),(8,'Feb 15, 2021 3:05:37 PM','Request still not accepted',10,5,5),(9,'Feb 15, 2021 5:59:28 PM','Goods Delivered Successfully',20,5,3);
/*!40000 ALTER TABLE `stock_requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `UserID` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(45) NOT NULL,
  `Firstname` varchar(45) NOT NULL,
  `Lastname` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Branch_ID` int DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  KEY `Branch_ID_idx` (`Branch_ID`),
  CONSTRAINT `Branch_ID` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'chamal123','chamal','peiris','123',1),(2,'jehan123','jehan','almeda','123',2),(4,'malik123','malik','perera','123',4),(5,'thamashi123','thamashi','lanerolle','123',2),(8,'enok123','enok','perera','123',5),(9,'darren123','darren','sammy','123',5);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `Vehicle_ID` int NOT NULL AUTO_INCREMENT,
  `Vehicle_No` varchar(45) NOT NULL,
  `Branch_ID` int NOT NULL,
  PRIMARY KEY (`Vehicle_ID`),
  KEY `brid_idx` (`Branch_ID`),
  KEY `branchIDofvehicle_idx` (`Branch_ID`),
  CONSTRAINT `branchIDofvehicle` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (1,'KY-5762',2);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-26 11:08:45
