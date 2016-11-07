DROP SCHEMA IF EXISTS sped_contrib CASCADE;

CREATE SCHEMA sped_contrib AUTHORIZATION DBA;

SET SCHEMA sped_contrib;

CREATE TABLE pis_0000 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_ver varchar(3),
  tipo_escrit varchar(1),
  ind_sit_esp varchar(1),
  num_rec_anterior varchar(41),
  dt_ini timestamp,
  dt_fin timestamp,
  nome varchar(100),
  cnpj varchar(14),
  uf varchar(2),
  cod_mun varchar(7),
  suframa varchar(9),
  ind_nat_pj varchar(2),
  ind_ativ varchar(1)
);


CREATE TABLE pis_0001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  ind_mov integer
);


CREATE TABLE pis_0035 (
  id bigint NOT NULL PRIMARY KEY,
  id_pai bigint NOT NULL,
  cod_scp varchar(14),
  nome_scp varchar(255),
  inf_comp varchar(255),
  acao integer,
  carga_id integer,
  cnpj_pai integer
);


CREATE TABLE pis_0100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  nome varchar(100),
  cpf varchar(11),
  crc varchar(15),
  cnpj varchar(14),
  cep varchar(8),
  "end" varchar(60),
  num varchar(255),
  compl varchar(60),
  bairro varchar(60),
  fone varchar(10),
  fax varchar(10),
  email varchar(255),
  cod_mun varchar(7)
);


CREATE TABLE pis_0110 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_inc_trib varchar(1),
  ind_apro_cred varchar(1),
  cod_tipo_cont varchar(1)
);


CREATE TABLE pis_0111 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  rec_bru_ncum_trib_mi numeric(21,2),
  rec_bru_ncum_nt_mi numeric(21,2),
  rec_bru_ncum_exp numeric(21,2),
  rec_bru_cum numeric(21,2),
  rec_bru_total numeric(21,2)
);


CREATE TABLE pis_0120 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  mes_dispensa varchar(6),
  inf_comp varchar(90)
);


CREATE TABLE pis_0140 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_est varchar(60),
  nome varchar(100),
  cnpj varchar(14),
  uf varchar(2),
  ie varchar(14),
  cod_mun varchar(7),
  im varchar(255),
  suframa varchar(9)
);


CREATE TABLE pis_0145 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_inc_trib varchar(1),
  vl_rec_tot numeric(21,2),
  vl_rec_ativ numeric(21,2),
  vl_rec_demais_ativ numeric(21,2),
  info_compl varchar(255)
);


CREATE TABLE pis_0150 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_part varchar(60),
  nome varchar(100),
  cod_pais varchar(5),
  cnpj varchar(14),
  cpf varchar(11),
  ie varchar(14),
  cod_mun varchar(7),
  suframa varchar(9),
  "end" varchar(60),
  num varchar(255),
  compl varchar(60),
  bairro varchar(60)
);


CREATE TABLE pis_0190 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  unid varchar(6),
  descr varchar(255)
);


CREATE TABLE pis_0200 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_item varchar(60),
  descr_item varchar(255),
  cod_barra varchar(255),
  cod_ant_item varchar(60),
  unid_inv varchar(6),
  tipo_item varchar(2),
  cod_ncm varchar(8),
  ex_ipi varchar(3),
  cod_gen varchar(2),
  cod_lst varchar(4),
  aliq_icms numeric(8,2),
  novo varchar(1)
);


CREATE TABLE pis_0205 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  descr_ant_item varchar(255),
  dt_ini timestamp,
  dt_fim timestamp,
  cod_ant_item varchar(60)
);


CREATE TABLE pis_0206 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_comb varchar(255)
);


CREATE TABLE pis_0208 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_tab varchar(2),
  cod_gru varchar(2),
  marca_com varchar(60)
);


CREATE TABLE pis_0400 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_nat varchar(10),
  descr_nat varchar(255)
);


CREATE TABLE pis_0450 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_inf varchar(6),
  txt varchar(255)
);


CREATE TABLE pis_0500 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  dt_alt timestamp,
  cod_nat_cc varchar(2),
  ind_cta varchar(1),
  nivel varchar(5),
  cod_cta varchar(60),
  nome_cta varchar(60),
  cod_cta_ref varchar(60),
  cnpj_est varchar(14)
);


CREATE TABLE pis_0600 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  dt_alt timestamp,
  cod_ccus varchar(60),
  ccus varchar(60)
);


CREATE TABLE pis_0990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  qtd_lin_0 integer
);


CREATE TABLE pis_1001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  ind_mov integer
);


CREATE TABLE pis_1010 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  id_sec_jud varchar(255),
  id_vara varchar(2),
  ind_nat_acao varchar(2),
  desc_dec_jud varchar(100),
  dt_sent_jud timestamp
);


CREATE TABLE pis_1020 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_nat_acao varchar(2),
  dt_dec_adm timestamp
);


CREATE TABLE pis_1100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_apu_cred varchar(6),
  orig_cred varchar(2),
  cnpj_suc varchar(14),
  cod_cred varchar(3),
  vl_cred_apu numeric(21,2),
  vl_cred_ext_apu numeric(21,2),
  vl_tot_cred_apu numeric(21,2),
  vl_cred_desc_pa_ant numeric(21,2),
  vl_cred_per_pa_ant numeric(21,2),
  vl_cred_dcomp_pa_ant numeric(21,2),
  sd_cred_disp_efd numeric(21,2),
  vl_cred_desc_efd numeric(21,2),
  vl_cred_per_efd numeric(21,2),
  vl_cred_dcomp_efd numeric(21,2),
  vl_cred_trans numeric(21,2),
  vl_cred_out numeric(21,2),
  sld_cred_fim numeric(21,2)
);


CREATE TABLE pis_1101 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_part varchar(60),
  cod_item varchar(60),
  cod_mod varchar(2),
  ser varchar(4),
  sub_ser varchar(3),
  num_doc varchar(9),
  dt_oper timestamp,
  chv_nfe varchar(44),
  vl_oper numeric(21,2),
  cfop varchar(4),
  nat_bc_cred varchar(2),
  ind_orig_cred varchar(1),
  cst_pis varchar(2),
  vl_bc_pis numeric(22,3),
  aliq_pis numeric(23,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60),
  cod_ccus varchar(60),
  desc_compl varchar(255),
  per_escrit varchar(6),
  cnpj varchar(14)
);


CREATE TABLE pis_1102 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  vl_cred_pis_trib_mi numeric(21,2),
  vl_cred_pis_nt_mi numeric(21,2),
  vl_cred_pis_exp numeric(21,2)
);


CREATE TABLE pis_1200 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_apur_ant varchar(6),
  nat_cont_rec varchar(2),
  vl_cont_apur numeric(21,2),
  vl_cred_pis_desc numeric(21,2),
  vl_cont_dev numeric(21,2),
  vl_out_ded numeric(21,2),
  vl_cont_ext numeric(21,2),
  vl_mul numeric(21,2),
  vl_jur numeric(21,2),
  dt_recol varchar(8)
);


CREATE TABLE pis_1210 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cnpj varchar(14),
  cst_pis varchar(2),
  cod_part varchar(60),
  dt_oper timestamp,
  vl_oper numeric(21,2),
  vl_bc_pis numeric(22,3),
  aliq_pis numeric(23,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60),
  desc_compl varchar(255)
);


CREATE TABLE pis_1220 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_apu_cred varchar(6),
  orig_cred varchar(2),
  cod_cred varchar(3),
  vl_cred numeric(21,2)
);


CREATE TABLE pis_1300 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_nat_ret varchar(2),
  pr_rec_ret varchar(6),
  vl_ret_apu numeric(21,2),
  vl_ret_ded numeric(21,2),
  vl_ret_per numeric(21,2),
  vl_ret_dcomp numeric(21,2),
  sld_ret numeric(21,2)
);


CREATE TABLE pis_1500 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_apu_cred varchar(6),
  orig_cred varchar(2),
  cnpj_suc varchar(14),
  cod_cred varchar(3),
  vl_cred_apu numeric(21,2),
  vl_cred_ext_apu numeric(21,2),
  vl_tot_cred_apu numeric(21,2),
  vl_cred_desc_pa_ant numeric(21,2),
  vl_cred_per_pa_ant numeric(21,2),
  vl_cred_dcomp_pa_ant numeric(21,2),
  sd_cred_disp_efd numeric(21,2),
  vl_cred_desc_efd numeric(21,2),
  vl_cred_per_efd numeric(21,2),
  vl_cred_dcomp_efd numeric(21,2),
  vl_cred_trans numeric(21,2),
  vl_cred_out numeric(21,2),
  sld_cred_fim numeric(21,2)
);


CREATE TABLE pis_1501 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_part varchar(60),
  cod_item varchar(60),
  cod_mod varchar(2),
  ser varchar(4),
  sub_ser varchar(3),
  num_doc varchar(9),
  dt_oper timestamp,
  chv_nfe varchar(44),
  vl_oper numeric(21,2),
  cfop varchar(4),
  nat_bc_cred varchar(2),
  ind_orig_cred varchar(1),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(22,3),
  aliq_cofins numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  cod_ccus varchar(60),
  desc_compl varchar(255),
  per_escrit varchar(6),
  cnpj varchar(14)
);


CREATE TABLE pis_1502 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  vl_cred_cofins_trib_mi numeric(21,2),
  vl_cred_cofins_nt_mi numeric(21,2),
  vl_cred_cofins_exp numeric(21,2)
);


CREATE TABLE pis_1600 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_apur_ant varchar(6),
  nat_cont_rec varchar(2),
  vl_cont_apur numeric(21,2),
  vl_cred_cofins_desc numeric(21,2),
  vl_cont_dev numeric(21,2),
  vl_out_ded numeric(21,2),
  vl_cont_ext numeric(21,2),
  vl_mul numeric(21,2),
  vl_jur numeric(21,2),
  dt_recol timestamp
);


CREATE TABLE pis_1610 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cnpj varchar(14),
  cst_cofins varchar(2),
  cod_part varchar(60),
  dt_oper timestamp,
  vl_oper numeric(21,2),
  vl_bc_cofins numeric(22,3),
  aliq_cofins numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  desc_compl varchar(255)
);


CREATE TABLE pis_1620 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_apu_cred varchar(6),
  orig_cred varchar(2),
  cod_cred varchar(3),
  vl_cred numeric(21,2)
);


CREATE TABLE pis_1700 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_nat_ret varchar(2),
  pr_rec_ret varchar(6),
  vl_ret_apu numeric(21,2),
  vl_ret_ded numeric(21,2),
  vl_ret_per numeric(21,2),
  vl_ret_dcomp numeric(21,2),
  sld_ret numeric(21,2)
);


CREATE TABLE pis_1800 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  inc_imob varchar(90),
  rec_receb_ret numeric(21,2),
  rec_fin_ret numeric(21,2),
  bc_ret numeric(21,2),
  aliq_ret numeric(8,2),
  vl_rec_uni numeric(21,2),
  dt_rec_uni timestamp,
  cod_rec varchar(4)
);


CREATE TABLE pis_1900 (
  id bigint NOT NULL,
  id_pai bigint NOT NULL,
  cnpj varchar(14),
  cod_mod varchar(2),
  ser varchar(4),
  sub_ser varchar(20),
  cod_sit varchar(2),
  vl_tot_rec numeric(21,2),
  quant_doc varchar(255),
  cst_pis varchar(2),
  cst_cofins varchar(2),
  cfop varchar(4),
  info_compl varchar(255),
  cod_cta varchar(60),
  acao varchar(1) DEFAULT 'I',
  cnpj_pai varchar(14),
  carga_id integer
);


CREATE TABLE pis_1990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  qtd_lin_1 integer
);


CREATE TABLE pis_9001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  ind_mov integer
);


CREATE TABLE pis_9900 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  qtd_reg_blc integer
);


CREATE TABLE pis_9990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  qtd_lin_9 integer
);


CREATE TABLE pis_9999 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4),
  qtd_lin integer
);


CREATE TABLE pis_a001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'A001',
  ind_mov integer
);


CREATE TABLE pis_a010 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'A010',
  cnpj varchar(14)
);


CREATE TABLE pis_a100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_oper varchar(1),
  ind_emit varchar(1),
  cod_part varchar(60),
  cod_sit varchar(2),
  ser varchar(20),
  sub varchar(20),
  num_doc varchar(128),
  chv_nfse varchar(128),
  dt_doc timestamp,
  dt_exe_serv timestamp,
  vl_doc numeric(21,2),
  ind_pgto varchar(1),
  vl_desc numeric(21,2),
  vl_bc_pis numeric(21,2),
  vl_pis numeric(21,2),
  vl_bc_cofins numeric(21,2),
  vl_cofins numeric(21,2),
  vl_pis_ret numeric(21,2),
  vl_cofins_ret numeric(21,2),
  vl_iss numeric(21,2)
);


CREATE TABLE pis_a110 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_inf varchar(6),
  txt_compl varchar(255)
);


CREATE TABLE pis_a111 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_a120 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  vl_tot_serv numeric(21,2),
  vl_bc_pis numeric(21,2),
  vl_pis_imp numeric(21,2),
  dt_pag_pis timestamp,
  vl_bc_cofins numeric(21,2),
  vl_cofins_imp numeric(21,2),
  dt_pag_cofins timestamp,
  loc_exe_serv varchar(1)
);


