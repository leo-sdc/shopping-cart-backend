CREATE TABLE product (
	id number(20) NOT NULL AUTO_INCREMENT,
	name varchar(200) NOT NULL,
	value number(6,2) NULL,
	PRIMARY KEY (id),
	UNIQUE KEY UK_name (name)
)