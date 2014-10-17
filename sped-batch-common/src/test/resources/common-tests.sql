drop table if exists reg_0000;
create table reg_0000 (
  id bigint not null,
  nome varchar(100),
  cnpj varchar(14),
  dt_ini date
);

insert into reg_0000 values(1, 'Empresa Teste', '99999999000191', '2014-01-01');

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

