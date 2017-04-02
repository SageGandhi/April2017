CREATE TABLE APP.AuthorDetails (ID BIGINT NOT NULL, BIO VARCHAR(1000), DATEOFBIRTH DATE, AuthorFirstName VARCHAR(100) NOT NULL, LANGUAGE VARCHAR(255), AuthorLastName VARCHAR(100), PRIMARY KEY (ID))
CREATE TABLE EmployeeVersion000 (ID BIGINT NOT NULL, NAME VARCHAR(255), TITLE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
