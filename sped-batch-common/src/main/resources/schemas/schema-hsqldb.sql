CREATE TABLE BATCH_SPED_EXECUTION (
  ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
  CNPJ CHARACTER VARYING(14) NOT NULL,
  NOME CHARACTER VARYING(100),
  ANO INTEGER NOT NULL,
  MES INTEGER NOT NULL,
  ARQUIVO CHARACTER VARYING(255),
  LAYOUT CHARACTER VARYING(15),
  JOB_EXECUTION_ID BIGINT NOT NULL,
  CONSTRAINT BATCH_SPED_JOB_FKEY FOREIGN KEY (JOB_EXECUTION_ID)
    REFERENCES BATCH_JOB_EXECUTION (JOB_EXECUTION_ID)
);

CREATE TABLE BATCH_SPED_EXECUTION_SEQ (
  ID BIGINT IDENTITY
);