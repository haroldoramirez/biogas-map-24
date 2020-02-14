# --- Sample dataset

# --- !Ups

insert into usuario (nome, email, senha, papel, status, verificado, data_cadastro, data_alteracao, ultimo_acesso)
    values ('Administrador', 'administrador@cibiogas.org', '$2a$10$nbLHwCCpkqWbkUZEDX3G5e3CRDJuqTPgVRRfaNduKRiBdN8jVu7ai', 'ADMINISTRADOR', TRUE, TRUE, 'now', 'now', 'now');

insert into token_da_api (usuario_id, codigo, expicacao)
    values (1, 'D8E13FBA2F0F379C5A42C03026F4C9A8F5BCF346', '2028-12-22 14:42:23.383');

insert into situacao (nome, data_cadastro, data_alteracao) values ('Em Operação', 'now', 'now');
insert into situacao (nome, data_cadastro, data_alteracao) values ('Em Construção', 'now', 'now');
insert into situacao (nome, data_cadastro, data_alteracao) values ('Em Reforma', 'now', 'now');

insert into categoria (nome, data_cadastro, data_alteracao) values ('Agropecuária', 'now', 'now');
insert into categoria (nome, data_cadastro, data_alteracao) values ('Aterro Sanitário', 'now', 'now');
insert into categoria (nome, data_cadastro, data_alteracao) values ('Estação de Tratamento de Esgoto', 'now', 'now');
insert into categoria (nome, data_cadastro, data_alteracao) values ('Indústria', 'now', 'now');
insert into categoria (nome, data_cadastro, data_alteracao) values ('Codigestão', 'now', 'now');

insert into cooperativa (nome, data_cadastro, data_alteracao) values ('Cooperativa 1', 'now', 'now');

insert into tecnologia (nome, data_cadastro, data_alteracao) values ('Biodigestor', 'now', 'now');
insert into tecnologia (nome, data_cadastro, data_alteracao) values ('Compostagem', 'now', 'now');

insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (1, '< 1250 m³/dia', 1, 1250, 'now', 'now');
insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (1, '1251 a 2500 m³/dia', 2, 2500, 'now', 'now');
insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (2, '2501 a 8500 m³/dia', 3, 8500, 'now', 'now');
insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (2, '8501 a 12500 m³/dia', 4, 12500, 'now', 'now');
insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (3, '12501 a 85500 m³/dia', 5, 85500, 'now', 'now');
insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (3, '85501 a 350.000 m³/dia', 6, 350000, 'now', 'now');
insert into escala (intervalo, legenda, porte, valor, data_cadastro, data_alteracao) values (3, '> 350.000 m³/dia', 7, 351000, 'now', 'now');

insert into fonte_do_substrato (nome, categoria_id, data_cadastro, data_alteracao) values ('Suinocultura', 1, 'now', 'now');
insert into fonte_do_substrato (nome, categoria_id, data_cadastro, data_alteracao) values ('Suinocultura bovinocultura e/ou avicultura', 1, 'now', 'now');
insert into fonte_do_substrato (nome, categoria_id, data_cadastro, data_alteracao) values ('Bovinocultura de Leite ou Corte', 1, 'now', 'now');