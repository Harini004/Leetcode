# Write your MySQL query statement below

with activity_ranking as (
select player_id, min(event_date) as first_date from activity group by player_id)
select round(count(b.player_id)/count(a.player_id),2) as fraction
from activity_ranking a left join activity b
on a.player_id = b.player_id
and b.event_date = a.first_date + INTERVAL 1 DAY
