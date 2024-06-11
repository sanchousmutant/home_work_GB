SELECT productname, manufacturer,
  CASE
	  WHEN productcount <= 1 then 'little'
      WHEN productcount > 1 and productcount <= 3 then 'many'
      WHEN productcount > 3 then 'lots'
  END as "statuscount case",
  if(productcount <= 1, 'little',
  if(productcount > 1 and productcount <= 3, 'many', 'lots'))
  -- if(productcount > 3, 'lots')))
  as "statuscount if"
FROM products;

SELECT
  product_name, manufacturer_id,
  CASE
    WHEN product_count < 100 THEN 'little'
    WHEN product_count BETWEEN 100 AND 300 THEN 'many'
    ELSE 'lots'
  END AS status_count
FROM mobile_phones;

-- Создайте таблицу (сущность) с мобильными телефонами mobile_phones
DROP TABLE IF EXISTS mobile_phones; -- проверка наличия таблицы
CREATE TABLE mobile_phones(
Id serial PRIMARY KEY,
product_name VARCHAR(30) NOT NULL,
manufacturer VARCHAR(30) NOT NULL,
product_count INTEGER ,
price INTEGER
);
-- заполняем таблицу
INSERT INTO mobile_phones (product_name, manufacturer, product_count, price) VALUES
('iPhone X', 'Apple', 156, 76000),
('iPhone 8', 'Apple', 180, 51000),
('Galaxy S9', 'Samsung', 21, 56000),
('Galaxy S8', 'Samsung', 124, 41000),
('P20 Pro', 'Huawei', 341, 36000);
-- создаем доп таблицу
DROP TABLE IF exists manufacturer;
CREATE TABLE manufacturer(
id serial PRIMARY KEY,
name VARCHAR(30) NOT null);
-- заполняем
insert into manufacturer (name)
values ("Apple"), ("Samsung"), ("Huawei");
-- внешний ключ
alter table mobile_phones add column manufacturer_id bigint unsigned after manufacturer;
ALTER TABLE mobile_phones ADD FOREIGN KEY (manufacturer_id) REFERENCES manufacturer(id)
on update cascade on delete set null;
-- обновление данных manufacturer_id
UPDATE mobile_phones 
SET mobile_phones.manufacturer_id  = (
    SELECT manufacturer.id  
    FROM manufacturer
    WHERE manufacturer.name  = mobile_phones.manufacturer 
);
-- Удалите атрибут manufacturer из сущности mobile_phones
ALTER table mobile_phones DROP COLUMN manufacturer;
-- Выведите идентификатор, название и идентификатор производителя сущности mobile_phones
select id, product_name, manufacturer_id from mobile_phones;