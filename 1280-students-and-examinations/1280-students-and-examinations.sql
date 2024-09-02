# Write your MySQL query statement below
select st.student_id, st.student_name, su.subject_name, (count(e.subject_name)) as attended_exams 
from students st
cross join subjects su
left join examinations e on st.student_id = e.student_id and
su.subject_name = e.subject_name 
group by student_id, student_name, subject_name
order by student_id, student_name