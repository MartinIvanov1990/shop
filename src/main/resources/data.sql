INSERT INTO Employee (first_name, last_name, age, salary, password, role_id)
VALUES ('Ivan', 'Ivanov', 25, 2000, 'p12', 1);

INSERT INTO Employee (first_name, last_name, age, salary, password, role_id)
VALUES ('Petar', 'Petrov', 25, 2000, '123', 1);

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Bread', 6.30, 23,'food', 'black', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Beer', 12.30, 25,'drink', 'White', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Paper', 12.30, 25,'sanitary', 'White', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO product (name, price, quantity, type, color, expires, description)
VALUES ('Lipstick', 12.30, 25,'makeup', 'red', STR_TO_DATE('3-04-2023', '%d-%m-%Y'), 'Test');

INSERT INTO Authority (role)
VALUES ('ADMIN');

INSERT INTO Authority (role)
VALUES ('USER');


