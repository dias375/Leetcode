# Write your MySQL query statement below
select employee_id, salary as bonus
from Employees
where left(name,1) != 'M' and (employee_id % 2) > 0

union

select employee_id, 0 as bonus
from Employees
where left(name,1) = 'M' or (employee_id % 2) = 0

order by employee_id asc