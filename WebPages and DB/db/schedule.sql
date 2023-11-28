create table schedule(
    id int primary_key auto_increment
    client_id int NOT NULL
    date date,
    time time,
    foreign key (client_id) references client (id)
)
