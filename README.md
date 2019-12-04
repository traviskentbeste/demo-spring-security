# demo-spring-security
Demo Spring Security

Table of contents
=================
<!--ts-->
   * [Installation](#installation)
   * [H2 Database](#h2-database)
   * [Endpoints](#endpoints)
   * [Attachments](#attachments)
<!--te-->

Installation
============

built with https://start.spring.io/

```
spring boot devtools
spring web
spring data jpa
h2 database
spring security
```

MYSQL Database
============
Table setup
```
create table user (
id int not null auto_increment, 
username varchar(32), 
password varchar(64), 
primary key (id)
);

insert into user (username, password) values ('demo', 'demo');
```

 
Helpful SQL to run
```
select * from user;
+----+----------+----------+
| id | username | password |
+----+----------+----------+
|  1 | demo     | demo     |
+----+----------+----------+
1 row in set (0.00 sec)
```