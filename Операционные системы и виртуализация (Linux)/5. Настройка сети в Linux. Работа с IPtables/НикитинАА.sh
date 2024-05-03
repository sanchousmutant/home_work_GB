# 1. Настроить iptables: разрешить подключения только на 22-й и 80-й порты.
sudo iptables -A INPUT -p tcp --dport 22 -j ACCEPT
sudo iptables -A INPUT -p tcp --dport 80 -j ACCEPT
#sudo iptables -A INPUT -p tcp -m multiport --dport 22,80 -j ACCEPT
# 2. Настроить проброс портов локально с порта 80 на порт 8080
sudo iptables -t nat -I PREROUTING -p tcp --dport 80 -j REDIRECT --to-port 8080
sudo iptables -L -nv -t nat # проверка
# 3. Запретить любой входящий трафик с IP-адреса 3.4.5.6
sudo iptables -t filter -A INPUT -s 3.4.5.6 -j DROP 
# 4. Запустите mc. Используя ps, найдите PID процесса, завершите процесс, передав ему сигнал 9.
ps aux | grep mc
kill -s 9 #PID mc
