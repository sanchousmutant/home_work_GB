# Установка docker

sudo apt update
sudo apt install apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
echo "deb [signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt update
sudo apt install docker-ce
sudo usermod -aG docker $USER # добавляем пользователя в группу docker
newgrp docker # применяем изменения
docker --version # проверяем

# Создание и запуск контейнеров

docker run # Запускает контейнер из образа
docker start # Запускает остановленный контейнер
docker stop # Останавливает работающий контейнер
docker restart # Перезапускает контейнер
docker exec # Выполняет команду внутри запущенного контейнера

#Управление контейнерами

docker rm $(docker ps -aq) # удалит все остановленные контейнеры
docker ps # Просмотр списка запущенных контейнеров
docker ps -a # Просмотр списка всех контейнеров (включая остановленные)
docker rm # Удаляет контейнер
docker logs # Просмотр логов контейнера

# Работа с образами
docker images # Просмотр списка образов
docker pull # Загрузка образа с Docker Hub
docker build # Сборка образа из Dockerfile
docker rmi # Удаляет образ
docker search # поиск образа

# Запуск контейнера из образа Ubuntu
docker run -it -h GB --name gb-test ubuntu:22.10
ls -l / # содержимое корневой дирректории

# Использование внешнего хранилища
mkdir /test/folder
docker run -it -h GB --name gb-test -v /test/folder:/otherway ubuntu:22.10 # монтируем эту папку контейнеру
echo "$HOSTNAME" >> /otherway/test.txt # добавляем данные
exit
cat /test/folder/test.txt # проверяем