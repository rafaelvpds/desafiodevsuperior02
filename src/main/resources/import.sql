INSERT INTO tb_participants (name, email) VALUES ('Jose Silva', 'jose@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Thiago Faria', 'thiago@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Maria do Rosario', 'maria@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');


INSERT INTO tb_categories (description) VALUES ('Curso');
INSERT INTO tb_categories (description) VALUES ('Oficina');







INSERT INTO tb_activities (name, description,price,categorie_id) VALUES ('Curso de HTML', 'Aprenda Html de forma pratica', 80.00,1);
INSERT INTO tb_activities (name, description,price,categorie_id) VALUES ('Oficina de GitHub', 'Controle de versao dos seus projetos', 50.00,2);

INSERT INTO tb_activity_participant (activity_id,participant_id) VALUES (1,1);
INSERT INTO tb_activity_participant (activity_id,participant_id) VALUES (1,2);
INSERT INTO tb_activity_participant (activity_id,participant_id) VALUES (1,3);
INSERT INTO tb_activity_participant (activity_id,participant_id) VALUES (2,1);
INSERT INTO tb_activity_participant (activity_id,participant_id) VALUES (2,3);
INSERT INTO tb_activity_participant (activity_id,participant_id) VALUES (2,4);


INSERT INTO tb_blocks (start,finish, atividades_id) VALUES ('2017-09-25T08:00:00Z','2017-09-25T11:00:00Z', 1);
INSERT INTO tb_blocks (start,finish, atividades_id) VALUES ('2017-09-25T14:00:00Z','2017-09-25T18:00:00Z',2);
INSERT INTO tb_blocks (start,finish, atividades_id) VALUES ('2017-09-26T08:00:00Z','2017-09-26T11:00:00Z',2);
