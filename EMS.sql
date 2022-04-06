-- Create a new database called 'EMS'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT [name]
        FROM sys.databases
        WHERE [name] = N'EMS'
)
CREATE DATABASE EMS
GO

USE EMS
GO

DROP TABLE IF EXISTS T_EMPLOYEE;
DROP TABLE IF EXISTS T_GRADES;

CREATE TABLE T_GRADES(
    S_GRADE_ID NVARCHAR(10) PRIMARY KEY,
    S_POSITION NVARCHAR(500)
)
GO

CREATE TABLE T_EMPLOYEE(
    S_EMPLOYEE_ID NVARCHAR(50) PRIMARY KEY,
    S_FIRST_NAME NVARCHAR(50),
    S_LAST_NAME NVARCHAR(50),
    S_GENDER CHAR,
    D_DOB DATETIME,
    S_RESUME NVARCHAR(500),
    D_DOJ DATETIME,
    S_SUPERVISOR NVARCHAR(50),
    S_GRADE_ID NVARCHAR(10),
    FOREIGN KEY (S_GRADE_ID) REFERENCES T_GRADES(S_GRADE_ID)
)
go

INSERT INTO T_GRADES(S_GRADE_ID, S_POSITION)
VALUES('G1','Trainee'),
('G2', 'Software Developer'),
('G3', 'Software Engineer'),
('G4', 'Senior Software Engineer'),
('G5', 'Technical Architect')

INSERT INTO T_EMPLOYEE(S_EMPLOYEE_ID, S_FIRST_NAME, S_LAST_NAME, S_GENDER, S_GRADE_ID, S_SUPERVISOR, D_DOJ, S_RESUME, D_DOB)
VALUES('SS1', 'Surendiran', 'S', 'M', 'G4', '', '2022-01-31', '', '1993-04-12'),
('YK1', 'Yaswanth', 'K', 'M', 'G3', '', '2022-02-20', '', '2004-09-19'),
('SK1', 'Somnath', 'K', 'M', 'G2', '', '2022-03-20', '', '2007-02-19')