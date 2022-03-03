create table board(
	idx number not null,
	title varchar2(1000) not null,
	content varchar2(4000) not null,
	writer varchar2(50) not null,
	indate date default sysdate,
	count number default 0,
	primary key(idx)
);

create sequence board_idx;

insert into board(idx,title,content,writer)
values(board_idx.nextval, '�Խ��� ����','�Խ��� ����','������');

insert into board(idx,title,content,writer)
values(board_idx.nextval, '�Խ��� ����','�Խ��� ����','������');

insert into board(idx,title,content,writer)
values(board_idx.nextval, '�Խ��� ����','�Խ��� ����','������');


select * from board;

delete from board;



