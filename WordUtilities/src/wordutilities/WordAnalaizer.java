package wordutilities;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edvaldes
 */
public class WordAnalaizer {

    static boolean testPalindrom(String s, int i, int e) {

        // If there is only one character
        if (i == e) {
            return true;
        }

        // If first and last
        // characters do not match
        if ((s.charAt(i)) != (s.charAt(e))) {
            return false;
        }

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (i < e + 1) {
            return testPalindrom(s, i + 1, e - 1);
        }

        return true;

    }

}
