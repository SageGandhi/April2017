CREATE TABLE EMPLOYEEVERSION01 (ID BIGINT NOT NULL, ParkSpaceId BIGINT, PRIMARY KEY (ID))
CREATE TABLE PARKINGSPACEVERSION01 (ID BIGINT NOT NULL, PRIMARY KEY (ID))
ALTER TABLE EMPLOYEEVERSION01 ADD CONSTRAINT MPLYVRSON01PrkSpcd FOREIGN KEY (ParkSpaceId) REFERENCES PARKINGSPACEVERSION01 (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)