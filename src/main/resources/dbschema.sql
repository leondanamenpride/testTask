--Таблица с DVD
DROP TABLE IF EXISTS DVD;

CREATE TABLE DVD
(
  id    INT          NOT NULL   PRIMARY KEY IDENTITY ,
  title VARCHAR(255) NOT NULL
);

--Таблица с пользователями

CREATE TABLE USER
(
  id        INT          NOT NULL  PRIMARY KEY IDENTITY ,
  name      VARCHAR(255) NOT NULL                       ,
  password  VARCHAR(255) NOT NULL
);
--таблица соответствий пользователь-диск
DROP TABLE IF EXISTS TAKENITEM;
CREATE TABLE TAKENITEM
(
    user_id INT NOT NULL   ,
    dvd_id  INT NOT NULL   ,

    FOREIGN KEY (user_id) REFERENCES  USER(id),
    FOREIGN KEY (dvd_id)  REFERENCES  DVD(id)

);
INSERT INTO USER      VALUES (1,'user','password');
INSERT INTO DVD       VALUES (1,'green day');
INSERT INTO TAKENITEM VALUES (1,1);
