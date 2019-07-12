# noinspection SqlResolveForFile

show engines;

show tables;

show table status from mybatis;

create database quartzDataBase;

# 添加删除主键
alter table people
    drop primary key;
alter table people
    add primary key (id);


# 添加删除索引
alter table people
    add index (name);
alter table people
    drop index name_2;

create index nameIndex on people (name);
drop index sex on people;


# 查看注释(建表字段).
show create table people;
# 查看字段注释.
show full columns from people;

# 添加或修改注释.
alter table people
    comment '修改后的注释';
# 添加或修改字段注释.
alter table people
    modify column id int comment '主键';


# 复制表,不会复制表的索引.
create table peopleTwo as
select *
from people;
# 仅复制表的数据.
insert into peopleTwo
select *
from people;


# 检索表结构
SELECT TABLE_NAME               表名,
       COLUMN_NAME              列名,
       COLUMN_TYPE              数据类型,
       DATA_TYPE                字段类型,
       CHARACTER_MAXIMUM_LENGTH 长度,
       IS_NULLABLE              是否为空,
       COLUMN_DEFAULT           默认值,
       COLUMN_COMMENT           备注
FROM information_schema.COLUMNS
WHERE TABLE_NAME IN ('commodity');








