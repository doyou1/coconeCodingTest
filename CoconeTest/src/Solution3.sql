select
    id
    , count(item) count
    , sum(price) total
from
    (select
        g.id id
        , p.item item
        , ifnull(p.price, 0) price
    from
        game_users g
    left outer join
        (select
            p.item item
            , p.user_id id
            , c.price price
        from
            purchases p, characters c
        where
            p.item = c.name) p
    on
        g.id = p.id) nice_table
group by
    id
order by
    id;