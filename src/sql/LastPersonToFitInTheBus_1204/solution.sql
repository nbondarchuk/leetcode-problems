-- https://leetcode.com/problems/last-person-to-fit-in-the-bus

with c1 as
(select person_id, sum(weight) over(order by turn) as tw, turn from Queue)
select person_name from queue where turn = (select max(turn) from c1 where c1.tw <= 1000);