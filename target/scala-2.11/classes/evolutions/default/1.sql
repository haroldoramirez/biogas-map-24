# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  id                            bigserial not null,
  nome                          varchar(255) not null,
  constraint pk_usuario primary key (id)
);


# --- !Downs

drop table if exists usuario cascade;

