DROP TABLE clothes If EXISTS;
CREATE TABLE clothes (id int, brand varchar(100), type varchar(100), item varchar(100),color varchar(10), size varchar(2), gender char(1)); 
INSERT INTO clothes (id, brand, type, item,color, size, gender) VALUES (1, 'Zara', 'Outerwear', 'Coats','Red', 'S', 'M');
INSERT INTO clothes (id, brand, type, item,color, size, gender) VALUES (2, 'Louis Vuitton', 'Dresses', 'Dresses','Blue', 'M', 'F');
INSERT INTO clothes (id, brand, type, item,color, size, gender) VALUES (3, 'Uniqlo', 'Underwear','Socks', 'White', 'XL', 'M');
INSERT INTO clothes (id, brand, type, item,color, size, gender) VALUES (4, 'Nike', 'Bottoms', 'Shorts', 'Black', 'L', 'F');
INSERT INTO clothes (id, brand, type, item,color, size, gender) VALUES (5, 'Tommy Hilfiger', 'Tops',  'Sweaters', 'Red', 'XS', 'M');
