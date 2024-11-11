drop procedure if exists pro1;
delimiter $
create procedure pro1()

begin
		declare x int default 100;
		set @z := now();
		select x,@a,@z;
		end $
		delimiter ;
		