/*
Concept Notes (Strong Password)

Password strong tab jab:

kam se kam 1 digit

kam se kam 1 lowercase

kam se kam 1 uppercase

kam se kam 1 special (!@#$%^&*()-+)

length ≥ 6

Golden Formula ⭐
answer = max(missingTypes , 6 - length)


👉 Kyuki jo character add karoge:

length bhi badhegi

missing type bhi cover hoga
 */

// Strong Password

import java.util.Scanner;

class StrongPassword{

    // function to check minimum characters needed
    static int passwordCheck(int n, String password){

        boolean digit = false;
        boolean lower = false;
        boolean upper = false;
        boolean special = false;

        String sp = "!@#$%^&*()-+";

        // check each character
        for(int i=0; i<password.length(); i++){

            char ch = password.charAt(i);

            if(Character.isDigit(ch))
                digit = true;

            else if(Character.isLowerCase(ch))
                lower = true;

            else if(Character.isUpperCase(ch))
                upper = true;

            else if(sp.contains(ch+""))
                special = true;
        }

        // count missing types
        int missingTypes = 0;
        if(!digit) missingTypes++;
        if(!lower) missingTypes++;
        if(!upper) missingTypes++;
        if(!special) missingTypes++;

        // apply formula
        return Math.max(missingTypes, 6 - n);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // ⭐ buffer clear

        String password = sc.nextLine();

        System.out.println(passwordCheck(n, password));
    }
}
