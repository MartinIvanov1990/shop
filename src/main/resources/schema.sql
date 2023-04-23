CREATE TABLE if NOT EXISTS Employee (
 id BIGINT NOT NULL AUTO_INCREMENT,
 first_name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 age BIGINT,
 salary BIGINT,
 password VARCHAR(255) NOT NULL,
 role_id BIGINT,
 PRIMARY KEY (id));

CREATE TABLE if NOT EXISTS Product (
 product_id BIGINT NOT NULL AUTO_INCREMENT,
 name VARCHAR(255),
 price DOUBLE,
 quantity INTEGER,
 type VARCHAR(255),
 color VARCHAR(255),
 expires DATE,
 description VARCHAR(255),
 PRIMARY KEY (product_id));

 CREATE TABLE if NOT EXISTS Authority (
  id BIGINT NOT NULL AUTO_INCREMENT,
  role VARCHAR(255) NOT NULL,
  PRIMARY KEY (id));

