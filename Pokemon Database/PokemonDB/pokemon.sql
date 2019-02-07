BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `pokemon` (
	`p_id`	INTEGER NOT NULL,
	`p_name`	TEXT NOT NULL,
	`p_height`	INTEGER,
	`p_weight`	INTEGER,
	`p_ptype`	TEXT NOT NULL,
	`p_stype`	TEXT,
	`p_generation`	TEXT NOT NULL,
	`p_ability1`	TEXT NOT NULL,
	`p_ability2`	TEXT,
	`p_species`	TEXT NOT NULL,
	PRIMARY KEY(`p_id`)
);
INSERT INTO `pokemon` VALUES (1,'Bulbsaur','0.7m','6.9kg','Grass','Posion','Generation 1','Overgrow','','Seed');
COMMIT;
