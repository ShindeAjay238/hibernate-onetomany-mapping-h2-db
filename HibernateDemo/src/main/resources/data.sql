insert into Location(id, name) values(1, 'Latur, Maharashtra');
insert into Location(id, name) values(2, 'Pune, Maharashtra');
insert into Location(id, name) values(3, 'Califonia, USA');

insert into User(id, firstname, lastname, email, location_id) values(1, 'Ajay', 'Shinde', 'ajayshinde238@gmail.com', 1);
insert into User(id, firstname, lastname, email, location_id) values(2, 'Vijay', 'Shinde', 'vijayshinde@gmail.com', 2);
insert into User(id, firstname, lastname, email, location_id) values(3, 'Sanjay', 'Jadhav', 'sanjayjadhav221@gmail.com', 3);

insert into Post(id, post_date, details, user_id) values(1, CURRENT_TIMESTAMP(), 'Very good post', 1);
insert into Post(id, post_date, details, user_id) values(2, CURRENT_TIMESTAMP(), 'A rainy day', 2);
insert into Post(id, post_date, details, user_id) values(3, CURRENT_TIMESTAMP(), 'nice tutorials', 3);
 