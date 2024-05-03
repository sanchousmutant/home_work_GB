#Изоляция по файловой системе

Подготовка к использованию chroot :

Посмотреть зависимости

ldd /bin/bash

1 Для начала, создадим каталог "testfolder" в домашнем каталоге пользователя и 
скопируем необходимые исполняемые файлы и библиотеки в эту папку:

Создаем каталоги

mkdir ~/testfolder
mkdir ~/testfolder/bin
mkdir ~/testfolder/lib ~/testfolder/lib64
mkdir ~/testfolder/lib ~/testfolder/lib64

2 Копируем файлы
исполняемые файлы
cp /bin/bash ~/testfolder/bin
библиотеки
cp /lib/x86_64-linux-gnu/libtinfo.so.6 ~/testfolder/lib
cp /lib/x86_64-linux-gnu/libc.so.6 ~/testfolder/lib
cp /lib64/ld-linux-x86-64.so.2 ~/testfolder/lib64/


3 Запустим команду chroot для изменения корневой папки нашей текущей среды:

sudo chroot ~/testfolder

Теперь мы находимся в изолированной среде с корнем, отличным от основной файловой системы.
Оболочка интерпретатора Bash запущена в этой изолированной среде.

4 Выполним команду

ls

bash: ls: command not found

Это произошло потому, что необходимо также скопировать исполняемые файлы, такие как "ls",
и связанные с ними библиотеки в созданный каталог.

exit

Посмотреть зависимости

ldd /bin/ls

Копируем файлы

cp /bin/ls ~/testfolder/bin/
cp /lib/x86_64-linux-gnu/libselinux.so.1 ~/testfolder/lib/
cp /lib/x86_64-linux-gnu/libpcre2-8.so.0 ~/testfolder/lib/

Заходим в изолированную среду

chroot ~/testfolder

ls 

#Пространство имен:

Пространство имен в Linux обеспечивает изоляцию процессов друг от друга
Создание #Пространства Имен для Сети:

Создадим папку "testns":

mkdir testns

Выполним команду

ip netns add testns

Это создаст изолированное сетевое окружение, похожее на свитч, к которому можно подключить процессы.

Запуск Процесса в Пространстве Имен:

Используя команду ip, мы можем выполнить процесс в созданном пространстве имен:

ip netns exec testns bash

Проверим изоляцию по сети

ip a

Хотя к файловой системе доступ епсть

ls

Даже в этой изолированной среде, мы по-прежнему можем использовать команду ps aux, чтобы увидеть процессы,
ограниченные только пространством имен.

ps aux

#Более Глубокая Изоляция

Применяя дополнительные параметры, мы можем углубить уровень изоляции:

Изоляция #по Процессам и Сети:
__
unshare --net --pid --fork --mount-proc /bin/bash

Проверим

ip a  #проверка изоляция сети

ps aux #проверка изоляции процессов

unshare Утилита которая позволяет это разграничивать -
--net — ограничевает сетевое пространство имен
-mount-proc — разграничивает процессы
--fork — изолирует память
--pid — изолирует дерево процессов
