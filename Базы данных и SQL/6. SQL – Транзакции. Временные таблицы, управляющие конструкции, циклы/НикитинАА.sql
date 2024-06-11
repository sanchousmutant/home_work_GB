/*1. Создайте таблицу users_old, аналогичную таблице users. Создайте процедуру, с
помощью которой можно переместить любого (одного) пользователя из таблицы
users в таблицу users_old. (использование транзакции с выбором commit или rollback –
обязательно).*/
-- создание таблицы
DROP TABLE IF EXISTS users_old;
CREATE TABLE users_old (
	id SERIAL PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50) COMMENT 'Фамилия',
    email VARCHAR(120) UNIQUE
);

DROP PROCEDURE IF EXISTS move_user;
DELIMITER //
-- создание процедуры
CREATE PROCEDURE move_user(
  IN move_user_id INT, OUT tran_result varchar(100)
)
  BEGIN
	DECLARE count_user_id int;
	-- проверка пользователя
	SELECT COUNT(*) INTO count_user_id
  	FROM users
  	WHERE id = move_user_id;
  	
  	IF count_user_id = 0 THEN
        set tran_result = CONCAT('Пользователь с ID = ', move_user_id, ' не найден в таблице users.');
        ROLLBACK;
	ELSE  
	
	    START TRANSACTION;
	   	-- перемещение
	    INSERT INTO users_old (id, firstname, lastname, email)
	    SELECT id, firstname, lastname, email 
	    FROM users
	    WHERE id = move_user_id;
		-- удаление
	    DELETE FROM users
	    WHERE id = move_user_id;
	   
	    set tran_result = 'ok';
		COMMIT;
	
	END IF;
END //

DELIMITER ;
-- запуск процедуры
call move_user (2, @tran_result);
select @tran_result;

/*2. Создайте хранимую функцию hello(), которая будет возвращать приветствие, в
зависимости от текущего времени суток. С 6:00 до 12:00 функция должна возвращать
фразу "Доброе утро", с 12:00 до 18:00 функция должна возвращать фразу "Добрый
день", с 18:00 до 00:00 — "Добрый вечер", с 00:00 до 6:00 — "Доброй ночи".*/

DROP FUNCTION IF EXISTS lesson_4.hello;

DELIMITER $$
$$
CREATE FUNCTION lesson_4.hello()
RETURNS VARCHAR(255) READS SQL DATA
BEGIN
	DECLARE current_hour INT;

  	SET current_hour = HOUR(CURRENT_TIME());

  	IF current_hour >= 6 AND current_hour < 12 THEN
    	RETURN 'Доброе утро';
   
  	ELSEIF current_hour >= 12 AND current_hour < 18 THEN
    	RETURN 'Добрый день';
   
 	ELSEIF current_hour >= 18 AND current_hour < 0 THEN
    	RETURN 'Добрый вечер';
   
  	ELSE
    	RETURN 'Доброй ночи';
  	END IF;
END$$

select hello();


/*3. Создайте таблицу logs типа Archive. Пусть при каждом создании записи
в таблицах users, communities и messages в таблицу logs помещается время и дата
создания записи, название таблицы, идентификатор первичного ключа.*/

-- создание таблицы

DROP TABLE IF EXISTS logs;
CREATE TABLE logs (
  log_id INT PRIMARY KEY AUTO_INCREMENT,
  timestamp DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  table_name VARCHAR(255) NOT NULL,
  pk_id INT NOT NULL
) ENGINE = Archive;

-- создание триггера

DELIMITER $$

CREATE TRIGGER log_user_insert
AFTER INSERT ON users -- communities, messages
FOR EACH ROW
BEGIN
  INSERT INTO logs (table_name, pk_id)
  VALUES ('users', NEW.id);
END $$

DELIMITER ;

-- запуск процедуры добавления пользователя
CALL sp_user_add('Сидоров', 'Сидр', 'sidr@mail.ru', 123454, 'Novosib', NULL, '2019-01-01', @tran_result);

-- проверка транзакции
SELECT @tran_result;

-- распечатка таблицы logs
SELECT * FROM logs;

















