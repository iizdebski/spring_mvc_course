DROP DATABASE IF EXISTS book_manager;
CREATE DATABASE IF NOT EXISTS book_manager CHARACTER SET utf8 COLLATE utf8_general_ci;

USE book_manager;

DROP TABLE IF EXISTS books;

CREATE TABLE books (
                                ID INT NOT NULL AUTO_INCREMENT
                                  PRIMARY KEY,
                                TITLE VARCHAR(255) NOT NULL,
                                AUTHOR VARCHAR(255) NOT NULL,
                                PRICE INT NOT NULL,
                                CONSTRAINT id_UNIQUE
                                  UNIQUE (id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;