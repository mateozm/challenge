insert into Category (id_Category, name, parent_Category) values (1, 'Furnitures', null);
insert into Category (id_Category, name, parent_Category) values (2, 'Electronics', null);
insert into Category (id_Category, name, parent_Category) values (3, 'Home furnitures',1);
insert into Category (id_Category, name, parent_Category) values (4, 'Work Electronics',2);


insert into Product (id_Product, name, id_Category) values (1,'Major Appliances',3);
insert into Product (id_Product, name, id_Category) values (2,'Minor Appliances',3);

insert into Product (id_Product, name, id_Category) values (3,'Major Furnitures',4);
insert into Product (id_Product, name, id_Category) values (4,'Minor Furnitures',4);


insert into Keyword (id_Keyword, keyword, id_Category) values (1, 'furniture',1);

insert into Keyword (id_Keyword, keyword, id_Category) values (2, 'electronic',2);



insert into Keyword (id_Keyword, keyword, id_Category) values (4, 'work',4);
