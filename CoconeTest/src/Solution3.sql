--문제 설명
--GAME_USERS 테이블은 XX런 게임 유저의 정보를 담고 있는 테이블입니다. 
--GAME_USERS 테이블 구조는 다음과 같으며, 
--ID, DISTANCE, TIME_SPENT, BEST_DATE는 
--각각 유저의 아이디, 최고 기록(미터 단위), 게임을 한 시간, 최고기록 경신 날짜를 나타냅니다.
--
--NAME   TYPE
--ID   VARCHAR
--DISTANCE   INT
--TIME_SPENT   DECIMAL
--BEST_DATE   DATETIME

--CHARACTERS 테이블은 XX런게임에서 살 수 있는 캐릭터의 정보를 담고 있는 테이블입니다. 
--CHARACTERS 테이블 구조는 다음과 같으며, 
--NAME, SPEED, BOOST_SPEED, BOOST_TIME, PRICE는 
--각각 캐릭터의 이름, 속도, 부스트 속도, 부스트 지속 시간, 가격을 나타냅니다.
--
--NAME   TYPE
--NAME   VARCHAR
--SPEED   INT
--BOOST_SPEED   INT
--BOOST_TIME   INT
--PRICE   INT

--PURCHASES 테이블은 XX런 게임의 유료캐릭터 구매내역을 담고 있는 테이블입니다. 
--PURCHASES 테이블의 구조는 다음과 같으며, 
--ID, USER_ID, PURCHASE_DATE, ITEM은 
--각각 ID, 유저의 ID, 구매 날짜, 산 캐릭터의 이름을 나타냅니다.
--
--NAME   TYPE
--ID   INT
--USER_ID   VARCHAR
--PURCHASE_DATE   DATETIME
--ITEM   VARCHAR
--문제
--GAME_USERS 테이블에 있는 모든 유저에 대해, 유저의 id와 유저가 구입한 유료 캐릭터 수, 유저의 총 구입액을 조회하는 SQL 문을 작성하세요. 결과는 유저의 id 순으로 조회되어야 하며, 캐릭터를 한 번도 사지 않은 유저의 총 구입액은 0입니다.
--
--예시
--예를 들어, GAME_USERS 테이블, CHARACTERS 테이블, PURCHASES 테이블이 다음과 같다면
--
--GAME_USERS
--
--ID   DISTANCE   TIME_SPENT   BEST_DATE
--user1   59600   5.632400104   2016-11-19 21:47:30
--user2   79900   2.639340620   2016-12-19 13:59:55
--user3   99000   4.376248407   2016-12-09 14:18:32
--CHARACTERS
--
--NAME   SPEED   BOOST_SPEED   BOOST_TIME   PRICE
--Albatross   198   447   12   1000
--Bee   201   472   7   3000
--PURCHASES
--
--ID   USER_ID   PURCHASE_DATE   ITEM
--1   user1   2016-12-16 07:44:17   Albatross
--2   user2   2016-12-11 10:30:05   Albatross
--3   user1   2016-11-16 23:23:32   Bee
--user1은 캐릭터 Albatross와 Bee를 샀으며, 구입액은 4000입니다.
--user2는 캐릭터 Albatross를 샀으며, 구입액은 1000입니다.
--user3은 아무것도 사지 않았으므로, 구입액은 0입니다.
--따라서 이때는 SQL을 실행하면 다음과 같이 출력되어야 합니다.
--
--USER_ID   PURCHASE_COUNT   TOTAL_PRICE
--user1   2   4000
--user2   1   1000
--user3   0   0

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