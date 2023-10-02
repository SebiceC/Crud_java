-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema crudsebastian
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema crudsebastian
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `crudsebastian` DEFAULT CHARACTER SET utf8 ;
USE `crudsebastian` ;

-- -----------------------------------------------------
-- Table `crudsebastian`.`genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crudsebastian`.`genero` (
  `idgenero` INT NOT NULL,
  `generoNombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idgenero`),
  UNIQUE INDEX `idgenero_UNIQUE` (`idgenero` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crudsebastian`.`ciudad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crudsebastian`.`ciudad` (
  `idciudad` INT NOT NULL,
  `ciudadNombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idciudad`),
  UNIQUE INDEX `idciudad_UNIQUE` (`idciudad` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crudsebastian`.`propietario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crudsebastian`.`propietario` (
  `numID` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `idGenero` INT NOT NULL,
  `idCiudad` INT NOT NULL,
  PRIMARY KEY (`numID`, `idGenero`, `idCiudad`),
  UNIQUE INDEX `numID_UNIQUE` (`numID` ASC) VISIBLE,
  INDEX `fk_propietario_genero_idx` (`idGenero` ASC) VISIBLE,
  INDEX `fk_propietario_ciudad1_idx` (`idCiudad` ASC) VISIBLE,
  CONSTRAINT `fk_propietario_genero`
    FOREIGN KEY (`idGenero`)
    REFERENCES `crudsebastian`.`genero` (`idgenero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_propietario_ciudad1`
    FOREIGN KEY (`idCiudad`)
    REFERENCES `crudsebastian`.`ciudad` (`idciudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
