CREATE DATABASE xlch;

use xlch;

create table user (
   id int(11) primary key not null auto_increment,
	 name varchar(32),
	 email varchar(32)
);