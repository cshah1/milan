ALTER TABLE `milan`.`registration` 
ADD COLUMN `registrationdatetime` DATETIME NULL DEFAULT NULL AFTER `departuretime`,
ADD COLUMN `bhaktichakracollected` BIT NULL DEFAULT 0 AFTER `registrationdatetime`;
ADD COLUMN `accomodationType` VARCHAR(10) NULL DEFAULT 'None' AFTER `bhaktichakracollected`;

UPDATE
	milan.registration
SET accomodationType = CASE 
		WHEN accfri='Y' and accsat='Y' and accsun='Y' and gender='M' THEN 'FSS-M' 
		WHEN accfri='Y' and accsat='Y' and accsun='Y' and gender='F' THEN 'FSS-F' 
		WHEN accfri='Y' and accsat='Y' and accsun='N' and gender='M' THEN 'FS-M'
		WHEN accfri='Y' and accsat='Y' and accsun='N' and gender='F' THEN 'FS-F'
		WHEN accfri='N' and accsat='Y' and accsun='Y' and gender='M' THEN 'SS-M'
		WHEN accfri='N' and accsat='Y' and accsun='Y' and gender='F' THEN 'SS-F'
		ELSE 'None'
	END 
WHERE 
	ID >0;