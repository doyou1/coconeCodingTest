-- �ڵ带 �Է��ϼ���
select
    id, json_length(tags)
from
    youtubes
group by
    id, tags;