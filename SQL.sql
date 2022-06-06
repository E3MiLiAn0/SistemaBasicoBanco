use banco;


create table Sucursal(
numSucursal int primary key,
nombreSucursal varchar(50));


create table Empleado(
dni int primary key,
nombrApellido varchar (50),
telefono varchar(40),
email varchar(40),
legajo int,
fechaingreso date,
idSucursal int,
 foreign key (idSucursal) references Sucursal(numSucursal));

create table Cliente(
dni int primary key,
domicilio varchar (40),
nombrApellido varchar (50),
telefono varchar(40),
email varchar(40),
legajo int,
fechaAlta date,
idSucursal int,
 foreign key (idSucursal) references Sucursal(numSucursal));

create table CajaDeAhorro(
numCuenta int primary key,
saldo double default 0,
tipoMoneda varchar(30),
cbu long,
dniCliente int,
foreign key (dniCliente) references Cliente (dni));

create table CuentaCorriente(
numCuenta int primary key,
saldo double default 0,
tipoMoneda varchar(30),
cbu long,
dniCliente int,
foreign key (dniCliente) references Cliente (dni));






