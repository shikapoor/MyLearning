insert into USER (id, active,email,is_enabled,is_expired, is_loacked, last_name, name, password)
values(1,true,'shikapoor@gmail.com', true, false, false, 'kapoor', 'shivani', '$2a$10$VEMkIJufSdWe9OvM7L7W7etmAbgqBCATM4omuiOQap7tKVw3o4HOS');

insert into roles(id,role) values(1, 'ADMIN');

insert into roles(id,role) values(2, 'USER');

insert into user_role(user_id,role_id) values(1,1);

insert into user_role(user_id,role_id) values(1,2);
