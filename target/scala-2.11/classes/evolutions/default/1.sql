# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoria (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  data_cadastro                 date,
  data_alteracao                date,
  constraint pk_categoria primary key (id)
);

create table cooperativa (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  data_cadastro                 date,
  data_alteracao                date,
  constraint pk_cooperativa primary key (id)
);

create table escala (
  id                            bigserial not null,
  valor                         bigint not null,
  intervalo                     bigint not null,
  legenda                       varchar(255) not null,
  porte                         bigint not null,
  data_cadastro                 date,
  data_alteracao                date,
  constraint pk_escala primary key (id)
);

create table estado (
  id                            bigserial not null,
  ibge_code                     bigint,
  nome                          varchar(80),
  sigla                         varchar(4),
  regiao                        varchar(50),
  constraint pk_estado primary key (id)
);

create table fonte_do_substrato (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  categoria_id                  bigint,
  data_cadastro                 date,
  data_alteracao                date,
  constraint pk_fonte_do_substrato primary key (id)
);

create table log (
  id                            bigserial not null,
  mensagem                      varchar(500) not null,
  navegador                     varchar(100),
  versao                        varchar(100),
  so                            varchar(100),
  data_cadastro                 timestamp not null,
  constraint pk_log primary key (id)
);

create table municipio (
  id                            bigserial not null,
  nome                          varchar(255),
  uf                            varchar(255),
  estado_id                     bigint,
  constraint pk_municipio primary key (id)
);

create table registro_de_acesso (
  id                            bigserial not null,
  usuario_id                    bigint,
  uri                           varchar(255),
  data_de_acesso                timestamp not null,
  constraint pk_registro_de_acesso primary key (id)
);

create table situacao (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  data_cadastro                 date,
  data_alteracao                date,
  constraint pk_situacao primary key (id)
);

create table tecnologia (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  data_cadastro                 date,
  data_alteracao                date,
  constraint pk_tecnologia primary key (id)
);

create table token (
  token                         varchar(255) not null,
  usuario_id                    bigint,
  type                          varchar(8),
  date_creation                 date,
  email                         varchar(255),
  constraint ck_token_type check (type in ('password','email')),
  constraint pk_token primary key (token)
);

create table token_da_api (
  id                            bigserial not null,
  usuario_id                    bigint,
  codigo                        varchar(255),
  expicacao                     timestamp,
  constraint uq_token_da_api_usuario_id unique (usuario_id),
  constraint pk_token_da_api primary key (id)
);

create table token_de_cadastro (
  id                            bigserial not null,
  codigo                        varchar(255),
  usuario_id                    bigint,
  constraint uq_token_de_cadastro_usuario_id unique (usuario_id),
  constraint pk_token_de_cadastro primary key (id)
);

create table unidade (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  situacao_id                   bigint,
  escala_id                     bigint,
  fonte_do_substrato_id         bigint,
  tecnologia_id                 bigint,
  municipio_id                  bigint,
  biogas_para_energia_termica   boolean not null,
  biogas_para_energia_eletrica  boolean not null,
  biogas_para_energia_mecanica  boolean not null,
  biogas_para_biometano         boolean not null,
  valor_estimado                boolean not null,
  codigo                        bigint not null,
  latitude                      float not null,
  longitude                     float not null,
  producao_diaria               bigint not null,
  producao_anual                bigint not null,
  ano_de_inicio_operacao        varchar(255) not null,
  emissaode_geeevitado          bigint not null,
  volume_dejeto_tratado_dia     bigint not null,
  volume_dejeto_tratado_ano     bigint not null,
  volume_compostagem_dia        bigint not null,
  volume_compostagem_ano        bigint not null,
  producao_biogas_dia           bigint not null,
  producao_biogas_ano           bigint not null,
  data_cadastro                 timestamp,
  data_alteracao                timestamp,
  constraint pk_unidade primary key (id)
);

