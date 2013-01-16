CREATE TABLE student(
	stdNo integer auto_increment,
	stdName varchar(20) not null,
	korScore float(5,2),
	engScore float(5,2),
	mathScore float(5,2),
	sumScore float(5,2),
	avgScore float(5,2),
	primary key(stdNo)
);