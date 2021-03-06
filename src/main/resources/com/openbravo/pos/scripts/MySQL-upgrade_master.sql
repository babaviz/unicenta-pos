--    uniCenta oPOS - Touch Friendly Point Of Sale
--    Copyright (c) 2009-2018 uniCenta
--    https://unicenta.com
--
--    This file is part of uniCenta oPOS.
--


--
-- Database upgrade script for MySQL v4.5.x + later
-- Date: 5JUNE2018
-- See JRootApp.initApp() change which consolidates individual version scripts
-- into this (MySQL-upgrade_master.sql) one upgrade script for 4.5.x + later
-- Versions pre 4.5 must use Database Transfer Tool
--

-- CLEAR THE DECKS
DELETE FROM sharedtickets;

-- Switch OFF table foreign key relationships
set foreign_key_checks = 0;

-- RECREATE applications table
DROP TABLE `applications`;
CREATE TABLE IF NOT EXISTS `applications` (
	`id` varchar(255) NOT NULL,
	`name` varchar(255) NOT NULL,
	`version` varchar(255) NOT NULL,
	`instdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY  ( `id` )
) ENGINE = InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT = Compact;

-- SYSTEM
-- Menu.Root changes for new report_name .bs, .jrxml and .properties grouping
DELETE FROM resources WHERE id = '0';
DELETE FROM resources WHERE id = '00';
INSERT INTO resources(id, name, restype, content) VALUES('00', 'Menu.Root', 0, $FILE{/com/openbravo/pos/templates/Menu.Root.txt});

-- COMMONS
-- Roles changes for new report_name .bs, .jrxml and .properties grouping
DELETE FROM roles WHERE id = '0';
INSERT INTO roles(id, name, permissions) VALUES('0', 'Administrator role', $FILE{/com/openbravo/pos/templates/Role.Administrator.xml} );
DELETE FROM roles WHERE id = '1';
INSERT INTO roles(id, name, permissions) VALUES('1', 'Manager role', $FILE{/com/openbravo/pos/templates/Role.Manager.xml} );
DELETE FROM roles WHERE id = '2';
INSERT INTO roles(id, name, permissions) VALUES('2', 'Employee role', $FILE{/com/openbravo/pos/templates/Role.Employee.xml} );

-- PLACES
-- Table Places changes for NEW Width & Height + Guests & Occupied
ALTER TABLE `places` ADD COLUMN `height` INT(11) NOT NULL DEFAULT 45 AFTER `tablemoved`;
ALTER TABLE `places` ADD COLUMN `width` INT(11) NOT NULL DEFAULT 90 AFTER `height`;
ALTER TABLE `places` ADD COLUMN `guests` INT(11) DEFAULT 0 AFTER `width`;
ALTER TABLE `places` ADD COLUMN `occupied` datetime DEFAULT NULL AFTER `guests`;

-- Switch ON table foreign key relationships
set foreign_key_checks = 1;

INSERT INTO applications(id, name, version) VALUES($APP_ID{}, $APP_NAME{}, $APP_VERSION{});