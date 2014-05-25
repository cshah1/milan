ALTER TABLE `milan`.`registration` 
ADD COLUMN `registrationdatetime` DATETIME NULL DEFAULT NULL AFTER `departuretime`,
ADD COLUMN `bhaktichakracollected` BIT NULL DEFAULT 0 AFTER `registrationdatetime`;
