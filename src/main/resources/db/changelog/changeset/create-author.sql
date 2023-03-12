CREATE TABLE author (
    id SERIAL NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    second_name VARCHAR(50) NOT NULL,
    birthday DATE NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (first_name, second_name)
);