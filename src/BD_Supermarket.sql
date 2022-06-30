
CREATE TABLE `categoria` (
  `idcategoria` int NOT NULL AUTO_INCREMENT,
  `nombrecate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `categoria` WRITE;
INSERT INTO `categoria` VALUES (1,'Alimentos'),(2,'Bebidas'),(3,'Limpieza');
UNLOCK TABLES;

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

LOCK TABLES `productos` WRITE;
INSERT INTO `productos` VALUES (1,'Gaseosa','Coca Cola','2.25 litros',280,100,2),(2,'Gaseosa','Sprite','2.25 litros',260,80,2),(3,'Arroz','Gallo','1 kg',190,90,1),(4,'Fideo','Lucchetti','1 kg',80,70,1),(5,'Aceite','Cocinero','900 ml',430,100,1),(6,'Te','Taragui','50 saquitos',200,100,1),(7,'Mate','Nobleza Gaucha','25 saquitos',90,50,1),(8,'Detergente','Zorro','300ml',79,50,3),(9,'Shampo','Sedal','400ml',350,100,3),(10,'Papel Higiénico','Higienol','30 metros',169,200,3),(11,'Polenta','La Española','1 kg',130,100,1);
UNLOCK TABLES;

CREATE TABLE `bd_supermarket`.`clientes` (
`id` INT(4) NOT NULL AUTO_INCREMENT ,
`fecha` TIMESTAMP NOT NULL ,
`nombre` VARCHAR(30) NOT NULL ,
`apellido` VARCHAR(40) NOT NULL ,
`dni` VARCHAR(10) NULL ,
`domicilio` VARCHAR(30) NOT NULL ,
`telefono` VARCHAR(15) NULL ,
`celular` VARCHAR(15) NOT NULL ,
`localidad` VARCHAR(25) NOT NULL ,
 PRIMARY KEY (`id`(4))) ENGINE = InnoDB;
 
CREATE TABLE `bd_supermarket`.`usuarios` (
`email` VARCHAR(35) NOT NULL , 
`clave` VARCHAR(15) NOT NULL , 
PRIMARY KEY (`email`(35), `clave`(15))) ENGINE = InnoDB;

DROP TABLE `clientes`;
DROP TABLE `usuarios`;
DROP TABLE `crear_cuentas`;

CREATE TABLE `bd_supermarket`.`crear_cuentas` (
`id_crearCuenta` INT(4) NOT NULL AUTO_INCREMENT , 
`email` VARCHAR(35) NOT NULL , 
`clave` VARCHAR(15) NOT NULL , 
`confirmacionClave` VARCHAR(15) NOT NULL , 
PRIMARY KEY (`id_crearCuenta`(4))) ENGINE = InnoDB;

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