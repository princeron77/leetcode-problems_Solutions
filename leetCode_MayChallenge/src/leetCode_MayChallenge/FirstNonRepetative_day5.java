/* Given a string, 
 * find the first non-repeating character in it and return it's index. 
 * If it doesn't exist, return -1.
 * 
 * Approach - Using HashMap
 * */
package leetCode_MayChallenge;
import java.util.*;
public class FirstNonRepetative_day5 {
	public static int firRep(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				map.put(ch,count+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.get(ch)==1) {
				return (s.indexOf(ch));
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		System.out.println("enter string");
		String s=z.nextLine();
		var a=firRep(s);
		System.out.println(a);
	}
}
