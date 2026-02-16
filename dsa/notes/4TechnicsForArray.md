Traversal Pattern (Sabse basic — foundation)
Idea

Array ko left se right ek baar pura dekhna = traversal

👉 Bas visit karna, change nahi karna (mostly)

[5, 3, 8, 2, 7]
↑  ↑  ↑  ↑  ↑
visit one by one

Kab use hota hai

Jab hume sirf information collect karni ho

Typical Questions

Sum of array

Max / Min

Average

Print array

Check sorted

Count elements

Code Pattern
for(int i=0;i<arr.length;i++){
// use arr[i]
}


ya

for(int x : arr){
// use x
}

Sochne ka tarika

“Har element ko ek baar dekhna hai”

⏱ Complexity: O(n)

2️⃣ Counting Pattern (Traversal ka upgraded version)
Idea

Traversal + condition check + counter

agar condition true → count++

[-3, 5, -1, 7, -9]

negative mila → count++

Kab use hota

Jab question bole:

kitne

number of

frequency

count

Typical Questions

Count negative numbers

Count even numbers

Count > k

Count vowels

Frequency of element

Code Pattern
int count = 0;

for(int x : arr){
if(condition){
count++;
}
}

Sochne ka tarika

“Mujhe bas condition satisfy karne wale elements ginne hain”

⏱ Complexity: O(n)

3️⃣ Two Pointer Pattern (Game changer 🔥)
Idea

Ek pointer left se, ek right se — beech me kaam

[1,2,3,4,5,6,7]
↑           ↑
start       end

Kaam kya karta?

Compare / swap / search fast

Kab use hota

Jab:

reverse karna ho

pair find karna ho

palindrome check

sorted array ho

middle me milna ho

Types
Opposite Direction

Reverse / palindrome

start++ , end--

Same Direction

Remove duplicates / move zeros

slow fast

Code Pattern
int start = 0;
int end = arr.length-1;

while(start < end){
// operation
start++;
end--;
}

Sochne ka tarika

“Ek hi loop me do jagah ka kaam karna hai”

⏱ Complexity: O(n) (but powerful)

4️⃣ Partition / Overwrite Pattern (Interview favourite ⭐)
Idea

Array ko 2 parts me tod do logically

[ valid elements | garbage elements ]


Aur valid ko aage bharo

Example — Move zeros
[0,1,0,3,12]

step1: non-zero aage
[1,3,12,?,?]

step2: zero fill
[1,3,12,0,0]

Kab use hota

Jab question bole:

move

segregate

shift

arrange

remove duplicates

Code Pattern
int index = 0;

for(int i=0;i<arr.length;i++){
if(valid element){
arr[index] = arr[i];
index++;
}
}

Sochne ka tarika

“Mujhe new array nahi banana, isi array ko arrange karna hai”

⏱ Complexity: O(n), Space O(1) (VERY IMPORTANT)

🧠 Ek line me difference
Pattern	Kaam
Traversal	Sirf dekhna
Counting	Ginna
Two Pointer	Dono side se kaam
Partition	Rearrange karna