/*
Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once. The relative order of the elements should be kept
the same.

Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates.

then the first k elements of nums should hold the final result. It does not
matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums

DO NOT ALLOCATION EXTRA SPACE FOR ANOTHER ARRAY. YOU MUST DO THIS BY 
MODIFYING THE INPUT ARRAY IN-PLACE with O(1) extra memory.


SDLC:
    1. Planning
    2. Analysis
    3. Design
    4. Implementation
    5. Testing and Integration
    6. Maintenance

    Run a C# application:
    Mono

    mcs -> compile program
    mono .exe -> run program

*/


public class Solution {
    public static int RemoveDuplicates(int[] nums) {
        return -1;   
    }

    static void Main(string[] args){
        System.Console.WriteLine("Hello World");
        // test one:
        int[] testOne = new int[]{1,1,1,3,3,4,5,6,7};
        int kOne = 6;

        int[] testTwo = new int[]{2,2,3,3,3,9,9};
        int kTwo = 3;

        
        int resultOne = RemoveDuplicates(testOne);
        if(resultOne ==kOne){
            System.Console.WriteLine("Test One passed!");
        } else {
            System.Console.WriteLine("Test One failed!");   
        }
        int resultTwo = RemoveDuplicates(testTwo);
        if(resultTwo ==kTwo){
            System.Console.WriteLine("Test Two passed!");
        } else {
            System.Console.WriteLine("Test Two failed!");   
        }
    }
}