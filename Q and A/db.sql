create table post(
    id int primary key auto_increment,
    created_on datetime,
    time_to_live int,
    message varchar(1024)
)
create table user(
    id int primary key auto_increment,
    fname varchar(250),
    lname varchar(250),
    email varchar(250)
);
create table user_2(
    id int primary key auto_increment,
    fname varchar(250),
    lname varchar(250),
    email varchar(250)
);