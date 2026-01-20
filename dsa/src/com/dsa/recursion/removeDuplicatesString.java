//REMOVE DUPLICATES FROM STRING (RECURSION) — NOTES
//🔹 Problem
//
//Given a string, remove duplicate characters
//and keep only first occurrence.
//
//        Example
//Input  : programming
//Output : progamin
//
//🔹 Core Idea
//
//String ko character by character traverse karna
//
//Duplicate characters ko skip karna
//
//First time aane wale characters ko store karna
//
//🔹 Required Components
//1️⃣ Recursion
//
//Used to move index forward.
//
//removeDup(str, index + 1)
//
//2️⃣ visited array (memory)
//
//Used to remember which characters already appeared.
//
//boolean[] visited = new boolean[26];
//
//
//Meaning:
//
//        false → character not seen
//true  → character already seen
//
//3️⃣ ch - 'a'
//
//Converts character into array index.
//
//'a' → 0
//        'b' → 1
//        'c' → 2
//        ...
//        'z' → 25
//
//
//Used as:
//
//visited[ch - 'a']
//
//
//        ⚠ Works only for lowercase letters.
//
//        4️⃣ StringBuilder
//
//Used to build answer efficiently.
//
//        StringBuilder ans = new StringBuilder();
//ans.append(ch);
//
//
//Avoids creating new strings again and again.
//
//        🔹 Why visited is STATIC?
//
//Recursive calls need same memory
//
//If declared inside method → new array created every call ❌
//
//Static belongs to class → shared by all calls ✅
//
//static boolean[] visited = new boolean[26];
//
//🔹 Algorithm (Step-wise)
//
//Start from index = 0
//
//Pick current character
//
//Check visited[ch - 'a']
//
//        if true → skip
//
//if false → add to answer & mark true
//
//Move to next index
//
//Stop when index == length (base case)
//
//🔹 Base Case
//if(index == str.length()) {
//print answer;
//    return;
//            }
//
//            🔹 Code Template (REVISION READY)
//static boolean[] visited = new boolean[26];
//
//static void removeDup(String str, int index, StringBuilder ans) {
//
//    if (index == str.length()) {
//        System.out.println(ans.toString());
//        return;
//    }
//
//    char ch = str.charAt(index);
//
//    if (visited[ch - 'a']) {
//        removeDup(str, index + 1, ans);
//    } else {
//        visited[ch - 'a'] = true;
//        ans.append(ch);
//        removeDup(str, index + 1, ans);
//    }
//}
//
//🔹 Call Stack Concept
//
//Recursive calls go down until base case
//
//After base case, calls return one by one
//
//Stack follows LIFO (Last In First Out)
//
//0 → 1 → 2 → 3 → ... → n
//base case
//n → ... → 3 → 2 → 1 → 0
//
//        🔹 Dry Run Logic (quick)
//false → add character → mark true
//        true  → duplicate → skip
//
//🔹 Time & Space Complexity
//Time  : O(n)
//Space : O(n)  (recursion stack)
//
//        🔹 Interview One-Line Answer
//
//We use recursion to traverse the string, a boolean array to track visited characters, and StringBuilder to efficiently construct the result.
//
//        🔹 Important Interview Points
//
//Recursion does not remember previous values
//
//visited array maintains state
//
//static ensures shared memory
//
//ch - 'a' maps characters to indexes
//
//StringBuilder improves performance
//
//🔒 FINAL REVISION LINE (MOST IMPORTANT)
//
//Recursion moves forward,
//visited remembers past,
//StringBuilder builds result.

package com.dsa.recursion;
public class removeDuplicatesString {
    static boolean[] visited = new boolean[26];
    static void removeDuplicates(String str,StringBuilder ans,int index){
        if(index==str.length()){
            System.out.println(ans.toString());
            return;
        }
        char ch=str.charAt(index);
        if(visited[ch - 'a']){
            removeDuplicates(str,ans,index+1);
        }else {
            visited[ch-'a']=true;
            ans.append(ch);
            removeDuplicates(str,ans,index+1);
        }
    }
    static void main(String[] args){
        String str = "abcdefwsaqrartredrfg";
        StringBuilder ans=new StringBuilder();
        int index=0;
        removeDuplicates(str,ans,index );
    }
}