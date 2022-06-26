-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: supermarket2
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `idcategoria` int NOT NULL AUTO_INCREMENT,
  `nombrecate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Alimentos'),(2,'Bebidas'),(3,'Limpieza');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `marca` varchar(25) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `categoria` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `categoria_idx` (`categoria`),
  CONSTRAINT `categoria` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Gaseosa','Coca Cola','2.25 litros',280,100,2),(2,'Gaseosa','Sprite','2.25 litros',260,80,2),(3,'Arroz','Gallo','1 kg',190,90,1),(4,'Fideo','Lucchetti','1 kg',80,70,1),(5,'Aceite','Cocinero','900 ml',430,100,1),(6,'Te','Taragui','50 saquitos',200,100,1),(7,'Mate','Nobleza Gaucha','25 saquitos',90,50,1),(8,'Detergente','Zorro','300ml',79,50,3),(9,'Shampo','Sedal','400ml',350,100,3),(10,'Papel Higiénico','Higienol','30 metros',169,200,3),(11,'Polenta','La Española','1 kg',130,100,1);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-20 18:37:43

CREATE TABLE `bd_supermarket`.`cliente` (
`id` INT(4) NOT NULL AUTO_INCREMENT ,
 `nombre` VARCHAR(30) NOT NULL ,
 `apellido` VARCHAR(40) NOT NULL ,
 `dni` FLOAT(10) NULL ,
 `domicilio` TEXT NOT NULL ,
 `telefono` VARCHAR(20) NULL ,
 `localidad` VARCHAR(25) NOT NULL ,
 PRIMARY KEY (`id`(4))) ENGINE = InnoDB;
 
CREATE TABLE `bd_supermarket`.`usuario` (
`email` VARCHAR(35) NOT NULL , 
`clave` VARCHAR(15) NOT NULL , 
PRIMARY KEY (`email`(35), `clave`(15))) ENGINE = InnoDB;

CREATE TABLE `bd_supermarket`.`domicilio` (
`calle1` VARCHAR(30) NOT NULL , 
`calle2` VARCHAR(30) NULL , 
`nro_calle` INT(5) NULL , 
`manzana` VARCHAR(10) NULL , 
`nro_piso` INT(5) NULL , 
`nro_dpto` INT(5) NULL , 
`barrio` VARCHAR(35) NOT NULL , 
`id` INT(4) NOT NULL AUTO_INCREMENT , 
PRIMARY KEY (`id`(4))) ENGINE = InnoDB;

CREATE TABLE `bd_supermarket`.`crear_cuenta` (
`id_crearCuenta` INT(4) NOT NULL , 
`email` VARCHAR(35) NOT NULL , 
`clave` VARCHAR(15) NOT NULL , 
`confirmClave` VARCHAR(15) NOT NULL , 
PRIMARY KEY (`id_crearCuenta`(4))) ENGINE = InnoDB;