# Write your MySQL query statement below
select s.user_id , Round(Avg(if(c.action='confirmed',1,0)),2) as confirmation_rate
from confirmations c
right join Signups s 
on s.user_id = c.user_id
group by s.user_id