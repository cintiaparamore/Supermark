use  bd_supermark;

CREATE TABLE `categoria` (
  `idcategoria` int NOT NULL AUTO_INCREMENT,
  `nombrecate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `categoria` WRITE;

INSERT INTO `categoria` VALUES (1,'Alimentos'),(2,'Bebidas'),(3,'Limpieza');

UNLOCK TABLES;

DROP TABLE IF EXISTS `productos`;

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

CREATE TABLE clientes (
id INT(4) NOT NULL AUTO_INCREMENT ,
nombre VARCHAR(30) NOT NULL ,
apellido VARCHAR(40) NOT NULL ,
dni VARCHAR(10) NULL ,
domicilio VARCHAR(30) NOT NULL ,
telefono VARCHAR(15) NULL ,
celular VARCHAR(15) NOT NULL ,
localidad VARCHAR(25) NOT NULL ,
email VARCHAR(35) NOT NULL , 
primary key (id, email)
 );
 
 CREATE TABLE usuario(
 email varchar (35) primary key,
 clave VARCHAR(15) NOT NULL
 );
 
 CREATE TABLE `comprobantes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(1) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT NULL,
  `id_cliente` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_comprobante_fk` (`id_cliente`),
  CONSTRAINT `cliente_comprobante_fk` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `descuento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `porcentaje` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

CREATE TABLE ventas(
id_ventas int NOT NULL AUTO_INCREMENT PRIMARY KEY,
fecha TIMESTAMP NOT NULL ,
id int,
foreign key (id) references clientes (id)
)ENGINE=InnoDB;

CREATE TABLE detalle_ventas(
id_ventas int,
codigo int unsigned,
cantidad int,
foreign key (id_ventas) references ventas (id_ventas),
foreign key (codigo) references productos (codigo)
)ENGINE=InnoDB;

select ventas.id_ventas, ventas.fecha, productos.nombre, productos.marca, productos.precio, detalle_ventas.cantidad from clientes inner join ventas using (id) inner join detalle_ventas using (id_ventas)
inner join productos using (codigo) where id=1;

DROP TABLE `categoria`;
DROP TABLE `productos`;
DROP TABLE `detalle_comprobantes`;
DROP TABLE `comprobantes`;
DROP TABLE `clientes`;
DROP TABLE `usuario`;
DROP TABLE `descuento`;