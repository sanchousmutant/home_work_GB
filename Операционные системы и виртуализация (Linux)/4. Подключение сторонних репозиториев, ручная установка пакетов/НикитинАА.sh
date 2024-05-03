# Подключить репозиторий с nginx любым удобным способом

sudo apt-add-repository ppa:nginx/stable

# Установить nginx 

sudo apt install nginx

apt list nginx

Вывод списка… Готово

nginx/jammy-updates,now 1.18.0-6ubuntu14.4 amd64 [установлен]

# Удалить nginx

sudo dpkg -P nginx

# Установить пакет на свой выбор, используя snap

sudo snap install chromium

chromium 122.0.6261.128 от Canonical✓ установлен

# Создать с помощью nano файл test.txt

sudo nano test.txt

# Настроить автоматический бэкап этого файла раз в 10 минут в файл
# с названием test.txt.bak с использованием cron

crontab –e

*/10 * * * * cp test.txt test.txt.bak