create table regions( region_id int unsigned not null primary key, region_name varchar(50));
insert into regions values( 1 , "abc");
insert into regions values( 2 , "xyz");
insert into regions values( 3 , "pqr");
select * from regions;

create table countries( country_id char not null primary key, country_name varchar(50), region_id int unsigned not null);
alter table countries add foreign key (region_id) references regions(region_id);
insert into countries values( "A", "Europe", 2);
update countries set country_name = "Europe" where region_id = 2;
insert into countries values( "B", "Australia", 1);
insert into countries values( "C", "Dubai", 3);
select * from countries;

create table location( location_id int unsigned not null auto_increment primary key, street_address varchar(50), postal_cod varchar(20), city varchar(30) not null , state_province varchar(30), country_id char not null);
alter table location add foreign key (country_id) references countries(country_id);
insert into location values( 1,"29 Mall","566","Belgium","prov","B");
insert into location values( 2,"27 circle","576","Tumkur","proi","B");
insert into location values( 3,"Orion Mall","586","Banglore","pro","A");
select * from location;

create table departments( department_id int unsigned not null, department_name varchar(50) not null, manager_id int unsigned, location_id int unsigned, primary key (department_id,manager_id));
alter table departments add foreign key (location_id) references location(location_id);
alter table departments add foreign key (manager_id) references employees(manager_id);
desc departments;
set foreign_key_checks=0;
select * from departments;
insert into departments values( 10, "ISE", 33 , 3);
insert into departments values( 11, "CSE", 35 , 2);
insert into departments values( 12, "EEE", 37 , 1);


create table jobs( job_id int unsigned not null primary key, job_title varchar(50) not null, min_salary decimal unsigned,max_salary decimal unsigned);
alter table jobs add unique key (job_id);
insert into jobs values( 233,"ASE",24000.00,54000.00);
insert into jobs values( 234,"HR",34000.00,64000.00);
insert into jobs values( 235,"Manger",64000.00,84000.00);
select * from jobs;

create table employees( employee_id int unsigned not null, first_name varchar(20),last_name varchar(20) not null,email varchar(20),ph_no varchar(10) not null,hire_date date not null,job_id int unsigned not null,salary decimal not null,commission_pct decimal, manager_id int unsigned,department_id int unsigned,primary key(manager_id,employee_id));
alter table employees add foreign key (job_id) references jobs(job_id);
alter table employees add unique key (employee_id);
drop table employees;
alter table employees add foreign key (department_id) references departments(department_id);
alter table employees add foreign key (manager_id) references departments(manager_id);
insert into employees values ( 80, "Sam","Khan","sk@gmail.com","2323323232", str_to_date('10-MAR-2000','%d-%M-%Y') , 234 , 34000.000, 2.3, 33, 10);
insert into employees values ( 81, "Riz","Syed","rs@gmail.com","23223232", str_to_date('12-MAR-2000','%d-%M-%Y') , 233 , 44000.000, 4.3, 35, 11);
insert into employees values ( 82, "Zaib","Han","zh@gmail.com","23233232", str_to_date('13-MAR-2000','%d-%M-%Y') , 235 , 53000.000, 5.3, 37, 12);
set foreign_key_checks=0;
select * from employees;
desc employees;

create table job_history( employee_id int unsigned not null, start_date date not null, end_date date not null, job_id varchar(20) not null, department_id int unsigned not null,primary key(employee_id,start_date));
alter table job_history modify column job_id int unsigned;
insert into job_history values( 80, str_to_date('11-MAR-2000','%d-%M-%Y'),str_to_date('13-MAR-2002','%d-%M-%Y'),233,11);
insert into job_history values( 81, str_to_date('13-MAR-2000','%d-%M-%Y'),str_to_date('15-MAR-2016','%d-%M-%Y'),235,11);
insert into job_history values( 82, str_to_date('15-MAR-2000','%d-%M-%Y'),str_to_date('16-MAR-2012','%d-%M-%Y'),234,10);

alter table job_history add foreign key(employee_id) references employees(employee_id);
alter table job_history add foreign key(job_id) references jobs(job_id);