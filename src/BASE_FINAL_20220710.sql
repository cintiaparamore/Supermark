-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_supermark
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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `celular` varchar(15) NOT NULL,
  `localidad` varchar(25) NOT NULL,
  `email` varchar(35) NOT NULL,
  PRIMARY KEY (`id`,`email`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'admin','apellido_admin','dni_admin','domicilio_admin','tel_admin','cel_admin','loc_admin','admin@admin'),(2,'cecy','palavecino','123','españa 255','123','123','salta','cecy@cecy'),(3,'cliente','apellido_cliente','123','belgrano 234','123','123','salta','cliente@cliente');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprobantes`
--

DROP TABLE IF EXISTS `comprobantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comprobantes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(1) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT NULL,
  `id_cliente` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_comprobante_fk` (`id_cliente`),
  CONSTRAINT `cliente_comprobante_fk` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprobantes`
--

LOCK TABLES `comprobantes` WRITE;
/*!40000 ALTER TABLE `comprobantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprobantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descuento`
--

DROP TABLE IF EXISTS `descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `descuento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `porcentaje` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descuento`
--

LOCK TABLES `descuento` WRITE;
/*!40000 ALTER TABLE `descuento` DISABLE KEYS */;
/*!40000 ALTER TABLE `descuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_comprobantes`
--

DROP TABLE IF EXISTS `detalle_comprobantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_comprobantes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_comprobante` int NOT NULL,
  `id_producto` int unsigned NOT NULL,
  `cantidad` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `comprobante_fk` (`id_comprobante`),
  KEY `producto_fk` (`id_producto`),
  CONSTRAINT `comprobante_fk` FOREIGN KEY (`id_comprobante`) REFERENCES `comprobantes` (`id`),
  CONSTRAINT `producto_fk` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_comprobantes`
--

LOCK TABLES `detalle_comprobantes` WRITE;
/*!40000 ALTER TABLE `detalle_comprobantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_comprobantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_ventas`
--

DROP TABLE IF EXISTS `detalle_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_ventas` (
  `id_ventas` int DEFAULT NULL,
  `codigo` int unsigned DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  KEY `id_ventas` (`id_ventas`),
  KEY `codigo` (`codigo`),
  CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`id_ventas`) REFERENCES `ventas` (`id_ventas`),
  CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`codigo`) REFERENCES `productos` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_ventas`
--

LOCK TABLES `detalle_ventas` WRITE;
/*!40000 ALTER TABLE `detalle_ventas` DISABLE KEYS */;
INSERT INTO `detalle_ventas` VALUES (24,10,10,1690),(24,4,1,80),(24,6,1,200),(25,2,1,260),(25,4,1,80),(25,6,1,200),(26,7,1,90),(26,8,1,79),(27,10,1,169),(27,9,1,350),(27,8,1,79);
/*!40000 ALTER TABLE `detalle_ventas` ENABLE KEYS */;
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

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `email` varchar(35) NOT NULL,
  `clave` varchar(15) NOT NULL,
  `rol` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('admin@admin','123456','admin'),('cecy@cecy','123456','admin'),('cliente@cliente','123456',NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `id_ventas` int NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `id_cliente` int NOT NULL,
  `total_venta` double DEFAULT NULL,
  PRIMARY KEY (`id_ventas`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,'2022-07-10 00:00:00',1,500),(4,'2022-07-10 00:00:00',2,1500),(5,'2022-07-10 00:00:00',9898,1900),(6,'2022-07-10 00:00:00',9898,1690),(7,'2022-07-10 00:00:00',25,1690),(8,'2022-07-10 00:00:00',88,1690),(9,'2022-07-10 00:00:00',88,4300),(10,'2022-07-10 00:00:00',1212,2000),(11,'2022-07-10 00:00:00',2323,1690),(12,'2022-07-10 13:48:14',2324,5990),(13,'2022-07-10 13:54:01',2324,3690),(14,'2022-07-10 14:04:03',12,8600),(15,'2022-07-10 14:16:13',3,4200),(16,'2022-07-10 14:56:34',3,6450),(17,'2022-07-10 15:00:40',3,1859),(18,'2022-07-10 15:31:09',3,3718),(19,'2022-07-10 15:34:17',3,4730),(20,'2022-07-10 15:38:53',3,960),(21,'2022-07-10 15:41:08',3,1690),(22,'2022-07-10 15:44:07',3,5655),(23,'2022-07-10 15:48:16',3,2490),(24,'2022-07-10 15:50:32',3,1970),(25,'2022-07-10 15:54:24',3,540),(26,'2022-07-10 15:56:40',3,169),(27,'2022-07-10 16:05:15',3,598);
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-10 16:08:35
