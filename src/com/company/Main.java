
 --N-1
SELECT * FROM customer WHERE country = 'Canada';
--N-2
SELECT DISTINCT country FROM customer;
--N-3
SELECT count(*) from orders;
--N-4
SELECT MAX(total_amount) AS max_price FROM orders;
--N-5
select SUM(total_amount) from orders;
--N-6
SELECT SUM(total_amount) FROM orders WHERE order_date BETWEEN 'Jan 1 2014' AND 'Dec 31 2014';
--N-7
select avg(total_amount) FROM orders;
--N-8
select avg(total_amount) from orders order by customer_id;
--N-9
select * from supplier where country in ('Brazil','Spain');
--N-10
SELECT * FROM orders WHERE order_date
    BETWEEN to_timestamp('Jan 1 2013', 'Mon DD YYYY')
    AND to_timestamp('Dec 31 2014', 'MON DD YYYY') AND total_amount < 100.00;
--N-11
select * from supplier where country in('Spain','Italy','Germany','France') order by country;
--N-12
select distinct  country from customer;
--N-13
select * from customer where customer.first_name like 'Jo%';
--N-14
select * from customer where customer.first_name like '___a';
--N-15
select country ,count(*) from customer group by country;
--N-16
select country ,count(*) from customer group by country order by  country DESC;
--N-17
SELECT sum(total_amount), customer_id, COUNT(*) AS count_of_orders  FROM orders
GROUP BY customer_id  ORDER BY customer_id ;
--N-18
SELECT sum(total_amount), customer_id, COUNT(*) AS count_of_orders  FROM orders
GROUP BY customer_id  ORDER BY customer_id ;



