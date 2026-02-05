package com.dsa.String;
class CharacterFrequency {

    static void frequency(String s) {

        s = s.toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 'a');
                System.out.println(ch + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        String s = "banana";

        frequency(s);
    }
}
