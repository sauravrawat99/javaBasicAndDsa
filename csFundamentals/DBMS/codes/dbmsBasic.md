What is DBMS
-
DBMS is software that helps to create, manage,
and manipulate databases in an organized and secure manner.

Why DBMS is Used?

** without use dbms 
.data manage difficult
.high duplicate
.nothing security

**advantage of dbms
.Data Security
.Data Consistency
.Data Integrity
.Less Redundancy (No duplicate data)
.Easy Data Access
.Data Backup & Recovery
.Multi-user Access

**Features of DBMS
.Data Storage
.Data Retrieval
.Data Manipulation
.Data Sharing
.Data Security
.Concurrency Control

----------------------------------------------------------------------------------------------
**file vs dbms
| DBMS            | File System      |
| --------------- | ---------------- |
| Data organized  | Data unorganized |
| Less redundancy | High redundancy  |
| Secure          | Less secure      |
| Easy backup     | Difficult backup |
| Multi-user      | Single user      |

--------------------------------------------------------------------------------------------------
What is RDBMS
-
RDMS=relations data management system 
The rdbms is the type of dbms whare store data in the form of table(row and column)and tables
are relation each other

Features of RDBMS

**Data stored in tables
.Uses SQL
.Supports Primary Key & Foreign Key
.Maintains relationships
.Ensures data integrity
.Supports multi-user access
.ACID properties supported

Examples of RDBMS
MySQL
Oracle
PostgreSQL
SQL Server
MariaDB


DBMS VS RDBMS
| DBMS                     | RDBMS                      |
| ------------------------ | -------------------------- |
| Data stored as files     | Data stored as tables      |
| No relation between data | Data stored with relations |
| No SQL required          | Uses SQL                   |
| Less secure              | More secure                |
| Example: File system     | Example: MySQL             |

RDBMS is a database management system where data is stored
in tables and tables are related to each other using keys.

-------------------------------------------------------------------------------------
What is Primary Key?
-
Primary Key is a column (or set of columns) that uniquely identifies each record in a table.

Rules of Primary Key
Must contain unique values
Cannot contain NULL
Only one primary key allowed in a table
Can be single column or multiple columns (Composite Key)


SQL Example
Create Table with Primary Key
CREATE TABLE Student (
id INT PRIMARY KEY,
name VARCHAR(50),
age INT
);

Add Primary Key in Existing Table
ALTER TABLE Student
ADD PRIMARY KEY (id);

✅ Composite Primary Key

When more than one column is used as primary key

CREATE TABLE Result (
student_id INT,
subject_id INT,
marks INT,
PRIMARY KEY (student_id, subject_id)
);

🔥 Why Primary Key is Important?

Identifies records uniquely

Avoids duplicate data

Used to create relationships

Improves searching speed

🎯 One-Line Interview Answer

A Primary Key is a unique and non-null field that identifies each record uniquely in a table.

🔥 Primary Key vs Unique Key (Interview Favorite)
Primary Key	Unique Key
Only one allowed	Multiple allowed
Cannot be NULL	Can have one NULL
Identifies record	Ensures uniqueness

