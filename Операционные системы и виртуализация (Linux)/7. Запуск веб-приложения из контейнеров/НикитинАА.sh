#2. Установить Docker.
apt install docker.io
#3. Запустить контейнер с Ubuntu.
sudo su
docker search ubuntu
docker pull ubuntu
docker images
docker run ubuntu
docker ps -a
