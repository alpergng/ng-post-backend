CREATE DATABASE  IF NOT EXISTS `ngpost` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ngpost`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: ngpost
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `post` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` longtext,
  `created_on` datetime(6) DEFAULT NULL,
  `pic_url` longtext,
  `title` varchar(255) DEFAULT NULL,
  `updated_on` datetime(6) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,'<p>When you play the game of thrones, you win or you die. There is no middle ground.</p>','2019-12-26 15:50:21.557000','https://vignette.wikia.nocookie.net/gameofthrones/images/3/3c/Cersei_refuses_to_share_her_plans.jpg/revision/latest?cb=20160814022818','Queen Cersei Lannister ',NULL,'cersei'),(2,'<p style=\"text-align: left;\"><strong>I\'m guilty of a far more monstrous crime: I\'m guilty of being a dwarf!</strong></p>','2019-12-26 15:53:27.605000','https://vignette.wikia.nocookie.net/gameofthrones/images/d/d9/Tyrion_Lannister.jpg/revision/latest?cb=20110411054140','Tyrion Lannister',NULL,'tyrion'),(6,'<p><strong><span style=\"color: #222222; font-family: Roboto, sans-serif; font-size: 25.6px; letter-spacing: 1.6px;\">We look up at the same stars and see such different things.</span></strong></p>','2019-12-26 16:07:15.900000','https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTv6QSPT-NWhK869J0mA6ixcQCECp8imsvqpxLPNedHN9svkvUw','Jon Snow',NULL,'jon'),(7,'<p><strong>A girl is Arya Stark of Winterfell, and I\'m going home.</strong></p>','2019-12-26 16:11:31.584000','https://s4.scoopwhoop.com/anj2/5d9b01969d04136ca562dc33/1157c853-4c04-4386-ba22-c8d01f76e5e2.jpg','Arya Stark',NULL,'arya'),(8,'<p><strong>You shouldn\'t envy me. Mostly, I live in the past.</strong></p>','2019-12-26 16:13:45.432000','https://www.log.com.tr/wp-content/uploads/2019/05/bran-stark-1-660x370.jpg','Bran Stark',NULL,'bran'),(9,'<p><em style=\"box-sizing: inherit; color: #2e2c2b; font-family: Georgia, Times, \'Times New Roman\', serif; font-size: 18px;\">I&rsquo;m going to go now.</em></p>','2019-12-26 16:18:57.220000','https://static3.srcdn.com/wordpress/wp-content/uploads/2019/05/bran-game-of-thrones-going-to-go-now.jpg?q=50&fit=crop&w=740&h=370&dpr=1.5','A Clever Way To End A Conversation',NULL,'bran'),(10,'<p>I\'m going to kill the queen.</p>','2019-12-26 16:21:08.993000','https://imgix.bustle.com/uploads/image/2018/5/11/46d4c5e7-4fe7-4c00-b97e-a60bba7da73b-arya-2.png?w=349&fit=max&auto=format&q=70&dpr=2','/w Ed Sheeran',NULL,'arya'),(11,'<p><strong><span style=\"box-sizing: inherit; line-height: 18pt; font-family: Georgia, serif; font-size: 16px; color: #0a0a0a;\">It&rsquo;s not easy being drunk all the time. If it were easy, everyone would do it.</span></strong></p>','2019-12-26 16:23:31.539000','https://cdn.pastemagazine.com/www/articles/TYRION-LANNISTER-quotes-list-11.jpg','Giving A Life Lesson',NULL,'tyrion');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'$2a$10$gnDhWlc7CMzUHLy2zLjKX.oB4qtEnJx326V4.USbMl5Mu.ZyYjZEC','admin1','cersei'),(2,'$2a$10$MkdtYI99D7Wg8Vqp83lY.ONo7JZEVnT0qfeWEONz.Qrq8B7/0LYMi','user1','tyrion'),(3,'$2a$10$BCFU4Uh1FRn6tnw4rvjKN.3wDMBiwJoH0x.OV/bdonPzWARDXXKVS','admin2','john'),(4,'$2a$10$QRjtp1KBGw8K5HTbGR/kLejWFmDVz0zB5mFk1GczfnLmlRabqYRWW','user2','arya'),(5,'$2a$10$lViFRXTBLsFCCPG1WNBeoeqJ5nS.0IBqcudg3BW.YzLGWMV.0eBye','user2','bran'),(6,'$2a$10$ROTTjJQ0IgY6btRqo4kDH.nYWPxmEMrHi0fPansFBUZWGn8IJ1wBC','admin2','jon');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-26 19:28:57
