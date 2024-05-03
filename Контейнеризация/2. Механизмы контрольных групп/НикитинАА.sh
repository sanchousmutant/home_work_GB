# Установка lxc
apt-get install lxc debootstrap bridge-utils lxc-templates
apt-get install lxd-installer
lxd init # оставляем все значения поумолчанию (Enter)
lxc storage list # проверяем

# Создание контейнера c Ubuntu
lxc-create -n test123 -t ubuntu #создаем контейнер
lxc-start -n test123 #запускаем
lxc-attach -n teat123 #входим в контейнер
free -m #проверяем память
exit #выходим
lxc-stop -n test123 #закрываем

# Ограничение контейнера 256 Мб ОЗУ

nano /var/lib/lxc/test123/config

lxc.cgroup2.memory.max = 256M  # добавляем строчку

lxc-start -n test123 #запускаем
lxc-attach -n teat123 #входим
free -m #проверяем пямаять

# Добавление автозапуск контейнеру
nano /var/lib/lxc/test123/config

lxc.start.auto = 1 # добавляем строчку

reboot

lxc-ls -f # проверяем статус контейнера

#  Указать файл, куда записывать логи
nano /var/lib/lxc/test123/config

lxc.log.file = /home/alexandr/GB/test123.log # добавляем строчку
