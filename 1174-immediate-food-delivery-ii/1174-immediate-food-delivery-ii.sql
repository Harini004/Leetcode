 select round(avg(order_date = customer_pref_delivery_date)*100,2) as immediate_percentage
 from 
 ( SELECT 
        customer_id,
        order_date,
        customer_pref_delivery_date,
        ROW_NUMBER() OVER (
            PARTITION BY customer_id 
            ORDER BY order_date
        ) AS rn
    FROM delivery) as t
    where rn = 1