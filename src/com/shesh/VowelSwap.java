package com.shesh;

public class VowelSwap {
    public static void main(String[] args) {

        System.out.println(reverseVowels("moercate"));

    }

    public static String reverseVowels(String s) {

        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        char t;
        while (i <= j) {
            if (isVowel(c[i]) && isVowel(c[j])) {
                t = c[i];
                c[i] = c[j];
                c[j] = t;
                i++;
                j--;
            } else if (isVowel(c[i])) {
                j--;
            } else if (isVowel(c[j])) {
                i++;
            } else {
                i++;
                j--;
            }


        }
        return new String(c);
    }

    static boolean  isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        return false;
    }
}
