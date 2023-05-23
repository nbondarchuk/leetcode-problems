-- https://leetcode.com/problems/find-customer-referee/description/?envType=study-plan-v2&id=top-sql-50
select name from Customer where referee_id is null or referee_id <> 2;