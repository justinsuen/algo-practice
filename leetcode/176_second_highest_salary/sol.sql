SELECT MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary NOT IN (
    SELECT MAX(Salary)
    FROM Employee
    )

-- Using MAX function gives null if not there
