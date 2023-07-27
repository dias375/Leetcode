# Write your MySQL query statement below
update Salary
set sex = case
WHEN sex = 'm' then 'f'
WHEN sex = 'f' then 'm'
END;