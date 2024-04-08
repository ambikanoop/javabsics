package Assignmenthackthon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class repeatedintupperlower {

public static void main(String[] args) {
	String str;
    char ch;
    int strlen, i;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the String: ");
    str = s.nextLine();
    
    strlen = str.length();
    Map<Character, Integer> hs = new HashMap<>();

    for (char c : str.toCharArray()) {
        hs.put(c, hs.getOrDefault(c, 0) + 1);
    }

    // Display duplicate characters along with their counts
    System.out.println("Duplicate Characters:");
    for (Map.Entry<Character, Integer> entry :hs.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

   
   
 }

