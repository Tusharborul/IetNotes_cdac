/*drop procedure if exists pro1;
delimiter $
create procedure pro1()

begin
		declare x int default 100;
		set @z := now();
		select x,@a,@z;
		end $
		delimiter ;
		
=========================================================

drop procedure if exists pro2;
delimiter $
create procedure pro2()
begin
select 'helloe world' H1;
end $
delimiter ;
==========================================================


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int,in y int)
begin
	
	select x+y;
	 
end $
delimiter ;

===========================================================



drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int,in y int,out z int)
begin
	set z := x+y;
	select z;
end $
delimiter ;
	
============================================================



drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int , in y int , out z int, out z1 int)
begin
	set z := x-y;
	set z1 :=x*y;
end $
delimiter ;
=================================================================



drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
begin
	if x > 20 then
	select 'Good';
	else
	select 'Bad';
	end if;
end $
delimiter ;
=================================================================	

drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin
declare x int default 1;
	l:loop 
	select x;
set x:=x+1;
if x=7 then 
leave l;
end if;
end loop l;
end $
delimiter ;
================================================================

drop procedure if exists pro1;
delimiter $
create procedure pro1(in a int)
begin
	declare x int default 1;
	l:loop
	select x;
	set x := x+1;
	if x>a then 
	leave l;
	end if;
	end loop l;
end $
delimiter ;
================================================================

drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin
	declare x int default 1;
	l:loop
	select x;
	set x := x+1;
	if x>7-1 then
	leave l;
	end if;
	end loop l;
end $
delimiter ;
=================================================================

drop procedure if exists pro1;
delimiter $
create procedure pro1(in a int)
begin 
	declare x int default 2;
	l:loop
	select x;
	set x := x+1;
	if x>a then 
	leave l;
	end if;
	end loop l;
	end $
delimiter ;

==================================================================


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
begin
	declare flag bool default false;
	select distinct true into flag from emp where deptno = x;
	if flag = true then
	select ename,job,deptno from emp where deptno=x;	
	else
	select 'not found';
 	end if;
	end $
delimiter ;

==================================================================

drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin
	declare  z int default 0;
	select count(*)- 5 into z from emp;
	select ename,job,sal from emp limit z,5;
end $
delimiter ;	
==================================================================


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int, in y int)
begin 

	select ename, job, sal from emp limit x, y;
end $
delimiter ;

==================================================================
*/


drop procedure if exists pro1;
delimiter $
create procedure pro1(in a int)
begin 
	declare x int default 0;
	l:loop
	select x;
	set x := x+1;
	if x>a then 
	leave l;
	end if;
	end loop l;
	end $
delimiter ;







