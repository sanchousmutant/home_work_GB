https://docs.google.com/document/d/1t6e7d0R7NomOxUmiusuPAYbJC26Vyj8qbuqExJXhz6c/edit?usp=sharing

#Создаем docker-compose.yaml:

nano docker-compose.yaml

version: '3.1'
services:
  new-mysql:
    image: mysql:8.0.31
    environment:
      MYSQL_ROOT_PASSWORD: 123123
  myphp:
    image: phpmyadmin/phpmyadmin
    ports:
      - 8081:80
    depends_on:
      - new-mysql
    environment:
      PMA_HOST: new-mysql

#Запускаем:
	docker-compose up -d

test_docke_compose_new-mysql_1 is up-to-date
test_docke_compose_myphp_1 is up-to-date

#Смотрим запущенные контейнеры:
	docker ps

CONTAINER ID   IMAGE                   COMMAND                  CREATED         STATUS              PORTS                                   NAMES
9792f4fa8368   phpmyadmin/phpmyadmin   "/docker-entrypoint.…"   3 minutes ago   Up About a minute   0.0.0.0:8081->80/tcp, :::8081->80/tcp   test_docke_compose_myphp_1
4fc3b834c0c2   mysql:8.0.31            "docker-entrypoint.s…"   3 minutes ago   Up About a minute   3306/tcp, 33060/tcp                     test_docke_compose_new-mysql_1

#Проверяем:
http://localhost:8081

Пользователь: root 
Пароль: 123123	
