-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema pandemicdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `pandemicdb` ;

-- -----------------------------------------------------
-- Schema pandemicdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pandemicdb` DEFAULT CHARACTER SET utf8 ;
USE `pandemicdb` ;

-- -----------------------------------------------------
-- Table `pandemic`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pandemic` ;

CREATE TABLE IF NOT EXISTS `pandemic` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS pandemicuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'pandemicuser'@'localhost' IDENTIFIED BY 'pandemicuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'pandemicuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `pandemic`
-- -----------------------------------------------------
START TRANSACTION;
USE `pandemicdb`;
INSERT INTO `pandemic` (`id`, `name`) VALUES (1, 'Covid-19');

COMMIT;

