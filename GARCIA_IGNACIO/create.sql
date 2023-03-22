CREATE TABLE IF NOT EXISTS odontologos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    numeroMatricula VARCHAR(50) NOT NULL
);

INSERT INTO odontologos (nombre, apellido, numeroMatricula) VALUES ('Roberto',
'Gonzalez', '1708266');
INSERT INTO odontologos (nombre, apellido, numeroMatricula) VALUES
('Chinchulin', 'Asado', '546315');
INSERT INTO odontologos (nombre, apellido, numeroMatricula) VALUES ('Albus',
'Dumbledore', '1111111');