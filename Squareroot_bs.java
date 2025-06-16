
package xyz;

public class Squareroot_bs {
	    public static void main(String[] args) {
	        int x = 85;
	        int sq = squareroot(x);
	        System.out.println("The square root of " + x + " is: " + sq);
	    }

	    public static int squareroot(int x) {
	        int start = 0, end = x, ans = 0;
	        while (start <= end) {
	            int mid = start + (end - start) / 2;

	            if (mid <= x / mid) {
	                ans = mid;       
	                start = mid + 1; 
	            } else {
	                end = mid - 1;   
	            }
	        }
	        return ans;
	    }
	}
