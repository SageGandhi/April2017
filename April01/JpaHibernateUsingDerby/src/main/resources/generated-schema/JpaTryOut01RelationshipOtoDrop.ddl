ALTER TABLE EMPLOYEEVERSION01 DROP CONSTRAINT MPLYVRSON01PrkSpcd
DROP TABLE EMPLOYEEVERSION01
DROP TABLE PARKINGSPACEVERSION01
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'
