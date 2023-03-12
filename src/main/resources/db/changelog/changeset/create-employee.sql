CREATE TABLE employee (
    id SERIAL NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    title VARCHAR NOT NULL,
    role VARCHAR NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (title)
);