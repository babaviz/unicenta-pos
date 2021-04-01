--    uniCenta oPOS - Touch Friendly Point Of Sale
--    Copyright (c) 2009-2018 uniCenta
--    https://unicenta.com
--
--    This file is part of uniCenta oPOS.
--


-- Database upgrade script for MySQL
-- v4.5.3 - v4.5.4 9MAY2018

--
-- CLEAR THE DECKS
--
DELETE FROM sharedtickets;

-- RECREATE applications --
DROP TABLE `applications`;
CREATE TABLE IF NOT EXISTS `applications` (
	`id` varchar(255) NOT NULL,
	`name` varchar(255) NOT NULL,
	`version` varchar(255) NOT NULL,
	`instdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY  ( `id` )
) ENGINE = InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT = Compact;

INSERT INTO applications(id, name, version) VALUES($APP_ID{}, $APP_NAME{}, $APP_VERSION{});