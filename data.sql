INSERT INTO _user (id, email, name, password)
VALUES (1, 'abc@miu.edu', 'umur', '$2a$12$UZNH8fLGMaB7QLgZmTlMk.amto5fmIzRAKqEa5XFKqJUjxZ1L/nw6'),
       (2, 'john@miu.edu', 'john', '$2a$12$UZNH8fLGMaB7QLgZmTlMk.amto5fmIzRAKqEa5XFKqJUjxZ1L/nw6'),
       (3, 'dean@miu.edu', 'Dean', '$2a$12$UZNH8fLGMaB7QLgZmTlMk.amto5fmIzRAKqEa5XFKqJUjxZ1L/nw6'); --123

INSERT INTO role (id, role)
VALUES (1, 'ADMIN'),(2, 'USER');

INSERT INTO _user_roles (user_id, roles_id)
VALUES (1, 1);
INSERT INTO _user_roles (user_id, roles_id)
VALUES (2, 2);
INSERT INTO _user_roles (user_id, roles_id)
VALUES (3, 2);