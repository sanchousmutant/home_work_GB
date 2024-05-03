#1. Управление пользователями:
#a) создать нового пользователя;
sudo useradd -m -s /bin/bash useradd
#b) убедиться, что информация о нем появилась в соответствующих файлах в системе;
tail /etc/passwd
#c) удалить созданного пользователя;
sudo userdel -r user
#2. Управление группами:
#a) создать группу;
sudo groupadd user_group
tail /etc/groupadd
#b) попрактиковаться в смене групп у пользователей;
sudo usermod -G user_group user
#c) добавить пользователя в группу, не меняя основной;
sudo usermod -aG user_group user
#d) удалить пользователя из группы.
sudo deluser user user_group
#3. Работа с группами.
#a) Создать пользователя с правами суперпользователя. Проверить результат.
sudo usermod -aG sudo user
id user
#b) * Создать группу developer и нескольких пользователей, входящих в неё. 
sudo groupadd new_group
sudo usermod -aG new_group user1
sudo usermod -aG new_group user2
#Создать директорию для совместной работы.Сделать так, чтобы созданные одними пользователями файлы могли изменять другие пользователи этой группы.
mkdir group_dir
sudo chown :new_group group_dir
#c) * Создать в директории для совместной работы поддиректорию для обмена файлами, но чтобы удалять файлы могли только их создатели.
mkdir group_cloud
chmod u=rwx,g=r,o=r group_cloud
