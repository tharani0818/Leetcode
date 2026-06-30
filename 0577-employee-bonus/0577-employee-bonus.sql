# Write your MySQL query statement below
SELECT e.name,b.bonus from Employee as e Left Join Bonus as b
ON e.empId=b.empId
Where b.bonus<1000 or b.bonus IS NULL;