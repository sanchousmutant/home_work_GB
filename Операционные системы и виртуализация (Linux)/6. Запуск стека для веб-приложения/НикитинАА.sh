#1. Установить Nginx
sudo apt install nginx
sudo ss -ntlp #проверили порты
#2. * настроить Nginx на работу с PHP-FPM.
sudo apt install php-fpm
sudo nano /etc/php/8.1/fpm/pool.d/www.conf
listen = /run/php/php8.1-fpm.sock #копируем путь 
sudo nano /etc/nginx/sites-available/default
location ~ \.php$ {

                include snippets/fastcgi-php.conf;

        #

        #       # With php-fpm (or other unix sockets):

                fastcgi_pass unix:/run/php/php8.1-fpm.sock; #вставляем путь

        #       # With php-cgi (or other tcp sockets):

        #       fastcgi_pass 127.0.0.1:9000;

        }
sudo systemctl reload nginx
#3. Установить Apache.
sudo apt install apache2
sudo nano /etc/apache2/ports.conf
Listen 8080 #изменяем порт
<IfModule ssl_module>
#       Listen 443
</IfModule>
<IfModule mod_gnutls.c>
#       Listen 443
</IfModule>
sudo nano /etc/apache2/sites-available/000-default.conf
<VirtualHost *:8080> #изменяем порт
sudo apachectl -t #проверяем синтаксис
sudo systemctl reload apache2
sudo ss -ntlp #проверили порты
#4. * Настроить обработку PHP. Добиться одновременной работы с Nginx.
sudo apt install libapache2-mod-php8.1 php8.1
sudo nano /var/www/html/info.php
<?php
phpinfo();
?>
sudo systemctl reload apache2
http://localhost/info.php
#5. Настроить схему обратного прокси для Nginx (динамика - на Apache).
sudo nano /etc/nginx/sites-available/default
location / {

                # First attempt to serve request as file, then

                # as directory, then fall back to displaying a 404.

                #try_files $uri $uri/ =404;

                proxy_pass http://localhost:8080; # port apache2

                proxy_set_header Host $host;

                proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;

                proxy_set_header X-Real-IP $remote_addr;

        }
sudo systemctl reload nginx

#6. Установить MySQL. Создать новую базу данных и таблицу в ней.
sudo apt install mysql-server-8.0
sudo mysql -u root -p
create database phonebook;
use phonebook;
create table phonebook(id int, name varchar(20), number int);
insert into phonebook values (1, 'Ivanov', 123456),(2, 'Petrov', 123123),(3, 'Sidorov', 123789);
select * from phonebook;
#7. * Установить пакет phpmyadmin и запустить его веб-интерфейс для управления MySQL.
sudo apt install phpmyadmin
sudo nano /etc/apache2/apache2.conf
Include /etc/phpmyadmin/apache.conf #в конец файла
sudo systemctl reload apache2
http://localhost:8080/phpmyadmin/ # http://localhost/phpmyadmin/ после логин/пароль 404 