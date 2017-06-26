DROP SCHEMA IF EXISTS sped_fiscal CASCADE;

CREATE SCHEMA sped_fiscal AUTHORIZATION DBA;

SET SCHEMA sped_fiscal;

CREATE TABLE reg_0000 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_ver varchar(3),
    cod_fin varchar(1),
    dt_ini date,
    dt_fin date,
    nome varchar(100),
    cnpj varchar(14),
    cpf varchar(11),
    uf varchar(2),
    ie varchar(14),
    cod_mun varchar(7),
    im varchar(255),
    suframa varchar(9),
    ind_perfil varchar(1),
    ind_ativ varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0000_idx_id_pai ON reg_0000 (id_pai);
CREATE INDEX reg_0000_idx_cnpj_pai ON reg_0000 (cnpj_pai);

CREATE TABLE reg_0001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0001_idx_id_pai ON reg_0001 (id_pai);
CREATE INDEX reg_0001_idx_cnpj_pai ON reg_0001 (cnpj_pai);

CREATE TABLE reg_0005 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    fantasia varchar(60),
    cep varchar(8),
    endereco varchar(60),
    num varchar(10),
    compl varchar(60),
    bairro varchar(60),
    fone varchar(11),
    fax varchar(11),
    email varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0005_idx_id_pai ON reg_0005 (id_pai);
CREATE INDEX reg_0005_idx_cnpj_pai ON reg_0005 (cnpj_pai);

CREATE TABLE reg_0015 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    uf_st varchar(2),
    ie_st varchar(14),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0015_idx_id_pai ON reg_0015 (id_pai);
CREATE INDEX reg_0015_idx_cnpj_pai ON reg_0015 (cnpj_pai);

CREATE TABLE reg_0100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    nome varchar(60),
    cpf varchar(11),
    crc varchar(15),
    cnpj varchar(14),
    cep varchar(8),
    endereco varchar(60),
    num varchar(10),
    compl varchar(60),
    bairro varchar(60),
    fone varchar(11),
    fax varchar(11),
    email varchar(60),
    cod_mun varchar(7),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0100_idx_id_pai ON reg_0100 (id_pai);
CREATE INDEX reg_0100_idx_cnpj_pai ON reg_0100 (cnpj_pai);

CREATE TABLE reg_0150 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    nome varchar(100),
    cod_pais varchar(5),
    cnpj varchar(14),
    cpf varchar(11),
    ie varchar(14),
    cod_mun varchar(7),
    suframa varchar(9),
    endereco varchar(60),
    num varchar(10),
    compl varchar(60),
    bairro varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0150_idx_id_pai ON reg_0150 (id_pai);
CREATE INDEX reg_0150_idx_cnpj_pai ON reg_0150 (cnpj_pai);

CREATE TABLE reg_0175 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_alt date,
    nr_campo varchar(2),
    cont_ant varchar(100),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0175_idx_id_pai ON reg_0175 (id_pai);
CREATE INDEX reg_0175_idx_cnpj_pai ON reg_0175 (cnpj_pai);

CREATE TABLE reg_0190 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    unid varchar(6),
    descr varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0190_idx_id_pai ON reg_0190 (id_pai);
CREATE INDEX reg_0190_idx_cnpj_pai ON reg_0190 (cnpj_pai);

CREATE TABLE reg_0200 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    descr_item varchar(255),
    cod_barra varchar(20),
    cod_ant_item varchar(60),
    unid_inv varchar(6),
    tipo_item varchar(2),
    cod_ncm varchar(8),
    ex_ipi varchar(3),
    cod_gen varchar(2),
    cod_lst varchar(5),
    aliq_icms numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0200_idx_id_pai ON reg_0200 (id_pai);
CREATE INDEX reg_0200_idx_cnpj_pai ON reg_0200 (cnpj_pai);

CREATE TABLE reg_0205 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    descr_ant_item varchar(255),
    dt_ini date,
    dt_fim date,
    cod_ant_item varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0205_idx_id_pai ON reg_0205 (id_pai);
CREATE INDEX reg_0205_idx_cnpj_pai ON reg_0205 (cnpj_pai);

CREATE TABLE reg_0206 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_comb varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0206_idx_id_pai ON reg_0206 (id_pai);
CREATE INDEX reg_0206_idx_cnpj_pai ON reg_0206 (cnpj_pai);

CREATE TABLE reg_0210 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item_comp varchar(60),
    qtd_comp numeric(18, 6),
    perda numeric(18, 4),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0210_idx_id_pai ON reg_0210 (id_pai);
CREATE INDEX reg_0210_idx_cnpj_pai ON reg_0210 (cnpj_pai);

