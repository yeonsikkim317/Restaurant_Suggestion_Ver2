
insert into category values ('c_1','한식');
insert into category values ('c_2','양식');
insert into category values ('c_3','일식');
insert into category values ('c_4','중식');
commit;

insert into specific values ('s_1','국물류','c_1');
insert into specific values ('s_2','분식류','c_1');
insert into specific values ('s_3','패스트푸드','c_2');
insert into specific values ('s_4','파스타','c_2');
insert into specific values ('s_5','초밥','c_3');
insert into specific values ('s_6','돈가스','c_3');
insert into specific values ('s_7','중식','c_4');
commit;

insert into restaurant values ('r_1','신선설농탕 서초점','s_1','https://place.map.kakao.com/11119974');
insert into restaurant values ('r_2','북창동 순두부 서초점','s_1','https://place.map.kakao.com/20197153');
insert into restaurant values ('r_3','국대떡볶이 서초남부점','s_2','https://place.map.kakao.com/13025838');
insert into restaurant values ('r_4','바르다김선생 남부터미널점','s_2','https://place.map.kakao.com/26404615');
insert into restaurant values ('r_5','왕떡볶이 서초점','s_2','https://place.map.kakao.com/16329157');
insert into restaurant values ('r_6','롯데리아 남부터미널점','s_3','https://place.map.kakao.com/7860341');
insert into restaurant values ('r_7','KFC 서초동점','s_3','https://place.map.kakao.com/8016870');
insert into restaurant values ('r_8','하일아트레스토랑','s_4','https://place.map.kakao.com/13597701');
insert into restaurant values ('r_9','더스파게티하우스 서초점','s_4','https://place.map.kakao.com/1718253066');
insert into restaurant values ('r_10','스시환','s_5','https://place.map.kakao.com/27062366');
insert into restaurant values ('r_11','스시36.5','s_5','https://place.map.kakao.com/467722199');
insert into restaurant values ('r_12','그림나베','s_6','https://place.map.kakao.com/2051492635');
insert into restaurant values ('r_13','믿을신','s_6','https://place.map.kakao.com/1743257699');
insert into restaurant values ('r_14','송쉐프 르쁘띠','s_7','https://place.map.kakao.com/781438888');
insert into restaurant values ('r_15','천지궁 서초점','s_7','https://place.map.kakao.com/13307801');
commit;












