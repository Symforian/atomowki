Drop Table Payment if exists
Drop Table Bill if exists
Drop Table ScheduleSubject if exists
Drop Table StudentBooks  if exists
Drop Table StudentScore if exists
Drop Table Schedule if exists
Drop Table Book  if exists
Drop Table Student  if exists
Drop Table Subject if exists
Drop Table Professor if exists
Drop Table Class if exists

CREATE TABLE Book(
	Id int Not NULL,
	ISBN nvarchar(15) Not  NULL,
	Title nvarchar(50) Not  NULL,
	Author nvarchar(30) Not  NULL,
	Description nvarchar(100) Not NULL,
	PublishDate datetime Not NULL,
	PRIMARY KEY (Id),
) 

CREATE TABLE Class(
	Id int Not null,
	Profile nvarchar(30) Not  NULL,
	StartYear int Not NULL,	
	PRIMARY KEY (Id),	
) 

CREATE TABLE Student(
	Id int not NULL,
	ClassId int not NULL,	
	IndexNumber int not NULL,
	Name nvarchar(50) not NULL,
	Surname nvarchar(50) not NULL,
	Email nvarchar(100) not NULL,
	PasswordHash nvarchar(10) not NULL,
	Address nvarchar(100) not NULL,
	NrLoginAttempts int not NULL,
	PRIMARY KEY (Id),
	CONSTRAINT FK_Student_Class FOREIGN KEY (ClassId) REFERENCES Class(Id),
) 

CREATE TABLE StudentBooks(
	StudentId int NOT NULL,
	BookId int NOT NULL,
	DateBorrowing datetime NOT NULL,
	DateReturn datetime NULL,
	StatusBorrowing nvarchar(100) NULL,
	CONSTRAINT FK_StudentBook_Student FOREIGN KEY (StudentId) REFERENCES Student(Id),
	CONSTRAINT FK_StudentBook_Book FOREIGN KEY (BookId) REFERENCES Book(Id)
) 

CREATE TABLE Subject(
	Id int Not null,
	Name nvarchar(100) not NULL,	
	PRIMARY KEY (Id),	
) 

CREATE TABLE Professor(
	Id int Not null,
	Name nvarchar(100) not NULL,	
	Surname nvarchar(100) not NULL,	
	PRIMARY KEY (Id),	
) 

CREATE TABLE Schedule(
	Id int Not null,
	ClassId int Not null,
	Year int not NULL,
	Semestr int not NULL,	
	PRIMARY KEY (Id),	
	CONSTRAINT FK_Schedule_Class FOREIGN KEY (ClassId) REFERENCES Class(Id),
) 

CREATE TABLE StudentScore(
	StudentId int Not null,
	SubjectId int Not null,
	ProfessorId int Not null,
	Score Float not NULL,	
	Date datetime NOT NULL,
	CONSTRAINT FK_StudentScore_Student FOREIGN KEY (StudentId) REFERENCES Student(Id),
	CONSTRAINT FK_StudentScore_Subject FOREIGN KEY (SubjectId) REFERENCES Subject(Id),
	CONSTRAINT FK_StudentScore_Professor FOREIGN KEY (ProfessorId) REFERENCES Professor(Id)
) 

CREATE TABLE ScheduleSubject(
	SubjectId int Not null,
	ScheduleId int Not null,
	StartTime time not null,
	EndTime time not null,
	CONSTRAINT FK_ScheduleSubject_Subject FOREIGN KEY (SubjectId) REFERENCES Subject(Id),
	CONSTRAINT FK_ScheduleSubject_Schedule FOREIGN KEY (ScheduleId) REFERENCES Schedule(Id),
) 

CREATE TABLE Bill(
	Id int Not null,
	StudentId int Not null,
	Description nvarchar(100) not NULL,	
	Ammount Decimal Not null,
	Date datetime NOT NULL,
	PRIMARY KEY (Id),	
	CONSTRAINT FK_Bill_Student FOREIGN KEY (StudentId) REFERENCES Student(Id),
) 

CREATE TABLE Payment(
	BillId int Not null,
	Ammount Decimal Not null,
	Date datetime NOT NULL,	
	CONSTRAINT FK_Payment_Bill FOREIGN KEY (BillId) REFERENCES Bill(Id),
) 