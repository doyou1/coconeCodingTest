-- �ڵ带 �Է��ϼ���
SELECT
    id, name, salary, branch_id
from
    EMPLOYEES 
where
    branch_id = 17
    and salary >= 300
order by
    ID;