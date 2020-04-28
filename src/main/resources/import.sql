INSERT INTO usuarios (username,password,enable,nombre,ape1,email) VALUES ('usuario_agu','$2a$10$hbIGtFubM5rRZKOc5aLznerHYRyc7oPTWYe5sW7r/IjLZY28fKLvm',1,'Agustin','Muñoz','agustin@gmail.com');
INSERT INTO usuarios (username,password,enable,nombre,ape1,email) VALUES ('usuario_antonio','$2a$10$yIP/K8SHBFxslFiM1WitxOoGVDR2O6NsnVq2qwpHuBMUWW5tLA9dq',1,'Antonio','Pérez','antonio@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (usuario_id,role_id) VALUES (1,1);
INSERT INTO usuarios_to_roles (usuario_id,role_id) VALUES (2,2);
INSERT INTO usuarios_to_roles (usuario_id,role_id) VALUES (2,1);