# Write your MySQL query statement below

with first_sales as (
select product_id,  min(year) as first_year from sales group by product_id)
select f.product_id, f.first_year, s.quantity, s.price from first_sales f
left join sales s on f.product_id = s.product_id and f.first_year = s.year