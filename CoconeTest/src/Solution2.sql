-- 코드를 입력하세요
select
    id, json_length(tags)
from
    youtubes
group by
    id, tags;