drop table if exists  reg_9900;
create table reg_9900 (
  id integer identity primary key,
  prop varchar(10)
);

insert into reg_9900(prop) values('Test 1');
insert into reg_9900(prop) values('Test 2');

drop table if exists reg_9999;
create table reg_9999 (
  id integer identity primary key,
  prop varchar(10)
);

