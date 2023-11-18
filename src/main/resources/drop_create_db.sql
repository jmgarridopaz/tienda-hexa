drop table if exists cliente;
create table cliente (id bigint not null auto_increment, nombre varchar(50), email varchar(320) not null, primary key (id), constraint UK_UNIQUE_EMAIL unique (email)) engine=InnoDB;
