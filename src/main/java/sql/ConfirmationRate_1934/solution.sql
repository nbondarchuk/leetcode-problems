-- https://leetcode.com/problems/confirmation-rate

select c1.user_id, round(coalesce(c3.confirmed/c2.requests, 0), 2) confirmation_rate from signups c1
left join (select user_id, count(*) requests from confirmations group by user_id) c2 on c1.user_id = c2.user_id
left join (select user_id, count(*) confirmed from confirmations where action = 'confirmed' group by user_id) c3 on c1.user_id = c3.user_id;