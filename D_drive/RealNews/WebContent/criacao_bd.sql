
CREATE DATABASE portal_realnews;
USE portal_realnews;
CREATE TABLE noticia (
id INT NOT NULL PRIMARY KEY ,
descricao VARCHAR ( 512 ),
titulo VARCHAR ( 126 ),
texto TEXT
);
CREATE TABLE comentario (
id INT NOT NULL auto_increment PRIMARY KEY ,
nome VARCHAR ( 126 ),
texto VARCHAR ( 512 ),
fk_noticia_id INT NOT NULL ,
FOREIGN KEY (fk_noticia_id)
REFERENCES noticia(id)  on update cascade on delete cascade
);
USE portal_realnews;
SELECT*FROM comentario;
SELECT*FROM noticia;


SET GLOBAL time_zone="-3:00";