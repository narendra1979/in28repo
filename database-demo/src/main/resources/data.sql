create table person
(
	id integer not null,
	name varchar(25) not null,
	location varchar(30),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (id,name,location,birth_date) 
VALUES (10001,'Ranga','Hyderabd',sysdate);

INSERT INTO PERSON (id,name,location,birth_date) 
VALUES (10002,'James','new York',sysdate);

INSERT INTO PERSON (id,name,location,birth_date) 
VALUES (10003,'Peter','Amsterdom',sysdate);