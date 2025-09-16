# Write your MySQL query statement below
Select Product.product_name,Sales.year,Sales.price
From sales
Join product
where Product.product_id=Sales.product_id