# Write your MySQL query statement below

with highest_sal as (
select id, salary, dense_rank() over (order by salary desc) as salary_rank from Employee)
select (select salary from highest_sal where salary_rank = 2 limit 1 ) as SecondHighestSalary;
