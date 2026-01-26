Divide and Conquer (D&C)
Divide and Conquer =

Problem ko chhote parts me tod do →
har part ko solve karo →
sabka result combine karo

📦 3 Steps hamesha same rahenge:

1️⃣ Divide → problem ko chhote subproblems me todna
2️⃣ Conquer → subproblem ko recursion se solve karna
3️⃣ Combine → sabke answer ko jodna

example

📘 Book ke 100 pages yaad karne hain
❌ ek baar me 100 page
✅ 20–20 pages divide → revise → combine

Yehi Divide & Conquer logic hai.


that is structure
function(problem) {

    // base case
    if(small problem)
        return answer;

    // divide
    left = function(left part);
    right = function(right part);

    // combine
    return merge(left, right);
}
