-- https://leetcode.com/problems/consecutive-numbers

select distinct l1.num ConsecutiveNums from logs l1
join logs l2 on l1.num = l2.num and l2.id = l1.id + 1
join logs l3 on l2.num = l3.num and l3.id = l2.id + 1;