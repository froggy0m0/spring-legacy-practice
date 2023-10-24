
create database pratice;
use pratice;

drop table user;
drop table product;

create table user(
	user_id varchar(15) not null,
    user_password varchar(15),
    primary key(user_id)
);

insert into user values
("ssafy", "1234"), ("admin", "1234");

create table product(
	product_code varchar(15) not null,
    product_name varchar(15),
    count int,
    primary key(product_code)
);

insert into product values
("A001", "갤럭시A1", 1), ("B001", "갤럭시B1", 5);

select * from user;
select * from product;