CREATE TABLE pis_a170 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_item varchar(4),
  cod_item varchar(60),
  descr_compl varchar(255),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  nat_bc_cred varchar(2),
  ind_orig_cred varchar(1),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(21,2),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(8,2),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  cod_ccus varchar(60)
);


CREATE TABLE pis_a990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'A990',
  qtd_lin_a integer
);


CREATE TABLE pis_c001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'C001',
  ind_mov integer
);


CREATE TABLE pis_c010 (
  id integer NOT NULL,
  id_pai integer DEFAULT 1,
  linha integer,
  reg varchar(4) DEFAULT 'C010',
  cnpj varchar(14),
  ind_escri integer DEFAULT 2
);


CREATE TABLE pis_c100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_oper varchar(1),
  ind_emit varchar(1),
  cod_part varchar(60),
  cod_mod varchar(2),
  cod_sit varchar(2),
  ser varchar(3),
  num_doc varchar(9),
  chv_nfe varchar(44),
  dt_doc timestamp,
  dt_e_s timestamp,
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
  contribuicao varchar(1),
  cnpj_pai varchar(14)
);


CREATE TABLE pis_c110 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_inf varchar(6),
  txt_compl varchar(255)
);


CREATE TABLE pis_c111 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c120 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_doc_imp varchar(1),
  num_doc_imp varchar(10),
  vl_pis_imp numeric(21,2),
  vl_cofins_imp numeric(21,2),
  num_acdraw varchar(20)
);


CREATE TABLE pis_c170 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
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
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  natureza_receita varchar(3)
);


CREATE TABLE pis_c175 (
  id bigint NOT NULL PRIMARY KEY,
  id_pai bigint NOT NULL,
  cfop varchar(4),
  vl_oper numeric(21,2),
  vl_desc numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  info_compl varchar(255),
  acao varchar(1),
  carga_id integer,
  cnpj_pai varchar(14)
);


CREATE TABLE pis_c180 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  dt_doc_ini timestamp,
  dt_doc_fin timestamp,
  cod_item varchar(60),
  cod_ncm varchar(8),
  ex_ipi varchar(3),
  vl_tot_item numeric(21,2)
);


CREATE TABLE pis_c181 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  cfop varchar(4),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c185 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  cfop varchar(4),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c188 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c190 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  dt_ref_ini timestamp,
  dt_ref_fin timestamp,
  cod_item varchar(60),
  cod_ncm varchar(8),
  ex_ipi varchar(3),
  vl_tot_item numeric(21,2)
);


CREATE TABLE pis_c191 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cnpj_cpf_part varchar(14),
  cst_pis varchar(2),
  cfop varchar(4),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c195 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cnpj_cpf_part varchar(14),
  cst_cofins varchar(2),
  cfop varchar(4),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c198 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c199 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_doc_imp varchar(1),
  num_doc_imp varchar(10),
  vl_pis_imp numeric(21,2),
  vl_cofins_imp numeric(21,2),
  num_acdraw varchar(20)
);


CREATE TABLE pis_c380 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  dt_doc_ini timestamp,
  dt_doc_fin timestamp,
  num_doc_ini varchar(6),
  num_doc_fin varchar(6),
  vl_doc numeric(21,2),
  vl_doc_canc numeric(21,2)
);


CREATE TABLE pis_c381 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  cod_item varchar(60),
  vl_item numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60),
  natureza_receita varchar(3)
);


CREATE TABLE pis_c385 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  cod_item varchar(60),
  vl_item numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  natureza_receita varchar(3)
);


CREATE TABLE pis_c395 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  cod_part varchar(60),
  ser varchar(3),
  sub_ser varchar(3),
  num_doc varchar(6),
  dt_doc timestamp,
  vl_doc numeric(21,2)
);


CREATE TABLE pis_c396 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_item varchar(60),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  nat_bc_cred varchar(2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c400 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  ecf_mod varchar(20),
  ecf_fab varchar(20),
  ecf_cx varchar(3),
  cnpj_pai varchar(14)
);


CREATE TABLE pis_c405 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  dt_doc timestamp,
  cro varchar(3),
  crz varchar(6),
  num_coo_fin varchar(6),
  gt_fin numeric(21,2),
  vl_brt numeric(21,2)
);


CREATE TABLE pis_c481 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  vl_item numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cod_item varchar(60),
  cod_cta varchar(60),
  natureza_receita varchar(3),
  cod_antes varchar(60)
);


CREATE TABLE pis_c485 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  vl_item numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_item varchar(60),
  cod_cta varchar(60),
  natureza_receita varchar(3),
  cod_antes varchar(60)
);


CREATE TABLE pis_c489 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c490 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  dt_doc_ini timestamp,
  dt_doc_fin timestamp,
  cod_mod varchar(2)
);


CREATE TABLE pis_c491 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_item varchar(60),
  cst_pis varchar(2),
  cfop varchar(4),
  vl_item numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c495 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_item varchar(60),
  cst_cofins varchar(2),
  cfop varchar(4),
  vl_item numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c499 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c500 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_part varchar(60),
  cod_mod varchar(2),
  cod_sit varchar(2),
  ser varchar(4),
  sub varchar(3),
  num_doc varchar(60),
  dt_doc timestamp,
  dt_e_s timestamp,
  vl_doc numeric(21,2),
  vl_icms numeric(21,2),
  cod_inf varchar(6),
  vl_pis numeric(21,2),
  vl_cofins numeric(21,2),
  cnpj_pai varchar(14)
);


CREATE TABLE pis_c501 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  vl_item numeric(21,2),
  nat_bc_cred varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c505 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  vl_item numeric(21,2),
  nat_bc_cred varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c509 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c600 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  cod_mun varchar(7),
  ser varchar(4),
  sub varchar(3),
  cod_cons varchar(2),
  qtd_cons varchar(255),
  qtd_canc varchar(255),
  dt_doc timestamp,
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
  vl_cofins numeric(21,2)
);


CREATE TABLE pis_c601 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  vl_item numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c605 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  vl_item numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_c609 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_c990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'C990',
  qtd_lin_c integer
);


CREATE TABLE pis_d001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'D001',
  ind_mov varchar(1)
);


CREATE TABLE pis_d010 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'D010',
  cnpj varchar(14)
);


CREATE TABLE pis_d100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_oper varchar(1),
  ind_emit varchar(1),
  cod_part varchar(60),
  cod_mod varchar(2),
  cod_sit varchar(2),
  ser varchar(4),
  sub varchar(3),
  num_doc varchar(9),
  chv_cte varchar(44),
  dt_doc timestamp,
  dt_a_p timestamp,
  tp_cte varchar(1),
  chv_cte_ref varchar(44),
  vl_doc numeric(21,2),
  vl_desc numeric(21,2),
  ind_frt varchar(1),
  vl_serv numeric(21,2),
  vl_bc_icms numeric(21,2),
  vl_icms numeric(21,2),
  vl_nt numeric(21,2),
  cod_inf varchar(6),
  cod_cta varchar(60)
);


CREATE TABLE pis_d101 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_nat_frt varchar(1),
  vl_item numeric(21,2),
  cst_pis varchar(2),
  nat_bc_cred varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d105 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_nat_frt varchar(1),
  vl_item numeric(21,2),
  cst_cofins varchar(2),
  nat_bc_cred varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d111 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_d200 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  cod_sit varchar(2),
  ser varchar(4),
  sub varchar(3),
  num_doc_ini varchar(9),
  num_doc_fin varchar(9),
  cfop varchar(4),
  dt_ref timestamp,
  vl_doc numeric(21,2),
  vl_desc numeric(21,2)
);


CREATE TABLE pis_d201 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  vl_item numeric(21,2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d205 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  vl_item numeric(21,2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d209 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_d300 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  ser varchar(4),
  sub varchar(3),
  num_doc_ini varchar(6),
  num_doc_fin varchar(255),
  cfop varchar(4),
  dt_ref timestamp,
  vl_doc numeric(21,2),
  vl_desc numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d309 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_d350 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  ecf_mod varchar(20),
  ecf_fab varchar(20),
  dt_doc timestamp,
  cro varchar(3),
  crz varchar(6),
  num_coo_fin varchar(6),
  gt_fin numeric(21,2),
  vl_brt numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d359 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_d500 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_oper varchar(1),
  ind_emit varchar(1),
  cod_part varchar(60),
  cod_mod varchar(2),
  cod_sit varchar(2),
  ser varchar(4),
  sub varchar(3),
  num_doc varchar(9),
  dt_doc timestamp,
  dt_a_p timestamp,
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
  vl_cofins numeric(21,2)
);


CREATE TABLE pis_d501 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_pis varchar(2),
  vl_item numeric(21,2),
  nat_bc_cred varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d505 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cst_cofins varchar(2),
  vl_item numeric(21,2),
  nat_bc_cred varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d509 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_d600 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_mod varchar(2),
  cod_mun varchar(7),
  ser varchar(4),
  sub varchar(3),
  ind_rec varchar(1),
  qtd_cons varchar(255),
  dt_doc_ini timestamp,
  dt_doc_fin timestamp,
  vl_doc numeric(21,2),
  vl_desc numeric(21,2),
  vl_serv numeric(21,2),
  vl_serv_nt numeric(21,2),
  vl_terc numeric(21,2),
  vl_da numeric(21,2),
  vl_bc_icms numeric(21,2),
  vl_icms numeric(21,2),
  vl_pis numeric(21,2),
  vl_cofins numeric(21,2)
);


CREATE TABLE pis_d601 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_class varchar(4),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d605 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_class varchar(4),
  vl_item numeric(21,2),
  vl_desc numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60)
);


CREATE TABLE pis_d609 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_d990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'D990',
  qtd_lin_d integer
);


CREATE TABLE pis_f001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'F001',
  ind_mov integer
);


CREATE TABLE pis_f010 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'F010',
  cnpj varchar(14)
);


CREATE TABLE pis_f100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_oper varchar(1),
  cod_part varchar(60),
  cod_item varchar(60),
  dt_oper timestamp,
  vl_oper numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(23,4),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(23,4),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  nat_bc_cred varchar(2),
  ind_orig_cred varchar(1),
  cod_cta varchar(60),
  cod_ccus varchar(60),
  desc_doc_oper varchar(255)
);


CREATE TABLE pis_f111 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_f120 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  nat_bc_cred varchar(2),
  ident_bem_imob varchar(2),
  ind_orig_cred varchar(1),
  ind_util_bem_imob varchar(1),
  vl_oper_dep numeric(21,2),
  parc_oper_nao_bc_cred numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  cod_ccus varchar(60),
  desc_bem_imob varchar(255)
);


CREATE TABLE pis_f129 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_f130 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  nat_bc_cred varchar(2),
  ident_bem_imob varchar(2),
  ind_orig_cred varchar(1),
  ind_util_bem_imob varchar(1),
  mes_oper_aquis varchar(6),
  vl_oper_aquis numeric(21,2),
  parc_oper_nao_bc_cred numeric(21,2),
  vl_bc_cred numeric(21,2),
  ind_nr_parc varchar(1),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  cod_cta varchar(60),
  cod_ccus varchar(60),
  desc_bem_imob varchar(255)
);


CREATE TABLE pis_f139 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_f150 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  nat_bc_cred varchar(2),
  vl_tot_est numeric(21,2),
  est_imp numeric(21,2),
  vl_bc_est numeric(21,2),
  vl_bc_men_est numeric(21,2),
  cst_pis varchar(2),
  aliq_pis numeric(12,4),
  vl_cred_pis numeric(21,2),
  cst_cofins varchar(2),
  aliq_cofins numeric(12,4),
  vl_cred_cofins numeric(21,2),
  desc_est varchar(100),
  cod_cta varchar(60)
);


CREATE TABLE pis_f200 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_oper varchar(2),
  unid_imob varchar(2),
  ident_emp varchar(255),
  desc_unid_imob varchar(90),
  num_cont varchar(90),
  cpf_cnpj_adqu varchar(14),
  dt_oper timestamp,
  vl_tot_vend numeric(21,2),
  vl_rec_acum numeric(21,2),
  vl_tot_rec numeric(21,2),
  cst_pis varchar(2),
  vl_bc_pis numeric(21,2),
  aliq_pis numeric(12,4),
  vl_pis numeric(21,2),
  cst_cofins varchar(2),
  vl_bc_cofins numeric(21,2),
  aliq_cofins numeric(12,4),
  vl_cofins numeric(21,2),
  perc_rec_receb numeric(8,2),
  ind_nat_emp varchar(1),
  inf_comp varchar(90)
);


CREATE TABLE pis_f205 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  vl_cus_inc_acum_ant numeric(21,2),
  vl_cus_inc_per_esc numeric(21,2),
  vl_cus_inc_acum numeric(21,2),
  vl_exc_bc_cus_inc_acum numeric(21,2),
  vl_bc_cus_inc numeric(21,2),
  cst_pis varchar(2),
  aliq_pis numeric(12,4),
  vl_cred_pis_acum numeric(21,2),
  vl_cred_pis_desc_ant numeric(21,2),
  vl_cred_pis_desc numeric(21,2),
  vl_cred_pis_desc_fut numeric(21,2),
  cst_cofins varchar(2),
  aliq_cofins numeric(12,4),
  vl_cred_cofins_acum numeric(21,2),
  vl_cred_cofins_desc_ant numeric(21,2),
  vl_cred_cofins_desc numeric(21,2),
  vl_cred_cofins_desc_fut numeric(21,2)
);


