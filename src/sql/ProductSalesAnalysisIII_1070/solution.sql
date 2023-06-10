-- https://leetcode.com/problems/product-sales-analysis-iii

SELECT product_id, year as first_year, quantity, price
FROM sales
WHERE (product_id, year) in (SELECT product_id, min(year)
    FROM sales
    GROUP BY product_id);