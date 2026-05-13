CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 
      # Write your MySQL query statement below.
   set N = N-1;
   return (select distinct(salary) from employee order by salary desc
   limit 1 offset N
  );
END