CREATE TABLE pis_f210 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  vl_cus_orc numeric(21,2),
  vl_exc numeric(21,2),
  vl_cus_orc_aju numeric(21,2),
  vl_bc_cred numeric(21,2),
  cst_pis varchar(2),
  aliq_pis numeric(12,4),
  vl_cred_pis_util numeric(21,2),
  cst_cofins varchar(2),
  aliq_cofins numeric(12,4),
  vl_cred_cofins_util numeric(21,2)
);


CREATE TABLE pis_f211 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_f500 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    vl_rec_caixa numeric(21,2),
    cst_pis varchar(2),
    vl_desc_pis numeric(21,2),
    vl_bc_pis numeric(21,2),
    aliq_pis numeric(12,4),
    vl_pis numeric(21,2),
    cst_cofins varchar(2),
    vl_desc_cofins numeric(21,2),
    vl_bc_cofins numeric(21,2),
    aliq_cofins numeric(12,4),
    vl_cofins numeric(21,2),
    cod_mod varchar(2),
    cfop varchar(4),
    cod_cta varchar(60),
    info_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    carga_id integer,
    cnpj_pai varchar(14)
);


CREATE TABLE pis_f509 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_f510 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    vl_rec_caixa numeric(21,2),
    cst_pis varchar(2),
    vl_desc_pis numeric(21,2),
    quant_bc_pis numeric(22,3),
    aliq_pis_quant numeric(23,4),
    vl_pis numeric(21,2),
    cst_cofins varchar(2),
    vl_desc_cofins numeric(21,2),
    quant_bc_cofins numeric(22,3),
    aliq_cofins_quant numeric(23,4),
    vl_cofins numeric(21,2),
    cod_mod varchar(2),
    cfop varchar(4),
    cod_cta varchar(60),
    info_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    carga_id integer,
    cnpj_pai varchar(14)
);


CREATE TABLE pis_f519 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_f525 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    vl_rec numeric(21,2),
    ind_rec varchar(2),
    cnpj_cpf varchar(14),
    num_doc varchar(60),
    cod_item varchar(60),
    vl_rec_det numeric(21,2),
    cst_pis varchar(2),
    cst_cofins varchar(2),
    info_compl varchar(255),
    cod_cta varchar(60),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_f550 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    vl_rec_comp numeric(21,2),
    cst_pis varchar(2),
    vl_desc_pis numeric(21,2),
    vl_bc_pis numeric(21,2),
    aliq_pis numeric(12,4),
    vl_pis numeric(21,2),
    cst_cofins varchar(2),
    vl_desc_cofins numeric(21,2),
    vl_bc_cofins numeric(21,2),
    aliq_cofins numeric(12,4),
    vl_cofins numeric(21,2),
    cod_mod varchar(2),
    cfop varchar(4),
    cod_cta varchar(60),
    info_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    carga_id integer,
    cnpj_pai varchar(14)
);


CREATE TABLE pis_f559 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_f560 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    vl_rec_comp numeric(21,2),
    cst_pis varchar(2),
    vl_desc_pis numeric(21,2),
    quant_bc_pis numeric(22,3),
    aliq_pis_quant numeric(12,4),
    vl_pis numeric(21,2),
    cst_cofins varchar(2),
    vl_desc_cofins numeric(21,2),
    quant_bc_cofins numeric(22,3),
    aliq_cofins_quant numeric(12,4),
    vl_cofins numeric(21,2),
    cod_mod varchar(2),
    cfop varchar(4),
    cod_cta varchar(60),
    info_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    carga_id integer,
    cnpj_pai varchar(14)
);


CREATE TABLE pis_f569 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_f600 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_nat_ret varchar(2),
  dt_ret timestamp,
  vl_bc_ret numeric(23,4),
  vl_ret numeric(21,2),
  cod_rec varchar(4),
  ind_nat_rec varchar(1),
  cnpj varchar(14),
  vl_ret_pis numeric(21,2),
  vl_ret_cofins numeric(21,2),
  ind_dec varchar(1)
);


CREATE TABLE pis_f700 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_ori_ded varchar(2),
  ind_nat_ded varchar(1),
  vl_ded_pis numeric(21,2),
  vl_ded_cofins numeric(21,2),
  vl_bc_oper numeric(21,2),
  cnpj varchar(14),
  inf_comp varchar(90)
);


CREATE TABLE pis_f800 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_nat_even varchar(2),
  dt_even timestamp,
  cnpj_suced varchar(14),
  pa_cont_cred varchar(6),
  cod_cred varchar(3),
  vl_cred_pis numeric(21,2),
  vl_cred_cofins numeric(21,2),
  per_cred_cis numeric(8,2)
);


CREATE TABLE pis_i001 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    ind_mov varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_i010 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    cnpj varchar(14),
    ind_ativ varchar(2),
    info_compl varchar(255),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_i100 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    vl_rec_fin numeric(21,2),
    cst varchar(2),
    vl_tot_ded_ger numeric(21,2),
    vl_tot_ded_esp numeric(21,2),
    vl_bc_pis numeric(21,2),
    aliq_pis numeric(10,2),
    vl_pis numeric(21,2),
    vl_bc_cofins numeric(21,2),
    aliq_cofins numeric(10,2),
    vl_cofins numeric(21,2),
    inf_comp varchar(90),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_i199 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao integer,
    carga_id integer,
    cnpj_pai integer
);


CREATE TABLE pis_i200 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_campo varchar(2),
    cod_det varchar(5),
    vl_det numeric(21,2),
    cod_cta varchar(60),
    inf_comp varchar(90),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_i299 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao integer,
    carga_id integer,
    cnpj_pai integer
);


CREATE TABLE pis_i300 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    cod_comp varchar(8),
    vl_comp numeric(21,2),
    cod_cta varchar(60),
    inf_comp varchar(90),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_i399 (
    id bigint NOT NULL PRIMARY KEY,
    id_pai bigint NOT NULL,
    num_proc varchar(20),
    ind_proc varchar(1),
    acao varchar(1) DEFAULT 'I',
    cnpj_pai varchar(14),
    carga_id integer
);


CREATE TABLE pis_f990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'F990',
  qtd_lin_f integer
);


CREATE TABLE pis_m001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'M001',
  ind_mov integer
);


CREATE TABLE pis_m100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M100',
  cod_cred varchar(3),
  ind_cred_ori varchar(1),
  vl_bc_cred numeric(21,2) DEFAULT 0,
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_cred numeric(21,2) DEFAULT 0,
  vl_ajus_acres numeric(21,2) DEFAULT 0,
  vl_ajus_reduc numeric(21,2) DEFAULT 0,
  vl_cred_dif numeric(21,2) DEFAULT 0,
  vl_cred_disp numeric(21,2) DEFAULT 0,
  ind_desc_cred varchar(1),
  vl_cred_desc numeric(21,2) DEFAULT 0,
  sld_cred numeric(21,2) DEFAULT 0
);


CREATE TABLE pis_m105 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M105',
  nat_bc_cred varchar(2),
  cst_pis varchar(2),
  vl_bc_pis_tot numeric(21,2) DEFAULT 0,
  vl_bc_pis_cum numeric(21,2) DEFAULT 0,
  vl_bc_pis_nc numeric(21,2) DEFAULT 0,
  vl_bc_pis numeric(21,2) DEFAULT 0,
  quant_bc_pis_tot numeric(22,3),
  quant_bc_pis numeric(22,3),
  desc_cred varchar(60)
);


CREATE TABLE pis_m110 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_aj varchar(1),
  vl_aj numeric(21,2),
  cod_aj varchar(2),
  num_doc varchar(255),
  descr_aj varchar(255),
  dt_ref timestamp
);


CREATE TABLE pis_m200 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M200',
  vl_tot_cont_nc_per numeric(21,2) DEFAULT 0,
  vl_tot_cred_desc numeric(21,2) DEFAULT 0,
  vl_tot_cred_desc_ant numeric(21,2) DEFAULT 0,
  vl_tot_cont_nc_dev numeric(21,2) DEFAULT 0,
  vl_ret_nc numeric(21,2) DEFAULT 0,
  vl_out_ded_nc numeric(21,2) DEFAULT 0,
  vl_cont_nc_rec numeric(21,2) DEFAULT 0,
  vl_tot_cont_cum_per numeric(21,2) DEFAULT 0,
  vl_ret_cum numeric(21,2) DEFAULT 0,
  vl_out_ded_cum numeric(21,2) DEFAULT 0,
  vl_cont_cum_rec numeric(21,2) DEFAULT 0,
  vl_tot_cont_rec numeric(21,2) DEFAULT 0
);


CREATE TABLE pis_m205 (
  id bigint NOT NULL,
  id_pai bigint NOT NULL,
  num_campo varchar(2),
  cod_rec varchar(6),
  vl_debito numeric(21,2),
  acao integer,
  carga_id integer,
  cnpj_pai integer,
  CONSTRAINT pis_m205_pkey PRIMARY KEY (id)
);


CREATE TABLE pis_m210 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M210',
  cod_cont varchar(2),
  vl_rec_brt numeric(21,2) DEFAULT 0,
  vl_bc_cont numeric(21,2) DEFAULT 0,
  aliq_pis numeric(12,4),
  quant_bc_pis numeric(22,3),
  aliq_pis_quant numeric(23,4),
  vl_cont_apur numeric(21,2) DEFAULT 0,
  vl_ajus_acres numeric(21,2) DEFAULT 0,
  vl_ajus_reduc numeric(21,2) DEFAULT 0,
  vl_cont_difer numeric(21,2) DEFAULT 0,
  vl_cont_difer_ant numeric(21,2) DEFAULT 0,
  vl_cont_per numeric(21,2) DEFAULT 0
);


CREATE TABLE pis_m211 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_tip_coop varchar(2),
  vl_bc_cont_ant_exc_coop numeric(21,2),
  vl_exc_coop_ger numeric(21,2),
  vl_exc_esp_coop numeric(21,2),
  vl_bc_cont numeric(21,2)
);


CREATE TABLE pis_m220 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_aj varchar(1),
  vl_aj numeric(21,2),
  cod_aj varchar(2),
  num_doc varchar(255),
  descr_aj varchar(255),
  dt_ref timestamp
);


CREATE TABLE pis_m230 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cnpj varchar(14),
  vl_vend numeric(21,2),
  vl_nao_receb numeric(21,2),
  vl_cont_dif numeric(21,2),
  vl_cred_dif numeric(21,2),
  cod_cred varchar(3)
);


CREATE TABLE pis_m300 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_cont varchar(2),
  vl_cont_apur_difer numeric(21,2),
  nat_cred_desc varchar(2),
  vl_cred_desc_difer numeric(21,2),
  vl_cont_difer_ant numeric(21,2),
  per_apur varchar(6),
  dt_receb timestamp
);


CREATE TABLE pis_m350 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  vl_tot_fol numeric(21,2),
  vl_exc_bc numeric(21,2),
  vl_tot_bc numeric(21,2),
  aliq_pis_fol numeric(8,2),
  vl_tot_cont_fol numeric(21,2)
);


CREATE TABLE pis_m400 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M400',
  cst_pis varchar(2),
  vl_tot_rec numeric(21,2) DEFAULT 0,
  cod_cta varchar(60),
  desc_compl varchar(255)
);


CREATE TABLE pis_m410 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M410',
  nat_rec varchar(3),
  vl_rec numeric(21,2) DEFAULT 0,
  cod_cta varchar(60),
  desc_compl varchar(255)
);


CREATE TABLE pis_m500 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M500',
  cod_cred varchar(3),
  ind_cred_ori varchar(1),
  vl_bc_cred numeric(21,2) DEFAULT 0,
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cred numeric(21,2) DEFAULT 0,
  vl_ajus_acres numeric(21,2) DEFAULT 0,
  vl_ajus_reduc numeric(21,2) DEFAULT 0,
  vl_cred_dif numeric(21,2) DEFAULT 0,
  vl_cred_disp numeric(21,2) DEFAULT 0,
  ind_desc_cred varchar(1),
  vl_cred_desc numeric(21,2) DEFAULT 0,
  sld_cred numeric(21,2) DEFAULT 0
);


CREATE TABLE pis_m505 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M505',
  nat_bc_cred varchar(2),
  cst_cofins varchar(2),
  vl_bc_cofins_tot numeric(21,2) DEFAULT 0,
  vl_bc_cofins_cum numeric(21,2) DEFAULT 0,
  vl_bc_cofins_nc numeric(21,2) DEFAULT 0,
  vl_bc_cofins numeric(21,2) DEFAULT 0,
  quant_bc_cofins_tot numeric(22,3),
  quant_bc_cofins numeric(22,3),
  desc_cred varchar(60)
);


CREATE TABLE pis_m510 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_aj varchar(1),
  vl_aj numeric(21,2),
  cod_aj varchar(2),
  num_doc varchar(255),
  descr_aj varchar(255),
  dt_ref timestamp
);


