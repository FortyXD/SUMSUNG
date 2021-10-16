CREATE TABLE tabl 
(_id INT AUTO_INCREMENT PRIMARY KEY,
  name text,
  age int,
  temperature double
);


insert into tabl(name, age, temperature) values("Masha", 84, 42.2);
insert into tabl(name, age, temperature) values("Vova", 14, 34.5);
select * from tabl;
