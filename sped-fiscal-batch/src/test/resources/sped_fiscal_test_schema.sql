DROP SCHEMA IF EXISTS sped_fiscal CASCADE;

CREATE SCHEMA sped_fiscal AUTHORIZATION DBA;

SET SCHEMA sped_fiscal;

CREATE TABLE reg_0000 (
    id bigint NOT NULL,
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


CREATE TABLE reg_0001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0005 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_0015 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    uf_st varchar(2),
    ie_st varchar(14),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0100 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_0150 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_0175 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_alt date,
    nr_campo varchar(2),
    cont_ant varchar(100),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0190 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    unid varchar(6),
    descr varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0200 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    descr_item varchar(255),
    cod_barra varchar(20),
    cod_ant_item varchar(60),
    unid_inv varchar(6),
    tipo_item varchar(2),
    cod_ncm varchar(8),
    ex_ipi varchar(3),
    cod_gen varchar(2),
    cod_lst varchar(4),
    aliq_icms numeric(8,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0205 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    descr_ant_item varchar(255),
    dt_ini date,
    dt_fim date,
    cod_ant_item varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0206 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_comb varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0220 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    unid_conv varchar(6),
    fat_conv numeric(25,6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0300 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_0305 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_ccus varchar(60),
    func varchar(255),
    vida_util varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0400 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_nat varchar(10),
    descr_nat varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0450 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_inf varchar(6),
    txt varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0460 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_obs varchar(6),
    txt varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0500 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_0600 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_alt date,
    cod_ccus varchar(60),
    ccus varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_0990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_0 bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1010 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_1100 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_1105 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_1110 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    num_doc varchar(9),
    dt_doc date,
    chv_nfe varchar(44),
    nr_memo varchar(255),
    qtd numeric(22,3),
    unid varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1200 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_aj_apur varchar(8),
    sld_cred numeric(21,2),
    cred_apr numeric(21,2),
    cred_receb numeric(21,2),
    cred_util numeric(21,2),
    sld_cred_fim numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1210 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    tipo_util varchar(4),
    nr_doc varchar(255),
    vl_cred_util numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1300 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    dt_fech date,
    estq_abert numeric(22,3),
    vol_entr numeric(22,3),
    vol_disp numeric(22,3),
    vol_saidas numeric(22,3),
    estq_escr numeric(22,3),
    val_aj_perda numeric(22,3),
    val_aj_ganho numeric(22,3),
    fech_fisico numeric(22,3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1310 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_tanque varchar(3),
    estq_abert numeric(22,3),
    vol_entr numeric(22,3),
    vol_disp numeric(22,3),
    vol_saidas numeric(22,3),
    estq_escr numeric(22,3),
    val_aj_perda numeric(22,3),
    val_aj_ganho numeric(22,3),
    fech_fisico numeric(22,3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1320 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_bico varchar(255),
    nr_interv varchar(255),
    mot_interv varchar(50),
    nom_interv varchar(30),
    cnpj_interv varchar(14),
    cpf_interv varchar(11),
    val_fecha numeric(22,3),
    val_abert numeric(22,3),
    vol_aferi numeric(22,3),
    vol_vendas numeric(22,3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1350 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    serie varchar(255),
    fabricante varchar(60),
    modelo varchar(255),
    tipo_medicao varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1360 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_lacre varchar(20),
    dat_aplicacao date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1370 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_bico varchar(3),
    cod_item varchar(60),
    num_tanque varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1390 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_prod varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1391 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_registro date,
    qtd_moid numeric(21,2),
    estq_ini numeric(21,2),
    qtd_produz numeric(21,2),
    ent_anid_hid numeric(21,2),
    outr_entr numeric(21,2),
    perda numeric(21,2),
    cons numeric(21,2),
    sai_ani_hid numeric(21,2),
    saidas numeric(21,2),
    estq_fin numeric(21,2),
    estq_ini_mel numeric(21,2),
    prod_dia_mel numeric(21,2),
    util_mel numeric(21,2),
    prod_alc_mel numeric(21,2),
    obs varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1400 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    mun varchar(7),
    valor numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1500 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    vl_forn numeric(21,2),
    vl_serv_nt numeric(21,2),
    vl_terc numeric(21,2),
    vl_da numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    cod_inf varchar(6),
    vl_pis numeric(21,2),
    vl_cofis numeric(21,2),
    tp_ligacao varchar(1),
    cod_grupo_tensao varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1510 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    cod_class varchar(4),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    cst_icms varchar(3),
    cfop varchar(4),
    vl_bc_icms numeric(21,2),
    aliq_icms numeric(8,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    aliq_st numeric(21,2),
    vl_icms_st numeric(21,2),
    ind_rec varchar(1),
    cod_part varchar(60),
    vl_pis numeric(21,2),
    vl_cofis numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1600 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    tot_credito numeric(21,2),
    tot_debito numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1700 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_1710 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_doc_ini varchar(12),
    num_doc_fin varchar(12),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1800 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_carga numeric(21,2),
    vl_pass numeric(21,2),
    vl_fat numeric(21,2),
    ind_rat numeric(14,6),
    vl_icms_ant numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms_apur numeric(21,2),
    vl_bc_icms_apur numeric(21,2),
    vl_dif numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1900 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_apur_icms varchar(1),
    descr_compl_out_apur varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1910 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1920 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_tot_transf_debitos_oa numeric(21,2),
    vl_tot_aj_debitos_oa numeric(21,2),
    vl_estornos_cred_oa numeric(21,2),
    vl_tot_transf_creditos_oa numeric(21,2),
    vl_tot_aj_creditos_oa numeric(21,2),
    vl_estornos_deb_oa numeric(21,2),
    vl_sld_credor_ant_oa numeric(21,2),
    vl_sld_apurado_oa numeric(21,2),
    vl_tot_ded numeric(21,2),
    vl_icms_recolher_oa numeric(21,2),
    vl_sld_credor_transp_oa numeric(21,2),
    deb_esp_oa numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1921 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1922 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1923 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1925 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_inf_adic varchar(8),
    vl_inf_adic numeric(21,2),
    desc_compl_aj varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_1926 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_or varchar(3),
    vl_or numeric(21,2),
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


CREATE TABLE reg_1990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_1 bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_9001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_9900 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    reg_blc varchar(4),
    qtd_reg_blc varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_9990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_9 bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_9999 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c100 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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
    vl_doc numeric(21,2),
    ind_pgto varchar(1),
    vl_desc numeric(21,2),
    vl_abat_nt numeric(21,2),
    vl_merc numeric(21,2),
    ind_frt varchar(1),
    vl_frt numeric(21,2),
    vl_seg numeric(21,2),
    vl_out_da numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_ipi numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    vl_pis_st numeric(21,2),
    vl_cofins_st numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c105 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    oper varchar(1),
    cod_uf varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c110 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_inf varchar(6),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c111 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_proc varchar(15),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c112 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_da varchar(1),
    uf varchar(2),
    num_da varchar(255),
    cod_aut varchar(255),
    vl_da numeric(21,2),
    dt_vcto date,
    dt_pgto date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c113 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_c114 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ecf_fab varchar(21),
    ecf_cx varchar(3),
    num_doc varchar(9),
    dt_doc date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c115 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_c116 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    nr_sat varchar(9),
    chv_cfe varchar(44),
    num_cfe varchar(6),
    dt_doc varchar(8),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c120 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_doc_imp varchar(1),
    num_doc_imp varchar(12),
    pis_imp numeric(21,2),
    cofins_imp numeric(21,2),
    num_acdraw varchar(20),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c130 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_serv_nt numeric(21,2),
    vl_bc_issqn numeric(21,2),
    vl_issqn numeric(21,2),
    vl_bc_irrf numeric(21,2),
    vl_irrf numeric(21,2),
    vl_bc_prev numeric(21,2),
    vl_prev numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c140 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_emit varchar(1),
    ind_tit varchar(2),
    desc_tit varchar(255),
    num_tit varchar(255),
    qtd_parc varchar(2),
    vl_tit numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c141 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_parc varchar(2),
    dt_vcto date,
    vl_parc numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c160 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    veic_id varchar(7),
    qtd_vol varchar(255),
    peso_brt numeric(21,2),
    peso_liq numeric(21,2),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c165 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    veic_id varchar(7),
    cod_aut varchar(255),
    nr_passe varchar(255),
    hora varchar(6),
    temper numeric(20,1),
    qtd_vol varchar(255),
    peso_brt numeric(21,2),
    peso_liq numeric(21,2),
    nom_mot varchar(60),
    cpf varchar(11),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c170 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    descr_compl varchar(255),
    qtd numeric(24,5),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    ind_mov varchar(1),
    cst_icms varchar(3),
    cfop varchar(4),
    cod_nat varchar(10),
    vl_bc_icms numeric(21,2),
    aliq_icms numeric(8,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    aliq_st numeric(8,2),
    vl_icms_st numeric(21,2),
    ind_apur varchar(1),
    cst_ipi varchar(2),
    cod_enq varchar(3),
    vl_bc_ipi numeric(21,2),
    aliq_ipi numeric(8,2),
    vl_ipi numeric(21,2),
    cst_pis varchar(2),
    vl_bc_pis numeric(21,2),
    aliq_pis_perc numeric(12,4),
    quant_bc_pis numeric(22,3),
    aliq_pis_reais numeric(23,4),
    vl_pis numeric(21,2),
    cst_cofins varchar(2),
    vl_bc_cofins numeric(21,2),
    aliq_cofins_perc numeric(12,4),
    quant_bc_cofins numeric(22,3),
    aliq_cofins_reais numeric(23,4),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    dar integer,
    dar_vlr_base_icms numeric(19,4),
    dar_vlr_icms_subs numeric(19,4),
    dar_vlr_base_subs numeric(19,4),
    dar_vlr_icms numeric(19,4),
    dar_perc_icms numeric(19,4),
    dar_perc_iva numeric(19,4),
    dar_vlr_icms_diferencial numeric(19,4),
    dar_vlr_custo numeric(19,4),
    dar_perc_red_base_icms numeric(19,4),
    dar_perc_red_base_subs numeric(19,4),
    dar_perc_icms_destino numeric(19,4),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    arquivo_sped varchar(1) DEFAULT 'S'
);


CREATE TABLE reg_c171 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_tanque varchar(3),
    qtde numeric(22,3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c172 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_bc_issqn numeric(21,2),
    aliq_issqn numeric(8,2),
    vl_issqn numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c173 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    lote_med varchar(255),
    qtd_item numeric(22,3),
    dt_fab date,
    dt_val date,
    ind_med varchar(1),
    tp_prod varchar(1),
    vl_tab_max numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c174 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_arm varchar(1),
    num_arm varchar(255),
    descr_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c175 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_veic_oper varchar(1),
    cnpj varchar(14),
    uf varchar(2),
    chassi_veic varchar(17),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c176 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod_ult_e varchar(2),
    num_doc_ult_e varchar(9),
    ser_ult_e varchar(3),
    dt_ult_e date,
    cod_part_ult_e varchar(60),
    quant_ult_e numeric(22,3),
    vl_unit_ult_e numeric(22,3),
    vl_unit_bc_st numeric(22,3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c177 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_selo_ipi varchar(6),
    qt_selo_ipi varchar(12),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c178 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cl_enq varchar(5),
    vl_unid numeric(21,2),
    quant_pad numeric(22,3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c179 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    bc_st_orig_dest numeric(21,2),
    icms_st_rep numeric(21,2),
    icms_st_compl numeric(21,2),
    bc_ret numeric(21,2),
    icms_ret numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c190 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    vl_ipi numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c195 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_obs varchar(6),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c197 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_aj varchar(10),
    descr_compl_aj varchar(255),
    cod_item varchar(60),
    vl_bc_icms numeric(21,2),
    aliq_icms numeric(8,2),
    vl_icms numeric(21,2),
    vl_outros numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c300 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc_ini varchar(6),
    num_doc_fin varchar(6),
    dt_doc date,
    vl_doc numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c310 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_doc_canc varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c320 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c321 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c350 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ser varchar(4),
    sub_ser varchar(3),
    num_doc varchar(6),
    dt_doc date,
    cnpj_cpf varchar(14),
    vl_merc numeric(21,2),
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofis numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c370 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c390 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c400 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ecf_mod varchar(20),
    ecf_fab varchar(21),
    ecf_cx varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c405 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_doc date,
    cro varchar(3),
    crz varchar(6),
    num_coo_fin varchar(9),
    gt_fin numeric(21,2),
    vl_brt numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    num_coo_ini varchar(9),
    gt_ini numeric(21,2)
);


CREATE TABLE reg_c410 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c420 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_tot_par varchar(7),
    vlr_acum_tot numeric(21,2),
    nr_tot varchar(2),
    descr_nr_tot varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c425 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c460 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    cod_sit varchar(2),
    num_doc varchar(9),
    dt_doc date,
    vl_doc numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cpf_cnpj varchar(14),
    nome_adq varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c465 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    chv_cfe varchar(44),
    num_ccf varchar(9),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c470 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    qtd numeric(22,3),
    qtd_canc numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c490 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c495 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    aliq_icms numeric(8,2),
    cod_item varchar(60),
    qtd numeric(22,3),
    qtd_canc numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    vl_canc numeric(21,2),
    vl_acmo numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_isen numeric(21,2),
    vl_nt numeric(21,2),
    vl_icms_st numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c500 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    vl_forn numeric(21,2),
    vl_serv_nt numeric(21,2),
    vl_terc numeric(21,2),
    vl_da numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    cod_inf varchar(6),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    tp_ligacao varchar(1),
    cod_grupo_tensao varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c510 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    cod_class varchar(4),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    cst_icms varchar(3),
    cfop varchar(4),
    vl_bc_icms numeric(21,2),
    aliq_icms numeric(8,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    aliq_st numeric(8,2),
    vl_icms_st numeric(21,2),
    ind_rec varchar(1),
    cod_part varchar(60),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c590 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c600 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    cod_mun varchar(7),
    ser varchar(4),
    sub varchar(3),
    cod_cons varchar(2),
    qtd_cons varchar(255),
    qtd_canc varchar(255),
    dt_doc date,
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    cons varchar(255),
    vl_forn numeric(21,2),
    vl_serv_nt numeric(21,2),
    vl_terc numeric(21,2),
    vl_da numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c601 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_doc_canc varchar(9),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c610 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_class varchar(4),
    cod_item varchar(60),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c690 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_red_bc numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c700 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_c790 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c791 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    uf varchar(2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c800 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    cod_sit varchar(2),
    num_cfe varchar(6),
    dt_doc date,
    vl_cfe numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cnpj_cpf varchar(14),
    nr_sat varchar(9),
    chv_cfe varchar(44),
    vl_desc numeric(21,2),
    vl_merc numeric(21,2),
    vl_out_da numeric(21,2),
    vl_icms numeric(21,2),
    vl_pis_st numeric(21,2),
    vl_cofins_st numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c850 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c860 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    nr_sat varchar(9),
    dt_doc date,
    doc_ini varchar(6),
    doc_fim varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c890 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_c990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_c bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d100 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    ind_frt varchar(1),
    vl_serv numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_nt numeric(21,2),
    cod_inf varchar(60),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d110 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    vl_serv numeric(21,2),
    vl_out numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d120 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    veic_id varchar(7),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d130 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part_consg varchar(60),
    cod_part_red varchar(60),
    ind_frt_red varchar(1),
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    veic_id varchar(7),
    vl_liq_frt numeric(21,2),
    vl_sec_cat numeric(21,2),
    vl_desp numeric(21,2),
    vl_pedg numeric(21,2),
    vl_out numeric(21,2),
    vl_frt numeric(21,2),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d140 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part_consg varchar(60),
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    ind_veic varchar(1),
    veic_id varchar(255),
    ind_nav varchar(1),
    viagem varchar(255),
    vl_frt_liq numeric(21,2),
    vl_desp_port numeric(21,2),
    vl_desp_car_desc numeric(21,2),
    vl_out numeric(21,2),
    vl_frt_brt numeric(21,2),
    vl_frt_mm numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d150 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    veic_id varchar(255),
    viagem varchar(255),
    ind_tfa varchar(1),
    vl_peso_tx numeric(21,2),
    vl_tx_terr numeric(21,2),
    vl_tx_red numeric(21,2),
    vl_out numeric(21,2),
    vl_tx_adv numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d160 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_d161 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_d162 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ser varchar(4),
    num_doc varchar(9),
    dt_doc date,
    vl_doc numeric(21,2),
    vl_merc numeric(21,2),
    qtd_vol varchar(255),
    peso_brt numeric(21,2),
    peso_liq numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d170 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part_consg varchar(60),
    cod_part_red varchar(60),
    cod_mun_orig varchar(7),
    cod_mun_dest varchar(7),
    otm varchar(255),
    ind_nat_frt varchar(1),
    vl_liq_frt numeric(21,2),
    vl_gris numeric(21,2),
    vl_pdg numeric(21,2),
    vl_out numeric(21,2),
    vl_frt numeric(21,2),
    veic_id varchar(7),
    uf_id varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d180 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_seq varchar(255),
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
    vl_doc numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d190 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d195 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_obs varchar(6),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d197 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_aj varchar(10),
    descr_compl_aj varchar(255),
    cod_item varchar(60),
    vl_bc_icms numeric(21,2),
    aliq_icms numeric(8,2),
    vl_icms numeric(21,2),
    vl_outros numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d300 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(4),
    num_doc_ini varchar(6),
    num_doc_fin varchar(255),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    dt_doc date,
    vl_opr numeric(21,2),
    vl_desc numeric(21,2),
    vl_serv numeric(21,2),
    vl_seg numeric(21,2),
    vl_out_desp numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d301 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_doc_canc varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d310 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mun_orig varchar(7),
    vl_serv numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d350 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ecf_mod varchar(20),
    ecf_fab varchar(21),
    ecf_cx varchar(3),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d355 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_doc date,
    cro varchar(3),
    crz varchar(6),
    num_coo_fin varchar(9),
    gt_fin numeric(21,2),
    vl_brt numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d360 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d365 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_tot_par varchar(7),
    vlr_acum_tot numeric(21,2),
    nr_tot varchar(2),
    descr_nr_tot varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d370 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mun_orig varchar(7),
    vl_serv numeric(21,2),
    qtd_bilh varchar(255),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d390 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_issqn numeric(21,2),
    aliq_issqn numeric(8,2),
    vl_issqn numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d400 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    cod_mod varchar(2),
    cod_sit varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(6),
    dt_doc date,
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    vl_serv numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d410 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc_ini varchar(6),
    num_doc_fin varchar(6),
    dt_doc date,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_desc numeric(21,2),
    vl_serv numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d411 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_doc_canc varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d420 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mun_orig varchar(7),
    vl_serv numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d500 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    vl_serv numeric(21,2),
    vl_serv_nt numeric(21,2),
    vl_terc numeric(21,2),
    vl_da numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    cod_inf varchar(6),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    tp_assinante varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d510 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    cod_class varchar(4),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    cst_icms varchar(3),
    cfop varchar(4),
    vl_bc_icms numeric(21,2),
    aliq_icms numeric(8,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    ind_rec varchar(1),
    cod_part varchar(60),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d530 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_serv varchar(1),
    dt_ini_serv date,
    dt_fin_serv date,
    per_fiscal varchar(6),
    cod_area varchar(255),
    terminal varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d590 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d600 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    cod_mun varchar(7),
    ser varchar(4),
    sub varchar(3),
    cod_cons varchar(2),
    qtd_cons varchar(255),
    dt_doc date,
    vl_doc numeric(21,2),
    vl_desc numeric(21,2),
    vl_serv numeric(21,2),
    vl_serv_nt numeric(21,2),
    vl_terc numeric(21,2),
    vl_da numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d610 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_class varchar(4),
    cod_item varchar(60),
    qtd numeric(22,3),
    unid varchar(6),
    vl_item numeric(21,2),
    vl_desc numeric(21,2),
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    vl_pis numeric(21,2),
    vl_cofins numeric(21,2),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d690 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d695 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_mod varchar(2),
    ser varchar(4),
    nro_ord_ini varchar(255),
    nro_ord_fin varchar(255),
    dt_doc_ini date,
    dt_doc_fin date,
    nom_mest varchar(15),
    chv_cod_dig varchar(32),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d696 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    cfop varchar(4),
    aliq_icms numeric(8,2),
    vl_opr numeric(21,2),
    vl_bc_icms numeric(21,2),
    vl_icms numeric(21,2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    vl_red_bc numeric(21,2),
    cod_obs varchar(6),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d697 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    uf varchar(2),
    vl_bc_icms_st numeric(21,2),
    vl_icms_st numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_d990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_d bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e100 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e110 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_tot_debitos numeric(21,2),
    vl_aj_debitos numeric(21,2),
    vl_tot_aj_debitos numeric(21,2),
    vl_estornos_cred numeric(21,2),
    vl_tot_creditos numeric(21,2),
    vl_aj_creditos numeric(21,2),
    vl_tot_aj_creditos numeric(21,2),
    vl_estornos_deb numeric(21,2),
    vl_sld_credor_ant numeric(21,2),
    vl_sld_apurado numeric(21,2),
    vl_tot_ded numeric(21,2),
    vl_icms_recolher numeric(21,2),
    vl_sld_credor_transportar numeric(21,2),
    deb_esp numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e111 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e112 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e113 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e115 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_inf_adic varchar(8),
    vl_inf_adic numeric(21,2),
    descr_compl_aj varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e116 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_or varchar(3),
    vl_or numeric(21,2),
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


CREATE TABLE reg_e200 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    uf varchar(2),
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e210 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov_st varchar(1),
    vl_sld_cred_ant_st numeric(21,2),
    vl_devol_st numeric(21,2),
    vl_ressarc_st numeric(21,2),
    vl_out_cred_st numeric(21,2),
    vl_aj_creditos_st numeric(21,2),
    vl_retencao_st numeric(21,2),
    vl_out_deb_st numeric(21,2),
    vl_aj_debitos_st numeric(21,2),
    vl_sld_dev_ant_st numeric(21,2),
    vl_deducoes_st numeric(21,2),
    vl_icms_recol_st numeric(21,2),
    vl_sld_cred_st_transportar numeric(21,2),
    deb_esp_st numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e220 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_aj_apur varchar(8),
    descr_compl_aj varchar(255),
    vl_aj_apur numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e230 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_da varchar(255),
    num_proc varchar(15),
    ind_proc varchar(1),
    proc varchar(255),
    txt_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e240 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_part varchar(60),
    cod_mod varchar(2),
    ser varchar(4),
    sub varchar(3),
    num_doc varchar(9),
    dt_doc date,
    cod_item varchar(60),
    vl_aj_item numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e250 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_or varchar(3),
    vl_or numeric(21,2),
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


CREATE TABLE reg_e500 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_apur varchar(1),
    dt_ini date,
    dt_fin date,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e510 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cfop varchar(4),
    cst_ipi varchar(2),
    vl_cont_ipi numeric(21,2),
    vl_bc_ipi numeric(21,2),
    vl_ipi numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e520 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    vl_sd_ant_ipi numeric(21,2),
    vl_deb_ipi numeric(21,2),
    vl_cred_ipi numeric(21,2),
    vl_od_ipi numeric(21,2),
    vl_oc_ipi numeric(21,2),
    vl_sc_ipi numeric(21,2),
    vl_sd_ipi numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e530 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_aj varchar(1),
    vl_aj numeric(21,2),
    cod_aj varchar(3),
    ind_doc varchar(1),
    num_doc varchar(255),
    descr_aj varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_e990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_e bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_g001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_g110 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_ini date,
    dt_fin date,
    saldo_in_icms numeric(21,2),
    som_parc numeric(21,2),
    vl_trib_exp numeric(21,2),
    vl_total numeric(21,2),
    ind_per_sai numeric(27,8),
    icms_aprop numeric(21,2),
    som_icms_oc numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_g125 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_ind_bem varchar(60),
    dt_mov date,
    tipo_mov varchar(2),
    vl_imob_icms_op numeric(21,2),
    vl_imob_icms_st numeric(21,2),
    vl_imob_icms_frt numeric(21,2),
    vl_imob_icms_dif numeric(21,2),
    num_parc varchar(3),
    vl_parc_pass numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_g126 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_ini date,
    dt_fin date,
    num_parc varchar(3),
    vl_parc_pass numeric(21,2),
    vl_trib_oc numeric(21,2),
    vl_total numeric(21,2),
    ind_per_sai numeric(27,8),
    vl_parc_aprop numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_g130 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
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


CREATE TABLE reg_g140 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    num_item varchar(3),
    cod_item varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_g990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_g bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_h001 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_h005 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    dt_inv date,
    vl_inv numeric(21,2),
    mot_inv varchar(2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_h010 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cod_item varchar(60),
    unid varchar(6),
    qtd numeric(22,3),
    vl_unit numeric(25,6),
    vl_item numeric(21,2),
    ind_prop varchar(1),
    cod_part varchar(60),
    txt_compl varchar(255),
    cod_cta varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_h020 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    cst_icms varchar(3),
    bl_icms numeric(21,2),
    vl_icms numeric(21,2),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE reg_h990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    qtd_lin_h bigint,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);

CREATE TABLE reg_k001 (
  id bigint NOT NULL,
  id_pai bigint NOT NULL,
  acao varchar(1) DEFAULT 'I',
  cnpj_pai varchar(14),
  carga_id integer,
  ind_mov varchar(1)
);

CREATE TABLE reg_k100 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_ini date,
    dt_fin date
);

CREATE TABLE reg_k200 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_est date,
    cod_item varchar(60),
    qtd numeric(20,3),
    ind_est varchar(1),
    cod_part varchar(60)
);

CREATE TABLE reg_k220 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_mov date,
    cod_item_ori varchar(60),
    cod_item_dest varchar(60),
    qtd numeric(20,3)
);

CREATE TABLE reg_k230 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_ini_op date,
    dt_fin_op date,
    cod_doc_op varchar(30),
    cod_item varchar(60),
    qtd_enc numeric(20,3)
);

CREATE TABLE reg_k235 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_saida date,
    cod_item varchar(60),
    qtd numeric(20,3),
    cod_ins_subst varchar(255)
);

CREATE TABLE reg_k250 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_prod date,
    cod_item varchar(60),
    qtd numeric(20,3)
);

CREATE TABLE reg_k255 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    dt_cons date,
    cod_item varchar(60),
    qtd numeric(20,3),
    cod_ins_subst varchar(60)
);

CREATE TABLE reg_k990 (
    id bigint NOT NULL,
    id_pai bigint NOT NULL,
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer,
    qtd_lin_k varchar(255)
);


ALTER TABLE reg_0000
    ADD CONSTRAINT reg_0000_pkey PRIMARY KEY (id);


ALTER TABLE reg_0001
    ADD CONSTRAINT reg_0001_pkey PRIMARY KEY (id);


ALTER TABLE reg_0005
    ADD CONSTRAINT reg_0005_pkey PRIMARY KEY (id);


ALTER TABLE reg_0015
    ADD CONSTRAINT reg_0015_pkey PRIMARY KEY (id);


ALTER TABLE reg_0100
    ADD CONSTRAINT reg_0100_pkey PRIMARY KEY (id);


ALTER TABLE reg_0150
    ADD CONSTRAINT reg_0150_pkey PRIMARY KEY (id);


ALTER TABLE reg_0175
    ADD CONSTRAINT reg_0175_pkey PRIMARY KEY (id);


ALTER TABLE reg_0190
    ADD CONSTRAINT reg_0190_pkey PRIMARY KEY (id);


ALTER TABLE reg_0200
    ADD CONSTRAINT reg_0200_pkey PRIMARY KEY (id);


ALTER TABLE reg_0205
    ADD CONSTRAINT reg_0205_pkey PRIMARY KEY (id);


ALTER TABLE reg_0206
    ADD CONSTRAINT reg_0206_pkey PRIMARY KEY (id);


ALTER TABLE reg_0220
    ADD CONSTRAINT reg_0220_pkey PRIMARY KEY (id);


ALTER TABLE reg_0300
    ADD CONSTRAINT reg_0300_pkey PRIMARY KEY (id);


ALTER TABLE reg_0305
    ADD CONSTRAINT reg_0305_pkey PRIMARY KEY (id);


ALTER TABLE reg_0400
    ADD CONSTRAINT reg_0400_pkey PRIMARY KEY (id);


ALTER TABLE reg_0450
    ADD CONSTRAINT reg_0450_pkey PRIMARY KEY (id);


ALTER TABLE reg_0460
    ADD CONSTRAINT reg_0460_pkey PRIMARY KEY (id);


ALTER TABLE reg_0500
    ADD CONSTRAINT reg_0500_pkey PRIMARY KEY (id);


ALTER TABLE reg_0600
    ADD CONSTRAINT reg_0600_pkey PRIMARY KEY (id);


ALTER TABLE reg_0990
    ADD CONSTRAINT reg_0990_pkey PRIMARY KEY (id);


ALTER TABLE reg_1001
    ADD CONSTRAINT reg_1001_pkey PRIMARY KEY (id);


ALTER TABLE reg_1010
    ADD CONSTRAINT reg_1010_pkey PRIMARY KEY (id);


ALTER TABLE reg_1100
    ADD CONSTRAINT reg_1100_pkey PRIMARY KEY (id);


ALTER TABLE reg_1105
    ADD CONSTRAINT reg_1105_pkey PRIMARY KEY (id);


ALTER TABLE reg_1110
    ADD CONSTRAINT reg_1110_pkey PRIMARY KEY (id);


ALTER TABLE reg_1200
    ADD CONSTRAINT reg_1200_pkey PRIMARY KEY (id);


ALTER TABLE reg_1210
    ADD CONSTRAINT reg_1210_pkey PRIMARY KEY (id);


ALTER TABLE reg_1300
    ADD CONSTRAINT reg_1300_pkey PRIMARY KEY (id);


ALTER TABLE reg_1310
    ADD CONSTRAINT reg_1310_pkey PRIMARY KEY (id);


ALTER TABLE reg_1320
    ADD CONSTRAINT reg_1320_pkey PRIMARY KEY (id);


ALTER TABLE reg_1350
    ADD CONSTRAINT reg_1350_pkey PRIMARY KEY (id);


ALTER TABLE reg_1360
    ADD CONSTRAINT reg_1360_pkey PRIMARY KEY (id);


ALTER TABLE reg_1370
    ADD CONSTRAINT reg_1370_pkey PRIMARY KEY (id);


ALTER TABLE reg_1390
    ADD CONSTRAINT reg_1390_pkey PRIMARY KEY (id);


ALTER TABLE reg_1391
    ADD CONSTRAINT reg_1391_pkey PRIMARY KEY (id);


ALTER TABLE reg_1400
    ADD CONSTRAINT reg_1400_pkey PRIMARY KEY (id);


ALTER TABLE reg_1500
    ADD CONSTRAINT reg_1500_pkey PRIMARY KEY (id);


ALTER TABLE reg_1510
    ADD CONSTRAINT reg_1510_pkey PRIMARY KEY (id);


ALTER TABLE reg_1600
    ADD CONSTRAINT reg_1600_pkey PRIMARY KEY (id);


ALTER TABLE reg_1700
    ADD CONSTRAINT reg_1700_pkey PRIMARY KEY (id);


ALTER TABLE reg_1710
    ADD CONSTRAINT reg_1710_pkey PRIMARY KEY (id);


ALTER TABLE reg_1800
    ADD CONSTRAINT reg_1800_pkey PRIMARY KEY (id);


ALTER TABLE reg_1900
    ADD CONSTRAINT reg_1900_pkey PRIMARY KEY (id);


ALTER TABLE reg_1910
    ADD CONSTRAINT reg_1910_pkey PRIMARY KEY (id);


ALTER TABLE reg_1920
    ADD CONSTRAINT reg_1920_pkey PRIMARY KEY (id);


ALTER TABLE reg_1921
    ADD CONSTRAINT reg_1921_pkey PRIMARY KEY (id);


ALTER TABLE reg_1922
    ADD CONSTRAINT reg_1922_pkey PRIMARY KEY (id);


ALTER TABLE reg_1923
    ADD CONSTRAINT reg_1923_pkey PRIMARY KEY (id);


ALTER TABLE reg_1925
    ADD CONSTRAINT reg_1925_pkey PRIMARY KEY (id);


ALTER TABLE reg_1926
    ADD CONSTRAINT reg_1926_pkey PRIMARY KEY (id);


ALTER TABLE reg_1990
    ADD CONSTRAINT reg_1990_pkey PRIMARY KEY (id);


ALTER TABLE reg_9001
    ADD CONSTRAINT reg_9001_pkey PRIMARY KEY (id);


ALTER TABLE reg_9900
    ADD CONSTRAINT reg_9900_pkey PRIMARY KEY (id);


ALTER TABLE reg_9990
    ADD CONSTRAINT reg_9990_pkey PRIMARY KEY (id);


ALTER TABLE reg_9999
    ADD CONSTRAINT reg_9999_pkey PRIMARY KEY (id);


ALTER TABLE reg_c001
    ADD CONSTRAINT reg_c001_pkey PRIMARY KEY (id);


ALTER TABLE reg_c100
    ADD CONSTRAINT reg_c100_pkey PRIMARY KEY (id);


ALTER TABLE reg_c105
    ADD CONSTRAINT reg_c105_pkey PRIMARY KEY (id);


ALTER TABLE reg_c110
    ADD CONSTRAINT reg_c110_pkey PRIMARY KEY (id);


ALTER TABLE reg_c111
    ADD CONSTRAINT reg_c111_pkey PRIMARY KEY (id);


ALTER TABLE reg_c112
    ADD CONSTRAINT reg_c112_pkey PRIMARY KEY (id);


ALTER TABLE reg_c113
    ADD CONSTRAINT reg_c113_pkey PRIMARY KEY (id);


ALTER TABLE reg_c114
    ADD CONSTRAINT reg_c114_pkey PRIMARY KEY (id);


ALTER TABLE reg_c115
    ADD CONSTRAINT reg_c115_pkey PRIMARY KEY (id);


ALTER TABLE reg_c116
    ADD CONSTRAINT reg_c116_pkey PRIMARY KEY (id);


ALTER TABLE reg_c120
    ADD CONSTRAINT reg_c120_pkey PRIMARY KEY (id);


ALTER TABLE reg_c130
    ADD CONSTRAINT reg_c130_pkey PRIMARY KEY (id);


ALTER TABLE reg_c140
    ADD CONSTRAINT reg_c140_pkey PRIMARY KEY (id);


ALTER TABLE reg_c141
    ADD CONSTRAINT reg_c141_pkey PRIMARY KEY (id);


ALTER TABLE reg_c160
    ADD CONSTRAINT reg_c160_pkey PRIMARY KEY (id);


ALTER TABLE reg_c165
    ADD CONSTRAINT reg_c165_pkey PRIMARY KEY (id);


ALTER TABLE reg_c170
    ADD CONSTRAINT reg_c170_pkey PRIMARY KEY (id);


ALTER TABLE reg_c171
    ADD CONSTRAINT reg_c171_pkey PRIMARY KEY (id);


ALTER TABLE reg_c172
    ADD CONSTRAINT reg_c172_pkey PRIMARY KEY (id);


ALTER TABLE reg_c173
    ADD CONSTRAINT reg_c173_pkey PRIMARY KEY (id);


ALTER TABLE reg_c174
    ADD CONSTRAINT reg_c174_pkey PRIMARY KEY (id);


ALTER TABLE reg_c175
    ADD CONSTRAINT reg_c175_pkey PRIMARY KEY (id);


ALTER TABLE reg_c176
    ADD CONSTRAINT reg_c176_pkey PRIMARY KEY (id);


ALTER TABLE reg_c177
    ADD CONSTRAINT reg_c177_pkey PRIMARY KEY (id);


ALTER TABLE reg_c178
    ADD CONSTRAINT reg_c178_pkey PRIMARY KEY (id);


ALTER TABLE reg_c179
    ADD CONSTRAINT reg_c179_pkey PRIMARY KEY (id);


ALTER TABLE reg_c190
    ADD CONSTRAINT reg_c190_pkey PRIMARY KEY (id);


ALTER TABLE reg_c195
    ADD CONSTRAINT reg_c195_pkey PRIMARY KEY (id);


ALTER TABLE reg_c197
    ADD CONSTRAINT reg_c197_pkey PRIMARY KEY (id);


ALTER TABLE reg_c300
    ADD CONSTRAINT reg_c300_pkey PRIMARY KEY (id);


ALTER TABLE reg_c310
    ADD CONSTRAINT reg_c310_pkey PRIMARY KEY (id);


ALTER TABLE reg_c320
    ADD CONSTRAINT reg_c320_pkey PRIMARY KEY (id);


ALTER TABLE reg_c321
    ADD CONSTRAINT reg_c321_pkey PRIMARY KEY (id);


ALTER TABLE reg_c350
    ADD CONSTRAINT reg_c350_pkey PRIMARY KEY (id);


ALTER TABLE reg_c370
    ADD CONSTRAINT reg_c370_pkey PRIMARY KEY (id);


ALTER TABLE reg_c390
    ADD CONSTRAINT reg_c390_pkey PRIMARY KEY (id);


ALTER TABLE reg_c400
    ADD CONSTRAINT reg_c400_pkey PRIMARY KEY (id);


ALTER TABLE reg_c405
    ADD CONSTRAINT reg_c405_pkey PRIMARY KEY (id);


ALTER TABLE reg_c410
    ADD CONSTRAINT reg_c410_pkey PRIMARY KEY (id);


ALTER TABLE reg_c420
    ADD CONSTRAINT reg_c420_pkey PRIMARY KEY (id);


ALTER TABLE reg_c425
    ADD CONSTRAINT reg_c425_pkey PRIMARY KEY (id);


ALTER TABLE reg_c460
    ADD CONSTRAINT reg_c460_pkey PRIMARY KEY (id);


ALTER TABLE reg_c465
    ADD CONSTRAINT reg_c465_pkey PRIMARY KEY (id);


ALTER TABLE reg_c470
    ADD CONSTRAINT reg_c470_pkey PRIMARY KEY (id);


ALTER TABLE reg_c490
    ADD CONSTRAINT reg_c490_pkey PRIMARY KEY (id);


ALTER TABLE reg_c495
    ADD CONSTRAINT reg_c495_pkey PRIMARY KEY (id);


ALTER TABLE reg_c500
    ADD CONSTRAINT reg_c500_pkey PRIMARY KEY (id);


ALTER TABLE reg_c510
    ADD CONSTRAINT reg_c510_pkey PRIMARY KEY (id);


ALTER TABLE reg_c590
    ADD CONSTRAINT reg_c590_pkey PRIMARY KEY (id);


ALTER TABLE reg_c600
    ADD CONSTRAINT reg_c600_pkey PRIMARY KEY (id);


ALTER TABLE reg_c601
    ADD CONSTRAINT reg_c601_pkey PRIMARY KEY (id);


ALTER TABLE reg_c610
    ADD CONSTRAINT reg_c610_pkey PRIMARY KEY (id);


ALTER TABLE reg_c690
    ADD CONSTRAINT reg_c690_pkey PRIMARY KEY (id);


ALTER TABLE reg_c700
    ADD CONSTRAINT reg_c700_pkey PRIMARY KEY (id);


ALTER TABLE reg_c790
    ADD CONSTRAINT reg_c790_pkey PRIMARY KEY (id);


ALTER TABLE reg_c791
    ADD CONSTRAINT reg_c791_pkey PRIMARY KEY (id);


ALTER TABLE reg_c800
    ADD CONSTRAINT reg_c800_pkey PRIMARY KEY (id);


ALTER TABLE reg_c850
    ADD CONSTRAINT reg_c850_pkey PRIMARY KEY (id);


ALTER TABLE reg_c860
    ADD CONSTRAINT reg_c860_pkey PRIMARY KEY (id);


ALTER TABLE reg_c890
    ADD CONSTRAINT reg_c890_pkey PRIMARY KEY (id);


ALTER TABLE reg_c990
    ADD CONSTRAINT reg_c990_pkey PRIMARY KEY (id);


ALTER TABLE reg_d001
    ADD CONSTRAINT reg_d001_pkey PRIMARY KEY (id);


ALTER TABLE reg_d100
    ADD CONSTRAINT reg_d100_pkey PRIMARY KEY (id);


ALTER TABLE reg_d110
    ADD CONSTRAINT reg_d110_pkey PRIMARY KEY (id);


ALTER TABLE reg_d120
    ADD CONSTRAINT reg_d120_pkey PRIMARY KEY (id);


ALTER TABLE reg_d130
    ADD CONSTRAINT reg_d130_pkey PRIMARY KEY (id);


ALTER TABLE reg_d140
    ADD CONSTRAINT reg_d140_pkey PRIMARY KEY (id);


ALTER TABLE reg_d150
    ADD CONSTRAINT reg_d150_pkey PRIMARY KEY (id);


ALTER TABLE reg_d160
    ADD CONSTRAINT reg_d160_pkey PRIMARY KEY (id);


ALTER TABLE reg_d161
    ADD CONSTRAINT reg_d161_pkey PRIMARY KEY (id);


ALTER TABLE reg_d162
    ADD CONSTRAINT reg_d162_pkey PRIMARY KEY (id);


ALTER TABLE reg_d170
    ADD CONSTRAINT reg_d170_pkey PRIMARY KEY (id);


ALTER TABLE reg_d180
    ADD CONSTRAINT reg_d180_pkey PRIMARY KEY (id);


ALTER TABLE reg_d190
    ADD CONSTRAINT reg_d190_pkey PRIMARY KEY (id);


ALTER TABLE reg_d195
    ADD CONSTRAINT reg_d195_pkey PRIMARY KEY (id);


ALTER TABLE reg_d197
    ADD CONSTRAINT reg_d197_pkey PRIMARY KEY (id);


ALTER TABLE reg_d300
    ADD CONSTRAINT reg_d300_pkey PRIMARY KEY (id);


ALTER TABLE reg_d301
    ADD CONSTRAINT reg_d301_pkey PRIMARY KEY (id);


ALTER TABLE reg_d310
    ADD CONSTRAINT reg_d310_pkey PRIMARY KEY (id);


ALTER TABLE reg_d350
    ADD CONSTRAINT reg_d350_pkey PRIMARY KEY (id);


ALTER TABLE reg_d355
    ADD CONSTRAINT reg_d355_pkey PRIMARY KEY (id);


ALTER TABLE reg_d360
    ADD CONSTRAINT reg_d360_pkey PRIMARY KEY (id);


ALTER TABLE reg_d365
    ADD CONSTRAINT reg_d365_pkey PRIMARY KEY (id);


ALTER TABLE reg_d370
    ADD CONSTRAINT reg_d370_pkey PRIMARY KEY (id);


ALTER TABLE reg_d390
    ADD CONSTRAINT reg_d390_pkey PRIMARY KEY (id);


ALTER TABLE reg_d400
    ADD CONSTRAINT reg_d400_pkey PRIMARY KEY (id);


ALTER TABLE reg_d410
    ADD CONSTRAINT reg_d410_pkey PRIMARY KEY (id);


ALTER TABLE reg_d411
    ADD CONSTRAINT reg_d411_pkey PRIMARY KEY (id);


ALTER TABLE reg_d420
    ADD CONSTRAINT reg_d420_pkey PRIMARY KEY (id);


ALTER TABLE reg_d500
    ADD CONSTRAINT reg_d500_pkey PRIMARY KEY (id);


ALTER TABLE reg_d510
    ADD CONSTRAINT reg_d510_pkey PRIMARY KEY (id);


ALTER TABLE reg_d530
    ADD CONSTRAINT reg_d530_pkey PRIMARY KEY (id);


ALTER TABLE reg_d590
    ADD CONSTRAINT reg_d590_pkey PRIMARY KEY (id);


ALTER TABLE reg_d600
    ADD CONSTRAINT reg_d600_pkey PRIMARY KEY (id);


ALTER TABLE reg_d610
    ADD CONSTRAINT reg_d610_pkey PRIMARY KEY (id);


ALTER TABLE reg_d690
    ADD CONSTRAINT reg_d690_pkey PRIMARY KEY (id);


ALTER TABLE reg_d695
    ADD CONSTRAINT reg_d695_pkey PRIMARY KEY (id);


ALTER TABLE reg_d696
    ADD CONSTRAINT reg_d696_pkey PRIMARY KEY (id);


ALTER TABLE reg_d697
    ADD CONSTRAINT reg_d697_pkey PRIMARY KEY (id);


ALTER TABLE reg_d990
    ADD CONSTRAINT reg_d990_pkey PRIMARY KEY (id);


ALTER TABLE reg_e001
    ADD CONSTRAINT reg_e001_pkey PRIMARY KEY (id);


ALTER TABLE reg_e100
    ADD CONSTRAINT reg_e100_pkey PRIMARY KEY (id);


ALTER TABLE reg_e110
    ADD CONSTRAINT reg_e110_pkey PRIMARY KEY (id);


ALTER TABLE reg_e111
    ADD CONSTRAINT reg_e111_pkey PRIMARY KEY (id);


ALTER TABLE reg_e112
    ADD CONSTRAINT reg_e112_pkey PRIMARY KEY (id);


ALTER TABLE reg_e113
    ADD CONSTRAINT reg_e113_pkey PRIMARY KEY (id);


ALTER TABLE reg_e115
    ADD CONSTRAINT reg_e115_pkey PRIMARY KEY (id);


ALTER TABLE reg_e116
    ADD CONSTRAINT reg_e116_pkey PRIMARY KEY (id);


ALTER TABLE reg_e200
    ADD CONSTRAINT reg_e200_pkey PRIMARY KEY (id);


ALTER TABLE reg_e210
    ADD CONSTRAINT reg_e210_pkey PRIMARY KEY (id);


ALTER TABLE reg_e220
    ADD CONSTRAINT reg_e220_pkey PRIMARY KEY (id);


ALTER TABLE reg_e230
    ADD CONSTRAINT reg_e230_pkey PRIMARY KEY (id);


ALTER TABLE reg_e240
    ADD CONSTRAINT reg_e240_pkey PRIMARY KEY (id);


ALTER TABLE reg_e250
    ADD CONSTRAINT reg_e250_pkey PRIMARY KEY (id);


ALTER TABLE reg_e500
    ADD CONSTRAINT reg_e500_pkey PRIMARY KEY (id);


ALTER TABLE reg_e510
    ADD CONSTRAINT reg_e510_pkey PRIMARY KEY (id);


ALTER TABLE reg_e520
    ADD CONSTRAINT reg_e520_pkey PRIMARY KEY (id);


ALTER TABLE reg_e530
    ADD CONSTRAINT reg_e530_pkey PRIMARY KEY (id);


ALTER TABLE reg_e990
    ADD CONSTRAINT reg_e990_pkey PRIMARY KEY (id);


ALTER TABLE reg_g001
    ADD CONSTRAINT reg_g001_pkey PRIMARY KEY (id);


ALTER TABLE reg_g110
    ADD CONSTRAINT reg_g110_pkey PRIMARY KEY (id);


ALTER TABLE reg_g125
    ADD CONSTRAINT reg_g125_pkey PRIMARY KEY (id);


ALTER TABLE reg_g126
    ADD CONSTRAINT reg_g126_pkey PRIMARY KEY (id);


ALTER TABLE reg_g130
    ADD CONSTRAINT reg_g130_pkey PRIMARY KEY (id);


ALTER TABLE reg_g140
    ADD CONSTRAINT reg_g140_pkey PRIMARY KEY (id);


ALTER TABLE reg_g990
    ADD CONSTRAINT reg_g990_pkey PRIMARY KEY (id);


ALTER TABLE reg_h001
    ADD CONSTRAINT reg_h001_pkey PRIMARY KEY (id);


ALTER TABLE reg_h005
    ADD CONSTRAINT reg_h005_pkey PRIMARY KEY (id);


ALTER TABLE reg_h010
    ADD CONSTRAINT reg_h010_pkey PRIMARY KEY (id);


ALTER TABLE reg_h020
    ADD CONSTRAINT reg_h020_pkey PRIMARY KEY (id);


ALTER TABLE reg_h990
    ADD CONSTRAINT reg_h990_pkey PRIMARY KEY (id);


ALTER TABLE reg_k001
    ADD CONSTRAINT reg_k001_pkey PRIMARY KEY (id);

ALTER TABLE reg_k100
    ADD CONSTRAINT reg_k100_pkey PRIMARY KEY (id);

ALTER TABLE reg_k200
    ADD CONSTRAINT reg_k200_pkey PRIMARY KEY (id);

ALTER TABLE reg_k220
    ADD CONSTRAINT reg_k220_pkey PRIMARY KEY (id);

ALTER TABLE reg_k230
    ADD CONSTRAINT reg_k230_pkey PRIMARY KEY (id);

ALTER TABLE reg_k235
    ADD CONSTRAINT reg_k235_pkey PRIMARY KEY (id);

ALTER TABLE reg_k250
    ADD CONSTRAINT reg_k250_pkey PRIMARY KEY (id);

ALTER TABLE reg_k255
    ADD CONSTRAINT reg_k255_pkey PRIMARY KEY (id);

ALTER TABLE reg_k990
    ADD CONSTRAINT reg_k990_pkey PRIMARY KEY (id);


CREATE INDEX reg_0000_idx_chave_duplicidade ON reg_0000 (dt_ini, dt_fin, cnpj, cpf, ie);


CREATE INDEX reg_0000_idx_id_pai ON reg_0000 (id_pai);


CREATE INDEX reg_0001_idx_id_pai ON reg_0001 (id_pai);


CREATE INDEX reg_0005_idx_id_pai ON reg_0005 (id_pai);


CREATE INDEX reg_0015_idx_chave_duplicidade ON reg_0015 (uf_st);


CREATE INDEX reg_0015_idx_id_pai ON reg_0015 (id_pai);


CREATE INDEX reg_0100_idx_id_pai ON reg_0100 (id_pai);


CREATE INDEX reg_0150_idx_chave_duplicidade ON reg_0150 (cod_part);


CREATE INDEX reg_0150_idx_id_pai ON reg_0150 (id_pai);


CREATE INDEX reg_0175_idx_chave_duplicidade ON reg_0175 (dt_alt, nr_campo);


CREATE INDEX reg_0175_idx_id_pai ON reg_0175 (id_pai);


CREATE INDEX reg_0190_idx_chave_duplicidade ON reg_0190 (unid);


CREATE INDEX reg_0190_idx_id_pai ON reg_0190 (id_pai);


CREATE INDEX reg_0200_idx_chave_duplicidade ON reg_0200 (cod_item);


CREATE INDEX reg_0200_idx_id_pai ON reg_0200 (id_pai);


CREATE INDEX reg_0200_idx_unid_inv ON reg_0200 (unid_inv);


CREATE INDEX reg_0205_idx_chave_duplicidade ON reg_0205 (descr_ant_item, dt_ini, dt_fim);


CREATE INDEX reg_0205_idx_dt_fim ON reg_0205 (dt_fim);


CREATE INDEX reg_0205_idx_dt_ini ON reg_0205 (dt_ini);


CREATE INDEX reg_0205_idx_id_pai ON reg_0205 (id_pai);


CREATE INDEX reg_0206_idx_id_pai ON reg_0206 (id_pai);


CREATE INDEX reg_0220_idx_chave_duplicidade ON reg_0220 (unid_conv);


CREATE INDEX reg_0220_idx_id_pai ON reg_0220 (id_pai);


CREATE INDEX reg_0300_idx_chave_duplicidade ON reg_0300 (cod_ind_bem);


CREATE INDEX reg_0300_idx_cod_prnc ON reg_0300 (cod_prnc);


CREATE INDEX reg_0300_idx_id_pai ON reg_0300 (id_pai);


CREATE INDEX reg_0305_idx_id_pai ON reg_0305 (id_pai);


CREATE INDEX reg_0400_idx_chave_duplicidade ON reg_0400 (cod_nat);


CREATE INDEX reg_0400_idx_id_pai ON reg_0400 (id_pai);


CREATE INDEX reg_0450_idx_chave_duplicidade ON reg_0450 (cod_inf);


CREATE INDEX reg_0450_idx_id_pai ON reg_0450 (id_pai);


CREATE INDEX reg_0460_idx_chave_duplicidade ON reg_0460 (cod_obs);


CREATE INDEX reg_0460_idx_id_pai ON reg_0460 (id_pai);


CREATE INDEX reg_0500_idx_chave_duplicidade ON reg_0500 (dt_alt, cod_cta);


CREATE INDEX reg_0500_idx_id_pai ON reg_0500 (id_pai);


CREATE INDEX reg_0600_idx_chave_duplicidade ON reg_0600 (dt_alt, cod_ccus);


CREATE INDEX reg_0600_idx_id_pai ON reg_0600 (id_pai);


CREATE INDEX reg_0990_idx_id_pai ON reg_0990 (id_pai);


CREATE INDEX reg_1001_idx_id_pai ON reg_1001 (id_pai);


CREATE INDEX reg_1010_idx_id_pai ON reg_1010 (id_pai);


CREATE INDEX reg_1100_idx_id_pai ON reg_1100 (id_pai);


CREATE INDEX reg_1105_idx_cod_item ON reg_1105 (cod_item);


CREATE INDEX reg_1105_idx_id_pai ON reg_1105 (id_pai);


CREATE INDEX reg_1110_idx_cod_part ON reg_1110 (cod_part);


CREATE INDEX reg_1110_idx_id_pai ON reg_1110 (id_pai);


CREATE INDEX reg_1110_idx_unid ON reg_1110 (unid);


CREATE INDEX reg_1200_idx_chave_duplicidade ON reg_1200 (cod_aj_apur);


CREATE INDEX reg_1200_idx_id_pai ON reg_1200 (id_pai);


CREATE INDEX reg_1210_idx_chave_duplicidade ON reg_1210 (tipo_util, nr_doc);


CREATE INDEX reg_1210_idx_id_pai ON reg_1210 (id_pai);


CREATE INDEX reg_1300_idx_chave_duplicidade ON reg_1300 (cod_item, dt_fech);


CREATE INDEX reg_1300_idx_id_pai ON reg_1300 (id_pai);


CREATE INDEX reg_1310_idx_chave_duplicidade ON reg_1310 (num_tanque);


CREATE INDEX reg_1310_idx_id_pai ON reg_1310 (id_pai);


CREATE INDEX reg_1320_idx_id_pai ON reg_1320 (id_pai);


CREATE INDEX reg_1350_idx_chave_duplicidade ON reg_1350 (serie);


CREATE INDEX reg_1350_idx_id_pai ON reg_1350 (id_pai);


CREATE INDEX reg_1360_idx_chave_duplicidade ON reg_1360 (num_lacre);


CREATE INDEX reg_1360_idx_id_pai ON reg_1360 (id_pai);


CREATE INDEX reg_1370_idx_chave_duplicidade ON reg_1370 (num_bico, cod_item);


CREATE INDEX reg_1370_idx_id_pai ON reg_1370 (id_pai);


CREATE INDEX reg_1390_idx_chave_duplicidade ON reg_1390 (cod_prod);


CREATE INDEX reg_1390_idx_id_pai ON reg_1390 (id_pai);


CREATE INDEX reg_1391_idx_chave_duplicidade ON reg_1391 (dt_registro);


CREATE INDEX reg_1391_idx_id_pai ON reg_1391 (id_pai);


CREATE INDEX reg_1400_idx_chave_duplicidade ON reg_1400 (cod_item, mun);


CREATE INDEX reg_1400_idx_id_pai ON reg_1400 (id_pai);


CREATE INDEX reg_1500_idx_chave_duplicidade ON reg_1500 (ind_oper, ind_emit, cod_part, ser, sub, num_doc, dt_doc);


CREATE INDEX reg_1500_idx_id_pai ON reg_1500 (id_pai);


CREATE INDEX reg_1510_idx_chave_duplicidade ON reg_1510 (num_item);


CREATE INDEX reg_1510_idx_id_pai ON reg_1510 (id_pai);


CREATE INDEX reg_1600_idx_chave_duplicidade ON reg_1600 (cod_part);


CREATE INDEX reg_1600_idx_id_pai ON reg_1600 (id_pai);


CREATE INDEX reg_1700_idx_id_pai ON reg_1700 (id_pai);


CREATE INDEX reg_1710_idx_id_pai ON reg_1710 (id_pai);


CREATE INDEX reg_1800_idx_id_pai ON reg_1800 (id_pai);


CREATE INDEX reg_1900_idx_chave_duplicidade ON reg_1900 (ind_apur_icms);


CREATE INDEX reg_1900_idx_id_pai ON reg_1900 (id_pai);


CREATE INDEX reg_1910_idx_chave_duplicidade ON reg_1910 (dt_ini, dt_fin);


CREATE INDEX reg_1910_idx_id_pai ON reg_1910 (id_pai);


CREATE INDEX reg_1920_idx_id_pai ON reg_1920 (id_pai);


CREATE INDEX reg_1921_idx_id_pai ON reg_1921 (id_pai);


CREATE INDEX reg_1922_idx_id_pai ON reg_1922 (id_pai);


CREATE INDEX reg_1923_idx_cod_item ON reg_1923 (cod_item);


CREATE INDEX reg_1923_idx_cod_part ON reg_1923 (cod_part);


CREATE INDEX reg_1923_idx_id_pai ON reg_1923 (id_pai);


CREATE INDEX reg_1925_idx_id_pai ON reg_1925 (id_pai);


CREATE INDEX reg_1926_idx_id_pai ON reg_1926 (id_pai);


CREATE INDEX reg_1990_idx_id_pai ON reg_1990 (id_pai);


CREATE INDEX reg_9001_idx_id_pai ON reg_9001 (id_pai);


CREATE INDEX reg_9900_idx_chave_duplicidade ON reg_9900 (reg_blc);


CREATE INDEX reg_9900_idx_id_pai ON reg_9900 (id_pai);


CREATE INDEX reg_9990_idx_id_pai ON reg_9990 (id_pai);


CREATE INDEX reg_9999_idx_id_pai ON reg_9999 (id_pai);


CREATE INDEX reg_c001_idx_id_pai ON reg_c001 (id_pai);


CREATE INDEX reg_c100_idx_chave_duplicidade ON reg_c100 (ind_emit, ind_oper, num_doc, cod_mod, cod_sit, ser, chv_nfe, cod_part);


CREATE INDEX reg_c100_idx_cod_part ON reg_c100 (cod_part);


CREATE INDEX reg_c100_idx_id_pai ON reg_c100 (id_pai);


CREATE INDEX reg_c105_idx_id_pai ON reg_c105 (id_pai);


CREATE INDEX reg_c110_idx_chave_duplicidade ON reg_c110 (cod_inf);


CREATE INDEX reg_c110_idx_id_pai ON reg_c110 (id_pai);


CREATE INDEX reg_c111_idx_chave_duplicidade ON reg_c111 (num_proc);


CREATE INDEX reg_c111_idx_id_pai ON reg_c111 (id_pai);


CREATE INDEX reg_c112_idx_id_pai ON reg_c112 (id_pai);


CREATE INDEX reg_c113_idx_chave_duplicidade ON reg_c113 (ind_emit, num_doc, cod_mod, ser, cod_part);


CREATE INDEX reg_c113_idx_cod_part ON reg_c113 (cod_part);


CREATE INDEX reg_c113_idx_id_pai ON reg_c113 (id_pai);


CREATE INDEX reg_c114_idx_chave_duplicidade ON reg_c114 (num_doc, dt_doc, ecf_fab);


CREATE INDEX reg_c114_idx_id_pai ON reg_c114 (id_pai);


CREATE INDEX reg_c115_idx_id_pai ON reg_c115 (id_pai);


CREATE INDEX reg_c116_idx_chave_duplicidade ON reg_c116 (nr_sat, num_cfe);


CREATE INDEX reg_c116_idx_id_pai ON reg_c116 (id_pai);


CREATE INDEX reg_c120_idx_chave_duplicidade ON reg_c120 (num_doc_imp, num_acdraw);


CREATE INDEX reg_c120_idx_id_pai ON reg_c120 (id_pai);


CREATE INDEX reg_c130_idx_id_pai ON reg_c130 (id_pai);


CREATE INDEX reg_c140_idx_id_pai ON reg_c140 (id_pai);


CREATE INDEX reg_c141_idx_chave_duplicidade ON reg_c141 (num_parc);


CREATE INDEX reg_c141_idx_id_pai ON reg_c141 (id_pai);


CREATE INDEX reg_c160_idx_cod_part ON reg_c160 (cod_part);


CREATE INDEX reg_c160_idx_id_pai ON reg_c160 (id_pai);


CREATE INDEX reg_c165_idx_chave_duplicidade ON reg_c165 (cod_part, veic_id);


CREATE INDEX reg_c165_idx_cod_part ON reg_c165 (cod_part);


CREATE INDEX reg_c165_idx_id_pai ON reg_c165 (id_pai);


CREATE INDEX reg_c170_idx_chave_duplicidade ON reg_c170 (num_item);


CREATE INDEX reg_c170_idx_cod_item ON reg_c170 (cod_item);


CREATE INDEX reg_c170_idx_cod_nat ON reg_c170 (cod_nat);


CREATE INDEX reg_c170_idx_id_pai ON reg_c170 (id_pai);


CREATE INDEX reg_c170_idx_unid ON reg_c170 (unid);


CREATE INDEX reg_c171_idx_chave_duplicidade ON reg_c171 (num_tanque);


CREATE INDEX reg_c171_idx_id_pai ON reg_c171 (id_pai);


CREATE INDEX reg_c172_idx_id_pai ON reg_c172 (id_pai);


CREATE INDEX reg_c173_idx_chave_duplicidade ON reg_c173 (lote_med);


CREATE INDEX reg_c173_idx_id_pai ON reg_c173 (id_pai);


CREATE INDEX reg_c174_idx_chave_duplicidade ON reg_c174 (num_arm);


CREATE INDEX reg_c174_idx_id_pai ON reg_c174 (id_pai);


CREATE INDEX reg_c175_idx_chave_duplicidade ON reg_c175 (chassi_veic);


CREATE INDEX reg_c175_idx_id_pai ON reg_c175 (id_pai);


CREATE INDEX reg_c176_idx_cod_part_ult_e ON reg_c176 (cod_part_ult_e);


CREATE INDEX reg_c176_idx_id_pai ON reg_c176 (id_pai);


CREATE INDEX reg_c177_idx_id_pai ON reg_c177 (id_pai);


CREATE INDEX reg_c178_idx_id_pai ON reg_c178 (id_pai);


CREATE INDEX reg_c179_idx_id_pai ON reg_c179 (id_pai);


CREATE INDEX reg_c190_idx_chave_duplicidade ON reg_c190 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c190_idx_cod_obs ON reg_c190 (cod_obs);


CREATE INDEX reg_c190_idx_id_pai ON reg_c190 (id_pai);


CREATE INDEX reg_c195_idx_chave_duplicidade ON reg_c195 (cod_obs);


CREATE INDEX reg_c195_idx_id_pai ON reg_c195 (id_pai);


CREATE INDEX reg_c197_idx_chave_duplicidade ON reg_c197 (cod_aj, cod_item);


CREATE INDEX reg_c197_idx_cod_item ON reg_c197 (cod_item);


CREATE INDEX reg_c197_idx_id_pai ON reg_c197 (id_pai);


CREATE INDEX reg_c300_idx_chave_duplicidade ON reg_c300 (ser, sub, num_doc_ini, num_doc_fin);


CREATE INDEX reg_c300_idx_id_pai ON reg_c300 (id_pai);


CREATE INDEX reg_c300_idx_num_doc_fin ON reg_c300 (num_doc_fin);


CREATE INDEX reg_c300_idx_num_doc_ini ON reg_c300 (num_doc_ini);


CREATE INDEX reg_c300_idx_ser_sub ON reg_c300 (ser, sub);


CREATE INDEX reg_c310_idx_chave_duplicidade ON reg_c310 (num_doc_canc);


CREATE INDEX reg_c310_idx_id_pai ON reg_c310 (id_pai);


CREATE INDEX reg_c320_idx_chave_duplicidade ON reg_c320 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c320_idx_cod_obs ON reg_c320 (cod_obs);


CREATE INDEX reg_c320_idx_id_pai ON reg_c320 (id_pai);


CREATE INDEX reg_c321_idx_chave_duplicidade ON reg_c321 (cod_item);


CREATE INDEX reg_c321_idx_id_pai ON reg_c321 (id_pai);


CREATE INDEX reg_c321_idx_unid ON reg_c321 (unid);


CREATE INDEX reg_c350_idx_chave_duplicidade ON reg_c350 (num_doc, ser, sub_ser);


CREATE INDEX reg_c350_idx_id_pai ON reg_c350 (id_pai);


CREATE INDEX reg_c370_idx_chave_duplicidade ON reg_c370 (num_item, cod_item);


CREATE INDEX reg_c370_idx_id_pai ON reg_c370 (id_pai);


CREATE INDEX reg_c390_idx_chave_duplicidade ON reg_c390 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c390_idx_cod_obs ON reg_c390 (cod_obs);


CREATE INDEX reg_c390_idx_id_pai ON reg_c390 (id_pai);


CREATE INDEX reg_c400_idx_chave_duplicidade ON reg_c400 (cod_mod, ecf_mod, ecf_fab);


CREATE INDEX reg_c400_idx_id_pai ON reg_c400 (id_pai);


CREATE INDEX reg_c405_idx_chave_duplicidade ON reg_c405 (dt_doc, cro, crz);


CREATE INDEX reg_c405_idx_id_pai ON reg_c405 (id_pai);


CREATE INDEX reg_c410_idx_id_pai ON reg_c410 (id_pai);


CREATE INDEX reg_c420_idx_chave_duplicidade ON reg_c420 (cod_tot_par, nr_tot);


CREATE INDEX reg_c420_idx_id_pai ON reg_c420 (id_pai);


CREATE INDEX reg_c425_idx_chave_duplicidade ON reg_c425 (cod_item);


CREATE INDEX reg_c425_idx_id_pai ON reg_c425 (id_pai);


CREATE INDEX reg_c425_idx_unid ON reg_c425 (unid);


CREATE INDEX reg_c460_idx_chave_duplicidade ON reg_c460 (cod_mod, num_doc, dt_doc);


CREATE INDEX reg_c460_idx_id_pai ON reg_c460 (id_pai);


CREATE INDEX reg_c465_idx_chave_duplicidade ON reg_c465 (chv_cfe);


CREATE INDEX reg_c465_idx_id_pai ON reg_c465 (id_pai);


CREATE INDEX reg_c470_idx_cod_item ON reg_c470 (cod_item);


CREATE INDEX reg_c470_idx_id_pai ON reg_c470 (id_pai);


CREATE INDEX reg_c470_idx_unid ON reg_c470 (unid);


CREATE INDEX reg_c490_idx_chave_duplicidade ON reg_c490 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c490_idx_cod_obs ON reg_c490 (cod_obs);


CREATE INDEX reg_c490_idx_id_pai ON reg_c490 (id_pai);


CREATE INDEX reg_c495_idx_chave_duplicidade ON reg_c495 (cod_item, aliq_icms);


CREATE INDEX reg_c495_idx_cod_item ON reg_c495 (cod_item);


CREATE INDEX reg_c495_idx_id_pai ON reg_c495 (id_pai);


CREATE INDEX reg_c495_idx_unid ON reg_c495 (unid);


CREATE INDEX reg_c500_idx_chave_duplicidade ON reg_c500 (ind_oper, ind_emit, cod_part, cod_mod, ser, num_doc, dt_doc);


CREATE INDEX reg_c500_idx_cod_inf ON reg_c500 (cod_inf);


CREATE INDEX reg_c500_idx_cod_part ON reg_c500 (cod_part);


CREATE INDEX reg_c500_idx_id_pai ON reg_c500 (id_pai);


CREATE INDEX reg_c510_idx_chave_duplicidade ON reg_c510 (num_item);


CREATE INDEX reg_c510_idx_cod_item ON reg_c510 (cod_item);


CREATE INDEX reg_c510_idx_cod_part ON reg_c510 (cod_part);


CREATE INDEX reg_c510_idx_id_pai ON reg_c510 (id_pai);


CREATE INDEX reg_c510_idx_unid ON reg_c510 (unid);


CREATE INDEX reg_c590_idx_chave_duplicidade ON reg_c590 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c590_idx_cod_obs ON reg_c590 (cod_obs);


CREATE INDEX reg_c590_idx_id_pai ON reg_c590 (id_pai);


CREATE INDEX reg_c600_idx_chave_duplicidade ON reg_c600 (cod_mod, cod_mun, ser, sub, cod_cons, dt_doc);


CREATE INDEX reg_c600_idx_id_pai ON reg_c600 (id_pai);


CREATE INDEX reg_c601_idx_chave_duplicidade ON reg_c601 (num_doc_canc);


CREATE INDEX reg_c601_idx_id_pai ON reg_c601 (id_pai);


CREATE INDEX reg_c610_idx_chave_duplicidade ON reg_c610 (cod_class, cod_item, aliq_icms);


CREATE INDEX reg_c610_idx_cod_item ON reg_c610 (cod_item);


CREATE INDEX reg_c610_idx_id_pai ON reg_c610 (id_pai);


CREATE INDEX reg_c610_idx_unid ON reg_c610 (unid);


CREATE INDEX reg_c690_idx_chave_duplicidade ON reg_c690 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c690_idx_cod_obs ON reg_c690 (cod_obs);


CREATE INDEX reg_c690_idx_id_pai ON reg_c690 (id_pai);


CREATE INDEX reg_c700_idx_chave_duplicidade ON reg_c700 (cod_mod, ser, nro_ord_ini, nro_ord_fin);


CREATE INDEX reg_c700_idx_id_pai ON reg_c700 (id_pai);


CREATE INDEX reg_c700_idx_nro_ord_fin ON reg_c700 (nro_ord_fin);


CREATE INDEX reg_c700_idx_nro_ord_ini ON reg_c700 (nro_ord_ini);


CREATE INDEX reg_c700_idx_ser ON reg_c700 (ser);


CREATE INDEX reg_c790_idx_chave_duplicidade ON reg_c790 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c790_idx_cod_obs ON reg_c790 (cod_obs);


CREATE INDEX reg_c790_idx_id_pai ON reg_c790 (id_pai);


CREATE INDEX reg_c791_idx_chave_duplicidade ON reg_c791 (uf);


CREATE INDEX reg_c791_idx_id_pai ON reg_c791 (id_pai);


CREATE INDEX reg_c800_idx_chave_duplicidade ON reg_c800 (cod_sit, nr_sat, num_cfe);


CREATE INDEX reg_c800_idx_id_pai ON reg_c800 (id_pai);


CREATE INDEX reg_c850_idx_chave_duplicidade ON reg_c850 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c850_idx_cod_obs ON reg_c850 (cod_obs);


CREATE INDEX reg_c850_idx_id_pai ON reg_c850 (id_pai);


CREATE INDEX reg_c860_idx_chave_duplicidade ON reg_c860 (nr_sat, dt_doc);


CREATE INDEX reg_c860_idx_id_pai ON reg_c860 (id_pai);


CREATE INDEX reg_c890_idx_chave_duplicidade ON reg_c890 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_c890_idx_cod_obs ON reg_c890 (cod_obs);


CREATE INDEX reg_c890_idx_id_pai ON reg_c890 (id_pai);


CREATE INDEX reg_c990_idx_id_pai ON reg_c990 (id_pai);


CREATE INDEX reg_d001_idx_id_pai ON reg_d001 (id_pai);


CREATE INDEX reg_d100_idx_chave_duplicidade ON reg_d100 (ind_emit, num_doc, cod_mod, cod_sit, ser, sub, cod_part);


CREATE INDEX reg_d100_idx_cod_inf ON reg_d100 (cod_inf);


CREATE INDEX reg_d100_idx_cod_part ON reg_d100 (cod_part);


CREATE INDEX reg_d100_idx_id_pai ON reg_d100 (id_pai);


CREATE INDEX reg_d110_idx_chave_duplicidade ON reg_d110 (num_item);


CREATE INDEX reg_d110_idx_cod_item ON reg_d110 (cod_item);


CREATE INDEX reg_d110_idx_id_pai ON reg_d110 (id_pai);


CREATE INDEX reg_d120_idx_id_pai ON reg_d120 (id_pai);


CREATE INDEX reg_d130_idx_cod_part_consg ON reg_d130 (cod_part_consg);


CREATE INDEX reg_d130_idx_cod_part_red ON reg_d130 (cod_part_red);


CREATE INDEX reg_d130_idx_id_pai ON reg_d130 (id_pai);


CREATE INDEX reg_d140_idx_cod_part_consg ON reg_d140 (cod_part_consg);


CREATE INDEX reg_d140_idx_id_pai ON reg_d140 (id_pai);


CREATE INDEX reg_d150_idx_id_pai ON reg_d150 (id_pai);


CREATE INDEX reg_d160_idx_id_pai ON reg_d160 (id_pai);


CREATE INDEX reg_d161_idx_id_pai ON reg_d161 (id_pai);


CREATE INDEX reg_d162_idx_chave_duplicidade ON reg_d162 (num_doc, ser, cod_mod);


CREATE INDEX reg_d162_idx_id_pai ON reg_d162 (id_pai);


CREATE INDEX reg_d170_idx_cod_part_consg ON reg_d170 (cod_part_consg);


CREATE INDEX reg_d170_idx_cod_part_red ON reg_d170 (cod_part_red);


CREATE INDEX reg_d170_idx_id_pai ON reg_d170 (id_pai);


CREATE INDEX reg_d180_idx_id_pai ON reg_d180 (id_pai);


CREATE INDEX reg_d190_idx_chave_duplicidade ON reg_d190 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d190_idx_cod_obs ON reg_d190 (cod_obs);


CREATE INDEX reg_d190_idx_id_pai ON reg_d190 (id_pai);


CREATE INDEX reg_d195_idx_chave_duplicidade ON reg_d195 (cod_obs);


CREATE INDEX reg_d195_idx_id_pai ON reg_d195 (id_pai);


CREATE INDEX reg_d197_idx_chave_duplicidade ON reg_d197 (cod_aj, cod_item);


CREATE INDEX reg_d197_idx_cod_item ON reg_d197 (cod_item);


CREATE INDEX reg_d197_idx_id_pai ON reg_d197 (id_pai);


CREATE INDEX reg_d300_idx_chave_duplicidade ON reg_d300 (cod_mod, ser, sub, num_doc_ini, num_doc_fin);


CREATE INDEX reg_d300_idx_cod_mod_ser_sub ON reg_d300 (cod_mod, ser, sub);


CREATE INDEX reg_d300_idx_cod_obs ON reg_d300 (cod_obs);


CREATE INDEX reg_d300_idx_id_pai ON reg_d300 (id_pai);


CREATE INDEX reg_d300_idx_num_doc_fin ON reg_d300 (num_doc_fin);


CREATE INDEX reg_d300_idx_num_doc_ini ON reg_d300 (num_doc_ini);


CREATE INDEX reg_d301_idx_chave_duplicidade ON reg_d301 (num_doc_canc);


CREATE INDEX reg_d301_idx_id_pai ON reg_d301 (id_pai);


CREATE INDEX reg_d310_idx_chave_duplicidade ON reg_d310 (cod_mun_orig);


CREATE INDEX reg_d310_idx_id_pai ON reg_d310 (id_pai);


CREATE INDEX reg_d350_idx_chave_duplicidade ON reg_d350 (cod_mod, ecf_mod, ecf_fab);


CREATE INDEX reg_d350_idx_id_pai ON reg_d350 (id_pai);


CREATE INDEX reg_d355_idx_chave_duplicidade ON reg_d355 (dt_doc, cro, crz);


CREATE INDEX reg_d355_idx_id_pai ON reg_d355 (id_pai);


CREATE INDEX reg_d360_idx_id_pai ON reg_d360 (id_pai);


CREATE INDEX reg_d365_idx_chave_duplicidade ON reg_d365 (cod_tot_par, nr_tot);


CREATE INDEX reg_d365_idx_id_pai ON reg_d365 (id_pai);


CREATE INDEX reg_d370_idx_id_pai ON reg_d370 (id_pai);


CREATE INDEX reg_d390_idx_chave_duplicidade ON reg_d390 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d390_idx_cod_obs ON reg_d390 (cod_obs);


CREATE INDEX reg_d390_idx_id_pai ON reg_d390 (id_pai);


CREATE INDEX reg_d400_idx_chave_duplicidade ON reg_d400 (cod_part, ser, sub, num_doc, cod_sit);


CREATE INDEX reg_d400_idx_cod_part ON reg_d400 (cod_part);


CREATE INDEX reg_d400_idx_id_pai ON reg_d400 (id_pai);


CREATE INDEX reg_d410_idx_chave_duplicidade ON reg_d410 (cod_mod, ser, sub, num_doc_ini, num_doc_fin, cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d410_idx_id_pai ON reg_d410 (id_pai);


CREATE INDEX reg_d411_idx_id_pai ON reg_d411 (id_pai);


CREATE INDEX reg_d420_idx_id_pai ON reg_d420 (id_pai);


CREATE INDEX reg_d500_idx_chave_duplicidade ON reg_d500 (ind_oper, ind_emit, cod_part, cod_mod, ser, num_doc, dt_doc);


CREATE INDEX reg_d500_idx_cod_inf ON reg_d500 (cod_inf);


CREATE INDEX reg_d500_idx_cod_part ON reg_d500 (cod_part);


CREATE INDEX reg_d500_idx_id_pai ON reg_d500 (id_pai);


CREATE INDEX reg_d510_idx_chave_duplicidade ON reg_d510 (num_item);


CREATE INDEX reg_d510_idx_cod_item ON reg_d510 (cod_item);


CREATE INDEX reg_d510_idx_cod_part ON reg_d510 (cod_part);


CREATE INDEX reg_d510_idx_id_pai ON reg_d510 (id_pai);


CREATE INDEX reg_d510_idx_unid ON reg_d510 (unid);


CREATE INDEX reg_d530_idx_id_pai ON reg_d530 (id_pai);


CREATE INDEX reg_d590_idx_chave_duplicidade ON reg_d590 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d590_idx_cod_obs ON reg_d590 (cod_obs);


CREATE INDEX reg_d590_idx_id_pai ON reg_d590 (id_pai);


CREATE INDEX reg_d600_idx_chave_duplicidade ON reg_d600 (cod_mod, cod_mun, ser, sub, cod_cons, dt_doc);


CREATE INDEX reg_d600_idx_id_pai ON reg_d600 (id_pai);


CREATE INDEX reg_d610_idx_chave_duplicidade ON reg_d610 (cod_item, cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d610_idx_id_pai ON reg_d610 (id_pai);


CREATE INDEX reg_d610_idx_unid ON reg_d610 (unid);


CREATE INDEX reg_d690_idx_chave_duplicidade ON reg_d690 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d690_idx_cod_obs ON reg_d690 (cod_obs);


CREATE INDEX reg_d690_idx_id_pai ON reg_d690 (id_pai);


CREATE INDEX reg_d695_idx_chave_duplicidade ON reg_d695 (cod_mod, ser, nro_ord_ini, nro_ord_fin);


CREATE INDEX reg_d695_idx_id_pai ON reg_d695 (id_pai);


CREATE INDEX reg_d695_idx_nro_ord_fin ON reg_d695 (nro_ord_fin);


CREATE INDEX reg_d695_idx_nro_ord_ini ON reg_d695 (nro_ord_ini);


CREATE INDEX reg_d695_idx_ser ON reg_d695 (ser);


CREATE INDEX reg_d696_idx_chave_duplicidade ON reg_d696 (cst_icms, cfop, aliq_icms);


CREATE INDEX reg_d696_idx_cod_obs ON reg_d696 (cod_obs);


CREATE INDEX reg_d696_idx_id_pai ON reg_d696 (id_pai);


CREATE INDEX reg_d697_idx_chave_duplicidade ON reg_d697 (uf);


CREATE INDEX reg_d697_idx_id_pai ON reg_d697 (id_pai);


CREATE INDEX reg_d990_idx_id_pai ON reg_d990 (id_pai);


CREATE INDEX reg_e001_idx_id_pai ON reg_e001 (id_pai);


CREATE INDEX reg_e100_idx_chave_duplicidade ON reg_e100 (dt_ini, dt_fin);


CREATE INDEX reg_e100_idx_dt_fin ON reg_e100 (dt_fin);


CREATE INDEX reg_e100_idx_dt_ini ON reg_e100 (dt_ini);


CREATE INDEX reg_e100_idx_id_pai ON reg_e100 (id_pai);


CREATE INDEX reg_e110_idx_id_pai ON reg_e110 (id_pai);


CREATE INDEX reg_e111_idx_id_pai ON reg_e111 (id_pai);


CREATE INDEX reg_e112_idx_id_pai ON reg_e112 (id_pai);


CREATE INDEX reg_e113_idx_cod_item ON reg_e113 (cod_item);


CREATE INDEX reg_e113_idx_cod_part ON reg_e113 (cod_part);


CREATE INDEX reg_e113_idx_id_pai ON reg_e113 (id_pai);


CREATE INDEX reg_e115_idx_id_pai ON reg_e115 (id_pai);


CREATE INDEX reg_e116_idx_id_pai ON reg_e116 (id_pai);


CREATE INDEX reg_e200_idx_chave_duplicidade ON reg_e200 (uf, dt_ini, dt_fin);


CREATE INDEX reg_e200_idx_dt_fin ON reg_e200 (dt_fin);


CREATE INDEX reg_e200_idx_dt_ini ON reg_e200 (dt_ini);


CREATE INDEX reg_e200_idx_id_pai ON reg_e200 (id_pai);


CREATE INDEX reg_e200_idx_uf ON reg_e200 (uf);


CREATE INDEX reg_e210_idx_id_pai ON reg_e210 (id_pai);


CREATE INDEX reg_e220_idx_id_pai ON reg_e220 (id_pai);


CREATE INDEX reg_e230_idx_id_pai ON reg_e230 (id_pai);


CREATE INDEX reg_e240_idx_cod_item ON reg_e240 (cod_item);


CREATE INDEX reg_e240_idx_cod_part ON reg_e240 (cod_part);


CREATE INDEX reg_e240_idx_id_pai ON reg_e240 (id_pai);


CREATE INDEX reg_e250_idx_id_pai ON reg_e250 (id_pai);


CREATE INDEX reg_e500_idx_chave_duplicidade ON reg_e500 (ind_apur, dt_ini, dt_fin);


CREATE INDEX reg_e500_idx_id_pai ON reg_e500 (id_pai);


CREATE INDEX reg_e510_idx_chave_duplicidade ON reg_e510 (cfop, cst_ipi);


CREATE INDEX reg_e510_idx_id_pai ON reg_e510 (id_pai);


CREATE INDEX reg_e520_idx_id_pai ON reg_e520 (id_pai);


CREATE INDEX reg_e530_idx_id_pai ON reg_e530 (id_pai);


CREATE INDEX reg_e990_idx_id_pai ON reg_e990 (id_pai);


CREATE INDEX reg_g001_idx_id_pai ON reg_g001 (id_pai);


CREATE INDEX reg_g110_idx_chave_duplicidade ON reg_g110 (dt_ini, dt_fin);


CREATE INDEX reg_g110_idx_id_pai ON reg_g110 (id_pai);


CREATE INDEX reg_g125_idx_chave_duplicidade ON reg_g125 (cod_ind_bem, tipo_mov);


CREATE INDEX reg_g125_idx_id_pai ON reg_g125 (id_pai);


CREATE INDEX reg_g126_idx_chave_duplicidade ON reg_g126 (dt_ini, dt_fin);


CREATE INDEX reg_g126_idx_dt_fin ON reg_g126 (dt_fin);


CREATE INDEX reg_g126_idx_dt_ini ON reg_g126 (dt_ini);


CREATE INDEX reg_g126_idx_id_pai ON reg_g126 (id_pai);


CREATE INDEX reg_g130_idx_chave_duplicidade ON reg_g130 (ind_emit, cod_part, cod_mod, serie, num_doc);


CREATE INDEX reg_g130_idx_cod_part ON reg_g130 (cod_part);


CREATE INDEX reg_g130_idx_id_pai ON reg_g130 (id_pai);


CREATE INDEX reg_g140_idx_chave_duplicidade ON reg_g140 (num_item);


CREATE INDEX reg_g140_idx_cod_item ON reg_g140 (cod_item);


CREATE INDEX reg_g140_idx_id_pai ON reg_g140 (id_pai);


CREATE INDEX reg_g990_idx_id_pai ON reg_g990 (id_pai);


CREATE INDEX reg_h001_idx_id_pai ON reg_h001 (id_pai);


CREATE INDEX reg_h005_idx_chave_duplicidade ON reg_h005 (dt_inv, mot_inv);


CREATE INDEX reg_h005_idx_id_pai ON reg_h005 (id_pai);


CREATE INDEX reg_h010_idx_chave_duplicidade ON reg_h010 (cod_item, ind_prop, cod_part);


CREATE INDEX reg_h010_idx_cod_part ON reg_h010 (cod_part);


CREATE INDEX reg_h010_idx_id_pai ON reg_h010 (id_pai);


CREATE INDEX reg_h010_idx_unid ON reg_h010 (unid);


CREATE INDEX reg_h020_idx_id_pai ON reg_h020 (id_pai);


CREATE INDEX reg_h990_idx_id_pai ON reg_h990 (id_pai);


CREATE INDEX reg_k001_idx_id_pai ON reg_k001 (id_pai);

SET SCHEMA public;
