🔹 What is if-else?

if-else is a decision-making statement used to execute code based on a condition.

if (condition) {
// true block
} else {
// false block
}


int age = 18;

if (age >= 18) {
System.out.println("Eligible to vote");
} else {
System.out.println("Not eligible");
}


if else ladder
int marks = 75;

if (marks >= 90) {
System.out.println("A Grade");
} else if (marks >= 75) {
System.out.println("B Grade");
} else {
System.out.println("C Grade");
}

📌 Interview line:
if-else statement checks conditions top to bottom.

✅ Loops in Java

Loops are used to execute a block of code repeatedly.

for loop
for (initialization; condition; increment/decrement) {
// code
}
🔹 Example
for (int i = 1; i <= 5; i++) {
System.out.println(i);
}

📌 Use case:
When number of iterations is known.

2️⃣ while Loop
🔹 Syntax
while (condition) {
// code
}

🔹 Example
int i = 1;

while (i <= 5) {
System.out.println(i);
i++;
}


📌 Use case:
When number of iterations is not fixed.

| for loop                   | while loop                 |
| -------------------------- | -------------------------- |
| Initialization inside loop | Initialization outside     |
| Best when count is known   | Best when count is unknown |
| More compact               | More flexible              |


🎯 One-Line Interview Definitions

if-else:

Used to execute code based on a condition.

for loop:

Used when the number of iterations is known.

while loop:

Used when the number of iterations is not known.


✅ do-while Loop
🔹 What is do-while loop?

do-while loop executes the code at least once, even if the condition is false.

🔹 Syntax
do {
// code
} while (condition);


📌 Note:
Semicolon (;) is mandatory after while(condition);

🔹 Example
int i = 1;

do {
System.out.println(i);
i++;
} while (i <= 5);

🔹 Condition false but loop runs once
int i = 10;

do {
System.out.println(i);
} while (i < 5);


📌 Output:

10


📌 Interview line:
do-while loop executes minimum one time.

🔥 break Statement
🔹 What is break?

break is used to terminate the loop immediately.

🔹 Example
for (int i = 1; i <= 5; i++) {
if (i == 3) {
break;
}
System.out.println(i);
}


📌 Output:

1
2


📌 Use case:
When you want to stop loop completely.

🔥 continue Statement
🔹 What is continue?

continue is used to skip current iteration and move to the next iteration.

🔹 Example
for (int i = 1; i <= 5; i++) {
if (i == 3) {
continue;
}
System.out.println(i);
}


📌 Output:

1
2
4
5


📌 Use case:
When you want to skip a specific condition.

| break                     | continue                        |
| ------------------------- | ------------------------------- |
| Stops the loop            | Skips current iteration         |
| Control goes outside loop | Control goes to next loop cycle |
| Used to exit loop         | Used to ignore condition        |


🎯 One-Line Interview Definitions

do-while loop:

Executes the loop body at least once before checking the condition.

break:

Terminates the loop immediately.

continue:

Skips the current iteration and continues with the next one.

