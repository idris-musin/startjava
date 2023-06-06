DROP DATABASE IF EXISTS Jaegers;
DROP TABLE IF EXISTS Jaegers;

CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    NUMERIC(7, 3),
    weight    NUMERIC(7, 3),
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);

\ir init_db.sql;
\ir queries.sql;