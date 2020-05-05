/*You're given strings J representing the types of stones that are jewels,
 *  and S representing the stones you have.  Each character in S is a type of stone you have. 
 *   You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, 
and all characters in J and S are letters.
 Letters are case sensitive, so "a" is considered a different type of stone from "A".
 
 Approach - Simple brute force just calculating the count and print
 
  */
package leetCode_MayChallenge;
import java.util.*;
public class JewelAndStone_day2 {
	public  static int numJewelsInStones(String J, String S) {
        int count=0;
        for(int i=0;i<J.length();i++){
            for(int j=0;j<S.length();j++){
            if(J.charAt(i)==S.charAt(j)){
                count++;
            }
        }
        }
        return count;
	}
	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		String J=z.nextLine();
		String S=z.nextLine();
		var n=numJewelsInStones(J,S);
		System.out.println(n);
	}
}
