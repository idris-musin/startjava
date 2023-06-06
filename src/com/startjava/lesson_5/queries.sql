\echo Вывод всей таблицы
SELECT *
  FROM Jaegers;

\echo Отображение только не уничтоженных роботов

SELECT *
  FROM Jaegers
 WHERE status = 'Active';

\echo Отображение роботов нескольких серий: Mark-1 и Mark-4
SELECT *
  FROM Jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo Отображение всех роботов, кроме Mark-1 и Mark-4
SELECT *
  FROM Jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo Сортировка таблицы по убыванию по столбцу mark
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\echo Отображение информации о самом старом роботе
SELECT *
  FROM Jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM Jaegers);

\echo Отображение роботов, которые уничтожили больше всех kaiju
SELECT *
  FROM Jaegers
 WHERE kaijuKill =
       (SELECT MAX(kaijuKill)
          FROM Jaegers);

\echo Отображение среднего веса роботов
SELECT AVG(weight)
  FROM Jaegers;

\echo Увеличение на единицу количества уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers
   SET kaijuKill = kaijuKill + 1
 WHERE status NOT IN ('Destroyed');

\echo Удаление уничтоженных роботов
DELETE
  FROM Jaegers
 WHERE status = 'Destroyed';