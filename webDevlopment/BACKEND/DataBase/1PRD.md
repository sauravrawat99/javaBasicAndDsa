PRODUCT REQUIREMENT DOCUMENT (PRD)
1. Project Overview
1.1 Project Name

Project Management System

1.2 Objective

Build a secure backend system for managing projects, tasks, subtasks, notes, and team members with role-based access control.

2-User role
| Role          | Description              |
| ------------- | ------------------------ |
| admin         | Full system access       |
| project_admin | Manage assigned projects |
| member        | Basic project access     |

3. Features
3.1 Authentication

User registration

Login

Logout

JWT access token

Refresh token

Email verification

Password reset

3.2 Project Management

Create project

Update project

Delete project

Add/remove members

View project details

3.3 Task Management

Create task

Update task

Delete task

Create subtask

Update subtask

Delete subtask

Task status management (todo, in_progress, done)

3.4 Notes

Create note

Update note

Delete note

View notes

3.5 System Health

Health check API endpoint

Technical Specifications
4.1 API Structure

Base URL:

/api/v1

Autantication-Role

| Method | Endpoint         | Description        |
| ------ | ---------------- | ------------------ |
| POST   | /register        | Register user      |
| POST   | /login           | Login user         |
| POST   | /logout          | Logout user        |
| GET    | /current-user    | Get logged-in user |
| POST   | /refresh-token   | Refresh JWT        |
| POST   | /forgot-password | Request reset      |
| POST   | /reset-password  | Reset password     |

projects-Routes

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| GET    | /           | List projects  |
| POST   | /           | Create project |
| GET    | /:projectId | Get project    |
| PUT    | /:projectId | Update project |
| DELETE | /:projectId | Delete project |

task route
| Method | Endpoint          | Description    |
| ------ | ----------------- | -------------- |
| GET    | /:projectId       | List tasks     |
| POST   | /:projectId       | Create task    |
| PUT    | /:taskId          | Update task    |
| DELETE | /:taskId          | Delete task    |
| POST   | /:taskId/subtasks | Create subtask |

notesRoutes
| Method | Endpoint    | Description |
| ------ | ----------- | ----------- |
| GET    | /:projectId | List notes  |
| POST   | /:projectId | Create note |
| PUT    | /:noteId    | Update note |
| DELETE | /:noteId    | Delete note |

4.6 Health Check
GET /api/v1/healthcheck

Returns system status.

permission matrix
| Feature            | Admin | Project Admin | Member |
| ------------------ | ----- | ------------- | ------ |
| Create Project     | ✅     | ❌             | ❌      |
| Manage Members     | ✅     | ❌             | ❌      |
| Create Tasks       | ✅     | ✅             | ❌      |
| View Tasks         | ✅     | ✅             | ✅      |
| Update Task Status | ✅     | ✅             | ✅      |
| Delete Task        | ✅     | ✅             | ❌      |

6. Data Models
User

id

name

email

password

role

Project

id

name

description

createdBy

members

Task

id

title

description

status (todo, in_progress, done)

projectId

Note

id

content

projectId

7. Security Features

JWT Authentication

Role-based Authorization

Input Validation

Secure Password Hashing

Protected Routes

CORS Configuration

8. File Management (Optional)

File upload support

Secure storage

Metadata tracking

9. Success Criteria

Secure authentication system

Complete project lifecycle

Role-based access control

Proper error handling

Scalable architecture