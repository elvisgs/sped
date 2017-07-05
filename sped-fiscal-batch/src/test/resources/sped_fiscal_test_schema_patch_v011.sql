SET SCHEMA sped_fiscal;

UPDATE reg_0000 SET cod_ver = '011';

ALTER TABLE reg_0200 ADD COLUMN cest varchar(7);

ALTER TABLE reg_1210 ADD COLUMN chv_doce varchar(44);

ALTER TABLE reg_1923 ADD COLUMN chv_doce varchar(44);

ALTER TABLE reg_c113 ADD COLUMN chv_doce varchar(44);

ALTER TABLE reg_c176 ADD COLUMN chave_nfe_ult_e varchar(44);
ALTER TABLE reg_c176 ADD COLUMN num_item_ult_e varchar(3);
ALTER TABLE reg_c176 ADD COLUMN vl_unit_bc_icms_ult_e numeric(18, 2);
ALTER TABLE reg_c176 ADD COLUMN aliq_icms_ult_e numeric(18, 2);
ALTER TABLE reg_c176 ADD COLUMN vl_unit_limite_bc_icms_ult_e numeric(18, 2);
ALTER TABLE reg_c176 ADD COLUMN vl_unit_icms_ult_e numeric(18, 3);
ALTER TABLE reg_c176 ADD COLUMN aliq_st_ult_e numeric(18, 2);
ALTER TABLE reg_c176 ADD COLUMN vl_unit_res numeric(18, 3);
ALTER TABLE reg_c176 ADD COLUMN cod_resp_ret varchar(1);
ALTER TABLE reg_c176 ADD COLUMN cod_mot_res varchar(1);
ALTER TABLE reg_c176 ADD COLUMN chave_nfe_ret varchar(44);
ALTER TABLE reg_c176 ADD COLUMN cod_part_nfe_ret varchar(60);
ALTER TABLE reg_c176 ADD COLUMN ser_nfe_ret varchar(3);
ALTER TABLE reg_c176 ADD COLUMN num_nfe_ret varchar(9);
ALTER TABLE reg_c176 ADD COLUMN item_nfe_ret varchar(3);
ALTER TABLE reg_c176 ADD COLUMN cod_da varchar(1);
ALTER TABLE reg_c176 ADD COLUMN num_da varchar(255);

ALTER TABLE reg_e113 ADD COLUMN chv_doce varchar(44);

ALTER TABLE reg_e240 ADD COLUMN chv_doce varchar(44);

ALTER TABLE reg_e310 ADD COLUMN deb_esp_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_deducoes_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_out_cred_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_out_deb_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_recol_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_sld_cred_ant_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_sld_cred_transportar_fcp numeric(18, 2);
ALTER TABLE reg_e310 ADD COLUMN vl_sld_dev_ant_fcp numeric(18, 2);

CREATE TABLE reg_k210 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini_os date,
    dt_fin_os date,
    cod_doc_os varchar(30),
    cod_item_ori varchar(60),
    qtd_ori numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k210_idx_id_pai ON reg_k210 (id_pai);
CREATE INDEX reg_k210_idx_cnpj_pai ON reg_k210 (cnpj_pai);

CREATE TABLE reg_k215 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item_dest varchar(60),
    qtd_des numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k215_idx_id_pai ON reg_k215 (id_pai);
CREATE INDEX reg_k215_idx_cnpj_pai ON reg_k215 (cnpj_pai);

CREATE TABLE reg_k260 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_op_os varchar(30),
    cod_item varchar(60),
    dt_saida date,
    qtd_saida numeric(18, 3),
    dt_ret date,
    qtd_ret numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k260_idx_id_pai ON reg_k260 (id_pai);
CREATE INDEX reg_k260_idx_cnpj_pai ON reg_k260 (cnpj_pai);

CREATE TABLE reg_k265 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    qtd_cons numeric(18, 3),
    qtd_ret numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k265_idx_id_pai ON reg_k265 (id_pai);
CREATE INDEX reg_k265_idx_cnpj_pai ON reg_k265 (cnpj_pai);

CREATE TABLE reg_k270 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini_ap date,
    dt_fin_ap date,
    cod_op_os varchar(30),
    cod_item varchar(60),
    qtd_cor_pos numeric(18, 3),
    qtd_cor_neg numeric(18, 3),
    origem varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k270_idx_id_pai ON reg_k270 (id_pai);
CREATE INDEX reg_k270_idx_cnpj_pai ON reg_k270 (cnpj_pai);

CREATE TABLE reg_k275 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    qtd_cor_pos numeric(18, 3),
    qtd_cor_neg numeric(18, 3),
    cod_ins_subst varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k275_idx_id_pai ON reg_k275 (id_pai);
CREATE INDEX reg_k275_idx_cnpj_pai ON reg_k275 (cnpj_pai);

CREATE TABLE reg_k280 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_est date,
    cod_item varchar(60),
    qtd_cor_pos numeric(18, 3),
    qtd_cor_neg numeric(18, 3),
    ind_est varchar(1),
    cod_part varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k280_idx_id_pai ON reg_k280 (id_pai);
CREATE INDEX reg_k280_idx_cnpj_pai ON reg_k280 (cnpj_pai);
