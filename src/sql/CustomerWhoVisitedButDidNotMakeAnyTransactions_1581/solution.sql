-- https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions

select v.customer_id customer_id, count(*) count_no_trans from visits v
where not exists(select * from transactions t where t.visit_id = v.visit_id) group by v.customer_id;