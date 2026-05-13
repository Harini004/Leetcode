# Write your MySQL query statement below
with email_order as (
select id, row_number() over (partition by email order by id) as row_num from person ) 

delete  from person where id in(
select id from email_order where row_num > 1)