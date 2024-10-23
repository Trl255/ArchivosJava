-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-04-2022 a las 20:37:02
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centros`
--

CREATE TABLE `centros` (
  `Numero` int(11) NOT NULL,
  `Nombre` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Direccion` text COLLATE utf8mb4_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `centros`
--

INSERT INTO `centros` (`Numero`, `Nombre`, `Direccion`) VALUES
(10, 'SEDE CENTRAL', 'C. ALCALA 820, MADRID'),
(20, 'RELACION CON CLIENTES', 'C. ATOCHA 405, MADRID');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `Numero` int(11) NOT NULL,
  `Centro` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Director` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Tipo_dir` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Presupuesto` int(11) NOT NULL,
  `Depto_jefe` int(11) DEFAULT NULL,
  `Nombre` text COLLATE utf8mb4_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`Numero`, `Centro`, `Director`, `Tipo_dir`, `Presupuesto`, `Depto_jefe`, `Nombre`) VALUES
(100, '10', '260', 'P', 12, NULL, 'DIRECCION GENERAL'),
(110, '20', '180', 'P', 15, 100, 'DIRECC. COMERCIAL'),
(111, '20', '180', 'F', 11, 110, 'SECTOR INDUSTRIAL'),
(112, '20', '270', 'P', 9, 100, 'SECTOR SERVICIOS'),
(120, '10', '150', 'F', 3, 100, 'ORGANIZACION'),
(121, '10', '150', 'P', 2, 120, 'PERSONAL'),
(122, '10', '350', 'P', 6, 120, 'PROCESO DE DATOS'),
(130, '10', '310', 'P', 2, 100, 'FINANZAS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `Cod` int(11) NOT NULL,
  `Departamento` int(11) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Fecha_nacimiento` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Fecha_ingreso` text COLLATE utf8mb4_spanish2_ci NOT NULL DEFAULT '',
  `Salario` int(11) NOT NULL,
  `Comision` int(11) DEFAULT NULL,
  `Num_hijos` int(11) NOT NULL,
  `Nombre` text COLLATE utf8mb4_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`Cod`, `Departamento`, `Telefono`, `Fecha_nacimiento`, `Fecha_ingreso`, `Salario`, `Comision`, `Num_hijos`, `Nombre`) VALUES
(110, 121, 350, '10-NOV-29', '10-FEB-50', 1310, NULL, 3, 'PONS, CESAR'),
(120, 112, 840, '09-JUN-35', '01-OCT-68', 1350, 110, 1, 'LASA, MARIO'),
(130, 112, 810, '09-NOV-45', '01-FEB-69', 1290, 110, 2, 'TEROL, LUCIANO'),
(150, 121, 340, '10-AUG-30', '15-JAN-48', 1440, NULL, 0, 'PEREZ, JULIO'),
(160, 111, 740, '09-JUL-39', '11-NOV-68', 1310, 110, 2, 'AGUIRRE, AUREO'),
(180, 110, 508, '18-OCT-34', '18-MAR-56', 1480, 50, 2, 'PEREZ, MARCOS'),
(190, 121, 350, '12-MAY-32', '11-FEB-62', 1300, NULL, 4, 'VEIGA, JULIANA'),
(210, 100, 200, '28-SEP-40', '22-JAN-59', 1380, NULL, 2, 'GALVEZ, PILAR'),
(240, 111, 760, '26-FEB-42', '24-FEB-66', 1280, 100, 3, 'SANZ, LAVINIA'),
(250, 100, 250, '27-OCT-46', '01-MAR-67', 1450, NULL, 0, 'ALBA, ADRIANA'),
(260, 100, 220, '03-DEC-43', '12-JUL-68', 1720, NULL, 6, 'LOPEZ, ANTONIO'),
(270, 112, 800, '21-MAY-45', '10-SEP-66', 1380, 80, 3, 'GARCIA, OCTAVIO'),
(280, 130, 410, '11-JAN-48', '08-OCT-71', 1290, NULL, 5, 'FLOR, DOROTEA'),
(285, 122, 620, '25-OCT-49', '15-FEB-68', 1380, NULL, 0, 'POLO, OTILIA'),
(290, 120, 910, '30-NOV-47', '14-FEB-68', 1270, NULL, 3, 'GIL, GLORIA'),
(310, 130, 480, '21-NOV-46', '15-JAN-71', 1420, NULL, 0, 'GARCIA, AUGUSTO'),
(320, 122, 620, '25-DEC-57', '05-FEB-78', 1405, NULL, 2, 'SANZ, CORNELIO'),
(330, 112, 850, '19-AUG-48', '01-MAR-72', 1280, 90, 0, 'DIEZ, AMELIA'),
(350, 122, 610, '13-APR-49', '10-SEP-84', 1450, NULL, 1, 'CAMPS, AURELIO'),
(360, 111, 750, '29-OCT-58', '10-OCT-68', 1250, 100, 2, 'LARA, DORINDA'),
(370, 121, 360, '22-JUN-67', '20-JAN-87', 1190, NULL, 1, 'RUIZ, FABIOLA'),
(380, 112, 880, '30-MAR-68', '01-JAN-88', 1180, NULL, 0, 'MARTIN, MICAELA'),
(390, 110, 500, '19-FEB-66', '08-OCT-86', 1215, NULL, 1, 'MORAN, CARMEN'),
(400, 111, 780, '18-AUG-69', '01-NOV-87', 1185, NULL, 0, 'LARA, LUCRECIA'),
(410, 122, 660, '14-JUL-68', '13-OCT-88', 1175, NULL, 0, 'MU‹OZ, AZUCENA'),
(420, 130, 450, '22-OCT-66', '19-NOV-88', 1400, NULL, 0, 'FIERRO, CLAUDIA'),
(430, 122, 650, '26-OCT-67', '19-NOV-88', 1210, NULL, 1, 'MORA, VALERIANA'),
(440, 111, 760, '27-SEP-66', '28-FEB-86', 1210, 100, 0, 'DURAN, LIVIA'),
(450, 112, 880, '21-OCT-66', '28-FEB-86', 1210, 100, 0, 'PEREZ, SABINA'),
(480, 111, 760, '04-APR-65', '28-FEB-86', 1210, 100, 1, 'PINO, DIANA'),
(490, 112, 880, '06-JUN-64', '01-JAN-88', 1180, 100, 0, 'TORRES, HORACIO'),
(500, 111, 750, '08-OCT-65', '01-JAN-87', 1200, 100, 0, 'VAZQUEZ, HONORIA'),
(510, 110, 550, '04-MAY-66', '01-NOV-86', 1200, NULL, 1, 'CAMPOS, ROMULO'),
(550, 111, 780, '10-JAN-70', '21-JAN-88', 1100, 120, 0, 'SANTOS, SANCHO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `centros`
--
ALTER TABLE `centros`
  ADD PRIMARY KEY (`Numero`);

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`Numero`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`Cod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
