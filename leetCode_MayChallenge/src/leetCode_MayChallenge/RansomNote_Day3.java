/*Given an arbitrary ransom note string and another string containing letters from all the magazines,
 *  write a function that will return true if the ransom note can be constructed from the magazines ; 
 *  otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
	Approach- Brute force

*/


package leetCode_MayChallenge;

import java.util.Scanner;

public class RansomNote_Day3 {
	    public static  boolean canConstruct(String ransomNote, String magazine) {
	        int[] arr = new int[26];
	        for(int i =0;i<magazine.length();i++){
	            arr[magazine.charAt(i) - 'a']++;
	        }
	        for(int i=0;i<ransomNote.length(); i++){
	            if(--arr[ransomNote.charAt(i) - 'a']<0){
	                return false;
	            }
	        }
	    return true;
	    }
	    public static void main(String args[]) {
	    	Scanner z=new Scanner(System.in);
	    	String ransomNote=z.nextLine();
	    	String magazine=z.nextLine();
	    	canConstruct(ransomNote,magazine);
	    }
	}

