
--primary key
create table Client(
    id int primary key auto_increment,
    firstname varchar(50),
    lastname varchar(150),
    email varchar(255),
    state char(2)
);
create table Client(
    id int NOT NULL auto_increment,
    firstname varchar(50),
    lastname varchar(150),
    email varchar(255),
    state char(2),
    primary key (id)
);
-- composite key
create table Client(
    firstname varchar(50),
    lastname varchar(150),
    email varchar(255),
    state char(2),
    primary key (firstname, lastname)
);
--unique key
create table Client(
    firstname varchar(50),
    lastname varchar(150),
    email varchar(255),
    state char(2),
    unique (email)
);

--foreign key
create table meetings(
    id int NOT NULL auto_increment,
    client_id int NOT NULL
    meeting_name varchar(255),
    meeting_date date,
    meeting_place varchar(1024),
    primary key (id),
    foreign key (client_id) references client (id)
);


insert into meetings (meeting_name, meeting_date, meeting_place) values ('Initial consultation','2023-10-28','My office');
insert into meetings (client_id,meeting_name, meeting_date, meeting_place) values (5,'Project review','2023-11-28','Clients office');



insert into client(first_name,last_name,state) values ('John','Deer','OR');
insert into client(first_name,last_name,email,state) values ('Mary','Poppins','mary@gmail.com','TX');
insert into client(first_name,last_name,email,state) values ('Wyatt','Earp','earp@hotmai.com','AZ');
insert into client(first_name,last_name,email,state) values ('Range','Rover','rr@hotmai.com','AZ');
insert into client(first_name,last_name,email,state) values ('Tom','Thumb','tom@river.com','OR');
update client set email = 'john@gmail.com' 

select * from client;


