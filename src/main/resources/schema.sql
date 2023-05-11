CREATE TABLE if NOT EXISTS Employee (
 id BIGINT NOT NULL AUTO_INCREMENT,
 first_name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 age BIGINT,
 salary BIGINT,
 password VARCHAR(255) NOT NULL,
 username VARCHAR(255) NOT NULL,
 role_id BIGINT,
 PRIMARY KEY (id));

 CREATE TABLE if NOT EXISTS Customer (
  id BIGINT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  email VARCHAR(255),
  phone_number VARCHAR(255) NOT NULL,
  role_id BIGINT,
  basket_id BIGINT,
  PRIMARY KEY (id));

CREATE TABLE if NOT EXISTS Product (
 id BIGINT NOT NULL AUTO_INCREMENT,
 name VARCHAR(255),
 price DOUBLE,
 quantity INTEGER,
 type VARCHAR(255),
 color VARCHAR(255),
 expires DATE,
 description VARCHAR(255),
 PRIMARY KEY (id));

--CREATE TABLE if NOT EXISTS Authority (
-- id BIGINT NOT NULL AUTO_INCREMENT,
-- role VARCHAR(255) NOT NULL,
-- PRIMARY KEY (id));

CREATE TABLE if NOT EXISTS shopping_basket (
 id BIGINT NOT NULL AUTO_INCREMENT,
 PRIMARY KEY (id));

 CREATE TABLE if NOT EXISTS shopping_basket_products (
  basket_id BIGINT NOT NULL,
  product_id BIGINT NOT NULL,
  constraint fk_basket_product_id foreign key (basket_id) references shopping_basket(id),
  constraint fk_product_basket_id foreign key (product_id) references product(id));

CREATE TABLE if NOT EXISTS roles (
  role_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  PRIMARY KEY (role_id)
);

CREATE TABLE if NOT EXISTS users_roles (
  employee_id BIGINT NOT NULL,
  role_id int(11) NOT NULL,
  CONSTRAINT role_fk FOREIGN KEY (role_id) REFERENCES roles (role_id),
  CONSTRAINT user_fk FOREIGN KEY (employee_id) REFERENCES employee (id)
);