CREATE TABLE reg_0220 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    unid_conv varchar(6),
    fat_conv numeric(18, 6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0220_idx_id_pai ON reg_0220 (id_pai);
CREATE INDEX reg_0220_idx_cnpj_pai ON reg_0220 (cnpj_pai);

CREATE TABLE reg_0300 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_ind_bem varchar(60),
    ident_merc varchar(1),
    descr_item varchar(255),
    cod_prnc varchar(60),
    cod_cta varchar(60),
    nr_parc varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0300_idx_id_pai ON reg_0300 (id_pai);
CREATE INDEX reg_0300_idx_cnpj_pai ON reg_0300 (cnpj_pai);

CREATE TABLE reg_0305 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_ccus varchar(60),
    func varchar(255),
    vida_util varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0305_idx_id_pai ON reg_0305 (id_pai);
CREATE INDEX reg_0305_idx_cnpj_pai ON reg_0305 (cnpj_pai);

CREATE TABLE reg_0400 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_nat varchar(10),
    descr_nat varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0400_idx_id_pai ON reg_0400 (id_pai);
CREATE INDEX reg_0400_idx_cnpj_pai ON reg_0400 (cnpj_pai);

CREATE TABLE reg_0450 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_inf varchar(6),
    txt varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0450_idx_id_pai ON reg_0450 (id_pai);
CREATE INDEX reg_0450_idx_cnpj_pai ON reg_0450 (cnpj_pai);

CREATE TABLE reg_0460 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_obs varchar(6),
    txt varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0460_idx_id_pai ON reg_0460 (id_pai);
CREATE INDEX reg_0460_idx_cnpj_pai ON reg_0460 (cnpj_pai);

CREATE TABLE reg_0500 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_alt date,
    cod_nat_cc varchar(2),
    ind_cta varchar(1),
    nivel varchar(5),
    cod_cta varchar(60),
    nome_cta varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0500_idx_id_pai ON reg_0500 (id_pai);
CREATE INDEX reg_0500_idx_cnpj_pai ON reg_0500 (cnpj_pai);

CREATE TABLE reg_0600 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_alt date,
    cod_ccus varchar(60),
    ccus varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0600_idx_id_pai ON reg_0600 (id_pai);
CREATE INDEX reg_0600_idx_cnpj_pai ON reg_0600 (cnpj_pai);

CREATE TABLE reg_0990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_0 integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_0990_idx_id_pai ON reg_0990 (id_pai);
CREATE INDEX reg_0990_idx_cnpj_pai ON reg_0990 (cnpj_pai);

CREATE TABLE reg_1001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1001_idx_id_pai ON reg_1001 (id_pai);
CREATE INDEX reg_1001_idx_cnpj_pai ON reg_1001 (cnpj_pai);

CREATE TABLE reg_1010 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_exp varchar(1),
    ind_ccrf varchar(1),
    ind_comb varchar(1),
    ind_usina varchar(1),
    ind_va varchar(1),
    ind_ee varchar(1),
    ind_cart varchar(1),
    ind_form varchar(1),
    ind_aer varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1010_idx_id_pai ON reg_1010 (id_pai);
CREATE INDEX reg_1010_idx_cnpj_pai ON reg_1010 (cnpj_pai);

CREATE TABLE reg_1100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_doc varchar(1),
    nro_de varchar(11),
    dt_de date,
    nat_exp varchar(1),
    nro_re varchar(12),
    dt_re date,
    chc_emb varchar(18),
    dt_chc date,
    dt_avb date,
    tp_chc varchar(2),
    pais varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1100_idx_id_pai ON reg_1100 (id_pai);
CREATE INDEX reg_1100_idx_cnpj_pai ON reg_1100 (cnpj_pai);

CREATE TABLE reg_1105 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(3),
    num_doc varchar(9),
    chv_nfe varchar(44),
    dt_doc date,
    cod_item varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1105_idx_id_pai ON reg_1105 (id_pai);
CREATE INDEX reg_1105_idx_cnpj_pai ON reg_1105 (cnpj_pai);

CREATE TABLE reg_1110 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    num_doc varchar(9),
    dt_doc date,
    chv_nfe varchar(44),
    nr_memo integer,
    qtd numeric(18, 3),
    unid varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1110_idx_id_pai ON reg_1110 (id_pai);
CREATE INDEX reg_1110_idx_cnpj_pai ON reg_1110 (cnpj_pai);

CREATE TABLE reg_1200 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj_apur varchar(8),
    sld_cred numeric(18, 2),
    cred_apr numeric(18, 2),
    cred_receb numeric(18, 2),
    cred_util numeric(18, 2),
    sld_cred_fim numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1200_idx_id_pai ON reg_1200 (id_pai);
CREATE INDEX reg_1200_idx_cnpj_pai ON reg_1200 (cnpj_pai);

CREATE TABLE reg_1210 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    tipo_util varchar(4),
    nr_doc varchar(255),
    vl_cred_util numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1210_idx_id_pai ON reg_1210 (id_pai);
CREATE INDEX reg_1210_idx_cnpj_pai ON reg_1210 (cnpj_pai);

CREATE TABLE reg_1300 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    dt_fech date,
    estq_abert numeric(18, 3),
    vol_entr numeric(18, 3),
    vol_disp numeric(18, 3),
    vol_saidas numeric(18, 3),
    estq_escr numeric(18, 3),
    val_aj_perda numeric(18, 3),
    val_aj_ganho numeric(18, 3),
    fech_fisico numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1300_idx_id_pai ON reg_1300 (id_pai);
CREATE INDEX reg_1300_idx_cnpj_pai ON reg_1300 (cnpj_pai);

CREATE TABLE reg_1310 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_tanque varchar(3),
    estq_abert numeric(18, 3),
    vol_entr numeric(18, 3),
    vol_disp numeric(18, 3),
    vol_saidas numeric(18, 3),
    estq_escr numeric(18, 3),
    val_aj_perda numeric(18, 3),
    val_aj_ganho numeric(18, 3),
    fech_fisico numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1310_idx_id_pai ON reg_1310 (id_pai);
CREATE INDEX reg_1310_idx_cnpj_pai ON reg_1310 (cnpj_pai);

CREATE TABLE reg_1320 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_bico integer,
    nr_interv integer,
    mot_interv varchar(50),
    nom_interv varchar(30),
    cnpj_interv varchar(14),
    cpf_interv varchar(11),
    val_fecha numeric(18, 3),
    val_abert numeric(18, 3),
    vol_aferi numeric(18, 3),
    vol_vendas numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1320_idx_id_pai ON reg_1320 (id_pai);
CREATE INDEX reg_1320_idx_cnpj_pai ON reg_1320 (cnpj_pai);

CREATE TABLE reg_1350 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    serie varchar(255),
    fabricante varchar(60),
    modelo varchar(255),
    tipo_medicao varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1350_idx_id_pai ON reg_1350 (id_pai);
CREATE INDEX reg_1350_idx_cnpj_pai ON reg_1350 (cnpj_pai);

CREATE TABLE reg_1360 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_lacre varchar(20),
    dat_aplicacao date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1360_idx_id_pai ON reg_1360 (id_pai);
CREATE INDEX reg_1360_idx_cnpj_pai ON reg_1360 (cnpj_pai);

CREATE TABLE reg_1370 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_bico varchar(3),
    cod_item varchar(60),
    num_tanque varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1370_idx_id_pai ON reg_1370 (id_pai);
CREATE INDEX reg_1370_idx_cnpj_pai ON reg_1370 (cnpj_pai);

CREATE TABLE reg_1390 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_prod varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1390_idx_id_pai ON reg_1390 (id_pai);
CREATE INDEX reg_1390_idx_cnpj_pai ON reg_1390 (cnpj_pai);

CREATE TABLE reg_1391 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_registro date,
    qtd_moid numeric(18, 2),
    estq_ini numeric(18, 2),
    qtd_produz numeric(18, 2),
    ent_anid_hid numeric(18, 2),
    outr_entr numeric(18, 2),
    perda numeric(18, 2),
    cons numeric(18, 2),
    sai_ani_hid numeric(18, 2),
    saidas numeric(18, 2),
    estq_fin numeric(18, 2),
    estq_ini_mel numeric(18, 2),
    prod_dia_mel numeric(18, 2),
    util_mel numeric(18, 2),
    prod_alc_mel numeric(18, 2),
    obs varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1391_idx_id_pai ON reg_1391 (id_pai);
CREATE INDEX reg_1391_idx_cnpj_pai ON reg_1391 (cnpj_pai);

CREATE TABLE reg_1400 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    mun varchar(7),
    valor numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1400_idx_id_pai ON reg_1400 (id_pai);
CREATE INDEX reg_1400_idx_cnpj_pai ON reg_1400 (cnpj_pai);

CREATE TABLE reg_1500 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_oper varchar(1),
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(4),
    sub varchar(3),
    cod_cons varchar(2),
    num_doc varchar(9),
    dt_doc date,
    dt_e_s date,
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_forn numeric(18, 2),
    vl_serv_nt numeric(18, 2),
    vl_terc numeric(18, 2),
    vl_da numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    cod_inf varchar(6),
    vl_pis numeric(18, 2),
    vl_cofis numeric(18, 2),
    tp_ligacao varchar(1),
    cod_grupo_tensao varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1500_idx_id_pai ON reg_1500 (id_pai);
CREATE INDEX reg_1500_idx_cnpj_pai ON reg_1500 (cnpj_pai);

CREATE TABLE reg_1510 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    cod_class varchar(4),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    cst_icms varchar(3),
    cfop varchar(4),
    vl_bc_icms numeric(18, 2),
    aliq_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    aliq_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    ind_rec varchar(1),
    cod_part varchar(60),
    vl_pis numeric(18, 2),
    vl_cofis numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1510_idx_id_pai ON reg_1510 (id_pai);
CREATE INDEX reg_1510_idx_cnpj_pai ON reg_1510 (cnpj_pai);

CREATE TABLE reg_1600 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    tot_credito numeric(18, 2),
    tot_debito numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1600_idx_id_pai ON reg_1600 (id_pai);
CREATE INDEX reg_1600_idx_cnpj_pai ON reg_1600 (cnpj_pai);

CREATE TABLE reg_1700 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_disp varchar(2),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc_ini varchar(12),
    num_doc_fin varchar(12),
    num_aut varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1700_idx_id_pai ON reg_1700 (id_pai);
CREATE INDEX reg_1700_idx_cnpj_pai ON reg_1700 (cnpj_pai);

CREATE TABLE reg_1710 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_doc_ini varchar(12),
    num_doc_fin varchar(12),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1710_idx_id_pai ON reg_1710 (id_pai);
CREATE INDEX reg_1710_idx_cnpj_pai ON reg_1710 (cnpj_pai);

CREATE TABLE reg_1800 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_carga numeric(18, 2),
    vl_pass numeric(18, 2),
    vl_fat numeric(18, 2),
    ind_rat numeric(18, 6),
    vl_icms_ant numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms_apur numeric(18, 2),
    vl_bc_icms_apur numeric(18, 2),
    vl_dif numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1800_idx_id_pai ON reg_1800 (id_pai);
CREATE INDEX reg_1800_idx_cnpj_pai ON reg_1800 (cnpj_pai);

CREATE TABLE reg_1900 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_apur_icms varchar(1),
    descr_compl_out_apur varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1900_idx_id_pai ON reg_1900 (id_pai);
CREATE INDEX reg_1900_idx_cnpj_pai ON reg_1900 (cnpj_pai);

CREATE TABLE reg_1910 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1910_idx_id_pai ON reg_1910 (id_pai);
CREATE INDEX reg_1910_idx_cnpj_pai ON reg_1910 (cnpj_pai);

CREATE TABLE reg_1920 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_tot_transf_debitos_oa numeric(18, 2),
    vl_tot_aj_debitos_oa numeric(18, 2),
    vl_estornos_cred_oa numeric(18, 2),
    vl_tot_transf_creditos_oa numeric(18, 2),
    vl_tot_aj_creditos_oa numeric(18, 2),
    vl_estornos_deb_oa numeric(18, 2),
    vl_sld_credor_ant_oa numeric(18, 2),
    vl_sld_apurado_oa numeric(18, 2),
    vl_tot_ded numeric(18, 2),
    vl_icms_recolher_oa numeric(18, 2),
    vl_sld_credor_transp_oa numeric(18, 2),
    deb_esp_oa numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1920_idx_id_pai ON reg_1920 (id_pai);
CREATE INDEX reg_1920_idx_cnpj_pai ON reg_1920 (cnpj_pai);

CREATE TABLE reg_1921 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1921_idx_id_pai ON reg_1921 (id_pai);
CREATE INDEX reg_1921_idx_cnpj_pai ON reg_1921 (cnpj_pai);

CREATE TABLE reg_1922 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1922_idx_id_pai ON reg_1922 (id_pai);
CREATE INDEX reg_1922_idx_cnpj_pai ON reg_1922 (cnpj_pai);

CREATE TABLE reg_1923 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1923_idx_id_pai ON reg_1923 (id_pai);
CREATE INDEX reg_1923_idx_cnpj_pai ON reg_1923 (cnpj_pai);

CREATE TABLE reg_1925 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_inf_adic varchar(8),
    vl_inf_adic numeric(18, 2),
    desc_compl_aj varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1925_idx_id_pai ON reg_1925 (id_pai);
CREATE INDEX reg_1925_idx_cnpj_pai ON reg_1925 (cnpj_pai);

CREATE TABLE reg_1926 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_or varchar(3),
    vl_or numeric(18, 2),
    dt_vcto date,
    cod_rec varchar(255),
    num_proc varchar(15),
    ind_proc numeric(18, 2),
    proc varchar(255),
    txt_compl varchar(255),
    mes_ref varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1926_idx_id_pai ON reg_1926 (id_pai);
CREATE INDEX reg_1926_idx_cnpj_pai ON reg_1926 (cnpj_pai);

CREATE TABLE reg_1990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_1 integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_1990_idx_id_pai ON reg_1990 (id_pai);
CREATE INDEX reg_1990_idx_cnpj_pai ON reg_1990 (cnpj_pai);

CREATE TABLE reg_9001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_9001_idx_id_pai ON reg_9001 (id_pai);
CREATE INDEX reg_9001_idx_cnpj_pai ON reg_9001 (cnpj_pai);

CREATE TABLE reg_9900 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    reg_blc varchar(4),
    qtd_reg_blc integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_9900_idx_id_pai ON reg_9900 (id_pai);
CREATE INDEX reg_9900_idx_cnpj_pai ON reg_9900 (cnpj_pai);

CREATE TABLE reg_9990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_9 integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_9990_idx_id_pai ON reg_9990 (id_pai);
CREATE INDEX reg_9990_idx_cnpj_pai ON reg_9990 (cnpj_pai);

CREATE TABLE reg_9999 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_9999_idx_id_pai ON reg_9999 (id_pai);
CREATE INDEX reg_9999_idx_cnpj_pai ON reg_9999 (cnpj_pai);

CREATE TABLE reg_c001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c001_idx_id_pai ON reg_c001 (id_pai);
CREATE INDEX reg_c001_idx_cnpj_pai ON reg_c001 (cnpj_pai);

CREATE TABLE reg_c100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_oper varchar(1),
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(3),
    num_doc varchar(9),
    chv_nfe varchar(44),
    dt_doc date,
    dt_e_s date,
    vl_doc numeric(18, 2),
    ind_pgto varchar(1),
    vl_desc numeric(18, 2),
    vl_abat_nt numeric(18, 2),
    vl_merc numeric(18, 2),
    ind_frt varchar(1),
    vl_frt numeric(18, 2),
    vl_seg numeric(18, 2),
    vl_out_da numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_ipi numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    vl_pis_st numeric(18, 2),
    vl_cofins_st numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c100_idx_id_pai ON reg_c100 (id_pai);
CREATE INDEX reg_c100_idx_cnpj_pai ON reg_c100 (cnpj_pai);

CREATE TABLE reg_c101 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_fcp_uf_dest numeric(18, 2),
    vl_icms_uf_dest numeric(18, 2),
    vl_icms_uf_rem numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c101_idx_id_pai ON reg_c101 (id_pai);
CREATE INDEX reg_c101_idx_cnpj_pai ON reg_c101 (cnpj_pai);

CREATE TABLE reg_c105 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    oper varchar(1),
    cod_uf varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c105_idx_id_pai ON reg_c105 (id_pai);
CREATE INDEX reg_c105_idx_cnpj_pai ON reg_c105 (cnpj_pai);

CREATE TABLE reg_c110 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_inf varchar(6),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c110_idx_id_pai ON reg_c110 (id_pai);
CREATE INDEX reg_c110_idx_cnpj_pai ON reg_c110 (cnpj_pai);

CREATE TABLE reg_c111 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_proc varchar(15),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c111_idx_id_pai ON reg_c111 (id_pai);
CREATE INDEX reg_c111_idx_cnpj_pai ON reg_c111 (cnpj_pai);

CREATE TABLE reg_c112 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_da varchar(1),
    uf varchar(2),
    num_da varchar(255),
    cod_aut varchar(255),
    vl_da numeric(18, 2),
    dt_vcto date,
    dt_pgto date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c112_idx_id_pai ON reg_c112 (id_pai);
CREATE INDEX reg_c112_idx_cnpj_pai ON reg_c112 (cnpj_pai);

CREATE TABLE reg_c113 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_oper varchar(1),
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c113_idx_id_pai ON reg_c113 (id_pai);
CREATE INDEX reg_c113_idx_cnpj_pai ON reg_c113 (cnpj_pai);

CREATE TABLE reg_c114 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ecf_fab varchar(21),
    ecf_cx varchar(3),
    num_doc varchar(9),
    dt_doc date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c114_idx_id_pai ON reg_c114 (id_pai);
CREATE INDEX reg_c114_idx_cnpj_pai ON reg_c114 (cnpj_pai);

CREATE TABLE reg_c115 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_carga varchar(1),
    cnpj_col varchar(14),
    ie_col varchar(14),
    cpf_col varchar(11),
    cod_mun_col varchar(7),
    cnpj_entg varchar(14),
    ie_entg varchar(14),
    cpf_entg varchar(11),
    cod_mun_entg varchar(7),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c115_idx_id_pai ON reg_c115 (id_pai);
CREATE INDEX reg_c115_idx_cnpj_pai ON reg_c115 (cnpj_pai);

CREATE TABLE reg_c116 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    nr_sat varchar(9),
    chv_cfe varchar(44),
    num_cfe varchar(6),
    dt_doc varchar(8),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c116_idx_id_pai ON reg_c116 (id_pai);
CREATE INDEX reg_c116_idx_cnpj_pai ON reg_c116 (cnpj_pai);

CREATE TABLE reg_c120 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_doc_imp varchar(1),
    num_doc_imp varchar(12),
    pis_imp numeric(18, 2),
    cofins_imp numeric(18, 2),
    num_acdraw varchar(20),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c120_idx_id_pai ON reg_c120 (id_pai);
CREATE INDEX reg_c120_idx_cnpj_pai ON reg_c120 (cnpj_pai);

CREATE TABLE reg_c130 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_serv_nt numeric(18, 2),
    vl_bc_issqn numeric(18, 2),
    vl_issqn numeric(18, 2),
    vl_bc_irrf numeric(18, 2),
    vl_irrf numeric(18, 2),
    vl_bc_prev numeric(18, 2),
    vl_prev numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c130_idx_id_pai ON reg_c130 (id_pai);
CREATE INDEX reg_c130_idx_cnpj_pai ON reg_c130 (cnpj_pai);

CREATE TABLE reg_c140 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_emit varchar(1),
    ind_tit varchar(2),
    desc_tit varchar(255),
    num_tit varchar(255),
    qtd_parc varchar(2),
    vl_tit numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c140_idx_id_pai ON reg_c140 (id_pai);
CREATE INDEX reg_c140_idx_cnpj_pai ON reg_c140 (cnpj_pai);

CREATE TABLE reg_c141 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_parc varchar(2),
    dt_vcto date,
    vl_parc numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c141_idx_id_pai ON reg_c141 (id_pai);
CREATE INDEX reg_c141_idx_cnpj_pai ON reg_c141 (cnpj_pai);

CREATE TABLE reg_c160 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    veic_id varchar(7),
    qtd_vol integer,
    peso_brt numeric(18, 2),
    peso_liq numeric(18, 2),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c160_idx_id_pai ON reg_c160 (id_pai);
CREATE INDEX reg_c160_idx_cnpj_pai ON reg_c160 (cnpj_pai);

CREATE TABLE reg_c165 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    veic_id varchar(7),
    cod_aut varchar(255),
    nr_passe varchar(255),
    hora varchar(6),
    temper numeric(18, 1),
    qtd_vol integer,
    peso_brt numeric(18, 2),
    peso_liq numeric(18, 2),
    nom_mot varchar(60),
    cpf varchar(11),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c165_idx_id_pai ON reg_c165 (id_pai);
CREATE INDEX reg_c165_idx_cnpj_pai ON reg_c165 (cnpj_pai);

CREATE TABLE reg_c170 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    descr_compl varchar(255),
    qtd numeric(18, 5),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    ind_mov varchar(1),
    cst_icms varchar(3),
    cfop varchar(4),
    cod_nat varchar(10),
    vl_bc_icms numeric(18, 2),
    aliq_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    aliq_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    ind_apur varchar(1),
    cst_ipi varchar(2),
    cod_enq varchar(3),
    vl_bc_ipi numeric(18, 2),
    aliq_ipi numeric(18, 2),
    vl_ipi numeric(18, 2),
    cst_pis varchar(2),
    vl_bc_pis numeric(18, 2),
    aliq_pis_perc numeric(18, 4),
    quant_bc_pis numeric(18, 3),
    aliq_pis_reais numeric(18, 4),
    vl_pis numeric(18, 2),
    cst_cofins varchar(2),
    vl_bc_cofins numeric(18, 2),
    aliq_cofins_perc numeric(18, 4),
    quant_bc_cofins numeric(18, 3),
    aliq_cofins_reais numeric(18, 4),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    arquivo_sped varchar(1) DEFAULT 'S'
);

