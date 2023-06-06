\echo ����� ���� �������
SELECT *
  FROM Jaegers;

\echo ����������� ������ �� ������������ �������

SELECT *
  FROM Jaegers
 WHERE status = 'Active';

\echo ����������� ������� ���������� �����: Mark-1 � Mark-4
SELECT *
  FROM Jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo ����������� ���� �������, ����� Mark-1 � Mark-4
SELECT *
  FROM Jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo ���������� ������� �� �������� �� ������� mark
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\echo ����������� ���������� � ����� ������ ������
SELECT *
  FROM Jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM Jaegers);

\echo ����������� �������, ������� ���������� ������ ���� kaiju
SELECT *
  FROM Jaegers
 WHERE kaijuKill =
       (SELECT MAX(kaijuKill)
          FROM Jaegers);

\echo ����������� �������� ���� �������
SELECT AVG(weight)
  FROM Jaegers;

\echo ���������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
UPDATE Jaegers
   SET kaijuKill = kaijuKill + 1
 WHERE status NOT IN ('Destroyed');

\echo �������� ������������ �������
DELETE
  FROM Jaegers
 WHERE status = 'Destroyed';