create table usuario (
  id                            bigserial not null,
  nome                          varchar(255),
  email                         varchar(255),
  senha                         varchar(255),
  verificado                    boolean,
  confirmacao_token             varchar(255),
  papel                         varchar(13),
  status                        boolean not null,
  data_cadastro                 date,
  data_alteracao                date,
  ultimo_acesso                 timestamp not null,
  constraint ck_usuario_papel check (papel in ('USUARIO','SUPERVISOR','GERENTE','ADMINISTRADOR')),
  constraint pk_usuario primary key (id)
);

alter table fonte_do_substrato add constraint fk_fonte_do_substrato_categoria_id foreign key (categoria_id) references categoria (id) on delete restrict on update restrict;
create index ix_fonte_do_substrato_categoria_id on fonte_do_substrato (categoria_id);

alter table municipio add constraint fk_municipio_estado_id foreign key (estado_id) references estado (id) on delete restrict on update restrict;
create index ix_municipio_estado_id on municipio (estado_id);

alter table registro_de_acesso add constraint fk_registro_de_acesso_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_registro_de_acesso_usuario_id on registro_de_acesso (usuario_id);

alter table token_da_api add constraint fk_token_da_api_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;

alter table token_de_cadastro add constraint fk_token_de_cadastro_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;

alter table unidade add constraint fk_unidade_situacao_id foreign key (situacao_id) references situacao (id) on delete restrict on update restrict;
create index ix_unidade_situacao_id on unidade (situacao_id);

alter table unidade add constraint fk_unidade_escala_id foreign key (escala_id) references escala (id) on delete restrict on update restrict;
create index ix_unidade_escala_id on unidade (escala_id);

alter table unidade add constraint fk_unidade_fonte_do_substrato_id foreign key (fonte_do_substrato_id) references fonte_do_substrato (id) on delete restrict on update restrict;
create index ix_unidade_fonte_do_substrato_id on unidade (fonte_do_substrato_id);

alter table unidade add constraint fk_unidade_tecnologia_id foreign key (tecnologia_id) references tecnologia (id) on delete restrict on update restrict;
create index ix_unidade_tecnologia_id on unidade (tecnologia_id);

alter table unidade add constraint fk_unidade_municipio_id foreign key (municipio_id) references municipio (id) on delete restrict on update restrict;
create index ix_unidade_municipio_id on unidade (municipio_id);


# --- !Downs

alter table fonte_do_substrato drop constraint if exists fk_fonte_do_substrato_categoria_id;
drop index if exists ix_fonte_do_substrato_categoria_id;

alter table municipio drop constraint if exists fk_municipio_estado_id;
drop index if exists ix_municipio_estado_id;

alter table registro_de_acesso drop constraint if exists fk_registro_de_acesso_usuario_id;
drop index if exists ix_registro_de_acesso_usuario_id;

alter table token_da_api drop constraint if exists fk_token_da_api_usuario_id;

alter table token_de_cadastro drop constraint if exists fk_token_de_cadastro_usuario_id;

alter table unidade drop constraint if exists fk_unidade_situacao_id;
drop index if exists ix_unidade_situacao_id;

alter table unidade drop constraint if exists fk_unidade_escala_id;
drop index if exists ix_unidade_escala_id;

alter table unidade drop constraint if exists fk_unidade_fonte_do_substrato_id;
drop index if exists ix_unidade_fonte_do_substrato_id;

alter table unidade drop constraint if exists fk_unidade_tecnologia_id;
drop index if exists ix_unidade_tecnologia_id;

alter table unidade drop constraint if exists fk_unidade_municipio_id;
drop index if exists ix_unidade_municipio_id;

drop table if exists categoria cascade;

drop table if exists cooperativa cascade;

drop table if exists escala cascade;

drop table if exists estado cascade;

drop table if exists fonte_do_substrato cascade;

drop table if exists log cascade;

drop table if exists municipio cascade;

drop table if exists registro_de_acesso cascade;

drop table if exists situacao cascade;

drop table if exists tecnologia cascade;

drop table if exists token cascade;

drop table if exists token_da_api cascade;

drop table if exists token_de_cadastro cascade;

drop table if exists unidade cascade;

drop table if exists usuario cascade;

