git --version
# Check git installed hai ya nahi
git config --global user.name "Your Name"
# Apna naam set karo (commit ke liye)
git config --global user.email "youremail@gmail.com"
# Apna email set karo
git config --list
# Git ki sari settings dekho
📁 REPOSITORY START KARNA 
git init
# Current folder ko git repository banao
git clone <repo-url>
# GitHub se repo download karo
📄 FILE STATUS CHECK 
git status
# Files ki current state dekho (modified, staged, untracked)
➕ FILES STAGE KARNA 
git add filename.java
# Sirf ek file stage karo
git add .
# Sare changes stage karo
git add -A
# Deleted + modified + new sab stage
💾 COMMIT COMMANDS 
git commit -m "message"
# Staged files ko commit karo
git commit
# Editor open hoga (message likhne ke liye)
git commit -am "message"
# Tracked files ko direct add + commit
📜 COMMIT HISTORY 
git log
# Full commit history
git log --oneline
# Short commit history
git log --graph --oneline
# Branch ke sath history
🔗 REMOTE (GITHUB CONNECT)
git remote -v
# Remote repo check karo
git remote add origin <repo-url>
# Local repo ko GitHub se jodo
git remote remove origin
# Remote remove karo
🚀 PUSH & PULL 
git push
# Code GitHub pe bhejo
git push -u origin main
# First time push + upstream set
git pull
# GitHub se latest code lo
git fetch
# Sirf changes download karo (merge nahi)
🌿 BRANCH COMMANDS 
git branch
# Sab branches dekho
git branch branch-name
# Naya branch banao
git checkout branch-name
# Branch switch karo
git checkout -b branch-name
# Naya branch banao + switch
git switch branch-name
# New method to switch branch
git branch -d branch-name
# Branch delete karo
🔀 MERGE COMMANDS 
git merge branch-name
# Current branch me dusra branch merge karo
❌ UNDO / FIX COMMANDS (VERY IMPORTANT)
git reset filename.java
# File ko unstage karo
git reset --soft HEAD~1
# Last commit undo (code safe)
git reset --hard HEAD~1
# Last commit + code delete (danger ⚠️)
git checkout -- filename.java
# File ke changes undo karo
🗑️ FILE DELETE COMMANDS 
git rm filename.java
# File delete + stage
git rm --cached filename.java
# Git se remove, local me rakho
🔍 DIFFERENCE CHECK 
git diff
# Working directory changes dekho
git diff --staged
# Staged changes dekho
🏷️ TAG COMMANDS 
git tag v1.0
# Version tag banao
git tag
# Sab tags dekho
🔐 STASH COMMANDS 
git stash
# Temporary changes save karo
git stash list
# Stash list dekho
git stash pop
# Stash wapas lao
🚫 .gitignore 
touch .gitignore
# Ignore file banao
Example:

kotlin 
.idea/
*.class
node_modules/
🧠 MOST USED DAILY FLOW (REMEMBER THIS)
git status
git add .
git commit -m "message"
git push