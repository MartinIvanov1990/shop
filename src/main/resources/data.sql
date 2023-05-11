INSERT INTO Employee (first_name, last_name, age, salary, password, role_id, username)
VALUES ('Ivan', 'Ivanov', 25, 2000, '$2a$12$SXODxRc4Jw/2w11LhLrDrOLNVezxR1UYqQaVyxo7Ujhyxg6nd3Ux2', 1, 'ivan');

INSERT INTO Employee (first_name, last_name, age, salary, password, role_id, username)
VALUES ('Petar', 'Petrov', 25, 2000, '123', 1, 'petar');

INSERT INTO Customer (first_name, last_name, email, phone_number, role_id)
VALUES ('Cust', 'cust', 'abv@abv', 123456, 2);

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Bread', 6.30, 23,'food', 'black', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Beer', 12.30, 25,'drink', 'White', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Paper', 12.30, 25,'sanitary', 'White', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Lipstick', 12.30, 25,'makeup', 'red', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

--INSERT INTO Authority (role)
--VALUES ('ADMIN');
--
--INSERT INTO Authority (role)
--VALUES ('USER');

INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('CREATOR');
INSERT INTO roles (name) VALUES ('EDITOR');
INSERT INTO roles (name) VALUES ('ADMIN');

INSERT INTO users_roles (employee_id, role_id) VALUES (1, 4);
INSERT INTO users_roles (employee_id, role_id) VALUES (2, 2);


