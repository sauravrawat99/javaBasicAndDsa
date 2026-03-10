Step 1: Create Project
mkdir backend
cd backend
npm init -y
📦 Step 2: Install Dependencies
npm install express dotenv cors
npm install nodemon --save-dev
📁 Step 3: Basic Professional Structure
backend/
│
├── src/
│   └── app.js
│
├── server.js
├── .env
└── package.json
⚙️ Step 4: Create .env
PORT=5000
NODE_ENV=development
🧠 Step 5: Setup Express App (src/app.js)
const express = require("express");
const cors = require("cors");

const app = express();

// Middleware
app.use(cors());
app.use(express.json());

// Test Route
app.get("/", (req, res) => {
  res.status(200).json({
    message: "Server is running 🚀",
  });
});

module.exports = app;
🔥 Step 6: Setup Server (server.js)
require("dotenv").config();
const app = require("./src/app");

const PORT = process.env.PORT || 5000;

app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
🛠 Step 7: Add Scripts in package.json
"scripts": {
  "start": "node server.js",
  "dev": "nodemon server.js"
}
▶️ Step 8: Run Server
npm run dev

Browser me check karo:

http://localhost:5000

Output:

Server is running 🚀
🧠 Interview Explanation Line

Agar interviewer puche:

How do you set up an Express server?

Tum bol sakte ho:

I initialize a Node project, install Express, configure middlewares like JSON parser and CORS, create a modular app.js for configuration, and use server.js to start the server using environment variables