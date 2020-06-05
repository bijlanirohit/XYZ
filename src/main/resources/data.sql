--Employee Data
 
INSERT INTO EMP(id,first_name,last_name) values('E1024', 'John', 'D.Costa');
INSERT INTO EMP(id,first_name,last_name) values('E1025', 'Rohit', 'Sharma');
INSERT INTO EMP(id,first_name,last_name) values('E1026', 'Kiran', 'Verma');
INSERT INTO EMP(id,first_name,last_name) values('E1027', 'Shweta', 'Pathak');
INSERT INTO EMP(id,first_name,last_name) values('E1028', 'Kalpesh', 'Yadav');
INSERT INTO EMP(id,first_name,last_name) values('E1029', 'Anjali', 'Singh');

--Employee HR Data

INSERT INTO EMP_HR(id,age,doj,salary,department) values('E1024', 34, '2001-04-12', 1000000, 'Technical');
INSERT INTO EMP_HR(id,age,doj,salary,department) values('E1025', 25, '2006-12-15', 450000,  'Technical');
INSERT INTO EMP_HR(id,age,doj,salary,department) values('E1026', 43, '1998-08-19', 1500000, 'Technical');
INSERT INTO EMP_HR(id,age,doj,salary,department) values('E1027', 36, '2003-04-14', 1200000, 'Technical');
INSERT INTO EMP_HR(id,age,doj,salary,department) values('E1028', 24, '2005-12-15', 450000, 'Technical');
INSERT INTO EMP_HR(id,age,doj,salary,department) values('E1029', 23, '2004-11-16', 400000, 'Technical');

--Project Data

INSERT INTO PROJECT(id, name) values(1,'BPTX');
INSERT INTO PROJECT(id, name) values(2,'OSR');
INSERT INTO PROJECT(id, name) values(3,'OTIS');
INSERT INTO PROJECT(id, name) values(4,'CBS');

--Employee Project Data

INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1024',1);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1024',2);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1025',2);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1025',4);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1026',3);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1026',1);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1027',1);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1027',4);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1028',3);
INSERT INTO EMP_PROJECT(emp_id, project_id) values('E1028',4);

