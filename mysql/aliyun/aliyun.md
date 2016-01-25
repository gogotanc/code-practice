# 阿里云数据库的一些操作
### 开启远程访问权限

mysql -h localhost -u root -p

GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'gogotanc' WITH GRANT OPTION;

FLUSH PRIVILEGES;

### 阿里云IP

121.42.172.30 (公)
10.251.37.90 (内)

115.28.194.40 (公)
10.144.65.65 (内)