CREATE INDEX reg_c170_idx_id_pai ON reg_c170 (id_pai);
CREATE INDEX reg_c170_idx_cnpj_pai ON reg_c170 (cnpj_pai);

CREATE TABLE reg_c171 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_tanque varchar(3),
    qtde numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c171_idx_id_pai ON reg_c171 (id_pai);
CREATE INDEX reg_c171_idx_cnpj_pai ON reg_c171 (cnpj_pai);

CREATE TABLE reg_c172 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_bc_issqn numeric(18, 2),
    aliq_issqn numeric(18, 2),
    vl_issqn numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c172_idx_id_pai ON reg_c172 (id_pai);
CREATE INDEX reg_c172_idx_cnpj_pai ON reg_c172 (cnpj_pai);

CREATE TABLE reg_c173 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    lote_med varchar(255),
    qtd_item numeric(18, 3),
    dt_fab date,
    dt_val date,
    ind_med varchar(1),
    tp_prod varchar(1),
    vl_tab_max numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c173_idx_id_pai ON reg_c173 (id_pai);
CREATE INDEX reg_c173_idx_cnpj_pai ON reg_c173 (cnpj_pai);

CREATE TABLE reg_c174 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_arm varchar(1),
    num_arm varchar(255),
    descr_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c174_idx_id_pai ON reg_c174 (id_pai);
