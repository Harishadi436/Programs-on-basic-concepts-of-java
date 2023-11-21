package com.java_coding;

public class Pangram {
    static boolean pangram(String a) {
        int count = 0;
        String b = "abcdefghijklmnopqrstuvwxyz";
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) >= 0) {
                count++;
            }
        }
        if (count == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(pangram("Mr. Jock, TV quiz Ph. D., bags few lynx"));
    }
}
