/*Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

* Approach - Using Moore's voting Algo time
* Complexicity - O(n)
*/
package leetCode_MayChallenge;
import java.util.*;
public class MajorityElement_Day6 {
	public static int majorityElement(int[] nums) {
        Integer candidate=null;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                count=1;
                continue;
            }
            else{
                if(candidate == nums[i]){
                    count++;
                } else{
                    count--;
                }
            }
        }
        if(count==0){
            return 0;
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(candidate==nums[i]){
                count++;
            }
        }
        return (count>nums.length/2)? candidate : null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		int nums[]= {1,2,1,3,3,3,3};
		int n=majorityElement(nums);
		System.out.println(n);
	}

}