CREATE TABLE pis_m600 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M600',
  vl_tot_cont_nc_per numeric(21,2) DEFAULT 0,
  vl_tot_cred_desc numeric(21,2) DEFAULT 0,
  vl_tot_cred_desc_ant numeric(21,2) DEFAULT 0,
  vl_tot_cont_nc_dev numeric(21,2) DEFAULT 0,
  vl_ret_nc numeric(21,2) DEFAULT 0,
  vl_out_ded_nc numeric(21,2) DEFAULT 0,
  vl_cont_nc_rec numeric(21,2) DEFAULT 0,
  vl_tot_cont_cum_per numeric(21,2) DEFAULT 0,
  vl_ret_cum numeric(21,2) DEFAULT 0,
  vl_out_ded_cum numeric(21,2) DEFAULT 0,
  vl_cont_cum_rec numeric(21,2) DEFAULT 0,
  vl_tot_cont_rec numeric(21,2) DEFAULT 0
);


CREATE TABLE pis_m605 (
  id bigint NOT NULL,
  id_pai bigint NOT NULL,
  num_campo varchar(2),
  cod_rec varchar(6),
  vl_debito numeric(21,2),
  acao varchar(1) DEFAULT 'I',
  cnpj_pai varchar(14),
  carga_id integer,
  CONSTRAINT pis_m605_pkey PRIMARY KEY (id)
);


CREATE TABLE pis_m610 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M610',
  cod_cont varchar(2),
  vl_rec_brt numeric(21,2) DEFAULT 0,
  vl_bc_cont numeric(21,2) DEFAULT 0,
  aliq_cofins numeric(12,4),
  quant_bc_cofins numeric(22,3),
  aliq_cofins_quant numeric(23,4),
  vl_cont_apur numeric(21,2) DEFAULT 0,
  vl_ajus_acres numeric(21,2) DEFAULT 0,
  vl_ajus_reduc numeric(21,2) DEFAULT 0,
  vl_cont_difer numeric(21,2) DEFAULT 0,
  vl_cont_difer_ant numeric(21,2) DEFAULT 0,
  vl_cont_per numeric(21,2) DEFAULT 0
);


CREATE TABLE pis_m611 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_tip_coop varchar(2),
  vl_bc_cont_ant_exc_coop numeric(21,2),
  vl_exc_coop_ger numeric(21,2),
  vl_exc_esp_coop numeric(21,2),
  vl_bc_cont numeric(21,2)
);


CREATE TABLE pis_m620 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_aj varchar(1),
  vl_aj numeric(21,2),
  cod_aj varchar(2),
  num_doc varchar(255),
  descr_aj varchar(255),
  dt_ref timestamp
);


CREATE TABLE pis_m630 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cnpj varchar(14),
  vl_vend numeric(21,2),
  vl_nao_receb numeric(21,2),
  vl_cont_dif numeric(21,2),
  vl_cred_dif numeric(21,2),
  cod_cred varchar(3)
);


CREATE TABLE pis_m700 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  cod_cont varchar(2),
  vl_cont_apur_difer numeric(21,2),
  nat_bc_cred_desc varchar(2),
  vl_cred_desc_difer numeric(21,2),
  vl_cont_difer_ant numeric(21,2),
  per_apur varchar(6),
  dt_receb timestamp
);


CREATE TABLE pis_m800 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M800',
  cst_cofins varchar(2),
  vl_tot_rec numeric(21,2) DEFAULT 0,
  cod_cta varchar(60),
  desc_compl varchar(255)
);


CREATE TABLE pis_m810 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  reg varchar(4) DEFAULT 'M810',
  nat_rec varchar(3),
  vl_rec numeric(21,2),
  cod_cta varchar(60),
  desc_compl varchar(255)
);


CREATE TABLE pis_m990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'M990',
  qtd_lin_m integer
);


CREATE TABLE pis_p001 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'P001',
  ind_mov integer
);


CREATE TABLE pis_p010 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'P010',
  cnpj varchar(14)
);


CREATE TABLE pis_p100 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  dt_ini timestamp,
  dt_fim timestamp,
  vl_rec_tot_est numeric(21,2),
  cod_ativ_econ varchar(8),
  vl_rec_ativ_estab numeric(21,2),
  vl_exc numeric(21,2),
  vl_bc_cont numeric(21,2),
  aliq_cont numeric(12,4),
  vl_cont_apu numeric(21,2),
  cod_cta varchar(60),
  info_compl varchar(255)
);


CREATE TABLE pis_p110 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_campo varchar(2),
  cod_det varchar(8),
  det_valor numeric(21,2),
  inf_compl varchar(255)
);


CREATE TABLE pis_p199 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  num_proc varchar(20),
  ind_proc varchar(1)
);


CREATE TABLE pis_p200 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  per_ref varchar(6),
  vl_tot_cont_apu numeric(21,2),
  vl_tot_aj_reduc numeric(21,2),
  vl_tot_aj_acres numeric(21,2),
  vl_tot_cont_dev numeric(21,2),
  cod_rec varchar(6)
);


CREATE TABLE pis_p210 (
  id integer NOT NULL,
  id_pai integer NOT NULL,
  linha integer NOT NULL,
  reg varchar(4),
  ind_aj varchar(1),
  vl_aj numeric(21,2),
  cod_aj varchar(2),
  num_doc varchar(255),
  descr_aj varchar(255),
  dt_ref timestamp
);


CREATE TABLE pis_p990 (
  id integer NOT NULL,
  id_pai integer,
  linha integer,
  reg varchar(4) DEFAULT 'P990',
  qtd_lin_p integer
);


INSERT INTO pis_0000 VALUES (1, 0, 1, '0000', '002', '0', '', '', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'EMPRESA TESTE', '99999999000191', 'SP', '3550308', '', '00', '0');


INSERT INTO pis_0001 VALUES (1, 0, 2, '0001', 0);




INSERT INTO pis_0110 VALUES (1, 1, 3, '0110', '3', '2', '2');


INSERT INTO pis_0111 VALUES (1, 1, 4, '0111', 11200000.00, 6000000.00, 1000000.00, 1800000.00, 20000000.00);




INSERT INTO pis_0140 VALUES (1, 1, 5, '0140', 'CE0000001', 'EMPRESA TESTE - PAULISTA', '99999999000191', 'SP', '', '3550308', '', '');
INSERT INTO pis_0140 VALUES (2, 1, 76, '0140', 'CE0000002', 'EMPRESA TESTE - COPACABANA', '99999999000272', 'RJ', '', '3304557', '', '');




INSERT INTO pis_0150 VALUES (1, 1, 6, '0150', 'F1', 'CORP SA', '1058', '88888888000191', '', '', '3552502', '', 'AV JORGE BENJOR', '123', '', 'meu');
INSERT INTO pis_0150 VALUES (2, 2, 77, '0150', 'F1', 'Empresa teste', '1058', '66666666000191', '', '', '5200050', '', '', '', '', '');


INSERT INTO pis_0190 VALUES (1, 1, 7, '0190', 'UN', 'Unidade');
INSERT INTO pis_0190 VALUES (2, 1, 8, '0190', 'PC', 'Peça');
INSERT INTO pis_0190 VALUES (3, 1, 9, '0190', 'KG', 'Kilograma');
INSERT INTO pis_0190 VALUES (4, 1, 10, '0190', 'TB', 'Tubo');
INSERT INTO pis_0190 VALUES (5, 1, 11, '0190', 'MED', 'Medição por lote de produção');
INSERT INTO pis_0190 VALUES (6, 2, 78, '0190', 'KG', 'Kilo');


