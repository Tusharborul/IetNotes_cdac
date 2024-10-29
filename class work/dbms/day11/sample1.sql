/*delimiter $
drop procedure if exists sample1;
create procedure sample1()
begin 
	select 'Hello World' R1;
end $

delimiter ;







drop procedure if exists sample1;
delimiter $
create procedure sample1()
begin 
	declare x int default 100;
	set @z := now();
	select x, @a;
end $

delimiter ;






drop procedure if exists sample1;
delimiter $
create procedure sample1(in x int, in y int)
begin 
	select x+y;
end $

delimiter ;

*/


drop procedure if exists sample1;
delimiter $
create procedure sample1(in x int, in y int, out z int)
begin 
	set z := x + y;
end $
delimiter ;
