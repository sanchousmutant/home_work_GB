/*Имеется база данных – социальная сеть.

База данных содержит сущности:
users – пользователи;
messages – сообщения;
friend_requests – заявки на дружбу;
communities – сообщества;
users_communities – пользователи сообществ;
media_types – типы медиа;
media – медиа;
likes – лайки;
profiles – профили пользователя.

У сущности «пользователи» имеются следующие поля(атрибуты):
id – идентификатор;
firstname – имя;
lastname - фамилия;
email - адрес электронной почты.

У сущности «сообщения» имеются следующие поля(атрибуты):
id – идентификатор;
from_user_id – отправитель;
to_user_id – получатель;
body - содержимое;
created_at - дата отправки.

Найти количество сообщений, отправленных каждым пользователей.
В зависимости от количества отправленных сообщений рассчитать ранг пользователей, первое место присвоив пользователю(ям) с наибольшим количеством отправленных сообщений.

Вывести полученный ранг, имя, фамилия, пользователя и кол-во отправленных сообщений. Выводимый список необходимо отсортировать в порядке возрастания ранга.*/

SELECT
    DENSE_RANK() OVER (ORDER BY cnt DESC) AS rank_message,
    users.firstname,
    users.lastname,
    COALESCE(cnt, 0) AS message_count
FROM
    users
LEFT JOIN
    (SELECT
         from_user_id,
         COUNT(*) AS cnt
     FROM
         messages
     GROUP BY
         from_user_id) messages ON users.id = messages.from_user_id
ORDER BY
    rank_message;
    
/*Получите список сообщений, отсортированных по возрастанию даты отправки.
Вычислите разность между соседними значениями дат отправки. Разности выразите в минутах.

Выведите идентификатор сообщения, дату отправки, дату отправки следующего сообщения и разницу даты отправки соседних сообщений.*/
   
SELECT
  m.id,
  m.created_at,
  LEAD(m.created_at) OVER (ORDER BY m.created_at) AS next_created_at,
  TIMESTAMPDIFF(MINUTE, m.created_at, LEAD(m.created_at) OVER (ORDER BY m.created_at)) AS diff_in_minutes
FROM
  messages m
ORDER BY
  m.created_at;