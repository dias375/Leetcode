# Write your MySQL query statement below
Select name as Customers
from Customers
where id != All(select c.id
                from Customers c, Orders o
                where c.id = o.Customerid)