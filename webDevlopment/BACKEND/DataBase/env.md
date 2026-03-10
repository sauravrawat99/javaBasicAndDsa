.env Kya Hoti Hai?

.env file me hum:

Secret keys

Database URL

API keys

Port number

store karte hain.

👉 Taaki ye cheezein code me hard-coded na rahein.
👉 Security aur flexibility dono milti hai.

📁 .env File Kaise Banaye?

Project root folder me ek file banao:

.env
🧾 Basic .env Example (MERN Backend)
PORT=5000

MONGO_URI=mongodb://localhost:27017/projectdb

JWT_SECRET=your_super_secret_key

JWT_EXPIRE=7d

REFRESH_TOKEN_SECRET=your_refresh_secret

NODE_ENV=development
🔐 Production Example (Mongo Atlas)
MONGO_URI=mongodb+srv://username:password@cluster.mongodb.net/projectdb
📌 Important Rules

1️⃣ .env file kabhi GitHub pe upload nahi karni
Add this in .gitignore:

.env

2️⃣ .env load karne ke liye dotenv use karte hain

Install:

npm install dotenv

Use in server.js (sabse upar):

require("dotenv").config();

Access variable like this:

process.env.PORT
process.env.MONGO_URI
process.env.JWT_SECRET
🧠 Interview Line

Agar interviewer puche:

Why do we use .env file?

Tum bol sakte ho:

We use .env to store environment-specific and sensitive configuration like database URLs and secret keys securely outside the source code.