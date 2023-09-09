.version
.database
.show
.tables

CREATE TABLE JACREDENCIALES
(
    Id_Credenciales INTEGER PRIMARY KEY AUTOINCREMENT ,
    Id_Usuario              INTEGER     NOT NULL,
    Usuario_Credencial      VARCHAR(30) NOT NULL,
    Password_Credencial     VARCHAR(30) NOT NULL
);

INSERT INTO JACREDENCIALES (Usuario_Credencial, Password_Credencial)
VALUES ('julio.arrobo@epn.edu.ec', '2200223473');
INSERT INTO JACREDENCIALES (Usuario_Credencial, Password_Credencial)
VALUES ('profesor', '123456');
INSERT INTO JACREDENCIALES (Usuario_Credencial, Password_Credencial)
VALUES ('usuario3', '11111')

SELECT * FROM JACREDENCIALES

--CREACION DE TABLAS BASE DE DATOS

CREATE TABLE JAARSENALTIPO
(
    Id_ArsenalTipo      INTEGER PRIMARY KEY AUTOINCREMENT,
    Id_Credenciales     INTEGER,
    Nombre_TipoArsenal  VARCHAR(30) NOT NULL,
    FOREIGN KEY (Id_Credenciales) REFERENCES JACREDENCIALES(Id_Credenciales)
);

CREATE TABLE JACOORDENADAS
(
    Id_Coordenadas      INTEGER PRIMARY KEY AUTOINCREMENT,
    Id_ArsenalTipo      INTEGER,
    Nombre_Cordenadas   VARCHAR(30) NOT NULL,
    FOREIGN KEY (Id_ArsenalTipo ) REFERENCES JAARSENALTIPO(Id_ArsenalTipo)
);
SELECT * FROM JAARSENALTIPO;

CREATE TABLE JAARSENAL
(
    Id_Arsenal          INTEGER PRIMARY KEY AUTOINCREMENT,
    Id_Coodenadas       INTEGER,
    Nombre_Arsenal      VARCHAR(30) NOT NULL,
    FOREIGN KEY (Id_Coodenadas) REFERENCES JACOORDENADAS(Id_Coodenadas)
);

CREATE TABLE JAHORARIO
(
    Id_Horario          INTEGER PRIMARY KEY AUTOINCREMENT,
    Id_Arsenal          INTEGER,
    Dia                 VARCHAR(30) NOT NULL,
    Hora                VARCHAR(30) NOT NULL,
    FOREIGN KEY (Id_Arsenal) REFERENCES JAARSENAL(Id_Arsenal)
);

INSERT OR IGNORE INTO JAHORARIO (Hora)
SELECT 'Juan', 'juan@example.com'
WHERE NOT EXISTS (SELECT 1 FROM personas WHERE nombre = 'Juan');

INSERT INTO JAHORARIO(Hora) VA

