# Write your MySQL query statement below
With previousweatherdata as (
    select id, recorddate, temperature,
    LAG(temperature,1) over (order by recorddate) as prevtemp,
    LAG(recorddate, 1) over (order by recorddate) as prevdate
    from weather
)
select id from previousweatherdata where temperature > prevtemp
and recorddate = DATE_ADD(prevdate, INTERVAL 1 DAY)

