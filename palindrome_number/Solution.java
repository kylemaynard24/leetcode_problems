import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        List<Integer> nums = new ArrayList<Integer>();
        while(x > 0){
            int leftover = x % 10;
            nums.add(leftover);
            x -= leftover;
            x /= 10;                
        }
        
        // check palindrome
        int i = 0; 
        int j = nums.size() - 1;
        while(i < j){
            if(nums.get(i) != nums.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



    public static void main(String[] args){
        // [false, true, true, false, true]
        int[] tests = new int[]{10, 100, 212, 323, 4445, 83922938};
        for(int i = 0; i < tests.length; i++){
            System.out.println(tests[i] + " = " + isPalindrome(tests[i]));
        }
    }
}