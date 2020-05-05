/* You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version, 
all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.
You are given an API bool isBadVersion(version)
which will return whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API. */

//using Linear approach to find a solution but Using Brute can cause Exceed time out

//Now using Binary search to reduce time by half 
package leetCode_MayChallenge;

import java.util.Scanner;

class VersionControl{
	public static boolean isBadVersion(int n) {
		if(n>=1) {
			return true;
		}
		else {
			return false;
		}
	}
}
public  class FirstBadVersion extends VersionControl {
	public static int firstBadVersion(int n) {
		 int left=1;
	        int right=n;
	        while(left<right){
	            int mid=(left+right)/2;
	            if(isBadVersion(mid)){
	                right=mid;
	            }
	            else{
	                left=mid+1;
	            }
	        }
	        return left;
    }
	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		//int version=z.nextInt();
		firstBadVersion(n);
	}
}