CREATE INDEX reg_c174_idx_cnpj_pai ON reg_c174 (cnpj_pai);

CREATE TABLE reg_c175 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_veic_oper varchar(1),
    cnpj varchar(14),
    uf varchar(2),
    chassi_veic varchar(17),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c175_idx_id_pai ON reg_c175 (id_pai);
CREATE INDEX reg_c175_idx_cnpj_pai ON reg_c175 (cnpj_pai);

CREATE TABLE reg_c176 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod_ult_e varchar(2),
    num_doc_ult_e varchar(9),
    ser_ult_e varchar(3),
    dt_ult_e date,
    cod_part_ult_e varchar(60),
    quant_ult_e numeric(18, 3),
    vl_unit_ult_e numeric(18, 3),
    vl_unit_bc_st numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c176_idx_id_pai ON reg_c176 (id_pai);
CREATE INDEX reg_c176_idx_cnpj_pai ON reg_c176 (cnpj_pai);

CREATE TABLE reg_c177 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_selo_ipi varchar(6),
    qt_selo_ipi varchar(12),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c177_idx_id_pai ON reg_c177 (id_pai);
CREATE INDEX reg_c177_idx_cnpj_pai ON reg_c177 (cnpj_pai);

CREATE TABLE reg_c178 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cl_enq varchar(5),
    vl_unid numeric(18, 2),
    quant_pad numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c178_idx_id_pai ON reg_c178 (id_pai);
CREATE INDEX reg_c178_idx_cnpj_pai ON reg_c178 (cnpj_pai);

CREATE TABLE reg_c179 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    bc_st_orig_dest numeric(18, 2),
    icms_st_rep numeric(18, 2),
    icms_st_compl numeric(18, 2),
    bc_ret numeric(18, 2),
    icms_ret numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c179_idx_id_pai ON reg_c179 (id_pai);
CREATE INDEX reg_c179_idx_cnpj_pai ON reg_c179 (cnpj_pai);

CREATE TABLE reg_c190 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    vl_ipi numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c190_idx_id_pai ON reg_c190 (id_pai);
CREATE INDEX reg_c190_idx_cnpj_pai ON reg_c190 (cnpj_pai);

CREATE TABLE reg_c195 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_obs varchar(6),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c195_idx_id_pai ON reg_c195 (id_pai);
CREATE INDEX reg_c195_idx_cnpj_pai ON reg_c195 (cnpj_pai);

CREATE TABLE reg_c197 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj varchar(10),
    descr_compl_aj varchar(255),
    cod_item varchar(60),
    vl_bc_icms numeric(18, 2),
    aliq_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_outros numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c197_idx_id_pai ON reg_c197 (id_pai);
CREATE INDEX reg_c197_idx_cnpj_pai ON reg_c197 (cnpj_pai);

CREATE TABLE reg_c300 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc_ini varchar(6),
    num_doc_fin varchar(6),
    dt_doc date,
    vl_doc numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c300_idx_id_pai ON reg_c300 (id_pai);
CREATE INDEX reg_c300_idx_cnpj_pai ON reg_c300 (cnpj_pai);

CREATE TABLE reg_c310 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_doc_canc varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c310_idx_id_pai ON reg_c310 (id_pai);
CREATE INDEX reg_c310_idx_cnpj_pai ON reg_c310 (cnpj_pai);

CREATE TABLE reg_c320 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c320_idx_id_pai ON reg_c320 (id_pai);
CREATE INDEX reg_c320_idx_cnpj_pai ON reg_c320 (cnpj_pai);

CREATE TABLE reg_c321 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c321_idx_id_pai ON reg_c321 (id_pai);
CREATE INDEX reg_c321_idx_cnpj_pai ON reg_c321 (cnpj_pai);

CREATE TABLE reg_c350 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ser varchar(4),
    sub_ser varchar(3),
    num_doc varchar(6),
    dt_doc date,
    cnpj_cpf varchar(14),
    vl_merc numeric(18, 2),
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofis numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c350_idx_id_pai ON reg_c350 (id_pai);
CREATE INDEX reg_c350_idx_cnpj_pai ON reg_c350 (cnpj_pai);

CREATE TABLE reg_c370 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c370_idx_id_pai ON reg_c370 (id_pai);
CREATE INDEX reg_c370_idx_cnpj_pai ON reg_c370 (cnpj_pai);

CREATE TABLE reg_c390 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c390_idx_id_pai ON reg_c390 (id_pai);
CREATE INDEX reg_c390_idx_cnpj_pai ON reg_c390 (cnpj_pai);

CREATE TABLE reg_c400 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ecf_mod varchar(20),
    ecf_fab varchar(21),
    ecf_cx varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c400_idx_id_pai ON reg_c400 (id_pai);
CREATE INDEX reg_c400_idx_cnpj_pai ON reg_c400 (cnpj_pai);

CREATE TABLE reg_c405 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_doc date,
    cro varchar(3),
    crz varchar(6),
    num_coo_fin varchar(9),
    gt_fin numeric(18, 2),
    vl_brt numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c405_idx_id_pai ON reg_c405 (id_pai);
CREATE INDEX reg_c405_idx_cnpj_pai ON reg_c405 (cnpj_pai);

CREATE TABLE reg_c410 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c410_idx_id_pai ON reg_c410 (id_pai);
CREATE INDEX reg_c410_idx_cnpj_pai ON reg_c410 (cnpj_pai);

CREATE TABLE reg_c420 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_tot_par varchar(7),
    vlr_acum_tot numeric(18, 2),
    nr_tot varchar(2),
    descr_nr_tot varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c420_idx_id_pai ON reg_c420 (id_pai);
CREATE INDEX reg_c420_idx_cnpj_pai ON reg_c420 (cnpj_pai);

CREATE TABLE reg_c425 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c425_idx_id_pai ON reg_c425 (id_pai);
CREATE INDEX reg_c425_idx_cnpj_pai ON reg_c425 (cnpj_pai);

CREATE TABLE reg_c460 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    cod_sit varchar(2),
    num_doc varchar(9),
    dt_doc date,
    vl_doc numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cpf_cnpj varchar(14),
    nome_adq varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c460_idx_id_pai ON reg_c460 (id_pai);
CREATE INDEX reg_c460_idx_cnpj_pai ON reg_c460 (cnpj_pai);

CREATE TABLE reg_c465 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    chv_cfe varchar(44),
    num_ccf varchar(9),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c465_idx_id_pai ON reg_c465 (id_pai);
