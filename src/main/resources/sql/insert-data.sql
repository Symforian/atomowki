Delete from Payment;
Delete from Bill;
Delete from ScheduleSubject;
Delete from Schedule;
Delete from StudentScore;
Delete from StudentBooks;
Delete from Student;
Delete from Class;
Delete from Book;
Delete from Subject;
Delete from Professor;

INSERT INTO Subject (Id,Name) VALUES (1 ,'Subject1')
INSERT INTO Subject (Id,Name) VALUES (2 ,'Subject2')
INSERT INTO Subject (Id,Name) VALUES (3 ,'Subject3')

INSERT INTO Professor (Id ,Name ,Surname) VALUES (1,'Mandy','Surname')
INSERT INTO Professor (Id ,Name ,Surname) VALUES (2,'Ash','Surname')

INSERT INTO Book(Id,ISBN,Title,Author,Description,PublishDate)VALUES(1,'IBAN12','Title1','Author1','Description1','2010-02-01')

INSERT INTO Class(Id,Profile,StartYear) VALUES   (1,'Electronic','2017')
INSERT INTO Class(Id,Profile,StartYear) VALUES   (2,'Programic','2019')
INSERT INTO Class(Id,Profile,StartYear) VALUES   (3,'Architect','2018')

INSERT INTO Student(Id,ClassId,IndexNumber,Name,Surname,Email,PasswordHash,Address,NrLoginAttempts)VALUES(1,2,12345,'Johny','Cash','johny.cash@email.com','dasdsadac','Street 11, 93-123 Downtime',0)

INSERT INTO StudentBooks(StudentId,BookId,DateBorrowing,DateReturn,StatusBorrowing)VALUES(1,1,'2022-01-01',null,'Borrowed')

INSERT INTO StudentScore(StudentId,SubjectId,ProfessorId,Score,Date)VALUES(1,1,1,CAST('3.5' AS FLOAT),'2022-01-06')

INSERT INTO Schedule(Id,ClassId,Year,Semestr)VALUES(1,1,2021,3)

INSERT INTO ScheduleSubject(SubjectId,ScheduleId,StartTime,EndTime)VALUES(1,1,current_timestamp,current_timestamp)

INSERT INTO Bill(Id,StudentId,Description,Ammount,Date)VALUES(1,1,'For study',1000.50,'2021-10-01')

INSERT INTO Payment(BillId,Ammount,Date)VALUES(1,550.44,'2022-01-11')