INSERT INTO pis_0200 VALUES (1, 1, 12, '0200', 'P1', 'Produto 1', NULL, NULL, 'UN', '04', '32081010', NULL, '32', NULL, 18.00, NULL);
INSERT INTO pis_0200 VALUES (2, 1, 13, '0200', 'S1', 'SERVIÇOS EM PROCESSOS INDUSTRIAIS', NULL, NULL, 'MED', '09', NULL, NULL, '00', NULL, NULL, NULL);
INSERT INTO pis_0200 VALUES (3, 1, 14, '0200', 'P2', 'Insumo', NULL, NULL, 'KG', '01', '22071000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO pis_0200 VALUES (5, 1, 16, '0200', 'P8', 'Bomba', NULL, NULL, 'UN', '03', '87012000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO pis_0200 VALUES (4, 1, 15, '0200', 'P4', 'Cumulativo', NULL, NULL, 'UN', '04', '87112010', NULL, NULL, NULL, NULL, NULL);
INSERT INTO pis_0200 VALUES (6, 2, 79, '0200', 'P3', 'Insumo em Kg', NULL, NULL, 'KG', '01', '29051210', NULL, NULL, NULL, NULL, NULL);
INSERT INTO pis_0200 VALUES (7, 2, 80, '0200', 'S1', 'servico estab2', NULL, NULL, NULL, '09', NULL, NULL, NULL, NULL, NULL, NULL);


INSERT INTO pis_0400 VALUES (1, 1, 17, '0400', '5915AA', 'REMESSA DE MERCADORIA OU BEM PARA CONSERTO OU REPARO');
INSERT INTO pis_0400 VALUES (2, 1, 18, '0400', '5919AA', 'DEVOLUCAO SIMBOLICA DE MERCADORIA VENDIDA OU UTILIZADA EM PROCESSO INDUSTRIAL, RECEBIDA ANTERIORMENTE EM CONSIGNACAO MERCANTIL OU INDUSTRIAL');
INSERT INTO pis_0400 VALUES (3, 1, 19, '0400', '5920AA', 'REMESSA DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (4, 1, 20, '0400', '5921AA', 'DEVOLUCAO DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (5, 1, 21, '0400', '6919AA', 'DEVOLUCAO SIMBOLICA DE MERCADORIA VENDIDA OU UTILIZADA EM PROCESSO INDUSTRIAL, RECEBIDA ANTERIORMENTE EM CONSIGNACAO MERCANTIL OU INDUSTRIAL');
INSERT INTO pis_0400 VALUES (6, 1, 22, '0400', '6920AA', 'REMESSA DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (7, 1, 23, '0400', '6949AA', 'OUTRA SAIDA DE MERCADORIA OU PRESTACAO DE SERVICO NAO ESPECIFICADO');
INSERT INTO pis_0400 VALUES (8, 1, 24, '0400', '7949AA', 'OUTRAS SAIDAS DE MERCADORIA OU PRESTACAO DE SERVICOS NAO ESPECIFICADA');
INSERT INTO pis_0400 VALUES (9, 1, 25, '0400', '1101AA', 'COMPRA PARA INDUSTRIALIZACAO OU PRODUCAO RURAL');
INSERT INTO pis_0400 VALUES (10, 1, 26, '0400', '1102AA', 'COMPRA PARA COMERCIALIZACAO');
INSERT INTO pis_0400 VALUES (11, 1, 27, '0400', '1111AA', 'COMPRA PARA INDUSTRIALIZACAO DE MERCADORIA RECEBIDA ANTERIORMENTE EM CONSIGNACAO INDUSTRIAL');
INSERT INTO pis_0400 VALUES (12, 1, 28, '0400', '1120AA', 'COMPRA PARA INDUSTRIALIZACAO, EM VENDA A ORDEM, JA RECEBIDA DO VENDEDOR REMETENTE');
INSERT INTO pis_0400 VALUES (13, 1, 29, '0400', '1124AA', 'INDUSTRIALIZACAO EFETUADA POR OUTRA EMPRESA');
INSERT INTO pis_0400 VALUES (14, 1, 30, '0400', '1151AA', 'TRANSFERENCIA PARA INDUSTRIALIZACAO OU PRODUCAO RURAL');
INSERT INTO pis_0400 VALUES (15, 1, 31, '0400', '1201AA', 'DEVOLUCAO DE VENDA DE PRODUCAO DO ESTABELECIMENTO');
INSERT INTO pis_0400 VALUES (16, 1, 32, '0400', '1406AA', 'COMPRA DE BEM PARA O ATIVO IMOBILIZADO CUJA MERCADORIA ESTA SUJEITA AO REGIME DE SUBSTITUICAO TRIBUTARIA');
INSERT INTO pis_0400 VALUES (17, 1, 33, '0400', '1407AA', 'COMPRA DE MERCADORIA PARA USO OU CONSUMO CUJA MERCADORIA ESTA SUJEITA AO REGIME DE SUBSTITUICAO TRIBUTARIA');
INSERT INTO pis_0400 VALUES (18, 1, 34, '0400', '1410AA', 'DEVOLUCAO DE VENDA DE PRODUCAO DO ESTABELECIMENTO');
INSERT INTO pis_0400 VALUES (19, 1, 35, '0400', '1411AA', 'DEVOLUCAO DE VENDA DE MERCADORIA ADQUIRIDA OU RECEBIDA DE TERCEIROS EM OPERACAO COM MERCADORIA SUJEITA AO REGIME DE SUBSTITUICAO TRIBUTARIA');
INSERT INTO pis_0400 VALUES (20, 1, 36, '0400', '1551AA', 'COMPRA DE BEM PARA O ATIVO IMOBILIZADO');
INSERT INTO pis_0400 VALUES (21, 1, 37, '0400', '1554AA', 'RETORNO DE BEM DO ATIVO IMOBILIZADO REMETIDO PARA USO FORA DO ESTABELECIMENTO');
INSERT INTO pis_0400 VALUES (22, 1, 38, '0400', '1555AA', 'ENTRADA DE BEM DO ATIVO IMOBILIZADO DE TERCEIRO, REMETIDO PARA USO NO ESTABELECIMENTO');
INSERT INTO pis_0400 VALUES (23, 1, 39, '0400', '1556AA', 'COMPRA DE MATERIAL PARA USO OU CONSUMO');
INSERT INTO pis_0400 VALUES (24, 1, 40, '0400', '1557AA', 'TRANSFERENCIA DE MATERIAL PARA USO OU CONSUMO');
INSERT INTO pis_0400 VALUES (25, 1, 41, '0400', '1651AA', 'COMPRA DE COMBUSTIVEIS OU LUBRIFICANTES PARA INDUS');
INSERT INTO pis_0400 VALUES (26, 1, 42, '0400', '1902AA', 'RETORNO DE MERCADORIA REMETIDA PARA INDUSTRIALIZACAO POR ENCOMENDA');
INSERT INTO pis_0400 VALUES (27, 1, 43, '0400', '1903AA', 'ENTRADA DE MERCADORIA REMETIDA PARA INDUSTRIALIZACAO E NAO APLICADA NO REFERIDO PROCESSO');
INSERT INTO pis_0400 VALUES (28, 1, 44, '0400', '1906AA', 'RETORNO DE MERCADORIA REMETIDA PARA DEPOSITO FECHADO OU ARMAZEM GERAL');
INSERT INTO pis_0400 VALUES (29, 1, 45, '0400', '1908AA', 'ENTRADA DE BEM POR CONTA DE CONTRATO DE COMODATO');
INSERT INTO pis_0400 VALUES (30, 1, 46, '0400', '1910AA', 'ENTRADA DE BONIFICACAO, DOACAO OU BRINDE');
INSERT INTO pis_0400 VALUES (31, 1, 47, '0400', '1911AA', 'ENTRADA DE AMOSTRA GRATIS');
INSERT INTO pis_0400 VALUES (32, 1, 48, '0400', '1912AA', 'ENTRADA DE MERCADORIA OU BEM RECEBIDO PARA DEMONSTRACAO');
INSERT INTO pis_0400 VALUES (33, 1, 49, '0400', '1914AA', 'RETORNO DE MERCADORIA OU BEM REMETIDO PARA EXPOSICAO OU FEIRA');
INSERT INTO pis_0400 VALUES (34, 1, 50, '0400', '1916AA', 'RETORNO DE MERCADORIA OU BEM REMETIDO PARA CONSERTO OU REPARO');
INSERT INTO pis_0400 VALUES (35, 1, 51, '0400', '1917AA', 'ENTRADA DE MERCADORIA RECEBIDA EM CONSIGNACAO MERCANTIL OU INDUSTRIAL');
INSERT INTO pis_0400 VALUES (36, 1, 52, '0400', '1919AA', 'DEVOLUCAO SIMBOLICA DE MERCADORIA VENDIDA OU UTILIZADA EM PROCESSO INDUSTRIAL, REMETIDA ANTERIORMENTE EM CONSIGNACAO MERCANTIL OU INDUSTRIAL');
INSERT INTO pis_0400 VALUES (37, 1, 53, '0400', '1920AA', 'ENTRADA DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (38, 1, 54, '0400', '1921AA', 'RETORNO DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (39, 1, 55, '0400', '1933AA', 'COMPRAS DE PRESTACAO DE SERVICO');
INSERT INTO pis_0400 VALUES (40, 1, 56, '0400', '1949AA', 'OUTRA ENTRADA DE MERCADORIA OU PRESTACAO DE SERVICO NAO ESPECIFICADO');
INSERT INTO pis_0400 VALUES (41, 1, 57, '0400', '2101AA', 'COMPRA PARA INDUSTRIALIZACAO OU PRODUCAO RURAL');
INSERT INTO pis_0400 VALUES (42, 1, 58, '0400', '2102AA', 'COMPRA PARA COMERCIALIZACAO');
INSERT INTO pis_0400 VALUES (43, 1, 59, '0400', '2111AA', 'COMPRA PARA INDUSTRIALIZACAO DE MERCADORIA RECEBIDA ANTERIORMENTE EM CONSIGNACAO INDUSTRIAL');
INSERT INTO pis_0400 VALUES (44, 1, 60, '0400', '2151AA', 'TRANSFERENCIA PARA INDUSTRIALIZACAO OU PRODUCAO RURAL');
INSERT INTO pis_0400 VALUES (45, 1, 61, '0400', '2407AA', 'COMPRA DE MERCADORIA PARA USO OU CONSUMO CUJA MERCADORIA ESTA SUJEITA AO REGIME DE SUBSTITUICAO TRIBUTARIA');
INSERT INTO pis_0400 VALUES (46, 1, 62, '0400', '2410AA', 'DEVOLUCAO DE VENDA DE PRODUCAO DO ESTABELECIMENTO EM OPERACAO COM PRODUTO SUJEITO AO REGIME DE SUBSTITUICAO TRIBUTARIA');
INSERT INTO pis_0400 VALUES (47, 1, 63, '0400', '2552AA', 'TRANSFERENCIA DE BEM DO ATIVO IMOBILIZADO');
INSERT INTO pis_0400 VALUES (48, 1, 64, '0400', '2556AA', 'COMPRA DE MATERIAL PARA USO OU CONSUMO');
INSERT INTO pis_0400 VALUES (49, 1, 65, '0400', '2557AA', 'TRANSFERENCIA DE MATERIAL PARA USO OU CONSUMO');
INSERT INTO pis_0400 VALUES (50, 1, 66, '0400', '2910AA', 'ENTRADA DE BONIFICACAO, DOACAO OU BRINDE');
INSERT INTO pis_0400 VALUES (51, 1, 67, '0400', '2911AA', 'ENTRADA DE AMOSTRA GRATIS');
INSERT INTO pis_0400 VALUES (52, 1, 68, '0400', '2915AA', 'ENTRADA DE MERCADORIA OU BEM RECEBIDO PARA CONSERTO OU REPARO');
INSERT INTO pis_0400 VALUES (53, 1, 69, '0400', '2916AA', 'RETORNO DE MERCADORIA OU BEM REMETIDO PARA CONSERTO OU REPARO');
INSERT INTO pis_0400 VALUES (54, 1, 70, '0400', '2917AA', 'ENTRADA DE MERCADORIA RECEBIDA EM CONSIGNACAO MERCANTIL OU INDUSTRIAL');
INSERT INTO pis_0400 VALUES (55, 1, 71, '0400', '2920AA', 'ENTRADA DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (56, 1, 72, '0400', '2921AA', 'RETORNO DE VASILHAME OU SACARIA');
INSERT INTO pis_0400 VALUES (57, 1, 73, '0400', '2923AA', 'ENTRADA DE MERCADORIA RECEBIDA DO VENDEDOR REMETENTE, EM VENDA A ORDEM');
INSERT INTO pis_0400 VALUES (58, 1, 74, '0400', '2949AA', 'OUTRA ENTRADA DE MERCADORIA OU PRESTACAO DE SERVICO NAO ESPECIFICADO');


INSERT INTO pis_0450 VALUES (1, 1, 75, '0450', '20000', 'Operação regular');


INSERT INTO pis_0500 VALUES (1, 1, 81, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.1.0001', 'ESTOQUES - MATERIA-PRIMA', '', '99999999000191');
INSERT INTO pis_0500 VALUES (2, 1, 82, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.2.0001', 'ESTOQUES - MATERIA-PRIMA', '', '99999999000272');
INSERT INTO pis_0500 VALUES (3, 1, 83, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.3.0001', 'ESTOQUES - MATERIA-PRIMA', '', '99999999000353');
INSERT INTO pis_0500 VALUES (4, 1, 84, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.4.0001', 'ESTOQUES - MATERIA-PRIMA', '', '99999999000434');
INSERT INTO pis_0500 VALUES (5, 1, 85, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.5.0001', 'ESTOQUES - MATERIA-PRIMA', '', '99999999000515');
INSERT INTO pis_0500 VALUES (6, 1, 86, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.1.0002', 'ESTOQUES - MATERIAIS INTERMEDIARIOS', '', '99999999000191');
INSERT INTO pis_0500 VALUES (7, 1, 87, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.2.0002', 'ESTOQUES - MATERIAIS INTERMEDIARIOS', '', '99999999000272');
INSERT INTO pis_0500 VALUES (8, 1, 88, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.3.0002', 'ESTOQUES - MATERIAIS INTERMEDIARIOS', '', '99999999000353');
INSERT INTO pis_0500 VALUES (9, 1, 89, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.4.0002', 'ESTOQUES - MATERIAIS INTERMEDIARIOS', '', '99999999000434');
INSERT INTO pis_0500 VALUES (10, 1, 90, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.5.0002', 'ESTOQUES - MATERIAIS INTERMEDIARIOS', '', '99999999000515');
INSERT INTO pis_0500 VALUES (11, 1, 91, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.1.0003', 'EMBALAGENS', '', '99999999000191');
INSERT INTO pis_0500 VALUES (12, 1, 92, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.2.0003', 'EMBALAGENS', '', '99999999000272');
INSERT INTO pis_0500 VALUES (13, 1, 93, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.3.0003', 'EMBALAGENS', '', '99999999000353');
INSERT INTO pis_0500 VALUES (14, 1, 94, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.4.0003', 'EMBALAGENS', '', '99999999000434');
INSERT INTO pis_0500 VALUES (15, 1, 95, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '1200.5.0003', 'EMBALAGENS', '', '99999999000515');
INSERT INTO pis_0500 VALUES (16, 1, 96, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.1.0001', 'RECEITA BRUTA - MERCADO INTERNO', '', '');
INSERT INTO pis_0500 VALUES (17, 1, 97, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.1.0002', 'RECEITA BRUTA - MERCADO INTERNO - ZFM', '', '');
INSERT INTO pis_0500 VALUES (18, 1, 98, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.1.0003', 'RECEITA BRUTA - MERCADO INTERNO - SUSPENSAO', '', '');
INSERT INTO pis_0500 VALUES (19, 1, 99, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.1.0004', 'RECEITA BRUTA - MERCADO EXTERNO', '', '');
INSERT INTO pis_0500 VALUES (20, 1, 100, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3200.1.0005', 'COFINS INCIDENTES SOBRE VENDAS', '', '');
INSERT INTO pis_0500 VALUES (21, 1, 101, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3200.1.0004', 'PIS INCIDENTES SOBRE VENDAS', '', '');
INSERT INTO pis_0500 VALUES (22, 1, 102, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3300.2.0001', 'OUTRAS RECEITAS OPERACIONAIS', '', '');
INSERT INTO pis_0500 VALUES (23, 1, 103, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.3.0001', 'CUSTOS - ENERGIA ELETRICA', '', '');
INSERT INTO pis_0500 VALUES (24, 1, 104, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.3.0002', 'CUSTOS - ALUGUEL INSTALACOES INDUSTRIAIS', '', '');
INSERT INTO pis_0500 VALUES (25, 1, 105, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.3.0004', 'CUSTOS - DEPRECIACAO MAQUINAS E EQUIPAMENTOS', '', '');
INSERT INTO pis_0500 VALUES (26, 1, 106, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.3.0005', 'CUSTOS - ARRENDAMENTO MAQUINAS E EQUIPAMENTOS', '', '');
INSERT INTO pis_0500 VALUES (27, 1, 107, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.3.0006', 'CUSTOS - SERVICOS DE TERCEIROS', '', '');
INSERT INTO pis_0500 VALUES (28, 1, 108, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.3.0007', 'CUSTOS - OUTROS', '', '');
INSERT INTO pis_0500 VALUES (29, 1, 109, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.4.0001', 'DESPESAS OPERACIONAIS - ENERGIA ELETRICA', '', '');
INSERT INTO pis_0500 VALUES (30, 1, 110, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.4.0002', 'DESPESAS OPERACIONAIS - DEPRECIACAO', '', '');
INSERT INTO pis_0500 VALUES (31, 1, 111, '0500', '2011-04-01 00:00:00', '01', 'A', '4', '3100.4.0003', 'DESPESAS OPERACIONAIS - ALUGUEIS', '', '');


INSERT INTO pis_0990 VALUES (1, 0, 112, '0990', 112);


INSERT INTO pis_1001 VALUES (1, 0, 244, '1001', 1);


INSERT INTO pis_1990 VALUES (1, 0, 245, '1990', 2);


INSERT INTO pis_9001 VALUES (1, 0, 246, '9001', 0);


INSERT INTO pis_9990 VALUES (1, 0, 307, '9990', 63);


INSERT INTO pis_9999 VALUES (1, 0, 308, '9999', 308);


INSERT INTO pis_a001 VALUES (1, 0, 113, 'A001', 0);


INSERT INTO pis_a010 VALUES (1, 1, 114, 'A010', '99999999000191');
INSERT INTO pis_a010 VALUES (2, 1, 120, 'A010', '99999999000272');


INSERT INTO pis_a100 VALUES (1, 1, 115, 'A100', '0', '1', 'F1', '00', '001', '', '23609', '', '2011-04-07 00:00:00', '2011-04-07 00:00:00', 212000.00, '0', 12000.00, 200000.00, 3300.00, 200000.00, 15200.00, NULL, NULL, 10000.00);
INSERT INTO pis_a100 VALUES (2, 1, 117, 'A100', '0', '1', 'F1', '00', '001', '', '23674', '', '2011-04-21 00:00:00', '2011-04-21 00:00:00', 86000.00, '0', 6000.00, 80000.00, 1320.00, 80000.00, 6080.00, NULL, NULL, 2400.00);
INSERT INTO pis_a100 VALUES (3, 2, 121, 'A100', '0', '1', 'F1', '00', '001', '', '23609', '', '2011-04-07 00:00:00', '2011-04-07 00:00:00', 212000.00, '0', 12000.00, 200000.00, 3300.00, 200000.00, 15200.00, NULL, NULL, 10000.00);


INSERT INTO pis_a170 VALUES (1, 1, 116, 'A170', '1', 'S1', 'SERVIÇOS LABORATORIAIS', 212000.00, 12000.00, '03', '0', '56', 200000.00, 1.65, 3300.00, '56', 200000.00, 7.60, 15200.00, '3100.3.0006', '');
INSERT INTO pis_a170 VALUES (2, 2, 118, 'A170', '1', 'S1', 'ANALISE DE PIGMENTACAO', 56000.00, 6000.00, '03', '0', '56', 50000.00, 1.65, 825.00, '56', 50000.00, 7.60, 3800.00, '3100.3.0006', '');
INSERT INTO pis_a170 VALUES (3, 2, 119, 'A170', '2', 'S1', 'MIXAGEM', 30000.00, NULL, '03', '0', '56', 30000.00, 1.65, 495.00, '56', 30000.00, 7.60, 2280.00, '3100.3.0006', '');
INSERT INTO pis_a170 VALUES (4, 3, 122, 'A170', '1', 'S1', 'SERVIÇOS DE TERCEIROS', 212000.00, 12000.00, '03', '0', '56', 200000.00, 1.65, 3300.00, '56', 200000.00, 7.60, 15200.00, '3100.3.0006', '');


INSERT INTO pis_a990 VALUES (1, 0, 123, 'A990', 11);


INSERT INTO pis_c001 VALUES (1, 0, 124, 'C001', 0);


INSERT INTO pis_c010 VALUES (1, 1, 125, 'C010', '99999999000191', NULL);
INSERT INTO pis_c010 VALUES (2, 1, 145, 'C010', '99999999000272', NULL);


INSERT INTO pis_c180 VALUES (1, 1, 126, 'C180', '55', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'P1', '32081010', NULL, 8200000.00);
INSERT INTO pis_c180 VALUES (3, 1, 136, 'C180', '55', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'P8', '87012000', NULL, 1000000.00);
INSERT INTO pis_c180 VALUES (2, 1, 133, 'C180', '55', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'P4', '87112010', NULL, 1800000.00);
INSERT INTO pis_c180 VALUES (4, 2, 146, 'C180', '55', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'P3', '29051210', NULL, 9000000.00);


INSERT INTO pis_c181 VALUES (1, 1, 127, 'C181', '01', '5101', 5200000.00, 200000.00, 5000000.00, 1.6500, NULL, NULL, 82500.00, '3100.1.0001');
INSERT INTO pis_c181 VALUES (2, 1, 128, 'C181', '09', '6101', 2000000.00, NULL, NULL, NULL, NULL, NULL, NULL, '3100.1.0001');
INSERT INTO pis_c181 VALUES (3, 1, 129, 'C181', '08', '7101', 1000000.00, NULL, NULL, NULL, NULL, NULL, 0.00, '3100.1.0004');
INSERT INTO pis_c181 VALUES (4, 2, 134, 'C181', '05', '5101', 1800000.00, NULL, 1800000.00, 0.6500, NULL, NULL, 11700.00, '');
INSERT INTO pis_c181 VALUES (5, 3, 137, 'C181', '02', '5101', 1000000.00, NULL, 1000000.00, 2.3000, NULL, NULL, 23000.00, '');
INSERT INTO pis_c181 VALUES (6, 4, 147, 'C181', '01', '5101', 5000000.00, NULL, 5000000.00, 1.6500, NULL, NULL, 82500.00, '3100.1.0001');
INSERT INTO pis_c181 VALUES (7, 4, 148, 'C181', '09', '6101', 4000000.00, NULL, 4000000.00, NULL, NULL, NULL, 0.00, '3100.1.0003');


INSERT INTO pis_c185 VALUES (1, 1, 130, 'C185', '01', '5101', 5200000.00, 200000.00, 5000000.00, 7.6000, NULL, NULL, 380000.00, '3100.1.0001');
INSERT INTO pis_c185 VALUES (2, 1, 131, 'C185', '09', '6101', 2000000.00, NULL, NULL, NULL, NULL, NULL, NULL, '3100.1.0001');
INSERT INTO pis_c185 VALUES (3, 1, 132, 'C185', '08', '7101', 1000000.00, NULL, NULL, NULL, NULL, NULL, 0.00, '3100.1.0004');
INSERT INTO pis_c185 VALUES (4, 2, 135, 'C185', '05', '5101', 1800000.00, NULL, 1800000.00, 3.0000, NULL, NULL, 54000.00, '');
INSERT INTO pis_c185 VALUES (5, 3, 138, 'C185', '02', '5101', 1000000.00, NULL, 1000000.00, 10.3000, NULL, NULL, 103000.00, '');
INSERT INTO pis_c185 VALUES (6, 4, 149, 'C185', '01', '5101', 5000000.00, NULL, 5000000.00, 7.6000, NULL, NULL, 380000.00, '3100.1.0001');
INSERT INTO pis_c185 VALUES (7, 4, 150, 'C185', '09', '6101', 4000000.00, NULL, 4000000.00, NULL, NULL, NULL, 0.00, '3100.1.0003');


INSERT INTO pis_c190 VALUES (1, 1, 139, 'C190', '55', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'P2', '22071000', NULL, 3200000.00);
INSERT INTO pis_c190 VALUES (2, 2, 151, 'C190', '55', '2011-04-01 00:00:00', '2011-04-30 00:00:00', 'P3', '29051210', NULL, 7900000.00);


INSERT INTO pis_c191 VALUES (1, 1, 140, 'C191', '88888888000191', '56', '1101', 3200000.00, NULL, 3200000.00, 1.6500, NULL, NULL, 52800.00, '1200.1.0001');
INSERT INTO pis_c191 VALUES (2, 2, 152, 'C191', '77777777000191', '56', '1101', 7900000.00, NULL, 7900000.00, 1.6500, NULL, NULL, 130350.00, '1200.1.0001');


INSERT INTO pis_c195 VALUES (1, 1, 141, 'C195', '88888888000191', '56', '1101', 3200000.00, NULL, 3200000.00, 7.6000, NULL, NULL, 243200.00, '1200.1.0001');
INSERT INTO pis_c195 VALUES (2, 2, 153, 'C195', '77777777000191', '56', '1101', 7900000.00, NULL, 7900000.00, 7.6000, NULL, NULL, 600400.00, '1200.1.0001');


INSERT INTO pis_c500 VALUES (1, 1, 142, 'C500', 'F1', '06', '00', '3059', '2', '178045', '2011-04-17 00:00:00', '2011-04-17 00:00:00', 1000000.00, NULL, '20000', 16500.00, 7600.00, NULL);


INSERT INTO pis_c501 VALUES (1, 1, 143, 'C501', '56', 1000000.00, '04', 1000000.00, 1.6500, 16500.00, '3100.3.0001');


INSERT INTO pis_c505 VALUES (1, 1, 144, 'C505', '56', 1000000.00, '04', 1000000.00, 7.6000, 76000.00, '3100.3.0001');


INSERT INTO pis_c990 VALUES (1, 0, 154, 'C990', 31);


INSERT INTO pis_d001 VALUES (1, 0, 155, 'D001', '0');


INSERT INTO pis_d010 VALUES (1, 1, 156, 'D010', '99999999000191');
INSERT INTO pis_d010 VALUES (2, 1, 163, 'D010', '99999999000272');


INSERT INTO pis_d100 VALUES (1, 1, 157, 'D100', '0', '1', 'F1', '07', '00', '0001', '2', '34007', '', '2011-04-12 00:00:00', '2011-04-12 00:00:00', '', '', 1000000.00, NULL, '2', 1000000.00, 1000000.00, 180000.00, NULL, '', '');
INSERT INTO pis_d100 VALUES (2, 1, 160, 'D100', '0', '1', 'F1', '07', '00', '0001', '2', '34015', '', '2011-04-19 00:00:00', '2011-04-19 00:00:00', '', '', 850000.00, NULL, '2', 850000.00, 850000.00, 143000.00, NULL, '', '');
INSERT INTO pis_d100 VALUES (3, 2, 164, 'D100', '0', '1', 'F1', '07', '00', '0001', '2', '34019', '', '2011-04-22 00:00:00', '2011-04-22 00:00:00', '', '', 700000.00, NULL, '2', 700000.00, 700000.00, 122000.00, NULL, '', '');


INSERT INTO pis_d101 VALUES (1, 1, 158, 'D101', '0', 1000000.00, '56', '07', 1000000.00, 1.6500, 16500.00, '3100.3.0007');
INSERT INTO pis_d101 VALUES (2, 2, 161, 'D101', '1', 850000.00, '70', '', NULL, NULL, NULL, '3100.3.0007');
INSERT INTO pis_d101 VALUES (3, 3, 165, 'D101', '0', 700000.00, '56', '07', 700000.00, 1.6500, 11550.00, '3100.3.0007');


INSERT INTO pis_d105 VALUES (1, 1, 159, 'D105', '0', 1000000.00, '56', '07', 1000000.00, 7.6000, 76000.00, '3100.3.0007');
INSERT INTO pis_d105 VALUES (2, 2, 162, 'D105', '1', 850000.00, '70', '', NULL, NULL, NULL, '3100.3.0007');
INSERT INTO pis_d105 VALUES (3, 3, 166, 'D105', '0', 700000.00, '56', '07', 700000.00, 7.6000, 53200.00, '3100.3.0007');

INSERT INTO pis_d990 VALUES (1, 0, 167, 'D990', 13);


INSERT INTO pis_f001 VALUES (1, 0, 168, 'F001', 0);


INSERT INTO pis_f010 VALUES (1, 1, 169, 'F010', '99999999000191');


INSERT INTO pis_f100 VALUES (1, 1, 170, 'F100', '0', 'F1', '', '2011-04-25 00:00:00', 100000.00, '56', 100000.0000, 1.6500, 1650.00, '56', 100000.0000, 7.6000, 7600.00, '05', '0', '3100.3.0002', '', '');
INSERT INTO pis_f100 VALUES (2, 1, 171, 'F100', '0', 'F1', '', '2011-04-29 00:00:00', 200000.00, '56', 200000.0000, 1.6500, 3300.00, '56', 200000.0000, 7.6000, 15200.00, '08', '0', '3100.3.0002', '', '');

INSERT INTO pis_f120 VALUES (1, 1, 172, 'F120', '09', '03', '0', '1', 280000.00, NULL, '56', 280000.00, 1.6500, 4620.00, '56', 280000.00, 7.6000, 21280.00, '3100.3.0004', '', 'DEPRECIAÇÃO INSTALAÇÕES MATRIZ');
INSERT INTO pis_f120 VALUES (2, 1, 173, 'F120', '09', '04', '0', '1', 110000.00, NULL, '56', 110000.00, 1.6500, 1815.00, '56', 110000.00, 7.6000, 8360.00, '3100.3.0004', '', 'DEPRECIAÇÃO INSTALAÇÕES FILIAL 2');
INSERT INTO pis_f120 VALUES (3, 1, 174, 'F120', '09', '05', '0', '1', 190000.00, NULL, '56', 190000.00, 1.6500, 3135.00, '56', 190000.00, 7.6000, 14440.00, '3100.3.0004', '', 'DEPRECIAÇÃO INSTALAÇÕES FILIAL 3');
INSERT INTO pis_f120 VALUES (4, 1, 175, 'F120', '09', '03', '0', '2', 150000.00, NULL, '56', 150000.00, 1.6500, 2475.00, '56', 150000.00, 7.6000, 11400.00, '3100.3.0004', '', 'DEPRECIAÇÃO INSTALAÇÕES FILIAL 4');
INSERT INTO pis_f120 VALUES (5, 1, 176, 'F120', '09', '04', '0', '2', 250000.00, NULL, '56', 250000.00, 1.6500, 4125.00, '56', 250000.00, 7.6000, 19000.00, '3100.3.0004', '', 'DEPRECIAÇÃO INSTALAÇÕES FILIAL 5');


INSERT INTO pis_f990 VALUES (1, 0, 177, 'F990', 10);


INSERT INTO pis_m001 VALUES (1, 0, 178, 'M001', 0);


INSERT INTO pis_m100 VALUES (1, 1, 'M100', '101', '0', 8713600.00, 1.6500, 0.000, NULL, 143774.40, 0.00, 0.00, 0.00, 143774.40, '0', 143774.40, 0.00);
INSERT INTO pis_m100 VALUES (2, 1, 'M100', '201', '0', 4668000.00, 1.6500, 0.000, NULL, 77022.00, 0.00, 0.00, 0.00, 77022.00, '1', 44225.60, 32796.40);
INSERT INTO pis_m100 VALUES (3, 1, 'M100', '301', '0', 778000.00, 1.6500, 0.000, NULL, 12837.00, 0.00, 0.00, 0.00, 12837.00, '1', 0.00, 12837.00);


INSERT INTO pis_m105 VALUES (1, 1, 'M105', '03', '56', 480000.00, 43200.00, 436800.00, 268800.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (2, 1, 'M105', '05', '56', 100000.00, 9000.00, 91000.00, 56000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (3, 1, 'M105', '07', '56', 1700000.00, 153000.00, 1547000.00, 952000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (4, 1, 'M105', '09', '56', 980000.00, 88200.00, 891800.00, 548800.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (5, 1, 'M105', '04', '56', 1000000.00, 90000.00, 910000.00, 560000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (6, 1, 'M105', '02', '56', 11100000.00, 999000.00, 10101000.00, 6216000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (7, 1, 'M105', '08', '56', 200000.00, 18000.00, 182000.00, 112000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (8, 2, 'M105', '03', '56', 480000.00, 43200.00, 436800.00, 144000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (9, 2, 'M105', '05', '56', 100000.00, 9000.00, 91000.00, 30000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (10, 2, 'M105', '07', '56', 1700000.00, 153000.00, 1547000.00, 510000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (11, 2, 'M105', '09', '56', 980000.00, 88200.00, 891800.00, 294000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (12, 2, 'M105', '04', '56', 1000000.00, 90000.00, 910000.00, 300000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (13, 2, 'M105', '02', '56', 11100000.00, 999000.00, 10101000.00, 3330000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (14, 2, 'M105', '08', '56', 200000.00, 18000.00, 182000.00, 60000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (15, 3, 'M105', '03', '56', 480000.00, 43200.00, 436800.00, 24000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (16, 3, 'M105', '05', '56', 100000.00, 9000.00, 91000.00, 5000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (17, 3, 'M105', '07', '56', 1700000.00, 153000.00, 1547000.00, 85000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (18, 3, 'M105', '09', '56', 980000.00, 88200.00, 891800.00, 49000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (19, 3, 'M105', '04', '56', 1000000.00, 90000.00, 910000.00, 50000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (20, 3, 'M105', '02', '56', 11100000.00, 999000.00, 10101000.00, 555000.00, NULL, 0.000, '');
INSERT INTO pis_m105 VALUES (21, 3, 'M105', '08', '56', 200000.00, 18000.00, 182000.00, 10000.00, NULL, 0.000, '');


INSERT INTO pis_m200 VALUES (1, 1, 'M200', 188000.00, 188000.00, 0.00, 0.00, 0.00, 0.00, 0.00, 11700.00, 0.00, 0.00, 11700.00, 11700.00);


INSERT INTO pis_m210 VALUES (1, 1, 'M210', '01', 10200000.00, 10000000.00, 1.6500, 0.000, NULL, 165000.00, 0.00, 0.00, 0.00, 0.00, 165000.00);
INSERT INTO pis_m210 VALUES (2, 1, 'M210', '31', 1800000.00, 1800000.00, 0.6500, 0.000, NULL, 11700.00, 0.00, 0.00, 0.00, 0.00, 11700.00);
INSERT INTO pis_m210 VALUES (3, 1, 'M210', '02', 1000000.00, 1000000.00, 2.3000, 0.000, NULL, 23000.00, 0.00, 0.00, 0.00, 0.00, 23000.00);


INSERT INTO pis_m400 VALUES (1, 1, 'M400', '08', 1000000.00, '3100.1.0004', 'Exportações');
INSERT INTO pis_m400 VALUES (2, 1, 'M400', '09', 6000000.00, NULL, NULL);


INSERT INTO pis_m410 VALUES (1, 1, 'M410', '401', 1000000.00, NULL, NULL);
INSERT INTO pis_m410 VALUES (2, 2, 'M410', '101', 6000000.00, '3100.1.0003', 'Venda a empreda preponderantemente exportadora');


INSERT INTO pis_m500 VALUES (1, 1, 'M500', '101', '0', 8713600.00, 7.6000, 0.000, NULL, 662233.60, 0.00, 0.00, 0.00, 662233.60, '0', 662233.60, 0.00);
INSERT INTO pis_m500 VALUES (2, 1, 'M500', '201', '0', 4668000.00, 7.6000, 0.000, NULL, 354768.00, 0.00, 0.00, 0.00, 354768.00, '1', 200766.40, 154001.60);
INSERT INTO pis_m500 VALUES (3, 1, 'M500', '301', '0', 778000.00, 7.6000, 0.000, NULL, 59128.00, 0.00, 0.00, 0.00, 59128.00, '1', 0.00, 59128.00);


INSERT INTO pis_m505 VALUES (1, 1, 'M505', '03', '56', 480000.00, 43200.00, 436800.00, 268800.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (2, 1, 'M505', '05', '56', 100000.00, 9000.00, 91000.00, 56000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (3, 1, 'M505', '07', '56', 1700000.00, 153000.00, 1547000.00, 952000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (4, 1, 'M505', '09', '56', 980000.00, 88200.00, 891800.00, 548800.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (5, 1, 'M505', '04', '56', 1000000.00, 90000.00, 910000.00, 560000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (6, 1, 'M505', '02', '56', 11100000.00, 999000.00, 10101000.00, 6216000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (7, 1, 'M505', '08', '56', 200000.00, 18000.00, 182000.00, 112000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (8, 2, 'M505', '03', '56', 480000.00, 43200.00, 436800.00, 144000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (9, 2, 'M505', '05', '56', 100000.00, 9000.00, 91000.00, 30000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (10, 2, 'M505', '07', '56', 1700000.00, 153000.00, 1547000.00, 510000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (11, 2, 'M505', '09', '56', 980000.00, 88200.00, 891800.00, 294000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (12, 2, 'M505', '04', '56', 1000000.00, 90000.00, 910000.00, 300000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (13, 2, 'M505', '02', '56', 11100000.00, 999000.00, 10101000.00, 3330000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (14, 2, 'M505', '08', '56', 200000.00, 18000.00, 182000.00, 60000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (15, 3, 'M505', '03', '56', 480000.00, 43200.00, 436800.00, 24000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (16, 3, 'M505', '05', '56', 100000.00, 9000.00, 91000.00, 5000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (17, 3, 'M505', '07', '56', 1700000.00, 153000.00, 1547000.00, 85000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (18, 3, 'M505', '09', '56', 980000.00, 88200.00, 891800.00, 49000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (19, 3, 'M505', '04', '56', 1000000.00, 90000.00, 910000.00, 50000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (20, 3, 'M505', '02', '56', 11100000.00, 999000.00, 10101000.00, 555000.00, NULL, 0.000, '');
INSERT INTO pis_m505 VALUES (21, 3, 'M505', '08', '56', 200000.00, 18000.00, 182000.00, 10000.00, NULL, 0.000, '');


INSERT INTO pis_m600 VALUES (1, 1, 'M600', 863000.00, 863000.00, 0.00, 0.00, 0.00, 0.00, 0.00, 54000.00, 0.00, 0.00, 54000.00, 54000.00);


INSERT INTO pis_m610 VALUES (1, 1, 'M610', '01', 10200000.00, 10000000.00, 7.6000, 0.000, NULL, 760000.00, 0.00, 0.00, 0.00, 0.00, 760000.00);
INSERT INTO pis_m610 VALUES (2, 1, 'M610', '31', 1800000.00, 1800000.00, 3.0000, 0.000, NULL, 54000.00, 0.00, 0.00, 0.00, 0.00, 54000.00);
INSERT INTO pis_m610 VALUES (3, 1, 'M610', '02', 1000000.00, 1000000.00, 10.3000, 0.000, NULL, 103000.00, 0.00, 0.00, 0.00, 0.00, 103000.00);


INSERT INTO pis_m800 VALUES (1, 1, 'M800', '08', 1000000.00, NULL, NULL);
INSERT INTO pis_m800 VALUES (2, 1, 'M800', '09', 6000000.00, NULL, NULL);


INSERT INTO pis_m810 VALUES (1, 1, 'M810', '401', 1000000.00, '3100.1.0004', 'Exportação');
INSERT INTO pis_m810 VALUES (2, 2, 'M810', '101', 6000000.00, '3100.1.0003', 'Venda a empreda preponderantemente exportadora');


INSERT INTO pis_m990 VALUES (1, 0, 243, 'M990', 66);


ALTER TABLE pis_0000
ADD CONSTRAINT pis_0000_pkey PRIMARY KEY (id);


ALTER TABLE pis_0001
ADD CONSTRAINT pis_0001_pkey PRIMARY KEY (id);


ALTER TABLE pis_0100
ADD CONSTRAINT pis_0100_pkey PRIMARY KEY (id);


ALTER TABLE pis_0110
ADD CONSTRAINT pis_0110_pkey PRIMARY KEY (id);


ALTER TABLE pis_0111
ADD CONSTRAINT pis_0111_pkey PRIMARY KEY (id);


ALTER TABLE pis_0120
ADD CONSTRAINT pis_0120_pkey PRIMARY KEY (id);


ALTER TABLE pis_0140
ADD CONSTRAINT pis_0140_pkey PRIMARY KEY (id);


ALTER TABLE pis_0145
ADD CONSTRAINT pis_0145_pkey PRIMARY KEY (id);


ALTER TABLE pis_0150
ADD CONSTRAINT pis_0150_pkey PRIMARY KEY (id);


ALTER TABLE pis_0190
ADD CONSTRAINT pis_0190_pkey PRIMARY KEY (id);


ALTER TABLE pis_0200
ADD CONSTRAINT pis_0200_pkey PRIMARY KEY (id);


ALTER TABLE pis_0205
ADD CONSTRAINT pis_0205_pkey PRIMARY KEY (id);


ALTER TABLE pis_0206
ADD CONSTRAINT pis_0206_pkey PRIMARY KEY (id);


ALTER TABLE pis_0208
ADD CONSTRAINT pis_0208_pkey PRIMARY KEY (id);


ALTER TABLE pis_0400
ADD CONSTRAINT pis_0400_pkey PRIMARY KEY (id);


ALTER TABLE pis_0450
ADD CONSTRAINT pis_0450_pkey PRIMARY KEY (id);


ALTER TABLE pis_0500
ADD CONSTRAINT pis_0500_pkey PRIMARY KEY (id);


ALTER TABLE pis_0600
ADD CONSTRAINT pis_0600_pkey PRIMARY KEY (id);


ALTER TABLE pis_0990
ADD CONSTRAINT pis_0990_pkey PRIMARY KEY (id);


ALTER TABLE pis_1001
ADD CONSTRAINT pis_1001_pkey PRIMARY KEY (id);


ALTER TABLE pis_1010
ADD CONSTRAINT pis_1010_pkey PRIMARY KEY (id);


ALTER TABLE pis_1020
ADD CONSTRAINT pis_1020_pkey PRIMARY KEY (id);


ALTER TABLE pis_1100
ADD CONSTRAINT pis_1100_pkey PRIMARY KEY (id);


ALTER TABLE pis_1101
ADD CONSTRAINT pis_1101_pkey PRIMARY KEY (id);


ALTER TABLE pis_1102
ADD CONSTRAINT pis_1102_pkey PRIMARY KEY (id);


ALTER TABLE pis_1200
ADD CONSTRAINT pis_1200_pkey PRIMARY KEY (id);


ALTER TABLE pis_1210
ADD CONSTRAINT pis_1210_pkey PRIMARY KEY (id);


ALTER TABLE pis_1220
ADD CONSTRAINT pis_1220_pkey PRIMARY KEY (id);


ALTER TABLE pis_1300
ADD CONSTRAINT pis_1300_pkey PRIMARY KEY (id);


ALTER TABLE pis_1500
ADD CONSTRAINT pis_1500_pkey PRIMARY KEY (id);


ALTER TABLE pis_1501
ADD CONSTRAINT pis_1501_pkey PRIMARY KEY (id);


ALTER TABLE pis_1502
ADD CONSTRAINT pis_1502_pkey PRIMARY KEY (id);


ALTER TABLE pis_1600
ADD CONSTRAINT pis_1600_pkey PRIMARY KEY (id);


ALTER TABLE pis_1610
ADD CONSTRAINT pis_1610_pkey PRIMARY KEY (id);


ALTER TABLE pis_1620
ADD CONSTRAINT pis_1620_pkey PRIMARY KEY (id);


ALTER TABLE pis_1700
ADD CONSTRAINT pis_1700_pkey PRIMARY KEY (id);


ALTER TABLE pis_1800
ADD CONSTRAINT pis_1800_pkey PRIMARY KEY (id);


ALTER TABLE pis_1990
ADD CONSTRAINT pis_1990_pkey PRIMARY KEY (id);


ALTER TABLE pis_9001
ADD CONSTRAINT pis_9001_pkey PRIMARY KEY (id);


ALTER TABLE pis_9900
ADD CONSTRAINT pis_9900_pkey PRIMARY KEY (id);


ALTER TABLE pis_9990
ADD CONSTRAINT pis_9990_pkey PRIMARY KEY (id);


ALTER TABLE pis_9999
ADD CONSTRAINT pis_9999_pkey PRIMARY KEY (id);


ALTER TABLE pis_a001
ADD CONSTRAINT pis_a001_pkey PRIMARY KEY (id);


ALTER TABLE pis_a010
ADD CONSTRAINT pis_a010_pkey PRIMARY KEY (id);


ALTER TABLE pis_a100
ADD CONSTRAINT pis_a100_pkey PRIMARY KEY (id);


ALTER TABLE pis_a110
ADD CONSTRAINT pis_a110_pkey PRIMARY KEY (id);


ALTER TABLE pis_a111
ADD CONSTRAINT pis_a111_pkey PRIMARY KEY (id);


ALTER TABLE pis_a120
ADD CONSTRAINT pis_a120_pkey PRIMARY KEY (id);


ALTER TABLE pis_a170
ADD CONSTRAINT pis_a170_pkey PRIMARY KEY (id);


ALTER TABLE pis_a990
ADD CONSTRAINT pis_a990_pkey PRIMARY KEY (id);


ALTER TABLE pis_c001
ADD CONSTRAINT pis_c001_pkey PRIMARY KEY (id);


ALTER TABLE pis_c010
ADD CONSTRAINT pis_c010_pkey PRIMARY KEY (id);


ALTER TABLE pis_c100
ADD CONSTRAINT pis_c100_pkey PRIMARY KEY (id);


ALTER TABLE pis_c110
ADD CONSTRAINT pis_c110_pkey PRIMARY KEY (id);


ALTER TABLE pis_c111
ADD CONSTRAINT pis_c111_pkey PRIMARY KEY (id);


ALTER TABLE pis_c120
ADD CONSTRAINT pis_c120_pkey PRIMARY KEY (id);


ALTER TABLE pis_c170
ADD CONSTRAINT pis_c170_pkey PRIMARY KEY (id);


ALTER TABLE pis_c180
ADD CONSTRAINT pis_c180_pkey PRIMARY KEY (id);


ALTER TABLE pis_c181
ADD CONSTRAINT pis_c181_pkey PRIMARY KEY (id);


ALTER TABLE pis_c185
ADD CONSTRAINT pis_c185_pkey PRIMARY KEY (id);


ALTER TABLE pis_c188
ADD CONSTRAINT pis_c188_pkey PRIMARY KEY (id);


ALTER TABLE pis_c190
ADD CONSTRAINT pis_c190_pkey PRIMARY KEY (id);


ALTER TABLE pis_c191
ADD CONSTRAINT pis_c191_pkey PRIMARY KEY (id);


ALTER TABLE pis_c195
ADD CONSTRAINT pis_c195_pkey PRIMARY KEY (id);


ALTER TABLE pis_c198
ADD CONSTRAINT pis_c198_pkey PRIMARY KEY (id);


ALTER TABLE pis_c199
ADD CONSTRAINT pis_c199_pkey PRIMARY KEY (id);


ALTER TABLE pis_c380
ADD CONSTRAINT pis_c380_pkey PRIMARY KEY (id);


ALTER TABLE pis_c381
ADD CONSTRAINT pis_c381_pkey PRIMARY KEY (id);


ALTER TABLE pis_c385
ADD CONSTRAINT pis_c385_pkey PRIMARY KEY (id);


ALTER TABLE pis_c395
ADD CONSTRAINT pis_c395_pkey PRIMARY KEY (id);


ALTER TABLE pis_c396
ADD CONSTRAINT pis_c396_pkey PRIMARY KEY (id);


ALTER TABLE pis_c400
ADD CONSTRAINT pis_c400_pkey PRIMARY KEY (id);


ALTER TABLE pis_c405
ADD CONSTRAINT pis_c405_pkey PRIMARY KEY (id);


ALTER TABLE pis_c481
ADD CONSTRAINT pis_c481_pkey PRIMARY KEY (id);


ALTER TABLE pis_c485
ADD CONSTRAINT pis_c485_pkey PRIMARY KEY (id);


ALTER TABLE pis_c489
ADD CONSTRAINT pis_c489_pkey PRIMARY KEY (id);


ALTER TABLE pis_c490
ADD CONSTRAINT pis_c490_pkey PRIMARY KEY (id);

ALTER TABLE pis_c491
ADD CONSTRAINT pis_c491_pkey PRIMARY KEY (id);

ALTER TABLE pis_c495
ADD CONSTRAINT pis_c495_pkey PRIMARY KEY (id);

ALTER TABLE pis_c499
ADD CONSTRAINT pis_c499_pkey PRIMARY KEY (id);

ALTER TABLE pis_c500
ADD CONSTRAINT pis_c500_pkey PRIMARY KEY (id);

ALTER TABLE pis_c501
ADD CONSTRAINT pis_c501_pkey PRIMARY KEY (id);

ALTER TABLE pis_c505
ADD CONSTRAINT pis_c505_pkey PRIMARY KEY (id);

ALTER TABLE pis_c509
ADD CONSTRAINT pis_c509_pkey PRIMARY KEY (id);

ALTER TABLE pis_c600
ADD CONSTRAINT pis_c600_pkey PRIMARY KEY (id);

ALTER TABLE pis_c601
ADD CONSTRAINT pis_c601_pkey PRIMARY KEY (id);

ALTER TABLE pis_c605
ADD CONSTRAINT pis_c605_pkey PRIMARY KEY (id);

ALTER TABLE pis_c609
ADD CONSTRAINT pis_c609_pkey PRIMARY KEY (id);

ALTER TABLE pis_c990
ADD CONSTRAINT pis_c990_pkey PRIMARY KEY (id);

ALTER TABLE pis_d001
ADD CONSTRAINT pis_d001_pkey PRIMARY KEY (id);

ALTER TABLE pis_d010
ADD CONSTRAINT pis_d010_pkey PRIMARY KEY (id);

ALTER TABLE pis_d100
ADD CONSTRAINT pis_d100_pkey PRIMARY KEY (id);

ALTER TABLE pis_d101
ADD CONSTRAINT pis_d101_pkey PRIMARY KEY (id);

ALTER TABLE pis_d105
ADD CONSTRAINT pis_d105_pkey PRIMARY KEY (id);

ALTER TABLE pis_d111
ADD CONSTRAINT pis_d111_pkey PRIMARY KEY (id);

ALTER TABLE pis_d200
ADD CONSTRAINT pis_d200_pkey PRIMARY KEY (id);

ALTER TABLE pis_d201
ADD CONSTRAINT pis_d201_pkey PRIMARY KEY (id);

ALTER TABLE pis_d205
ADD CONSTRAINT pis_d205_pkey PRIMARY KEY (id);

ALTER TABLE pis_d209
ADD CONSTRAINT pis_d209_pkey PRIMARY KEY (id);

ALTER TABLE pis_d300
ADD CONSTRAINT pis_d300_pkey PRIMARY KEY (id);

ALTER TABLE pis_d309
ADD CONSTRAINT pis_d309_pkey PRIMARY KEY (id);

ALTER TABLE pis_d350
ADD CONSTRAINT pis_d350_pkey PRIMARY KEY (id);

ALTER TABLE pis_d359
ADD CONSTRAINT pis_d359_pkey PRIMARY KEY (id);

ALTER TABLE pis_d500
ADD CONSTRAINT pis_d500_pkey PRIMARY KEY (id);

ALTER TABLE pis_d501
ADD CONSTRAINT pis_d501_pkey PRIMARY KEY (id);

ALTER TABLE pis_d505
ADD CONSTRAINT pis_d505_pkey PRIMARY KEY (id);

ALTER TABLE pis_d509
ADD CONSTRAINT pis_d509_pkey PRIMARY KEY (id);

ALTER TABLE pis_d600
ADD CONSTRAINT pis_d600_pkey PRIMARY KEY (id);

ALTER TABLE pis_d601
ADD CONSTRAINT pis_d601_pkey PRIMARY KEY (id);

ALTER TABLE pis_d605
ADD CONSTRAINT pis_d605_pkey PRIMARY KEY (id);

ALTER TABLE pis_d609
ADD CONSTRAINT pis_d609_pkey PRIMARY KEY (id);

ALTER TABLE pis_d990
ADD CONSTRAINT pis_d990_pkey PRIMARY KEY (id);

ALTER TABLE pis_f001
ADD CONSTRAINT pis_f001_pkey PRIMARY KEY (id);

ALTER TABLE pis_f010
ADD CONSTRAINT pis_f010_pkey PRIMARY KEY (id);

ALTER TABLE pis_f100
ADD CONSTRAINT pis_f100_pkey PRIMARY KEY (id);

ALTER TABLE pis_f111
ADD CONSTRAINT pis_f111_pkey PRIMARY KEY (id);

ALTER TABLE pis_f120
ADD CONSTRAINT pis_f120_pkey PRIMARY KEY (id);

ALTER TABLE pis_f129
ADD CONSTRAINT pis_f129_pkey PRIMARY KEY (id);

ALTER TABLE pis_f130
ADD CONSTRAINT pis_f130_pkey PRIMARY KEY (id);

ALTER TABLE pis_f139
ADD CONSTRAINT pis_f139_pkey PRIMARY KEY (id);

ALTER TABLE pis_f150
ADD CONSTRAINT pis_f150_pkey PRIMARY KEY (id);

ALTER TABLE pis_f200
ADD CONSTRAINT pis_f200_pkey PRIMARY KEY (id);

ALTER TABLE pis_f205
ADD CONSTRAINT pis_f205_pkey PRIMARY KEY (id);

ALTER TABLE pis_f210
ADD CONSTRAINT pis_f210_pkey PRIMARY KEY (id);

ALTER TABLE pis_f211
ADD CONSTRAINT pis_f211_pkey PRIMARY KEY (id);

ALTER TABLE pis_f600
ADD CONSTRAINT pis_f600_pkey PRIMARY KEY (id);

ALTER TABLE pis_f700
ADD CONSTRAINT pis_f700_pkey PRIMARY KEY (id);

ALTER TABLE pis_f800
ADD CONSTRAINT pis_f800_pkey PRIMARY KEY (id);

ALTER TABLE pis_f990
ADD CONSTRAINT pis_f990_pkey PRIMARY KEY (id);

ALTER TABLE pis_m001
ADD CONSTRAINT pis_m001_pkey PRIMARY KEY (id);

ALTER TABLE pis_m100
ADD CONSTRAINT pis_m100_pkey PRIMARY KEY (id);

ALTER TABLE pis_m105
ADD CONSTRAINT pis_m105_pkey PRIMARY KEY (id);

ALTER TABLE pis_m110
ADD CONSTRAINT pis_m110_pkey PRIMARY KEY (id);

ALTER TABLE pis_m200
ADD CONSTRAINT pis_m200_pkey PRIMARY KEY (id);

ALTER TABLE pis_m210
ADD CONSTRAINT pis_m210_pkey PRIMARY KEY (id);

ALTER TABLE pis_m211
ADD CONSTRAINT pis_m211_pkey PRIMARY KEY (id);

ALTER TABLE pis_m220
ADD CONSTRAINT pis_m220_pkey PRIMARY KEY (id);

ALTER TABLE pis_m230
ADD CONSTRAINT pis_m230_pkey PRIMARY KEY (id);

ALTER TABLE pis_m300
ADD CONSTRAINT pis_m300_pkey PRIMARY KEY (id);

ALTER TABLE pis_m350
ADD CONSTRAINT pis_m350_pkey PRIMARY KEY (id);

ALTER TABLE pis_m400
ADD CONSTRAINT pis_m400_pkey PRIMARY KEY (id);

ALTER TABLE pis_m410
ADD CONSTRAINT pis_m410_pkey PRIMARY KEY (id);

ALTER TABLE pis_m500
ADD CONSTRAINT pis_m500_pkey PRIMARY KEY (id);

ALTER TABLE pis_m505
ADD CONSTRAINT pis_m505_pkey PRIMARY KEY (id);

ALTER TABLE pis_m510
ADD CONSTRAINT pis_m510_pkey PRIMARY KEY (id);

ALTER TABLE pis_m600
ADD CONSTRAINT pis_m600_pkey PRIMARY KEY (id);

ALTER TABLE pis_m610
ADD CONSTRAINT pis_m610_pkey PRIMARY KEY (id);

ALTER TABLE pis_m611
ADD CONSTRAINT pis_m611_pkey PRIMARY KEY (id);

ALTER TABLE pis_m620
ADD CONSTRAINT pis_m620_pkey PRIMARY KEY (id);

ALTER TABLE pis_m630
ADD CONSTRAINT pis_m630_pkey PRIMARY KEY (id);

ALTER TABLE pis_m700
ADD CONSTRAINT pis_m700_pkey PRIMARY KEY (id);

ALTER TABLE pis_m800
ADD CONSTRAINT pis_m800_pkey PRIMARY KEY (id);

ALTER TABLE pis_m810
ADD CONSTRAINT pis_m810_pkey PRIMARY KEY (id);

ALTER TABLE pis_m990
ADD CONSTRAINT pis_m990_pkey PRIMARY KEY (id);

ALTER TABLE pis_p001
ADD CONSTRAINT pis_p001_pkey PRIMARY KEY (id);


ALTER TABLE pis_p010
ADD CONSTRAINT pis_p010_pkey PRIMARY KEY (id);

ALTER TABLE pis_p100
ADD CONSTRAINT pis_p100_pkey PRIMARY KEY (id);

ALTER TABLE pis_p110
ADD CONSTRAINT pis_p110_pkey PRIMARY KEY (id);


ALTER TABLE pis_p199
ADD CONSTRAINT pis_p199_pkey PRIMARY KEY (id);

ALTER TABLE pis_p200
ADD CONSTRAINT pis_p200_pkey PRIMARY KEY (id);

ALTER TABLE pis_p210
ADD CONSTRAINT pis_p210_pkey PRIMARY KEY (id);

ALTER TABLE pis_p990
ADD CONSTRAINT pis_p990_pkey PRIMARY KEY (id);


CREATE INDEX idx_chave_duplicidade ON pis_0120 (mes_dispensa);

CREATE INDEX idx_id_pai ON pis_0000 (id_pai);
