-- DDL - Definição
create table tab_ficha_cadastro (
	nome varchar(50) not null,
	salario_minimo numeric(8,2) not null
)

alter table tab_ficha_cadastro 
add profissão varchar(50) not null first;

alter table tab_ficha_cadastro 
add salario_maximo numeric(8,2) null,
add data_nascimento date not null,
add cpf varchar(12) not null,
add rg varchar(10) not null,
add logradouro varchar(50) not null,
add numero int null,
add complemento varchar(30) null,
add bairro varchar(30) not null,
add municipio varchar(30) not null,
add UF char(2) not null,
add cep varchar(9) not null,
add naturalidade varchar(50) not null,
add pais varchar(50) not null,
add telefone varchar(12) null,
add celular varchar(12) not null,
add email varchar(100) not null;


alter table tab_ficha_cadastro 
add escolaridade ENUM('analfabeto','ensino fundamental incompleto', 'ensino fundamental completo','ensino medio incompleto', 'ensino medio completo', 'ensiono superior incompleto', 'ensino superior completo');

insert into tab_ficha_cadastro 
values ('Dev', 'Lucca',1200.50,5000.0,'2000-02-02','50000000000','500000000','Rua --------',24,'Apto','Centro','São Paulo','SP','0991000','Brasileiro','Brasil','11999999999', '11922222222','lbugatti@gmail.com','ensino superior completo');

insert into tab_ficha_cadastro 
values ('Dev', 'Lucca',1200.50,5000.0,'2000-02-02','50000000000','500000000','Rua --------',24,'Apto','Centro','São Paulo','SP','0991000','Brasileiro','Brasil','11999999999', '11922222222','lbugatti@gmail.com','ensino superior completo')
values ('Dev', 'Taty',2000.0,8000.0,'1995-05-10','50000000000','500000000','Rua --------',24,'Apto','Centro','São Paulo','MG','0991000','Brasileiro','Brasil','11999999999', '11922222222','taty@gmail.com','ensiono superior incompleto')
values ('Dev', 'Dom',1500.50,10000.0,'1990-09-20','50000000000','500000000','Rua --------',24,'Apto','Centro','São Paulo','SP','0991000','Brasileiro','Brasil','11999999999', '11922222222','dom@gmail.com','ensino medio completo')
values ('Dev', 'Emerson',1000.0,4000.0,'2005-11-01','50000000000','500000000','Rua --------',24,'Apto','Centro','São Paulo','SC','0991000','Brasileiro','Brasil','11999999999', '11922222222','emerson@gmail.com','analfabeto')


select * 
from tab_ficha_cadastro 
where UF = 'SP';

select *
from tab_ficha_cadastro 
order by salario_minimo, nome;

select nome, data_nascimento as nascimento
from tab_ficha_cadastro
order by data_nascimento ;