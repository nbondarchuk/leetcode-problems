-- https://leetcode.com/problems/product-price-at-a-given-date

select distinct p2.product_id, coalesce(xx.price, 10) price from products p2
left join (select p1.product_id, p1.new_price as price
from products p1
where
(p1.product_id, p1.change_date) in (
select product_id, max(change_date) from products
where change_date <= to_date('2019-08-16', 'yyyy-mm-dd')
group by product_id)) xx on xx.product_id = p2.product_id;