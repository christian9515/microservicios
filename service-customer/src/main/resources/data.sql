CREATE TABLE tbl_regions ( id INT PRIMARY KEY, name VARCHAR(20) );
CREATE TABLE tbl_customers ( id INT PRIMARY KEY, number_id VARCHAR(20), first_name VARCHAR(20),
                                last_name VARCHAR(20), email VARCHAR(30), photo_url VARCHAR(20),
                                region_id INT, state VARCHAR(20));


INSERT INTO tbl_regions (id, name) VALUES (1, 'Sudamérica');
INSERT INTO tbl_regions (id, name) VALUES (2, 'Centroamérica');
INSERT INTO tbl_regions (id, name) VALUES (3, 'Norteamérica');
INSERT INTO tbl_regions (id, name) VALUES (4, 'Europa');
INSERT INTO tbl_regions (id, name) VALUES (5, 'Asia');
INSERT INTO tbl_regions (id, name) VALUES (6, 'Africa');
INSERT INTO tbl_regions (id, name) VALUES (7, 'Oceanía');
INSERT INTO tbl_regions (id, name) VALUES (8, 'Antártida');

INSERT INTO tbl_customers (id,number_id,first_name,last_name , email, photo_url, region_id, state) VALUES(1,'32404580', 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com','',1,'CREATED');
