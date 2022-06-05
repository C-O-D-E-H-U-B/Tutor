CREATE TABLE perissions(
   permission_id INT PRIMARY KEY NOT NULL,
   scope           CHAR(500) NOT NULL
);

insert into perissions values(1, 'login:true,exams:true,comment:true,message:true');

