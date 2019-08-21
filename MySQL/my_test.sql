show databases;
use my_test;
show tables ;

#🌰栗子: 每个部门的平均薪资
select deptno,avg(sal) avgsal from emp group by deptno;

# 每个部门的平均薪资 的 薪资等级
select d.dname,t.avgsal,s.grade
from (select deptno,avg(sal) avgsal from emp group by deptno) t
join dept d
on t.deptno = d.deptno
join salgrade s
on t.avgsal between s.losal and s.hisal;

#🌰栗子: 每个 部门 薪资等级 平均值
## 1.每个员工都薪资等级
select e.ename,e.deptno, e.sal, s.grade
from emp e
join salgrade s
on e.sal between s.losal and s.hisal;
## 2.基于以上结果,按照deptno分组,求每组grade平均值

select e.deptno, avg(s.grade) as grade_avg
from emp e
join salgrade s
on e.sal between s.losal and s.hisal
group by e.deptno;

# 🌰栗子: 找出工资第5名到第10名
select ename,sal from emp order by sal desc limit 4,6;

# 🌰栗子:通用分页
# #每页显示3条数据
# 第1页: limit 0,3
# 第2页: limit 3,3
# 第3页: limit 6,3
# 第4页: limit 9,3
# ...
# #每页显示pageSize条数据
# # 第pageNo页: limit (pageNo-1)*pageSize, pageSize;

CREATE TABLE T_USER
(
    id       INT AUTO_INCREMENT,
    userName VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO T_USER (userName, password)
VALUES ("张三", "zhangsan");

INSERT INTO T_USER (userName, password)
VALUES ("李四", "lisi");
commit;
select * from T_USER;