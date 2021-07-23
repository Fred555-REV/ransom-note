package challenges.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        //This hashmap holds a string and an int, destined to hold a word and a count.
        Map<String, Integer> magazineMap = new HashMap<>();
        //This loop adds each word to the map with an initial count of 1
        //If the word appears again the count will be increased in the map
        for (String word : magazine) {
            if (magazineMap.containsKey(word)) {
                int count = magazineMap.get(word);
                count++;
                magazineMap.put(word, count);
            } else {
                magazineMap.put(word, 1);
            }
        }
        int wordMatches = 0;
        for (String word : note) {
            if (magazineMap.containsKey(word) && magazineMap.get(word) > 0) {
                wordMatches++;
                int count = magazineMap.get(word);
                count--;
                magazineMap.put(word, count);
            }
        }
        if (wordMatches != note.size()) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}


//package challenges.hackerrank;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//        Map<String, String> ransomNote = new HashMap<>();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number of words from magazine and notes seperated by a space. ex. \"5 3\"");
//        String numbers = scan.nextLine();
//        String[] numArr = numbers.split(" ");
//        int numOfWordsInMag = Integer.getInteger(numArr[0]);
//        int numOfWordsInNote = Integer.getInteger(numArr[2]);
//        String[] wordsInMag = new String[numOfWordsInMag];
//        System.out.println("Enter the words in magazine");
//        for (String word : wordsInMag) {
//            word = scan.next();
//        }
//        String[] wordsInNote = new String[numOfWordsInNote];
//        System.out.println("Enter the words in note");
//        for (String word : wordsInNote) {
//            word = scan.next();
//        }
//
//    }
//}
