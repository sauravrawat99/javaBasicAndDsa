Fibonacci ek number series hai
Jisme har number pichhle 2 numbers ka sum hota hai


Recursion pehle niche jaata hai (base case tak)
Phir wapas aate time answer banata hai


interview

Fibonacci starts from 0 and 1
Each number = sum of previous two
Base case is the key


**Time Complexity (Recursive)
O(2^n)  ❌ (Very Slow)

Kyun?
Same function bar-bar call hota hai
fib(3) , fib(2) repeat hota hai

Call Tree Example (fib(5)):
fib(5)
├─ fib(4)
│  ├─ fib(3)
│  │  ├─ fib(2)
│  │  └─ fib(1)
│  └─ fib(2)
└─ fib(3)


👉 Repeated calls = exponential time

🧠 Space Complexity (Recursive)
O(n)

Kyun?
Maximum n recursive calls stack me hoti hain


(Stack memory use hoti hai)

🔥 Summary (Recursive)
Time  = O(2^n)
Space = O(n)