CREATE INDEX reg_c465_idx_cnpj_pai ON reg_c465 (cnpj_pai);

CREATE TABLE reg_c470 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    qtd numeric(18, 3),
    qtd_canc numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c470_idx_id_pai ON reg_c470 (id_pai);
CREATE INDEX reg_c470_idx_cnpj_pai ON reg_c470 (cnpj_pai);

CREATE TABLE reg_c490 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c490_idx_id_pai ON reg_c490 (id_pai);
CREATE INDEX reg_c490_idx_cnpj_pai ON reg_c490 (cnpj_pai);

CREATE TABLE reg_c500 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_oper varchar(1),
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(4),
    sub varchar(3),
    cod_cons varchar(2),
    num_doc varchar(9),
    dt_doc date,
    dt_e_s date,
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_forn numeric(18, 2),
    vl_serv_nt numeric(18, 2),
    vl_terc numeric(18, 2),
    vl_da numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    cod_inf varchar(6),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    tp_ligacao varchar(1),
    cod_grupo_tensao varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c500_idx_id_pai ON reg_c500 (id_pai);
CREATE INDEX reg_c500_idx_cnpj_pai ON reg_c500 (cnpj_pai);

CREATE TABLE reg_c510 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    cod_class varchar(4),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    cst_icms varchar(3),
    cfop varchar(4),
    vl_bc_icms numeric(18, 2),
    aliq_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    aliq_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    ind_rec varchar(1),
    cod_part varchar(60),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c510_idx_id_pai ON reg_c510 (id_pai);
CREATE INDEX reg_c510_idx_cnpj_pai ON reg_c510 (cnpj_pai);

CREATE TABLE reg_c590 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c590_idx_id_pai ON reg_c590 (id_pai);
CREATE INDEX reg_c590_idx_cnpj_pai ON reg_c590 (cnpj_pai);

CREATE TABLE reg_c600 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    cod_mun varchar(7),
    ser varchar(4),
    sub varchar(3),
    cod_cons varchar(2),
    qtd_cons integer,
    qtd_canc integer,
    dt_doc date,
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    cons integer,
    vl_forn numeric(18, 2),
    vl_serv_nt numeric(18, 2),
    vl_terc numeric(18, 2),
    vl_da numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c600_idx_id_pai ON reg_c600 (id_pai);
CREATE INDEX reg_c600_idx_cnpj_pai ON reg_c600 (cnpj_pai);

CREATE TABLE reg_c601 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_doc_canc varchar(9),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c601_idx_id_pai ON reg_c601 (id_pai);
CREATE INDEX reg_c601_idx_cnpj_pai ON reg_c601 (cnpj_pai);

CREATE TABLE reg_c610 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_class varchar(4),
    cod_item varchar(60),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c610_idx_id_pai ON reg_c610 (id_pai);
CREATE INDEX reg_c610_idx_cnpj_pai ON reg_c610 (cnpj_pai);

CREATE TABLE reg_c690 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_red_bc numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c690_idx_id_pai ON reg_c690 (id_pai);
CREATE INDEX reg_c690_idx_cnpj_pai ON reg_c690 (cnpj_pai);

CREATE TABLE reg_c700 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(4),
    nro_ord_ini varchar(9),
    nro_ord_fin varchar(9),
    dt_doc_ini date,
    dt_doc_fin date,
    nom_mest varchar(15),
    chv_cod_dig varchar(32),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c700_idx_id_pai ON reg_c700 (id_pai);
CREATE INDEX reg_c700_idx_cnpj_pai ON reg_c700 (cnpj_pai);

CREATE TABLE reg_c790 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c790_idx_id_pai ON reg_c790 (id_pai);
CREATE INDEX reg_c790_idx_cnpj_pai ON reg_c790 (cnpj_pai);

