INSERT INTO role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO role (authority) VALUES ('ROLE_USER');

INSERT INTO users (birthday,name, age, email,user_name, password, account_non_expired, account_non_locked, credentials_non_expired, enabled, role_id) VALUES ('1970-01-01','admin', 30,'admin@mail.ru','admin','$2a$12$IJUOxFKRTi2KuwwPrQOhculKT/bq5zJDHxt1RROUL5BLVS4ZaNyse',true,true,true,true, 1);
INSERT INTO users (birthday,name, age, email,user_name, password, account_non_expired, account_non_locked, credentials_non_expired, enabled, role_id) VALUES ('1970-01-01','user', 30,'user@mail.ru','user','$2a$12$0pDazczhtN2L2REMfOdnV.WyuOzkaewvT4IM1WYeX8GyuSLNdQC.G', true,true,true,true, 2);

