-- https://leetcode.com/problems/monthly-transactions-i

select
    to_char(trunc(trans_date, 'MONTH'), 'YYYY-MM') month,
    country,
    count(*) trans_count,
    sum(case state when 'approved' then 1 else 0 end) approved_count,
    sum(amount) trans_total_amount,
    sum(case when state = 'approved' then amount else 0 end) approved_total_amount
from
    transactions
group by
    to_char(trunc(trans_date, 'MONTH'), 'YYYY-MM'),
    country;