CREATE TABLE reg_c791 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    uf varchar(2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c791_idx_id_pai ON reg_c791 (id_pai);
CREATE INDEX reg_c791_idx_cnpj_pai ON reg_c791 (cnpj_pai);

CREATE TABLE reg_c800 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    cod_sit varchar(2),
    num_cfe varchar(6),
    dt_doc date,
    vl_cfe numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cnpj_cpf varchar(14),
    nr_sat varchar(9),
    chv_cfe varchar(44),
    vl_desc numeric(18, 2),
    vl_merc numeric(18, 2),
    vl_out_da numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_pis_st numeric(18, 2),
    vl_cofins_st numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c800_idx_id_pai ON reg_c800 (id_pai);
CREATE INDEX reg_c800_idx_cnpj_pai ON reg_c800 (cnpj_pai);

CREATE TABLE reg_c850 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c850_idx_id_pai ON reg_c850 (id_pai);
CREATE INDEX reg_c850_idx_cnpj_pai ON reg_c850 (cnpj_pai);

CREATE TABLE reg_c860 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    nr_sat varchar(9),
    dt_doc date,
    doc_ini varchar(6),
    doc_fim varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c860_idx_id_pai ON reg_c860 (id_pai);
CREATE INDEX reg_c860_idx_cnpj_pai ON reg_c860 (cnpj_pai);

CREATE TABLE reg_c890 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c890_idx_id_pai ON reg_c890 (id_pai);
CREATE INDEX reg_c890_idx_cnpj_pai ON reg_c890 (cnpj_pai);

CREATE TABLE reg_c990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_c integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_c990_idx_id_pai ON reg_c990 (id_pai);
CREATE INDEX reg_c990_idx_cnpj_pai ON reg_c990 (cnpj_pai);

CREATE TABLE reg_d001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d001_idx_id_pai ON reg_d001 (id_pai);
CREATE INDEX reg_d001_idx_cnpj_pai ON reg_d001 (cnpj_pai);

CREATE TABLE reg_d100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_oper varchar(1),
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    chv_cte varchar(44),
    dt_doc date,
    dt_a_p date,
    tp_ct_e varchar(1),
    chv_cte_ref varchar(44),
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    ind_frt varchar(1),
    vl_serv numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_nt numeric(18, 2),
    cod_inf varchar(60),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d100_idx_id_pai ON reg_d100 (id_pai);
CREATE INDEX reg_d100_idx_cnpj_pai ON reg_d100 (cnpj_pai);

CREATE TABLE reg_d101 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_fcp_uf_dest numeric(18, 2),
    vl_icms_uf_dest numeric(18, 2),
    vl_icms_uf_rem numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d101_idx_id_pai ON reg_d101 (id_pai);
CREATE INDEX reg_d101_idx_cnpj_pai ON reg_d101 (cnpj_pai);

CREATE TABLE reg_d110 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    vl_serv numeric(18, 2),
    vl_out numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d110_idx_id_pai ON reg_d110 (id_pai);
CREATE INDEX reg_d110_idx_cnpj_pai ON reg_d110 (cnpj_pai);

CREATE TABLE reg_d120 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    veic_id varchar(7),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d120_idx_id_pai ON reg_d120 (id_pai);
CREATE INDEX reg_d120_idx_cnpj_pai ON reg_d120 (cnpj_pai);

CREATE TABLE reg_d130 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part_consg varchar(60),
    cod_part_red varchar(60),
    ind_frt_red varchar(1),
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    veic_id varchar(7),
    vl_liq_frt numeric(18, 2),
    vl_sec_cat numeric(18, 2),
    vl_desp numeric(18, 2),
    vl_pedg numeric(18, 2),
    vl_out numeric(18, 2),
    vl_frt numeric(18, 2),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d130_idx_id_pai ON reg_d130 (id_pai);
CREATE INDEX reg_d130_idx_cnpj_pai ON reg_d130 (cnpj_pai);

CREATE TABLE reg_d140 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part_consg varchar(60),
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    ind_veic varchar(1),
    veic_id varchar(255),
    ind_nav varchar(1),
    viagem integer,
    vl_frt_liq numeric(18, 2),
    vl_desp_port numeric(18, 2),
    vl_desp_car_desc numeric(18, 2),
    vl_out numeric(18, 2),
    vl_frt_brt numeric(18, 2),
    vl_frt_mm numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d140_idx_id_pai ON reg_d140 (id_pai);
CREATE INDEX reg_d140_idx_cnpj_pai ON reg_d140 (cnpj_pai);

CREATE TABLE reg_d150 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    veic_id varchar(255),
    viagem integer,
    ind_tfa varchar(1),
    vl_peso_tx numeric(18, 2),
    vl_tx_terr numeric(18, 2),
    vl_tx_red numeric(18, 2),
    vl_out numeric(18, 2),
    vl_tx_adv numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d150_idx_id_pai ON reg_d150 (id_pai);
CREATE INDEX reg_d150_idx_cnpj_pai ON reg_d150 (cnpj_pai);

CREATE TABLE reg_d160 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    despacho varchar(255),
    cnpj_cpf_rem varchar(14),
    ie_rem varchar(14),
    cod_mun_ori varchar(7),
    cnpj_cpf_dest varchar(14),
    ie_dest varchar(14),
    cod_mun_dest varchar(7),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d160_idx_id_pai ON reg_d160 (id_pai);
CREATE INDEX reg_d160_idx_cnpj_pai ON reg_d160 (cnpj_pai);

CREATE TABLE reg_d161 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_carga varchar(1),
    cnpj_cpf_col varchar(14),
    ie_col varchar(14),
    cod_mun_col varchar(7),
    cnpj_cpf_entg varchar(14),
    ie_entg varchar(14),
    cod_mun_entg varchar(7),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d161_idx_id_pai ON reg_d161 (id_pai);
CREATE INDEX reg_d161_idx_cnpj_pai ON reg_d161 (cnpj_pai);

CREATE TABLE reg_d162 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(4),
    num_doc varchar(9),
    dt_doc date,
    vl_doc numeric(18, 2),
    vl_merc numeric(18, 2),
    qtd_vol integer,
    peso_brt numeric(18, 2),
    peso_liq numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d162_idx_id_pai ON reg_d162 (id_pai);
CREATE INDEX reg_d162_idx_cnpj_pai ON reg_d162 (cnpj_pai);

CREATE TABLE reg_d170 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part_consg varchar(60),
    cod_part_red varchar(60),
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    otm varchar(255),
    ind_nat_frt varchar(1),
    vl_liq_frt numeric(18, 2),
    vl_gris numeric(18, 2),
    vl_pdg numeric(18, 2),
    vl_out numeric(18, 2),
    vl_frt numeric(18, 2),
    veic_id varchar(7),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d170_idx_id_pai ON reg_d170 (id_pai);
CREATE INDEX reg_d170_idx_cnpj_pai ON reg_d170 (cnpj_pai);

CREATE TABLE reg_d180 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_seq integer,
    ind_emit varchar(1),
    cnpj_cpf_emit varchar(14),
    uf_emit varchar(2),
    ie_emit varchar(14),
    cod_mun_orig varchar(7),
    cnpj_cpf_tom varchar(14),
    uf_tom varchar(2),
    ie_tom varchar(14),
    cod_mun_dest varchar(7),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    vl_doc numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d180_idx_id_pai ON reg_d180 (id_pai);
CREATE INDEX reg_d180_idx_cnpj_pai ON reg_d180 (cnpj_pai);

CREATE TABLE reg_d190 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d190_idx_id_pai ON reg_d190 (id_pai);
CREATE INDEX reg_d190_idx_cnpj_pai ON reg_d190 (cnpj_pai);

CREATE TABLE reg_d195 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_obs varchar(6),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d195_idx_id_pai ON reg_d195 (id_pai);
CREATE INDEX reg_d195_idx_cnpj_pai ON reg_d195 (cnpj_pai);

CREATE TABLE reg_d197 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj varchar(10),
    descr_compl_aj varchar(255),
    cod_item varchar(60),
    vl_bc_icms numeric(18, 2),
    aliq_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_outros numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d197_idx_id_pai ON reg_d197 (id_pai);
CREATE INDEX reg_d197_idx_cnpj_pai ON reg_d197 (cnpj_pai);

CREATE TABLE reg_d300 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(4),
    num_doc_ini varchar(6),
    num_doc_fin integer,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    dt_doc date,
    vl_opr numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_serv numeric(18, 2),
    vl_seg numeric(18, 2),
    vl_out_desp numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d300_idx_id_pai ON reg_d300 (id_pai);
CREATE INDEX reg_d300_idx_cnpj_pai ON reg_d300 (cnpj_pai);

CREATE TABLE reg_d301 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_doc_canc integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d301_idx_id_pai ON reg_d301 (id_pai);
CREATE INDEX reg_d301_idx_cnpj_pai ON reg_d301 (cnpj_pai);

CREATE TABLE reg_d310 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mun_orig varchar(7),
    vl_serv numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d310_idx_id_pai ON reg_d310 (id_pai);
CREATE INDEX reg_d310_idx_cnpj_pai ON reg_d310 (cnpj_pai);

CREATE TABLE reg_d350 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ecf_mod varchar(20),
    ecf_fab varchar(21),
    ecf_cx varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d350_idx_id_pai ON reg_d350 (id_pai);
CREATE INDEX reg_d350_idx_cnpj_pai ON reg_d350 (cnpj_pai);

CREATE TABLE reg_d355 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_doc date,
    cro varchar(3),
    crz varchar(6),
    num_coo_fin varchar(9),
    gt_fin numeric(18, 2),
    vl_brt numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d355_idx_id_pai ON reg_d355 (id_pai);
CREATE INDEX reg_d355_idx_cnpj_pai ON reg_d355 (cnpj_pai);

CREATE TABLE reg_d360 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d360_idx_id_pai ON reg_d360 (id_pai);
CREATE INDEX reg_d360_idx_cnpj_pai ON reg_d360 (cnpj_pai);

CREATE TABLE reg_d365 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_tot_par varchar(7),
    vlr_acum_tot numeric(18, 2),
    nr_tot varchar(2),
    descr_nr_tot varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d365_idx_id_pai ON reg_d365 (id_pai);
CREATE INDEX reg_d365_idx_cnpj_pai ON reg_d365 (cnpj_pai);

CREATE TABLE reg_d370 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mun_orig varchar(7),
    vl_serv numeric(18, 2),
    qtd_bilh integer,
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d370_idx_id_pai ON reg_d370 (id_pai);
CREATE INDEX reg_d370_idx_cnpj_pai ON reg_d370 (cnpj_pai);

CREATE TABLE reg_d390 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_issqn numeric(18, 2),
    aliq_issqn numeric(18, 2),
    vl_issqn numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d390_idx_id_pai ON reg_d390 (id_pai);
CREATE INDEX reg_d390_idx_cnpj_pai ON reg_d390 (cnpj_pai);

CREATE TABLE reg_d400 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(6),
    dt_doc date,
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_serv numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d400_idx_id_pai ON reg_d400 (id_pai);
CREATE INDEX reg_d400_idx_cnpj_pai ON reg_d400 (cnpj_pai);

CREATE TABLE reg_d410 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc_ini varchar(6),
    num_doc_fin varchar(6),
    dt_doc date,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_serv numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d410_idx_id_pai ON reg_d410 (id_pai);
CREATE INDEX reg_d410_idx_cnpj_pai ON reg_d410 (cnpj_pai);

CREATE TABLE reg_d411 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_doc_canc varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d411_idx_id_pai ON reg_d411 (id_pai);
CREATE INDEX reg_d411_idx_cnpj_pai ON reg_d411 (cnpj_pai);

CREATE TABLE reg_d420 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mun_orig varchar(7),
    vl_serv numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d420_idx_id_pai ON reg_d420 (id_pai);
CREATE INDEX reg_d420_idx_cnpj_pai ON reg_d420 (cnpj_pai);

CREATE TABLE reg_d500 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_oper varchar(1),
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    dt_a_p date,
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_serv numeric(18, 2),
    vl_serv_nt numeric(18, 2),
    vl_terc numeric(18, 2),
    vl_da numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    cod_inf varchar(6),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    tp_assinante varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d500_idx_id_pai ON reg_d500 (id_pai);
CREATE INDEX reg_d500_idx_cnpj_pai ON reg_d500 (cnpj_pai);

CREATE TABLE reg_d510 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    cod_class varchar(4),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    cst_icms varchar(3),
    cfop varchar(4),
    vl_bc_icms numeric(18, 2),
    aliq_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    ind_rec varchar(1),
    cod_part varchar(60),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d510_idx_id_pai ON reg_d510 (id_pai);
CREATE INDEX reg_d510_idx_cnpj_pai ON reg_d510 (cnpj_pai);

CREATE TABLE reg_d530 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_serv varchar(1),
    dt_ini_serv date,
    dt_fin_serv date,
    per_fiscal varchar(6),
    cod_area varchar(255),
    terminal integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d530_idx_id_pai ON reg_d530 (id_pai);
CREATE INDEX reg_d530_idx_cnpj_pai ON reg_d530 (cnpj_pai);

CREATE TABLE reg_d590 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d590_idx_id_pai ON reg_d590 (id_pai);
CREATE INDEX reg_d590_idx_cnpj_pai ON reg_d590 (cnpj_pai);

CREATE TABLE reg_d600 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    cod_mun varchar(7),
    ser varchar(4),
    sub varchar(3),
    cod_cons varchar(2),
    qtd_cons integer,
    dt_doc date,
    vl_doc numeric(18, 2),
    vl_desc numeric(18, 2),
    vl_serv numeric(18, 2),
    vl_serv_nt numeric(18, 2),
    vl_terc numeric(18, 2),
    vl_da numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d600_idx_id_pai ON reg_d600 (id_pai);
CREATE INDEX reg_d600_idx_cnpj_pai ON reg_d600 (cnpj_pai);

CREATE TABLE reg_d610 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_class varchar(4),
    cod_item varchar(60),
    qtd numeric(18, 3),
    unid varchar(6),
    vl_item numeric(18, 2),
    vl_desc numeric(18, 2),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    vl_pis numeric(18, 2),
    vl_cofins numeric(18, 2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d610_idx_id_pai ON reg_d610 (id_pai);
CREATE INDEX reg_d610_idx_cnpj_pai ON reg_d610 (cnpj_pai);

CREATE TABLE reg_d690 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d690_idx_id_pai ON reg_d690 (id_pai);
CREATE INDEX reg_d690_idx_cnpj_pai ON reg_d690 (cnpj_pai);

CREATE TABLE reg_d695 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_mod varchar(2),
    ser varchar(4),
    nro_ord_ini integer,
    nro_ord_fin integer,
    dt_doc_ini date,
    dt_doc_fin date,
    nom_mest varchar(15),
    chv_cod_dig varchar(32),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d695_idx_id_pai ON reg_d695 (id_pai);
CREATE INDEX reg_d695_idx_cnpj_pai ON reg_d695 (cnpj_pai);

CREATE TABLE reg_d696 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(18, 2),
    vl_opr numeric(18, 2),
    vl_bc_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    vl_red_bc numeric(18, 2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d696_idx_id_pai ON reg_d696 (id_pai);
CREATE INDEX reg_d696_idx_cnpj_pai ON reg_d696 (cnpj_pai);

CREATE TABLE reg_d697 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    uf varchar(2),
    vl_bc_icms_st numeric(18, 2),
    vl_icms_st numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d697_idx_id_pai ON reg_d697 (id_pai);
CREATE INDEX reg_d697_idx_cnpj_pai ON reg_d697 (cnpj_pai);

CREATE TABLE reg_d990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_d integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_d990_idx_id_pai ON reg_d990 (id_pai);
CREATE INDEX reg_d990_idx_cnpj_pai ON reg_d990 (cnpj_pai);

CREATE TABLE reg_e001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e001_idx_id_pai ON reg_e001 (id_pai);
CREATE INDEX reg_e001_idx_cnpj_pai ON reg_e001 (cnpj_pai);

CREATE TABLE reg_e100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e100_idx_id_pai ON reg_e100 (id_pai);
CREATE INDEX reg_e100_idx_cnpj_pai ON reg_e100 (cnpj_pai);

CREATE TABLE reg_e110 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_tot_debitos numeric(18, 2),
    vl_aj_debitos numeric(18, 2),
    vl_tot_aj_debitos numeric(18, 2),
    vl_estornos_cred numeric(18, 2),
    vl_tot_creditos numeric(18, 2),
    vl_aj_creditos numeric(18, 2),
    vl_tot_aj_creditos numeric(18, 2),
    vl_estornos_deb numeric(18, 2),
    vl_sld_credor_ant numeric(18, 2),
    vl_sld_apurado numeric(18, 2),
    vl_tot_ded numeric(18, 2),
    vl_icms_recolher numeric(18, 2),
    vl_sld_credor_transportar numeric(18, 2),
    deb_esp numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e110_idx_id_pai ON reg_e110 (id_pai);
CREATE INDEX reg_e110_idx_cnpj_pai ON reg_e110 (cnpj_pai);

CREATE TABLE reg_e111 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e111_idx_id_pai ON reg_e111 (id_pai);
CREATE INDEX reg_e111_idx_cnpj_pai ON reg_e111 (cnpj_pai);

CREATE TABLE reg_e112 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e112_idx_id_pai ON reg_e112 (id_pai);
CREATE INDEX reg_e112_idx_cnpj_pai ON reg_e112 (cnpj_pai);

CREATE TABLE reg_e113 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e113_idx_id_pai ON reg_e113 (id_pai);
CREATE INDEX reg_e113_idx_cnpj_pai ON reg_e113 (cnpj_pai);

CREATE TABLE reg_e115 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_inf_adic varchar(8),
    vl_inf_adic numeric(18, 2),
    descr_compl_aj varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e115_idx_id_pai ON reg_e115 (id_pai);
CREATE INDEX reg_e115_idx_cnpj_pai ON reg_e115 (cnpj_pai);

CREATE TABLE reg_e116 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_or varchar(3),
    vl_or numeric(18, 2),
    dt_vcto date,
    cod_rec varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    mes_ref varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e116_idx_id_pai ON reg_e116 (id_pai);
CREATE INDEX reg_e116_idx_cnpj_pai ON reg_e116 (cnpj_pai);

CREATE TABLE reg_e200 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    uf varchar(2),
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e200_idx_id_pai ON reg_e200 (id_pai);
CREATE INDEX reg_e200_idx_cnpj_pai ON reg_e200 (cnpj_pai);

CREATE TABLE reg_e210 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov_st varchar(1),
    vl_sld_cred_ant_st numeric(18, 2),
    vl_devol_st numeric(18, 2),
    vl_ressarc_st numeric(18, 2),
    vl_out_cred_st numeric(18, 2),
    vl_aj_creditos_st numeric(18, 2),
    vl_retencao_st numeric(18, 2),
    vl_out_deb_st numeric(18, 2),
    vl_aj_debitos_st numeric(18, 2),
    vl_sld_dev_ant_st numeric(18, 2),
    vl_deducoes_st numeric(18, 2),
    vl_icms_recol_st numeric(18, 2),
    vl_sld_cred_st_transportar numeric(18, 2),
    deb_esp_st numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e210_idx_id_pai ON reg_e210 (id_pai);
CREATE INDEX reg_e210_idx_cnpj_pai ON reg_e210 (cnpj_pai);

CREATE TABLE reg_e220 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e220_idx_id_pai ON reg_e220 (id_pai);
CREATE INDEX reg_e220_idx_cnpj_pai ON reg_e220 (cnpj_pai);

CREATE TABLE reg_e230 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e230_idx_id_pai ON reg_e230 (id_pai);
CREATE INDEX reg_e230_idx_cnpj_pai ON reg_e230 (cnpj_pai);

CREATE TABLE reg_e240 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e240_idx_id_pai ON reg_e240 (id_pai);
CREATE INDEX reg_e240_idx_cnpj_pai ON reg_e240 (cnpj_pai);

CREATE TABLE reg_e250 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_or varchar(3),
    vl_or numeric(18, 2),
    dt_vcto date,
    cod_rec varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    mes_ref varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e250_idx_id_pai ON reg_e250 (id_pai);
CREATE INDEX reg_e250_idx_cnpj_pai ON reg_e250 (cnpj_pai);

CREATE TABLE reg_e300 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    uf varchar(2),
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e300_idx_id_pai ON reg_e300 (id_pai);
CREATE INDEX reg_e300_idx_cnpj_pai ON reg_e300 (cnpj_pai);

CREATE TABLE reg_e310 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov_difal varchar(1),
    vl_sld_cred_ant_difal numeric(18, 2),
    vl_tot_debitos_difal numeric(18, 2),
    vl_out_deb_difal numeric(18, 2),
    vl_tot_deb_fcp numeric(18, 2),
    vl_tot_creditos_difal numeric(18, 2),
    vl_tot_cred_fcp numeric(18, 2),
    vl_out_cred_difal numeric(18, 2),
    vl_sld_dev_ant_difal numeric(18, 2),
    vl_deducoes_difal numeric(18, 2),
    vl_recol numeric(18, 2),
    vl_sld_cred_transportar numeric(18, 2),
    deb_esp_difal numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e310_idx_id_pai ON reg_e310 (id_pai);
CREATE INDEX reg_e310_idx_cnpj_pai ON reg_e310 (cnpj_pai);

CREATE TABLE reg_e311 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e311_idx_id_pai ON reg_e311 (id_pai);
CREATE INDEX reg_e311_idx_cnpj_pai ON reg_e311 (cnpj_pai);

CREATE TABLE reg_e312 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e312_idx_id_pai ON reg_e312 (id_pai);
CREATE INDEX reg_e312_idx_cnpj_pai ON reg_e312 (cnpj_pai);

CREATE TABLE reg_e313 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    chv_doce varchar(44),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e313_idx_id_pai ON reg_e313 (id_pai);
CREATE INDEX reg_e313_idx_cnpj_pai ON reg_e313 (cnpj_pai);

CREATE TABLE reg_e316 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_or varchar(3),
    vl_or numeric(18, 2),
    dt_vcto date,
    cod_rec varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    mes_ref varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e316_idx_id_pai ON reg_e316 (id_pai);
CREATE INDEX reg_e316_idx_cnpj_pai ON reg_e316 (cnpj_pai);

CREATE TABLE reg_e500 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_apur varchar(1),
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e500_idx_id_pai ON reg_e500 (id_pai);
CREATE INDEX reg_e500_idx_cnpj_pai ON reg_e500 (cnpj_pai);

CREATE TABLE reg_e510 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cfop varchar(4),
    cst_ipi varchar(2),
    vl_cont_ipi numeric(18, 2),
    vl_bc_ipi numeric(18, 2),
    vl_ipi numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e510_idx_id_pai ON reg_e510 (id_pai);
CREATE INDEX reg_e510_idx_cnpj_pai ON reg_e510 (cnpj_pai);

CREATE TABLE reg_e520 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    vl_sd_ant_ipi numeric(18, 2),
    vl_deb_ipi numeric(18, 2),
    vl_cred_ipi numeric(18, 2),
    vl_od_ipi numeric(18, 2),
    vl_oc_ipi numeric(18, 2),
    vl_sc_ipi numeric(18, 2),
    vl_sd_ipi numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e520_idx_id_pai ON reg_e520 (id_pai);
CREATE INDEX reg_e520_idx_cnpj_pai ON reg_e520 (cnpj_pai);

CREATE TABLE reg_e530 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_aj varchar(1),
    vl_aj numeric(18, 2),
    cod_aj varchar(3),
    ind_doc varchar(1),
    num_doc varchar(255),
    descr_aj varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e530_idx_id_pai ON reg_e530 (id_pai);
CREATE INDEX reg_e530_idx_cnpj_pai ON reg_e530 (cnpj_pai);

CREATE TABLE reg_e990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_e integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_e990_idx_id_pai ON reg_e990 (id_pai);
CREATE INDEX reg_e990_idx_cnpj_pai ON reg_e990 (cnpj_pai);

CREATE TABLE reg_g001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g001_idx_id_pai ON reg_g001 (id_pai);
CREATE INDEX reg_g001_idx_cnpj_pai ON reg_g001 (cnpj_pai);

CREATE TABLE reg_g110 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini date,
    dt_fin date,
    saldo_in_icms numeric(18, 2),
    som_parc numeric(18, 2),
    vl_trib_exp numeric(18, 2),
    vl_total numeric(18, 2),
    ind_per_sai numeric(18, 8),
    icms_aprop numeric(18, 2),
    som_icms_oc numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g110_idx_id_pai ON reg_g110 (id_pai);
CREATE INDEX reg_g110_idx_cnpj_pai ON reg_g110 (cnpj_pai);

CREATE TABLE reg_g125 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_ind_bem varchar(60),
    dt_mov date,
    tipo_mov varchar(2),
    vl_imob_icms_op numeric(18, 2),
    vl_imob_icms_st numeric(18, 2),
    vl_imob_icms_frt numeric(18, 2),
    vl_imob_icms_dif numeric(18, 2),
    num_parc varchar(3),
    vl_parc_pass numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g125_idx_id_pai ON reg_g125 (id_pai);
CREATE INDEX reg_g125_idx_cnpj_pai ON reg_g125 (cnpj_pai);

CREATE TABLE reg_g126 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini date,
    dt_fin date,
    num_parc varchar(3),
    vl_parc_pass numeric(18, 2),
    vl_trib_oc numeric(18, 2),
    vl_total numeric(18, 2),
    ind_per_sai numeric(18, 8),
    vl_parc_aprop numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g126_idx_id_pai ON reg_g126 (id_pai);
CREATE INDEX reg_g126_idx_cnpj_pai ON reg_g126 (cnpj_pai);

CREATE TABLE reg_g130 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_emit varchar(1),
    cod_part varchar(60),
    cod_mod varchar(2),
    serie varchar(3),
    num_doc varchar(9),
    chv_nfe_cte varchar(44),
    dt_doc date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g130_idx_id_pai ON reg_g130 (id_pai);
CREATE INDEX reg_g130_idx_cnpj_pai ON reg_g130 (cnpj_pai);

CREATE TABLE reg_g140 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    num_item varchar(3),
    cod_item varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g140_idx_id_pai ON reg_g140 (id_pai);
CREATE INDEX reg_g140_idx_cnpj_pai ON reg_g140 (cnpj_pai);

CREATE TABLE reg_g990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_g integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_g990_idx_id_pai ON reg_g990 (id_pai);
CREATE INDEX reg_g990_idx_cnpj_pai ON reg_g990 (cnpj_pai);

CREATE TABLE reg_h001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_h001_idx_id_pai ON reg_h001 (id_pai);
CREATE INDEX reg_h001_idx_cnpj_pai ON reg_h001 (cnpj_pai);

CREATE TABLE reg_h005 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_inv date,
    vl_inv numeric(18, 2),
    mot_inv varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_h005_idx_id_pai ON reg_h005 (id_pai);
CREATE INDEX reg_h005_idx_cnpj_pai ON reg_h005 (cnpj_pai);

CREATE TABLE reg_h010 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cod_item varchar(60),
    unid varchar(6),
    qtd numeric(18, 3),
    vl_unit numeric(18, 6),
    vl_item numeric(18, 2),
    ind_prop varchar(1),
    cod_part varchar(60),
    txt_compl varchar(255),
    cod_cta varchar(255),
    vl_item_ir numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_h010_idx_id_pai ON reg_h010 (id_pai);
CREATE INDEX reg_h010_idx_cnpj_pai ON reg_h010 (cnpj_pai);

CREATE TABLE reg_h020 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    cst_icms varchar(3),
    bl_icms numeric(18, 2),
    vl_icms numeric(18, 2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_h020_idx_id_pai ON reg_h020 (id_pai);
CREATE INDEX reg_h020_idx_cnpj_pai ON reg_h020 (cnpj_pai);

CREATE TABLE reg_h990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_h integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_h990_idx_id_pai ON reg_h990 (id_pai);
CREATE INDEX reg_h990_idx_cnpj_pai ON reg_h990 (cnpj_pai);

CREATE TABLE reg_k001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k001_idx_id_pai ON reg_k001 (id_pai);
CREATE INDEX reg_k001_idx_cnpj_pai ON reg_k001 (cnpj_pai);

CREATE TABLE reg_k100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k100_idx_id_pai ON reg_k100 (id_pai);
CREATE INDEX reg_k100_idx_cnpj_pai ON reg_k100 (cnpj_pai);

CREATE TABLE reg_k200 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_est date,
    cod_item varchar(60),
    qtd numeric(18, 3),
    ind_est varchar(1),
    cod_part varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k200_idx_id_pai ON reg_k200 (id_pai);
CREATE INDEX reg_k200_idx_cnpj_pai ON reg_k200 (cnpj_pai);

CREATE TABLE reg_k220 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_mov date,
    cod_item_ori varchar(60),
    cod_item_dest varchar(60),
    qtd numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k220_idx_id_pai ON reg_k220 (id_pai);
CREATE INDEX reg_k220_idx_cnpj_pai ON reg_k220 (cnpj_pai);

CREATE TABLE reg_k230 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_ini_op date,
    dt_fin_op date,
    cod_doc_op varchar(30),
    cod_item varchar(60),
    qtd_enc numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k230_idx_id_pai ON reg_k230 (id_pai);
CREATE INDEX reg_k230_idx_cnpj_pai ON reg_k230 (cnpj_pai);

CREATE TABLE reg_k235 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_saida date,
    cod_item varchar(60),
    qtd numeric(18, 3),
    cod_ins_subst varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k235_idx_id_pai ON reg_k235 (id_pai);
CREATE INDEX reg_k235_idx_cnpj_pai ON reg_k235 (cnpj_pai);

CREATE TABLE reg_k250 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_prod date,
    cod_item varchar(60),
    qtd numeric(18, 3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k250_idx_id_pai ON reg_k250 (id_pai);
CREATE INDEX reg_k250_idx_cnpj_pai ON reg_k250 (cnpj_pai);

CREATE TABLE reg_k255 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    dt_cons date,
    cod_item varchar(60),
    qtd numeric(18, 3),
    cod_ins_subst varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k255_idx_id_pai ON reg_k255 (id_pai);
CREATE INDEX reg_k255_idx_cnpj_pai ON reg_k255 (cnpj_pai);

CREATE TABLE reg_k990 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint,
    qtd_lin_k integer,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE INDEX reg_k990_idx_id_pai ON reg_k990 (id_pai);
CREATE INDEX reg_k990_idx_cnpj_pai ON reg_k990 (cnpj_pai);


SET SCHEMA public;
