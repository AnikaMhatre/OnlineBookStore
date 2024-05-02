-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: finalprojectdb
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_no` bigint NOT NULL AUTO_INCREMENT,
  `book_count` int DEFAULT NULL,
  `book_id` varbinary(255) DEFAULT NULL,
  `book_imgpath` varbinary(1024) DEFAULT NULL,
  `book_price` varbinary(255) DEFAULT NULL,
  `book_title` varbinary(255) DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `is_delivered` bit(1) DEFAULT NULL,
  `order_amount` double DEFAULT NULL,
  `order_date` datetime(6) DEFAULT NULL,
  `razorpay_order_id` varchar(255) DEFAULT NULL,
  `razorpay_payment_id` varchar(255) DEFAULT NULL,
  `razorpay_signature` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (6,2,_binary '¨\Ì\0ur\0[IM∫`&vÍ≤•\0\0xp\0\0\0\0\0\0\0\0\0',_binary '¨\Ì\0ur\0[Ljava.lang.String;≠\“V\Á\È{G\0\0xp\0\0\0t\0;https://m.media-amazon.com/images/I/515t1sJlmvL._SY466_.jpgt\0;https://m.media-amazon.com/images/I/81A6Uqp4XqL._SY466_.jpg',_binary '¨\Ì\0ur\0[FúÅâ\"\‡B\0\0xp\0\0\0EÖ\‡\0D@\0',_binary '¨\Ì\0ur\0[Ljava.lang.String;≠\“V\Á\È{G\0\0xp\0\0\0t\0Basic Mathematicst\0World History 101',1,_binary '\0',4913,'2024-05-01 20:08:03.806000','order_O5GUWkVv5VpK9R','pay_O5GUlGH3FYeriZ','5172e3a02acd6f46969ce81d30f533ac125bcd9b69e160489903f34117a3ccca');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-02 13:57:22
