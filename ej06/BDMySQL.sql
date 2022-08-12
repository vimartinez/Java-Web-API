CREATE TABLE jwa.`User` (
	ID INT UNIQUE NOT NULL,
	nombreApellido varchar(100) NULL,
	mail varchar(100) NOT NULL,
	direccion varchar(100) NULL,
	clave varchar(100) NOT NULL,
	fechaNacimiento DATE NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;


USE JWA;

INSERT INTO jwa.`users`
(ID, nombreApellido, mail, direccion, clave, fechaNacimiento)
VALUES(1, "Pablo Gomez", 'pablo@gmail.com', 'Calle 1 nro 1234', MD5('1234'), NULL);
INSERT INTO jwa.`users`
(ID, nombreApellido, mail, direccion, clave, fechaNacimiento)
VALUES(2, "Norberto Gimenez", 'norber@gmail.com', 'Corrientes 348 2p', MD5('4567'), NULL);
INSERT INTO jwa.`users`
(ID, nombreApellido, mail, direccion, clave, fechaNacimiento)
VALUES(3, "Checo Perez", 'checo@gmail.com', 'Av de los Incas 3514 2c, CABA', MD5('12334'), NULL);

SELECT * FROM USERS;