use mysql;
select host, user from user;
-- 设置root用户密码
update mysql.user set authentication_string=password('root') where user='root';
