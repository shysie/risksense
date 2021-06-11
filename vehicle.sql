DROP TABLE IF EXISTS vehicles ;
CREATE TABLE IF NOT EXISTS vehicles (
  manufacturer varchar(16), 
  model varchar(16), 
  price int
);
INSERT INTO vehicles (manufacturer, model, price) VALUES 
('Toyota', 'Camry', 16000), 
('Toyota', 'Highlander', 22000), 
('Honda', 'Pilot', 24000), 
('Honda', 'Accord', 17000);

SELECT t2.manufacturer, t2.model, t2.price 
FROM (
  SELECT manufacturer, MAX(price) as max_price 
  FROM vehicles 
  group by manufacturer) t1 
INNER JOIN vehicles t2 
on t1.manufacturer = t2.manufacturer and t1.max_price = t2.price 