--    uniCenta oPOS - Touch Friendly Point Of Sale
--    Copyright (c) 2009-2018 uniCenta
--    https://unicenta.com
--
--    This file is part of uniCenta oPOS.
--


-- Database upgrade script for MySQL
-- v4.5 - v4.5.1 27JAN2018

--
-- CLEAR THE DECKS
--
DELETE FROM sharedtickets;

set foreign_key_checks = 0;

-- RECREATE applications --
DROP TABLE `applications`;
CREATE TABLE IF NOT EXISTS `applications` (
	`id` varchar(255) NOT NULL,
	`name` varchar(255) NOT NULL,
	`version` varchar(255) NOT NULL,
	`instdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY  ( `id` )
) ENGINE = InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT = Compact;

-- VERSIONS

-- COMMONS
DELETE FROM roles WHERE id = '0';
INSERT INTO roles(id, name, permissions) VALUES('0', 'Administrator role', $FILE{/com/openbravo/pos/templates/Role.Administrator.xml} );

set foreign_key_checks = 1;

INSERT INTO applications(id, name, version) VALUES($APP_ID{}, $APP_NAME{}, $APP_VERSION{});