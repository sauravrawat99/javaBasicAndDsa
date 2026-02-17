/*
CamelCase (Count Words)
Concept

CamelCase string me:

first word → small letters

har new word → Capital se start

👉 Isliye:

Words = Capital letters count + 1

Approach

String ko traverse karo
Jitni baar uppercase mile → word++
 */

class CamelCaseCount{
    static int camelcase(String s){
     int count=1;
     for (int i=1;i<s.length();i++){

         if(Character.isUpperCase(s.charAt(i))){
             count++;
         }

     }
        return count;
    }

    public static void main(String[] args){
        String s="HelloMyNameSaurav";
        System.out.println(camelcase(s));

    }
}