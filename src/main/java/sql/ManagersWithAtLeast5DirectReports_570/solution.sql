-- https://leetcode.com/problems/managers-with-at-least-5-direct-reports/

select name from Employee e
join (select managerId, count(managerId) from Employee group by managerId having count(managerId) >= 5 order by count(managerId) desc) sub on e.id = sub.managerId;