-- https://leetcode.com/problems/immediate-food-delivery-ii

select round(avg(case when t1.order_date = t1.customer_pref_delivery_date then 1 else 0 end) * 100, 2) immediate_percentage
from
    delivery t1
where
    (customer_id, order_date) in (select customer_id, min(order_date) from delivery t2 group by customer_id);