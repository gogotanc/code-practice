# 数据库的一些操作

### 开启远程访问权限

- mysql -h localhost -u root -p

- GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'gogotanc' WITH GRANT OPTION;

- FLUSH PRIVILEGES;