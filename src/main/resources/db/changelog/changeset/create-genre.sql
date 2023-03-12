CREATE TABLE genre (
    id SERIAL NOT NULL,
    name VARCHAR(80) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (name)
);