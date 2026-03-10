1️⃣ Create Project Folder
mkdir backend-project
cd backend-project
npm init -y

2️⃣ Install Required Packages
npm install express mongoose dotenv cors
npm install nodemon --save-dev

Basic packages:

express → server

mongoose → database connection

dotenv → environment variables

cors → frontend connection

nodemon → auto restart server

3️⃣ Create Basic Folder Structure
backend-project/
│
├── config/
├── controllers/
├── models/
├── routes/
├── middleware/
│
├── server.js
├── .env
└── package.json
4️⃣ Basic Server Setup (server.js)
const express = require("express");
const dotenv = require("dotenv");

dotenv.config();
const app = express();

app.use(express.json());

app.get("/", (req, res) => {
  res.send("Server Running");
});

const PORT = process.env.PORT || 5000;

app.listen(PORT, () => {
  console.log(`Server started on port ${PORT}`);
});
5️⃣ Setup MongoDB Connection (config/db.js)
const mongoose = require("mongoose");

const connectDB = async () => {
  await mongoose.connect(process.env.MONGO_URI);
  console.log("MongoDB Connected");
};

module.exports = connectDB;
6️⃣ Add Environment Variables (.env)
PORT=5000
MONGO_URI=your_connection_string
7️⃣ Connect DB in server.js
const connectDB = require("./config/db");
connectDB();
8️⃣ Create MVC Pattern

models → schema

controllers → logic

routes → API endpoints

middleware → auth/error handling

9️⃣ Run Server

Add in package.json:

"scripts": {
  "start": "node server.js",
  "dev": "nodemon server.js"
}

Run:

npm run dev