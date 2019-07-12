# 外连接必须要添加 on 后面的连接条件, 也是一种等值连接.
select *
from people
         left outer join country on people.id = country.id;


# Natural join 是一种特殊的等值连接, 比较相同的两列, 然后会去掉一列.
select *
from people
         natural join country;


# Inner join 和 join 都是笛卡尔积.
select *
from people
         inner join country;

select *
from people
         join country;


# 此种查询方式思路较为清晰, 一张一张的表连接, 添加过滤条件, 然后在形成的大表中再进行最后的过滤.
select *
from people
         join country on people.id = country.id
         join sys_user on people.id = sys_user.id
where people.id = 2;

